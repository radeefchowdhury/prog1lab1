import java.util.Scanner;
public class Agecal {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your year of birth");
        int yearBirth = sc.nextInt();
        System.out.println("You're year of birth is: " + yearBirth);
        
        System.out.println("Enter the current year");
        int currentYear = sc.nextInt();
        System.out.println("Current year is: " + currentYear);
        
        int age = currentYear - yearBirth;
        System.out.println("fuck minh your age is: " + age);


        
        
       
        
    }
    
}
