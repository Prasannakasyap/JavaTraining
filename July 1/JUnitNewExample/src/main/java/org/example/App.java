package org.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ParseException {
        System.out.println( "Hello World!" );
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date startDate = sdf.parse("2022-07-04");
        Date endDate = sdf.parse("2022-07-06");
        LeaveDetails ld3 = new LeaveDetails(1, 1000, startDate, endDate, 2, "Going Home");
        System.out.println(ld3);
    }
}
