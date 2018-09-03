package br.com.cvc.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class DateConversions {
	public static int getDaysBetween(String checkin, String checkout) {
		SimpleDateFormat myFormat = new SimpleDateFormat("dd/MM/yyyy");
		int days = 0;
		try {
			Date date1 = myFormat.parse(checkin);
			Date date2 = myFormat.parse(checkout);
			long diff = date2.getTime() - date1.getTime();
			System.out.println("Days: " + TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS));
			days = (int) TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
		} catch (ParseException e) {
			e.printStackTrace();
		}  
		return days;
	}
	
}
