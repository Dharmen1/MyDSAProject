package array;

public class LeapYear {

    public boolean isLeapYear(int year){
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        int year = 2024;
        LeapYear lP = new LeapYear();
        System.out.println(lP.isLeapYear(year));
    }
}
