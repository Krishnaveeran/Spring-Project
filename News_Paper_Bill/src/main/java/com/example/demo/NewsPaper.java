package com.example.demo;

import java.util.Calendar;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class NewsPaper {

	@Id
	private int billYear;
	private int billMonth;

	public int getBillYear() {
		return billYear;
	}

	public void setBillYear(int billYear) {
		this.billYear = billYear;
	}

	public int getBillMonth() {
		return billMonth;
	}

	public void setBillMonth(int billMonth) {
		this.billMonth = billMonth;
	}

	public int countWeekendDays() {
		// TODO Auto-generated method stub

		Calendar calendar = Calendar.getInstance();
		// Note that month is 0-based in calendar, bizarrely.
		calendar.set(billYear, billMonth - 1, 1);
		int daysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

		int satCount = 0;
		int sunCount = 0;

		for (int day = 1; day <= daysInMonth; day++) {
			calendar.set(billYear, billMonth - 1, day);
			int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

			if (dayOfWeek == Calendar.SATURDAY) {
				satCount++;
			} else if (dayOfWeek == Calendar.SUNDAY) {
				sunCount++;
			}
		}

		int weekdays = daysInMonth - (satCount + sunCount);

		int weekdays_price = 7;
		int sat_price = 8;
		int sun_price = 10;

		int bill_of_the_month = (satCount * sat_price) + (sunCount * sun_price)
				+ (weekdays_price * weekdays + daysInMonth);
		// in the above line daysInMonth is added for PaperMan charge(1 Rs per day)
		return bill_of_the_month;

	}

}
