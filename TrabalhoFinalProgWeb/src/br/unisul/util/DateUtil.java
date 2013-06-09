package br.unisul.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	public static Date parseStringToDate(String data) {
		try {
			Date date = null;
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			date = sdf.parse(data);
			return date;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static Date parseStringToHora(String data) {
		try {
			Date date = null;
			SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
			date = sdf.parse(data);
			return date;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
}