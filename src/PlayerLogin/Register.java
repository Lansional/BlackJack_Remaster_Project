package PlayerLogin;

import java.io.Console;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Register implements Login_and_Register {
	private Console console = System.console();
	private String id = null;		// 아이디입력
	private String passWord;		// 비밀번호 입력
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
		
		byte[] arr = new byte[id.length()];
		arr = passWord.getBytes();
		
		try {
			dataOutputStream = new DataOutputStream(new FileOutputStream(informationFile + id + ".dat"));
			dataOutputStream.write(arr);
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
			this.inputPassWord();
			if (soMoreWrong >= 3) {
				System.out.println("Sorry! Please try again");
				System.exit(0);
			}
		}
	}
	
	public boolean equalsPassword(char[] pW) {
		if (passWord.equals(String.valueOf(pW))) {
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
	public void setUserName(String id) {
		if (id == null) {
			System.err.println("입력값이 없습니다.");
			new Login();
			return;
		}
		this.id = id;
	}

	@Override
	public void setPassWord(char[] pW) {
		this.passWord = String.valueOf(pW);
	}

	@Override
	public String getPw() {
		return null;
	}
}
