package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Unit {
	@Id
	private double unit;

	public double getUnit() {
		return unit;
	}

	public void setUnit(double unit) {
		this.unit = unit;
	}

	public double calculate() {
		int unitRound = (int) unit;
		unitRound = unitRound % 10 >= 6 ? ((unitRound / 10) * 10) + 10 : (unitRound / 10) * 10;
		double payBill = 0;

		if (unitRound <= 500) {
			if (unitRound <= 100) {
				return payBill;
			}

			else if (unitRound >= 101 && unitRound <= 200) {
				payBill = (unitRound - 100) * 2.25;
				return payBill;
			}

			else if (unitRound >= 201 && unitRound <= 400) {
				payBill = ((unitRound - 200) * 4.50) + (100 * 2.25);
				return payBill;
			}

			else if (unitRound >= 401 && unitRound <= 500) {
				payBill = ((unitRound - 400) * 6) + ((100 * 2.25) + (200 * 4.5));
				return payBill;
			}

		} else {

			if (unitRound <= 100) {
				return payBill;
			}

			else if (unitRound >= 101 && unitRound <= 400) {
				payBill = (unitRound - 100) * 4.5;
				return payBill;
			}

			else if (unitRound >= 401 && unitRound <= 500) {
				payBill = ((unitRound - 400) * 6) + (300 * 4.5);
				return payBill;
			}

			else if (unitRound >= 501 && unitRound <= 600) {
				payBill = ((unitRound - 500) * 8) + ((300 * 4.5) + (100 * 6));
				return payBill;

			} else if (unitRound >= 601 && unitRound <= 800) {
				payBill = ((unitRound - 600) * 9) + ((300 * 4.5) + (100 * 6) + (100 * 8));
				return payBill;
			}

			else if (unitRound >= 801 && unitRound <= 1000) {
				payBill = ((unitRound - 800) * 10) + ((300 * 4.5) + (200 * 9) + (100 * 6) + (100 * 8));
				return payBill;
			}

			else {
				payBill = ((unitRound - 1000) * 11) + ((300 * 4.5) + (200 * 10) + (200 * 9) + (100 * 6) + (100 * 8));
				return payBill;

			}

		}
		return payBill;

	}

}
