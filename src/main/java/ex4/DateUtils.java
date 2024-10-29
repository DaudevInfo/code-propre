package ex4;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

	public static String format(String pattern, Date date) {

		if (pattern == null) {
			pattern = "dd/MM/yyyy HH:mm:ss" ;
		}
		SimpleDateFormat formateur = new SimpleDateFormat(pattern);
		return formateur.format(date);

	}

}
