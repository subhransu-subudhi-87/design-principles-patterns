package com.patterns.singleton;

public class DateUtil {

	private static DateUtil dateUtilInstance;
	
	private DateUtil() {
		
	}
	public static DateUtil getDateUtilInstance() {
		if(dateUtilInstance == null)
			dateUtilInstance = new DateUtil();
		return dateUtilInstance;
		
	}
}
