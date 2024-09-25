import java.util.Scanner;

public class PemilihanHari14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String dayName, dayType;

        System.out.println("input day name: ");
        dayName = sc.nextLine();
        switch (dayName.toLowerCase()) {
            case "monday" :
            case "tuesday" :
            case "wednesday" :
            case "thursday" :
            case "friday" :
                dayType = "WeekDay";    
                break;
                case "saturday" :
                case "sunday" :
                dayType = "WeekEnd";
                break;
            default:
                dayType = "Invalid day Name";
}

       System.err.println(dayName + " Is a " + dayType); 
    }
}
