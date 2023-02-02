import java.util.Scanner;

public class Ticket {
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);

    
        System.out.print("Enter Your Age = ");
        int age= obj.nextInt();

        if(age>0 && age<13){
            System.out.println("Ticket is 5$");

        }

        else if (age>=13 && age<=65) {
            System.out.println("Ticket is 20$");
            
        } else {
            System.out.println("Age Incorrect = "+age);
            
        }
    }
    
}
