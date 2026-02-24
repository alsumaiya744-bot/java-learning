
package weekdayworkingsystem;

public class DaysDetails {
    Days checkDay;
    void checkWeekdays(String day)
    {
        day=day.toUpperCase();
        checkDay=Days.valueOf(day);
        if((checkDay==checkDay.MONDAY)||(checkDay==checkDay.TUESDAY)||(checkDay==checkDay.WEDNESDAY)||(checkDay==checkDay.THURSDAY)||(checkDay==checkDay.FRIDAY))
        {
            System.out.println("yes it is a working day");
        }
        else
        {
            System.out.println("sorry! it is not a working day");
        }
    }
    void checkWeekendDays(String day)
    {
        day=day.toUpperCase();
        checkDay=Days.valueOf(day);
        if((checkDay==checkDay.SUNDAY)||(checkDay==checkDay.SATURDAY))
        {
            System.out.println("it is a weekend");
        }
        else
        {
            System.out.println("Sorry! it is not a weekend");
        }
    }
    void display()
    {
        System.out.println("Days in a week : ");
        for(Days s : Days.values())
        {
            System.out.println(s);
        }
    }
}
