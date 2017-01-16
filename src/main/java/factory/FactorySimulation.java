package factory;

/**
 * Created by luis on 8/01/17.
 */
public class FactorySimulation {

    public static void main(String[] args) {
        CalendarFactory myCf=new CalendarFactory();
        Calendar myHourCalendar=myCf.GetCalendar("HOUR");
        myHourCalendar.GetStyle();
        Calendar myMonthCalendar=myCf.GetCalendar("MONTH");
        myMonthCalendar.GetStyle();
        Calendar myYearCalendar=myCf.GetCalendar("YEAR");
        myYearCalendar.GetStyle();
        
    }
}
