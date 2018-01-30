import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

abstract class MyTime {
	public abstract void display();

	public static String getTime() {
		String t = "";
		DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		t = dateFormat.format(cal.getTime());
		return t;
	}

	public static String getDate() {
		/*
		 * // prints "Sep 6, 2009" DateFormat dateInstance =
		 * SimpleDateFormat.getDateInstance();
		 * System.out.println(dateInstance.format(Calendar.getInstance().getTime()));
		 * 
		 * // prints "9:03:20 PM" DateFormat timeInstance =
		 * SimpleDateFormat.getTimeInstance();
		 * System.out.println(timeInstance.format(Calendar.getInstance().getTime()));
		 * 
		 * // prints "Sep 6, 2009 9:03:20 PM" DateFormat dateTimeInstance =
		 * SimpleDateFormat.getDateTimeInstance();
		 * System.out.println(dateTimeInstance.format(Calendar.getInstance().getTime()))
		 * ;
		 */
		String d = "";
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Calendar cal = Calendar.getInstance();
		d = dateFormat.format(cal.getTime());
		return d;
	}

}