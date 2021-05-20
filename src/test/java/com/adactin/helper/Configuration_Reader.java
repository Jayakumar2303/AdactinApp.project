package com.adactin.helper;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configuration_Reader {
	public static Properties p;

	public Configuration_Reader() throws Throwable {
		File f = new File(
				"E:\\BA\\DESKTOP\\eclipse-workspace\\Adactinhotelapp\\src\\test\\java\\com\\adactin\\properties\\Configuration.properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);

	}

	public String getBrowser() {
		String browser = p.getProperty("browser");
		return browser;
	}

	public String geturl() {
		String url = p.getProperty("url");
		return url;
	}

	public String getfirstname() {
		String firstname = p.getProperty("firstname");
		return firstname;
	}

	public String getlastname() {
		String lastname = p.getProperty("lastname");
		return lastname;
	}

	public String getcardno() {
		String cardno = p.getProperty("cardno");
		return cardno;
	}

	public String getcvvno() {
		String cvvno = p.getProperty("cvvno");
		return cvvno;
	}

	public String getaddress() {
		String address = p.getProperty("address");
		return address;
	}

}
