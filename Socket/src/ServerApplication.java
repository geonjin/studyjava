import java.io.*;
import java.net.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class ServerApplication
{
	ServerSocket ss = null;
	static ArrayList<Client> clients = new ArrayList<Client>();
	static ArrayList<String> cl = new ArrayList<String>();
	
	public static void main(String[] args) 
	{
        ServerApplication server = new ServerApplication();
        try {
      	 
             server.ss = new ServerSocket(55555);
             System.out.println("Server > Server Socket is Created...");
             Collections.synchronizedList(cl);
             while(true) {
                 Socket socket = server.ss.accept();
                 System.out.println("TCP Connection Accepted : Client " + socket.getInetAddress());
                 Client newClient = new Client(socket);
                 server.clients.add(newClient);
                 newClient.start();
             }
        
        
        }catch(SocketException e) {
            System.out.println("Server > 소켓 관련 예외 발생, 서버종료" + e.getMessage());
        }catch(IOException e) {
            System.out.println("Server > 입출력 예외 발생");
        }
	}

}
class Client extends Thread
{
	Socket socket;
    OutputStream outStream;
    DataOutputStream dataOutputStream;
    InputStream inStream;
    DataInputStream dataInputStream;
    String rMsg;
   
    Client(Socket _socket)
    {
        this.socket = _socket;
    }
    
    public void run()
    {
        try 
        {
            outStream = socket.getOutputStream();
            dataOutputStream = new DataOutputStream(outStream);
            inStream = socket.getInputStream();
            dataInputStream = new DataInputStream(inStream);
            
            long c_time = System.currentTimeMillis() ;
            
            Date date = new Date();
        	SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
        	SimpleDateFormat timeformat = new SimpleDateFormat("HH:mm:ss");
        	
         
            String CID = null;
            String ip = null;
            String nowtime = dateformat.format(date) + timeformat.format(date);
            CID = dataInputStream.readUTF();
            System.out.println(CID + "   " + socket);
            
            
            ServerApplication server_app = new ServerApplication();
            
            ip = dataInputStream.readUTF();
            server_app.cl.add(ip + " id : null");

            System.out.println(server_app.clients);
            int subIndex = server_app.clients.size() - 1;
            int userIndex = Integer.parseInt(server_app.clients.get(subIndex).getName().substring(server_app.clients.get(subIndex).getName().length() - 1));
      
            while(true)
            { 
                rMsg = dataInputStream.readUTF();
                c_time = dataInputStream.readLong();
                long c_time1 = System.currentTimeMillis();
                
                if(rMsg.equals("Hello")) 
                {
                	dataOutputStream.writeUTF("Response /// " + "100 /// Complete /// END_MSG" );
                	server_app.cl.set(userIndex, ip+ " ID : " + CID);
                }
                else if(rMsg.equals("Clock")) 
                {
                	dataOutputStream.writeUTF("Response /// " + "110 /// 현재 시간은 " +  nowtime  + " /// END_MSG" );
                }
                else if(rMsg.equals("ConnectionTime")) 
                {
                	dataOutputStream.writeUTF("Response /// " + "180 /// 연결 유지 시간은 " + ( c_time1 - c_time )/1000 + " 입니다. /// END_MSG" );
                }
                else if(rMsg.equals("ClientList")) 
                {
                	dataOutputStream.writeUTF("Response /// " + "300 /// 연결된 목록은 " +  server_app.cl  + " 입니다. /// END_MSG");
                }
                else if(rMsg.equals("Quit")) 
                {
                	dataOutputStream.writeUTF("Response /// " + "350 /// 사용을 종료합니다 /// END_MSG");
                	server_app.cl.remove(userIndex);
                	server_app.clients.remove(userIndex);
                	System.out.println(server_app.clients);
                	break;
                }
                else
                {
                	dataOutputStream.writeUTF("Response /// " + "500 /// 인식 불가 /// END_MSG");
                }
            }
            
        }
        catch(IOException e) 
        {
            System.out.println("Exception with " + socket.getInetAddress());
        } 
    }
}
