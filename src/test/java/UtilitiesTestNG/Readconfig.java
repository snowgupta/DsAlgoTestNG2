package UtilitiesTestNG;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Readconfig {
	static Properties pro;
	
	public Readconfig() {
		File src = new File ("./ConfigurationTestNG/config.properties");
	
	try {
		FileInputStream fis = new FileInputStream (src);
		pro = new Properties();
		pro.load(fis);
	}
		catch (Exception e) {
			System.out.println("Excrption is " +e.getMessage());
		}
	
	}
public String MainHomepageURL() {
	String url = pro.getProperty("baseurl");
	return url;
}


public String EnterUserNameToRegister() {
	String RegUserName = pro.getProperty("regUserName");
	return RegUserName;
}
public String EnterPasswordToRegister() {
	String RegPassword = pro.getProperty("regPassword");
	return RegPassword;
}
public String ConfirmpasswordToRegister() {
	String ConFirmPassword = pro.getProperty("rePassword");
	return ConFirmPassword;
}


public String enterPythonCode() {
	String pythoncode= pro.getProperty("pythonCode");
	return pythoncode;
}


public String EnterUserName() {
	String UserName= pro.getProperty("username");
	return UserName;
}
public String EnterPassWord() {
	String PASSWORD = pro.getProperty("password");
	return PASSWORD;
}
public String getChromePath() {
	String ChromPath= pro.getProperty("chromepath");
	return ChromPath;
}
public String getFirefoxPath() {
	String FirefoxPath= pro.getProperty("firefoxpath");
	return FirefoxPath;
}
public String getEdgePath() {
	String MSEPath= pro.getProperty("edgepath");
	return MSEPath;
}
}