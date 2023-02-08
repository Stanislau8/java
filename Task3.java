public class Task3 {
    public static void main(String[] args) {
        double seconds = 86400;
        double minutes = seconds / 60;
        double hours = minutes / 60;
        double days = hours / 24;
        double weeks = days / 7;
        System.out.printf("seconds = %s \nminutes = %s \nhours = %s \ndays = %s \nweeks = %f \n", seconds,minutes,hours,days,weeks);
    }
}
