import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int N = input.nextInt();
        
        String formattedTime = convertSeconds(N);
        
        System.out.println(formattedTime);
        
        input.close();
    }
    
    public static String convertSeconds(int totalSeconds) {
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;
        
        return hours + ":" + minutes + ":" + seconds;
    }
}
