public class Date {
    private int year;
    private int month;
    private int day;
    private int nums;
    private int[] months = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private int[] leapMonths = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    private boolean isLeap(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public void yesterday() {
        int[] ms = isLeap(year) ? leapMonths : months;
//        退一天
        int y = year, m = month, d = day - 1;
        if (d == 0) {
            //        回到上一个月
            m--;
//            如果退到了上一年
            if (m == 0) {
                y--;
                m = 12;
                d = 31;
            } else {
                d = ms[m];
            }
        }
        System.out.println(String.format("昨天是%d年%d月%d日", y, m, d));
    }

    public void tomorrow() {
        int[] ms = isLeap(year) ? leapMonths : months;
        //        进一天
        int y = year, m = month, d = day + 1;
//        进入下一个月
        if (d == ms[month] + 1) {
            m++;
            d = 1;
//            进入下一年
            if (m == 13) {
                y++;
                m = 1;
            }
        }
        System.out.println(String.format("明天是%d年%d月%d日", y, m, d));
    }

    public void daysinyear() {
        System.out.println(String.format("今天是一年的第%d天", nums));
    }

    public Date() {
        year = 1900;
        month = 1;
        day = 1;
        nums = 0;
        int[] ms = isLeap(year) ? leapMonths : months;
//        计算是今年的第几天
        for (int i = 1; i < month; i++) {
            nums += ms[i];
        }
        nums += day;
    }

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
        nums = 0;
        int[] ms = isLeap(year) ? leapMonths : months;
        //        计算是今年的第几天
        for (int i = 1; i < month; i++) {
            nums += ms[i];
        }
        nums += day;

    }

    public Date(Date date) {
        year = date.year;
        day = date.day;
        month = date.month;
        nums = 0;
        int[] ms = isLeap(year) ? leapMonths : months;
        //        计算是今年的第几天
        for (int i = 1; i < month; i++) {
            nums += ms[i];
        }
        nums += day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "Data{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    public static void main(String[] args) {
//        Date date1 =new Date(2021,1,1);
//        date1.tomorrow();
//        date1.yesterday();
//
//        Date date2 =new Date(2021,12,31);
//        date2.tomorrow();
//        date2.yesterday();

        Date date3 = new Date(2021, 3, 1);
        date3.today();
        date3.tomorrow();
        date3.yesterday();
        date3.daysinyear();

//        Date date4 =new Date(2020,3,1);
//        date4.tomorrow();
//        date4.yesterday();
    }

    private void today() {
        System.out.println(String.format("今天是%d年%d月%d日", year, month, day));
    }
}
