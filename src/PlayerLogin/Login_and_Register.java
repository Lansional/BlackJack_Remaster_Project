package PlayerLogin;

public interface Login_and_Register {			// 로그인과 계정.....
	public String informationFile = new String("../../Information/");
	
	public void setUserName(String str);
	public void setPassWord(char[] passWord);
	public String getId();
	public String getPw();
}
