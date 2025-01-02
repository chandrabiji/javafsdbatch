package collections;

import java.util.Calendar;

public class CalendarDemo {

	public static void main(String[] args) {
		Calendar cl =Calendar.getInstance();
		System.out.println("--Date----");
		int dd = cl.get(Calendar.DATE);
		System.out.println("Day: "+dd);
		int mm = cl.get(Calendar.MONTH);
		System.out.println("Month : "+(++mm));
		int yy = cl.get(Calendar.YEAR);
		System.out.println("Year : "+yy);
		System.out.println("--Time---");
		int hh = cl.get(Calendar.HOUR);
		int mi = cl.get(Calendar.MINUTE);
		int ss = cl.get(Calendar.SECOND);
		System.out.println("Time : "+hh+":"+mi+":"+ss);
		

	}

}
