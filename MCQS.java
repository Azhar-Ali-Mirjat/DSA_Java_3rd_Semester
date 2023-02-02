import java.util.Scanner;

public class MCQS {
    public static void main(String[] args) {
        System.out.println("\t Obective Type Test");

        System.out.println("Physics is the Branch 0f ");
        int a=1;
        int b=2;
        int c=3;
        int d=4;

        System.out.println(a+"= Physhology \n"+b+"= Science \n"+c+"= Maths \n"+d+"= Chemistry");

        Scanner input= new Scanner(System.in);
        int option= input.nextInt();

        if(option==a){
            System.out.println("Incorrect");
        }
        else if(option==b){
            System.out.println("Correct");
        }
        else if(option==c){
            System.out.println("Incorrect");
        }
        else if(option==d){
                System.out.println("Incorrect");
        }
        else{
            System.out.println("Invalid Option");
        }
    }
    
}
