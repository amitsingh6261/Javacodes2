public class WeekAndDay {
    public static void main(String[] args) {
        int totalDays = 30;

        int weeks = totalDays / 7;
        int remainingDays = totalDays % 7;

        System.out.println("Weeks = " + weeks);
        System.out.println("Remaining Days = " + remainingDays);
    }
}