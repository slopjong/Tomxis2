package tomcat;

import java.io.File;
import org.apache.catalina.startup.Tomcat;

public class Launcher {
	
	public static void main(String[] args) throws Exception{
		
		String webappDir = System.getenv("WEBAPPDIR");
		if(webappDir == null || webappDir.isEmpty())
			webappDir = "src/main/webapp";
		
		String webPort = System.getenv("PORT");
		if(webPort == null || webPort.isEmpty())
			webPort = "8080";
		
		Tomcat tomcat = new Tomcat();
		tomcat.setPort(Integer.valueOf(webPort));
		tomcat.addWebapp("/", new File(webappDir).getAbsolutePath());
		tomcat.start();
		tomcat.getServer().await();
		System.out.println("Shutdown completed.");
	}
}