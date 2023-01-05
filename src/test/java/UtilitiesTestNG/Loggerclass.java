package UtilitiesTestNG;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Loggerclass {
	private static Logger Logger = LogManager.getLogger();
	 
	 public static void info(String message)
	 {
	  Logger.info(message);
	 }
	 public static void warn(String message)
	 {
	  Logger.warn(message);
	 }
	 public static void error(String message)
	 {
	  Logger.error(message);
	 }
	 public static void fatal(String message)
	 {
	  Logger.fatal(message);
	 }
	 public static void debug(String message)
	 {
	  Logger.debug(message);
	 }

}
