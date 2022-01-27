package ge.itvet.datetime;

public class Month {

    private int month;

    public void setMonth(int month) {
        this.month = month;
    }

    public int getMonth() {
        return month;
    }
    protected Month() {}
    public Month(int month)
    {
        this.month=month;
    }
    @Override
    public String toString()
    {
        if(month==1)
            return "Jan";
        if(month==2)
            return "Feb";
        if(month==3)
            return "Mar";
        if(month==4)
            return "Apr";
        if(month==5)
            return "May";
        if(month==6)
            return "Jun";
        if(month==7)
            return "Jul";
        if(month==8)
            return "Aug";
        if(month==9)
            return "Seq";
        if(month==10)
            return "Oct";
        if(month==11)
            return "Nov";
        if(month==12)
            return "Dec";
        else
            return "No";
    }
    public int daysInYear(int year)
    {
     if(month==1 ||month==3 ||month==5 ||month==7 ||month==8 ||month==10 ||month==12 )
         return 31;
     else if(year % 4 == 0 &&month==2)
         return 29;
     else if(year % 4 != 0 &&month==2)
         return 28;
     else
         return 30;
    }
}
