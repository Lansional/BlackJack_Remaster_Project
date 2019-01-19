package PlayerLogin;

import java.io.Console;

public class Login implements Login_and_Register { // Cloneable {
	private Console console = System.console();
	protected String userName;		// �����̸��Է�
	protected char[] pW;		// ��й�ȣ�Է�
	protected String passWord;		// pW�� String���� ��ȯ
	
	public Login() {
		System.out.print("UserName: ");
		inputUserName(console.readLine());
		System.out.print("PassWord: ");
		inputPassWord(console.readPassword());
		ioCheck<Login> login = new ioCheck<Login>(this);
	}
	
	@Override
	public String getId() {
		return userName;
	}

	@Override
	public String getPw() {
		return passWord;
	}
	
	@Override
	public void inputUserName(String str) {
		if (str == null) {
			System.err.println("�Է°��� �����ϴ�.");
			new Login();
			return;
		}
		this.userName = str;
	}

	@Override
	public void inputPassWord(char[] passWord) {
		if (passWord.length == 0) {
			System.err.println("�Է°��� �����ϴ�.");			
			new Login();
			return;
		}
		pW = passWord;
		this.passWord = String.valueOf(passWord);
	}
	
//	public Login deepClone() {		// ���� ����
//		Object obj = null;
//		
//		try {
//			obj = super.clone();
//		} catch (CloneNotSupportedException e) {
//			e.printStackTrace();
//		}
//		
//		Login login = (Login) obj;
//		return login;
//	}
}
