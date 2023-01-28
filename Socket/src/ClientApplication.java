import java.net.*;
import java.text.SimpleDateFormat;
import java.io.*;
import java.util.Date;
import java.util.Scanner;

public class ClientApplication 
{
	Socket socket = null;

	public static void main(String[] args) 
	{
		ClientApplication client = new ClientApplication();
		Scanner scanner = new Scanner(System.in);
		Socket socket = null;
		try
		{
			int c_cnt = 0;
			InetAddress local;
			  
			String CID = "";
			System.out.println("CID를 입력하세요 : ");
			CID = scanner.nextLine();
			  
			client.socket = new Socket("localhost", 55555);
			System.out.println("Client > 서버로 연결되었습니다.");
			long c_time = System.currentTimeMillis();
			MessageListener listener  = new MessageListener(client.socket);
			listener.start();
			  
			OutputStream out =  client.socket.getOutputStream();
			DataOutputStream dout = new DataOutputStream(out);
			
			
			Scanner scn = new Scanner(System.in);
			 
			dout.writeUTF(CID);
				
			local = InetAddress.getLocalHost();
			String ip = local.getHostAddress();
				
			dout.writeUTF(ip);
			
			while(true) 
			{
			    String msg = null;
			    System.out.print("Enter a message : ");
			    msg = scn.nextLine();
			    System.out.println("Request /// " + msg  + " /// CID : " + CID + " /// Num_Req : " + (c_cnt+1) + " /// " + "END_MSG");
			   			    
			    dout.writeUTF(msg);
			    dout.writeLong(c_time);
			    c_cnt ++;
			    Thread.sleep(100);
			    if (msg.equals("Quit"))
			    	break;
			}
			
			client.socket.close();
		}
		catch(Exception e)
		{
			System.out.println("Connection Fail");
		}	
	}
}

class MessageListener extends Thread
{
	Socket socket;
	InputStream in;
	DataInputStream din;
	 
	MessageListener(Socket _s)
	{
		this.socket = _s;
	}
	
	public void run() 
	{
		try
		{
			in = socket.getInputStream();
		    din = new DataInputStream(in);
		   
		    while(true) 
		    {
			    String msg = din.readUTF();
			    System.out.println(msg);
		    }
		   
		 }
		catch(Exception e) 
		{
		 	
		}
	}
}

