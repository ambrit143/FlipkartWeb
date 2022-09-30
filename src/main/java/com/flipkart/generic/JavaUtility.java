package com.flipkart.generic;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * This class contains java related reusable methods 
 * @author AMBRIT
 *
 */
public final class JavaUtility {
	/**
	 * This method returns ramdom number
	 * @return
	 */
     public int getRandomNumber() {
    	 return new Random().nextInt(1000);
     }
     public long convertStringToLong(String stringTimeout) {
    	 return Long.parseLong(stringTimeout);
     }
     /**
      * This method will print the given statement on console
      * @param statement
      */
     public void print(String statement) {
    	 System.out.println(statement);
     }
     public String getCurrentDate(String strategy) {
         Date date=new Date();
         System.out.println(date);
         SimpleDateFormat sdf=new SimpleDateFormat(strategy);
         return sdf.format(date);
       // return new SimpleDateFormat(strategy).format(new Date());
  	}
}
