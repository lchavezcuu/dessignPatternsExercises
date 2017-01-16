package factory;

/**
 * Created by luis on 8/01/17.
 */
public class CalendarFactory {

    public Calendar GetCalendar(String calendarType){
        //I already know that I'm broken OCP, this is just for practicing
        if(calendarType=="HOUR"){
            return new CalendarHour();
        }else if(calendarType=="MONTH"){
            return new CalendarMonth();
        }else if(calendarType=="YEAR"){
            return new CalendarYear();
        }else{
            System.out.println("Unavailable calendar");
            return null;
        }
    }
}
