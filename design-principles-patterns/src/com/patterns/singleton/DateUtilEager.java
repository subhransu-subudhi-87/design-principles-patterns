package com.patterns.singleton;

public class DateUtilEager {

private static DateUtilEager dateUtilEagerInstance = new DateUtilEager();
	
	private DateUtilEager() {
		
	}
	
	public static DateUtilEager getDateUtilEagerInstance() {
		return dateUtilEagerInstance;
		
	}
}
