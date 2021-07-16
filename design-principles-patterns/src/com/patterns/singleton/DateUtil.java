package com.patterns.singleton;

public class DateUtil {
    /**
     * For double-checked Locking the field is declared volatile;
     * to get rid of cache coherence issue.
     * 
     * As Java Memory Model could allow the publication of 
     *  partially initialized objects,so the filed should be
     *  volatile. 
     */
	private static volatile DateUtil dateUtilInstance;

	private DateUtil() {

	}

	public static DateUtil getDateUtilInstance() {
		if (dateUtilInstance == null) {
			synchronized (DateUtil.class) {
				if (dateUtilInstance == null)
					dateUtilInstance = new DateUtil();
			}
		}
		return dateUtilInstance;
	}
}
