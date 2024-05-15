package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {

	public static void main(String[] args) {

		 Calendar calendar = Calendar.getInstance();
		 calendar.set(2016, Calendar.MAY, 19, 23, 59, 30);
		 
		 Date thisDate = calendar.getTime();
		 
		 SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		 
		 System.out.println(sdf.format(thisDate));
		 
		 SimpleDateFormat sdfFrance = new SimpleDateFormat("EEEE dd MMMMM yyyy HH:mm:ss", Locale.FRANCE);
		 SimpleDateFormat sdfRusse = new SimpleDateFormat("EEEE dd MMMMM yyyy HH:mm:ss", new Locale("ru", "RU"));
		 SimpleDateFormat sdfChinois = new SimpleDateFormat("EEEE dd MMMMM yyyy HH:mm:ss", Locale.CHINESE);
		 SimpleDateFormat sdfAllemand = new SimpleDateFormat("EEEE dd MMMMM yyyy HH:mm:ss", Locale.GERMAN);
		 
		 System.out.println("Date Francaise: " + sdfFrance.format(thisDate));
		 System.out.println("Date Russe: " + sdfRusse.format(thisDate));
		 System.out.println("Date Chinoise: " + sdfChinois.format(thisDate) );
		 System.out.println("Date Allmenade: " + sdfAllemand.format(thisDate));
		 

	}

}
