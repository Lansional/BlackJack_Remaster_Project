package PlayerLogin;

import java.io.Console;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Register implements Login_and_Register {
	private String id = null;		// ���̵��Է�
	private Console console = System.console();
	private String passWord;		// ��й�ȣ �Է�
	private static int soMoreWrong;
	
	public Register() {
		System.out.print("UserName: ");
		setUserName(console.readLine());
		inputPassWord();
		inputInformation();
		System.out.println("Please Login!!");
		new Login();
	}
	
	public void inputInformation() {
		DataOutputStream dataOutputStream = null;
//		byte[] arr = new byte[100];
		
		try {
			dataOutputStream = new DataOutputStream(new FileOutputStream(informationFile + id + ".dat"));
			dataOutputStream.writeUTF(passWord);
		} catch (IOException e) {
			System.err.println("Information Error!");
		} finally {
			try {
				dataOutputStream.close();
			} catch (Exception e) {
			}
		}
	}
	
	public void inputPassWord() {
		System.out.print("PassWord: ");
		setPassWord(console.readPassword());
		System.out.print("Please Input PassWord OneMoreTime: ");
		if (equalsPassword(console.readPassword())) {
			return;
		} else {
			soMoreWrong++;
			System.err.println("Not Same PassWord input!");
			inputPassWord();
			if (soMoreWrong >= 3) {
				System.out.println("Sorry! Please try again");
				System.exit(0);
			}
		}
	}
	
	public boolean equalsPassword(char[] pW) {
		if (Arrays.equals(passWord.toCharArray(), pW)) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public String getId() {
		return id;
	}
	
	@Override
	public void setUserName(String id) {			// Setter: UserName
		if (id == null) {
			System.err.println("�Է°��� �����ϴ�.");
			new Login();
			return;
		}
		this.id = id;
	}

	@Override
	public void setPassWord(char[] passWord) {			// Setter: PassWord
		this.passWord = String.valueOf(passWord);
	}

	@Override
	public String getPw() {
		return passWord;
	}
}
