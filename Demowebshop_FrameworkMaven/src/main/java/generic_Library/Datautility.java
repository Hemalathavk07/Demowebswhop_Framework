package generic_Library;

import java.io.FileInputStream;
import java.util.Properties;

public class Datautility {

	
	FileInputStream  file = new FileInputStream("./TestData/Commondata.properties");
	Properties pro = new Properties();
	pro.load(file);
	String value = pro.getProperty(key);
	return value; 

}
