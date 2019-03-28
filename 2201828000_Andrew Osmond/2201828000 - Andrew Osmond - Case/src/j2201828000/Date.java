package j2201828000;

import java.util.Calendar;

public class Date {
	private int day;
	private int month;
	private int year;

	public Date() {
		Calendar cal = Calendar.getInstance();
		this.day = cal.get(Calendar.DAY_OF_MONTH);
		this.month = cal.get(Calendar.MONTH) + 1;
		this.year = cal.get(Calendar.YEAR);
	}

	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return String.format("%d/%d/%d", day, month, year);
	}
}
