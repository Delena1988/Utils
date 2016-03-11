package com.linjian.util;

import java.util.Calendar;

/**
 * 身份证工具类
 * 
 * @author linjian
 * @date 2016年3月11日上午9:40:08
 *
 */
public class IDCardUtil {
	/**
	 * 根据出生日期计算年龄,未满一年返回几月，未满一月返回几天
	 * 
	 * @param birthDate
	 * @return
	 */
	public static String getAgeByBirthDate(String birthDate) {
		int yearBirth = Integer.parseInt(birthDate.substring(0, 4));
		int monthBirth = Integer.parseInt(birthDate.substring(4, 6));
		int dayBirth = Integer.parseInt(birthDate.substring(6, 8));
		Calendar calendar = Calendar.getInstance();
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH) + 1;
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		if (year > yearBirth) {
			return String.valueOf(year - yearBirth) + "岁";
		} else {
			if (month > monthBirth) {
				return String.valueOf(month - monthBirth) + "月";
			} else {
				return String.valueOf(day - dayBirth) + "天";
			}
		}
	}
}
