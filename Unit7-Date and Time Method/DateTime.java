
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;

import javax.swing.text.DateFormatter;

import java.time.format.DateTimeFormatter;

public class DateTime{
    public static void main(String[] args) {
        LocalDate LD=LocalDate.now();
        LocalTime LT=LocalTime.now();
        LocalDateTime LDT=LocalDateTime.now();
                    //...DAte..//
        System.out.println("Local Date :"+ LD);
        System.out.println("This Month is :" + LocalDate.now().getMonth());
        System.out.println("Day of this Month :" + LD.getDayOfMonth());
        System.out.println("Day of this Week :" + LD.getDayOfWeek());
        System.out.println("Day of this Year :" + LD.getDayOfYear());

        System.out.println("Next Week: " + LD.plusWeeks(1));
        
                    //....Time....//
        System.out.println("Time :"+ LocalTime.now());
        System.out.println("Hour :" + LT.getHour());
        System.out.println("minute :" + LT.getMinute());
        System.out.println("Second :"+ LT.getSecond());
        System.out.println("LocalDateTime :" + LocalDateTime.now());
        
        System.out.println("DateTime after 8 hours: " + LDT.plusHours(8));

                    //....CAlender....//
        Calendar cal=Calendar.getInstance();
        System.out.println(cal);
        System.out.println("Calender Time :"+cal.getTime());
        System.out.println("Calender Year :"+cal.get(Calendar.YEAR));
        System.out.println("Calender Month :"+cal.get(Calendar.MONTH));
        System.out.println("Calender DAte :" +cal.get(Calendar.DATE));
        System.out.println("Calender Hour :" +cal.get(Calendar.HOUR)+"hr");
        System.out.println("Calender minute :"+cal.get(Calendar.MINUTE)+"min");
        System.out.println("Calender Second :"+cal.get(Calendar.SECOND)+ "sec");
        System.out.println("Today is"+ cal.get(Calendar.DATE) + "th "+ cal.get(Calendar.MONTH) + "th month " +cal.get(Calendar.HOUR)+"hr " + cal.get(Calendar.MINUTE)+"min " +cal.get(Calendar.SECOND)+ "sec "+ "of the Year " + cal.get(Calendar.YEAR));

                //...Date time formatting...//
        LocalDateTime DT=LocalDateTime.now();
        System.out.println("Actual DateTime : " + DT);

        DateTimeFormatter FDT= DateTimeFormatter.ofPattern("dd:MM:yyyy HH:mm:ss");//ofPattern() method accepts all sorts of values,we want to display in a different format.
        System.out.println("Formatted DAte :" + DT.format(FDT)); 

        DateTimeFormatter FDT1= DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm:ss");
        System.out.println("Formatted DAte1 :" + DT.format(FDT1));

        
                               
    }
}