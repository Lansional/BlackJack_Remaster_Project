package PlayerLogin;

import java.io.Console;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Login implements Login_and_Register {
	private String userName;		// 유저이름입력
	private String passWord;		// pW를 String으로 전환
	private Console console = System.console();
	
	public Login() {
		System.out.print("UserName: ");
		setUserName(console.readLine());
		System.out.print("PassWord: ");
		setPassWord(console.readPassword());
		findInformation();
	}
	
	public void findInformation() {
		DataInputStream dataInputStream = null;
		try {
			dataInputStream = new DataInputStream(new FileInputStream(informationFile + userName + ".dat"));
			String str = dataInputStream.readUTF();
			if (!ckeckThePassWord(str)) {
				System.out.println("Wrong PassWord");
				new Login();
			}
		} catch (FileNotFoundException fnfe) {
			System.err.println("Not UserName!");
		} catch (EOFException e) {
		} catch (IOException e) {
			System.out.println("Error!");
		} finally {
			try {
				dataInputStream.close();
			} catch (Exception e) {
			}
		}
	}
	
	public boolean ckeckThePassWord(String str) {
		if (passWord.equals(str)) {
			return true;
		}
		return false;
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
	public void setUserName(String str) {
		if (str == null) {
			System.err.println("입력값이 없습니다.");
			new Login();
			return;
		}
		this.userName = str;
	}

	@Override
	public void setPassWord(char[] passWord) {
		if (passWord.length == 0) {
			System.err.println("입력값이 없습니다.");			
			new Login();
			return;
		}
		this.passWord = String.valueOf(passWord);
	}
}
