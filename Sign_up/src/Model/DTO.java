package Model;

public class DTO {
	private String id;
	private String pw;
	private String name;
	
	public String getId()
	{
		return id;
	}
	public void setId(String id)
	{
		this.id = id;
	}
	
	public String getPw()
	{
		return pw;
	}
	public void setPw(String pw)
	{
		this.pw = pw;
	}
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	
	@Override
	public String toString()
	{
		String str = String.format("아이디:%s\n비밀번호:%s\n이름:&s\n",id,pw,name);
		return str;
	}
}
