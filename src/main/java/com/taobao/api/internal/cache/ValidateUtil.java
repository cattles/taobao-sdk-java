package com.taobao.api.internal.cache;

import java.math.BigInteger;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * validate
 * 
 * @author jeck.xie 2011-1-10
 */ 
public class ValidateUtil {

	/**
	 * Check whether the number is in range [min, max] inclusive.
	 * <p> Any/Both of the min/max could be null, which would be ignored.
	 * <p> Note, it's your responsibility to ensure min <= max if neither of them is null.
	 * @param text
	 * @param min
	 * @param max
	 * @return
	 */
	public static boolean isNumberInRange(String text, BigInteger min, BigInteger max) {
		BigInteger value = null;
		try {
			value = new BigInteger(text);
		} catch (Exception e) {
			// could be NullPointerException and MalformatException.
			return false;
		}
		
		if (min != null) {
			if (value.compareTo(min) < 0) {
				// smaller then min.
				return false;
			}
		} 
		
		if (max != null) {
			if (value.compareTo(max) > 0) {
				return false;
			}
		}
		
		return true;
	}
	
	public static boolean isBoolean(String input) {
		if (input == null) {
			return false;
		}
		
		return input.equals("true") || input.equals("false");
	}
	
	public static boolean isDate(String input) {
		if (input == null) {
			return false;
		}
		
		try {
			ymdOrYmdhms2Date(input);
		} catch (ParseException e) {
			return false;
		}
		return true;
	}

	/**
	 * Positive Integer or Decimal
	 * @param input
	 * @return
	 */
	public static boolean isPrice(String input) {
		if (input == null) {
			return false;
		}
		int dotPos = input.indexOf('.');
		if (dotPos == -1) {
			return isUnsignedNumber(input);
		}
		
		if (dotPos + 1 == input.length()) {
			return false;
		}
		String partInteger = input.substring(0, dotPos);
		String partDecimal = input.substring(dotPos + 1, input.length());
		
		if (partDecimal.length() > 2) {
			return false;
		}
		
		return isUnsignedNumber(partInteger) && isUnsignedNumber(partDecimal);
	}
	
	/**
	 * The number is defined as serial of digits. Note： 01234 would return true since most programing language
	 * treat it as a valid number.
	 * @param text
	 * @return
	 */
	private static boolean isUnsignedNumber(String text) {
		if (text == null) {
			return false;
		}
		
		if (text.length() == 0) {
			return false;
		}

		for (int i = 0; i < text.length(); i++) {
			char c = text.charAt(i);
			if (c < '0' || c > '9') {
				return false;
			}
		}

		return true;
	}
	
	/**
	 * Ymd or ymdhms2 date.
	 * 
	 * @param str
	 *            the str
	 * 
	 * @return the date
	 * 
	 * @throws ParseException
	 *             the parse exception
	 */
	private static Date ymdOrYmdhms2Date(String str) throws ParseException {
		if (str == null)
			return null;
		if (str.length() != 10 && str.length() != 19 && str.length() != 23) {
			throw new ParseException("error date:" + str, 0);
		}

		char[] strs = str.toCharArray();
		Calendar cal = null;
		try {
			int year = parseInt(strs, 0, 4);
			int month = parseInt(strs, 5, 7) - 1;
			int date = parseInt(strs, 8, 10);
			if (strs.length >= 19) {
				int hrs = parseInt(strs, 11, 13);
				int min = parseInt(strs, 14, 16);
				int sec = parseInt(strs, 17, 19);
				cal = new GregorianCalendar(year, month, date, hrs, min, sec);
				if (strs.length == 23) {
					int sss = parseInt(strs, 20, 23);
					cal.set(Calendar.MILLISECOND, sss);
				}
			} else {
				cal = new GregorianCalendar(year, month, date);
			}
			return cal.getTime();
		} catch (ParseException e) {
			throw e;
		}
	}
	
	/**
	 * 将字符数组的指定位转换为int
	 * 
	 * @param strs
	 * @param beginindex
	 * @param endindex
	 * @return
	 * @throws Exception
	 */
	private static int parseInt(char[] strs, int beginindex, int endindex)
			throws ParseException {
		int result = 0;
		int b = 1;
		for (int i = endindex - 1; i >= beginindex; i--) {
			if (strs[i] < 48 || strs[i] > 57) {
				throw new ParseException(
						"Parse error,can't parse char to int . ", 0);
			}
			result = result + (strs[i] - 48) * b;
			b *= 10;
		}
		return result;
	}
}
