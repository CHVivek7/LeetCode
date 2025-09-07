class Solution {
    public int dayOfYear(String str) {
        String[] arr = str.split("-");
        int year  = Integer.parseInt(arr[0]);
        int month = Integer.parseInt(arr[1]);
        int day   = Integer.parseInt(arr[2]);
        int[] monthDays = {31,28,31,30,31,30,31,31,30,31,30,31};
        if (isLeapYear(year) && month >= 2) {
            monthDays[1] = 29;
        } else {
            monthDays[1] = 28; 
        }
        int days = 0;
        for (int i = 0; i < month - 1; i++) {
            days += monthDays[i];
        }
        days += day;
        return days;
    }

    public static boolean isLeapYear(int year){
        if (year % 4 != 0) return false;
        if (year % 100 != 0) return true;
        return (year % 400 == 0);
    }
}