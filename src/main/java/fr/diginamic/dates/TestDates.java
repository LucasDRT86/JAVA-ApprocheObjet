package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class TestDates {

	public static void main(String[] args) {
		Date date = new Date();
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy", Locale.getDefault());
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyy HH:mm:ss", Locale.getDefault());
		
		System.out.println(sdf.format(date));
		System.out.println(sdf2.format(date));

	}

}
