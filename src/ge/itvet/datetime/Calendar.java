package ge.itvet.datetime;

public class Calendar extends Month {
    private int dayOfMonth, year, month, dayOfYear1;

    public Calendar(int dayOfMonth, Month month, int year) {

        this.dayOfMonth = dayOfMonth >= 32 || dayOfMonth < 0 ? -404 : dayOfMonth;
        this.year = Math.max(year, 0);
        this.month = getMonth();
    }

    public Calendar(int dayOfMonth, int month, int year) {
        this.dayOfMonth = dayOfMonth >= 32 || dayOfMonth < 0 ? -404 : dayOfMonth;
        this.year = Math.max(year, 0);
        this.month = month;
    }

    public Calendar(int dayOfMonth, int year) {
        this.dayOfYear1 = dayOfMonth;
        this.year = year;
        if (year % 4 == 0) {
            if (dayOfMonth > 0 && dayOfMonth < 32) {
                this.dayOfMonth = dayOfMonth;
                this.month = 1;
            } else if (dayOfMonth < 61) {
                this.dayOfMonth = dayOfMonth - 31;
                this.month = 2;
            } else if (dayOfMonth < 92) {
                this.dayOfMonth = dayOfMonth - 60;
                this.month = 3;
            } else if (dayOfMonth < 122) {
                this.dayOfMonth = dayOfMonth - 91;
                this.month = 4;
            } else if (dayOfMonth < 153) {
                this.dayOfMonth = dayOfMonth - 121;
                this.month = 5;
            } else if (dayOfMonth < 183) {
                this.dayOfMonth = dayOfMonth - 152;
                this.month = 6;
            } else if (dayOfMonth < 214) {
                this.dayOfMonth = dayOfMonth - 182;
                this.month = 7;
            } else if (dayOfMonth < 245) {
                this.dayOfMonth = dayOfMonth - 213;
                this.month = 8;
            } else if (dayOfMonth < 275) {
                this.dayOfMonth = dayOfMonth - 244;
                this.month = 9;
            } else if (dayOfMonth < 306) {
                this.dayOfMonth = dayOfMonth - 274;
                this.month = 10;
            } else if (dayOfMonth < 336) {
                this.dayOfMonth = dayOfMonth - 305;
                this.month = 11;
            } else if (dayOfMonth < 366) {
                this.dayOfMonth = dayOfMonth - 335;
                this.month = 12;
            }
        } else {
            if (dayOfMonth > 0 && dayOfMonth < 32) {
                this.dayOfMonth = dayOfMonth;
                this.month = 1;
            } else if (dayOfMonth < 60) {
                this.dayOfMonth = dayOfMonth - 31;
                this.month = 2;
            } else if (dayOfMonth < 91) {
                this.dayOfMonth = dayOfMonth - 59;
                this.month = 3;
            } else if (dayOfMonth < 121) {
                this.dayOfMonth = dayOfMonth - 90;
                this.month = 4;
            } else if (dayOfMonth < 152) {
                this.dayOfMonth = dayOfMonth - 120;
                this.month = 5;
            } else if (dayOfMonth < 182) {
                this.dayOfMonth = dayOfMonth - 151;
                this.month = 6;
            } else if (dayOfMonth < 213) {
                this.dayOfMonth = dayOfMonth - 181;
                this.month = 7;
            } else if (dayOfMonth < 244) {
                this.dayOfMonth = dayOfMonth - 212;
                this.month = 8;
            } else if (dayOfMonth < 274) {
                this.dayOfMonth = dayOfMonth - 243;
                this.month = 9;
            } else if (dayOfMonth < 305) {
                this.dayOfMonth = dayOfMonth - 275;
                this.month = 10;
            } else if (dayOfMonth < 335) {
                this.dayOfMonth = dayOfMonth - 304;
                this.month = 11;
            } else if (dayOfMonth < 365) {
                this.dayOfMonth = dayOfMonth - 334;
                this.month = 12;
            }


        }
    }

