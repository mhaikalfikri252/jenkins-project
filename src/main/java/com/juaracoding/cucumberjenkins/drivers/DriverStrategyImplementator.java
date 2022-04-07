package com.juaracoding.cucumberjenkins.drivers;

import com.juaracoding.cucumberjenkins.utils.Constants;

public class DriverStrategyImplementator {

	public static DriverStrategy chooseStrategy(String strategy) {

		switch (strategy) {
		case Constants.CHROME:
			return new Chrome();
		case Constants.FIREFOX:
			return new Firefox();
		default:
			return null;
		}
	}
}
