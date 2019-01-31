package PlayerLogin;

import java.io.Console;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Login implements Login_and_Register {
	private Console console = System.console();
	private String userName;		// �����̸��Է�
	private String passWord;		// pW�� String���� ��ȯ
	private static int wrongNumber;
	
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
			byte[] arr = new byte[100];
			while (true) {
				int num = dataInputStream.read(arr);
				if (num < 0)
					break;
			}
			String str = String.valueOf(arr);
			
			if (!ckechThePassWord(str)) {
				System.out.println("Wrong PassWord");
				if (wrongNumber >= 3) {
					System.out.println("Sorry! You have exceeded the number of input errors.");
					System.exit(0);
				}
				new Login();
			}
			System.out.println("Login Success");
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
	
	public boolean ckechThePassWord(String str) {
		if (str.equals(passWord)) {
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
			System.err.println("�Է°��� �����ϴ�.");
			new Login();
			return;
		}
		this.userName = str;
	}

	@Override
	public void setPassWord(char[] passWord) {
		if (passWord.length == 0) {
			System.err.println("�Է°��� �����ϴ�.");			
			new Login();
			return;
		}
		this.passWord = String.valueOf(passWord);
	}
}