    public int getDayOfYear() {

        if (dayOfYear1 > 0) {
            return dayOfYear1;
        } else {
            if (year % 4 == 0) {
                if (month == 1)
                    return dayOfMonth;
                if (month == 2)
                    return dayOfMonth + 31;
                if (month == 3)
                    return dayOfMonth + 60;
                if (month == 4)
                    return dayOfMonth + 91;
                if (month == 5)
                    return dayOfMonth + 121;
                if (month == 6)
                    return dayOfMonth + 152;
                if (month == 7)
                    return dayOfMonth + 182;
                if (month == 8)
                    return dayOfMonth + 213;
                if (month == 9)
                    return dayOfMonth + 244;
                if (month == 10)
                    return dayOfMonth + 274;
                if (month == 11)
                    return dayOfMonth + 305;
                if (month == 12)
                    return dayOfMonth + 335;
                else return -404;
            } else {
                if (month == 1)
                    return dayOfMonth;
                if (month == 2)
                    return dayOfMonth + 31;
                if (month == 3)
                    return dayOfMonth + 59;
                if (month == 4)
                    return dayOfMonth + 90;
                if (month == 5)
                    return dayOfMonth + 120;
                if (month == 6)
                    return dayOfMonth + 151;
                if (month == 7)
                    return dayOfMonth + 181;
                if (month == 8)
                    return dayOfMonth + 212;
                if (month == 9)
                    return dayOfMonth + 243;
                if (month == 10)
                    return dayOfMonth + 273;
                if (month == 11)
                    return dayOfMonth + 304;
                if (month == 12)
                    return dayOfMonth + 334;
                else return -404;

            }
        }

    }

    public void toNextDay() {
        if (month != 2 && dayOfMonth != 31 && dayOfMonth != 30)
            dayOfMonth++;
        else if (dayOfMonth == 30 && month == 4 || month == 6 || month == 9 || month == 11) {
            dayOfMonth = 0;
            month++;
        } else if (dayOfMonth == 30)
            dayOfMonth++;
        else if (month == 2) {
            if (year % 4 == 0 && dayOfMonth == 29 || year % 4 != 0 && dayOfMonth == 28) {
                dayOfMonth = 1;
                month = 3;
            } else
                dayOfMonth++;
        } else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            dayOfMonth = 1;
            if (month == 12) {
                month = 1;
                year++;
            } else month++;
        }
    }

    public void toPrevDay() {
        if (dayOfMonth != 1) dayOfMonth--;
        else if (month == 2 || month == 4 || month == 6 || month == 9 || month == 11) {
            dayOfMonth = 31;
            month--;
        } else if (month == 3) {
            if (year % 4 == 0) {
                dayOfMonth = 29;
                month = 2;
            } else {
                dayOfMonth = 28;
                month = 2;
            }
        } else if (month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            dayOfMonth = 30;
            month--;
        } else if (month == 1) {
            dayOfMonth = 31;
            month = 12;
            year--;

        }


    }

    @Override
    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDayOfMonth(int dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
    }

    public void setDayOfYear(int dayOfYear) {
        this.dayOfYear1 = dayOfYear;
    }

    @Override
    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public int getDayOfMonth() {
        return dayOfMonth;
    }

    public int getDayOfYear1() {
        return dayOfYear1;
    }

    public boolean isBefore(Calendar c) {
        if (c.getYear() < getYear())
            return true;
        else if (c.getYear() > getYear())
            return false;
        else {
            if (c.getMonth() < getMonth())
                return true;
            else if (c.getMonth() > getMonth())
                return false;
            else {
                return c.getDayOfMonth() < getMonth();

            }
        }


    }

    @Override
    public String toString() {
        return "Calendar{" +
                "dayOfMonth=" + dayOfMonth +
                ", year=" + year +
                ", month=" + month +
                '}';
    }

    public long daysBetween(Calendar c) {
        int ans=0,cyear = c.getYear(), n1 = cyear / 4, n2=cyear-cyear/4, m1=this.getYear()/4, m2=this.getYear()-this.getYear()/4;
        if (c.getDayOfYear() >= this.getDayOfYear())
            ans += c.getDayOfYear() - this.getDayOfYear();
        else {
            if (c.getYear() % 4 == 0) {
                ans += 366 + c.getDayOfYear() - this.getDayOfYear();
                --n1;
            } else {
                ans += 365 + c.getDayOfYear() - this.getDayOfYear();
                --n2;
            }
        }
        ans+=366*(n1-m1)+365*(n2-m2);
        if(c.getYear()%4==0&&c.getDayOfYear()<60)
            ans--;
        return ans;
    }

}







