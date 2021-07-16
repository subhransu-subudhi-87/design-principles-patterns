package com.patterns.singleton;

public class TestDateUtilSingleton {

	public static void main(String[] args) {

		DateUtil dateUtilObj1 = DateUtil.getDateUtilInstance();
		DateUtil dateUtilObj2 = DateUtil.getDateUtilInstance();

		System.out.println(dateUtilObj1 == dateUtilObj2);

		DateUtilEager dateUtilEager1 = DateUtilEager.getDateUtilEagerInstance();
		DateUtilEager dateUtilEager2 = DateUtilEager.getDateUtilEagerInstance();

		System.out.println(dateUtilEager1 == dateUtilEager2);
	}

}
