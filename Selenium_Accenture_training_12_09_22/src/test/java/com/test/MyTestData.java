package com.test;

import org.testng.annotations.DataProvider;

public class MyTestData {
	 @DataProvider
	    public Object[][] myTestData()
	    {
	        Object[][] obj= {
	                            {"kannan1@gmail.com","test1234"},
	                            {"kim@gmail.com","test1111"},
	                            {"kannan2@gmail.com","test1234"}
	                        };
	        return obj;
	    }
}
