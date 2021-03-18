package com.stackroute.mar18demo01;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;

public class PropertiesDemo {
	
	public static void demo() throws IOException {
		
		// Windows : C:\Users\Admin\Documents\workspace-spring-tool-suite-4-4.1.2.RELEASE\hclws\mar18demo01
		// Ubuntu : /home/ubuntu/Documents\workspace-spring-tool-suite-4-4.1.2.RELEASE\hclws\mar18demo01
		
		String filepath = System.getProperty("user.dir")+"/config/settings.properties";

		//System.getProperty("user.dir") => D:/Nixon/DemoProject ----> project
		//System.getProperty("user.dir") => E:/DemoProject
		
		FileReader fr = new FileReader(new File(filepath));
		
		Properties prop = new Properties();
		
		prop.load(fr);
		
		System.out.println("OS : "+prop.getProperty("OS"));
		System.out.println("Username : "+ prop.getProperty("hibernate.username"));
		
		Properties sysProperties = System.getProperties();
		
		Iterator itr = sysProperties.entrySet().iterator();
		
		while(itr.hasNext()) {
			Map.Entry me = (Map.Entry) itr.next();
			
			System.out.println(me.getKey()+" "+me.getValue());
			
			
		}
		
		
		prop.setProperty("superuser", "root");
		prop.setProperty("superuserpassword", "root");
		
		System.out.println(prop.getProperty("superuser"));
		
	}
	
	
}
