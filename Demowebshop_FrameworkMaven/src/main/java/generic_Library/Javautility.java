package generic_Library;

import java.time.LocalDateTime;
import java.util.Random;

public class Javautility {
	
	public static int getRandomNumber()
	{
		Random r =new Random();
		return r.nextInt(5000);
	}
	public static String getTimestamp()
	{
		LocalDateTime l =LocalDateTime.now();
		String date = l.toString().replace(".","-");
		return date;
	}

}
