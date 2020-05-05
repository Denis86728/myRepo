public class Date {

    int month;

    int day;

    int year;

    public Date() {
        setDay(day);
        setMonth(month);
        setYear(year);
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if(month >= 0 && month<=12){
            this.month = month;
        }
        else
        {
            month =0;
        }
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if(day >= 0 && day <=30){
            this.day = day;
        }
        else
        {
            day = 0;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year >= 0){
            this.year = year;
        }
        else{
            year = 0;
        }
    }

    public void displayDate() {
        System.out.println("The date is: " + getDay() + "/" + getMonth() + "/" + getYear());
    }
}
