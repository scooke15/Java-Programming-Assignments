package M02.Assignment1;

import java.util.GregorianCalendar;

public class MyDate {
    private int year, month, day;

    public MyDate(){
        this(System.currentTimeMillis());
    }

    public MyDate(long elapsedTime){
        setDate(elapsedTime);
    }

    public MyDate(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    //accessors
    public int getYear(){
        return year;
    }

    public int getMonth(){
        return month;
    }

    public int getDay(){
        return day;
    }

    public void setDate(long elapsedTime){
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTimeInMillis(elapsedTime);
        this.year = calendar.get(GregorianCalendar.YEAR);
        this.month = calendar.get(GregorianCalendar.MONTH);
        this.day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
    }
    
    public static void main(String[] args) {
        MyDate todaysDate = new MyDate();
        MyDate elapsedDate = new MyDate(34355555133101L);
        MyDate testDate = new MyDate(561555550000L);

        System.out.println("today - year: " + todaysDate.getYear() + " | month: " + todaysDate.getMonth() + " | day: " + todaysDate.getDay());
        System.out.println("elapsed date - year: " + elapsedDate.getYear() + " | month: " + elapsedDate.getMonth() + " | day: " + elapsedDate.getDay());
        System.out.println("test date - year: " + testDate.getYear() + " | month: " + testDate.getMonth() + " | day: " + testDate.getDay());
    }
   
}