import java.util.Scanner;

public class EmployeeSalary {
    public static void main(String[] args) {
        Scanner work= new Scanner(System.in);

        System.out.print("Enter Working Hours Per Week = ");
        int workperweek= work.nextInt();

        System.out.println("Enter Amount Per Hour = ");
        int amountperhour= work.nextInt();

        int grossSalaryYearly= 52*(amountperhour*workperweek);

        System.out.print("Yearly Gross Salary is = "+grossSalaryYearly);

        System.out.println("Enter Vacation Days");
        int vacationDays=work.nextInt();

        int grossSalaryYearly2=(vacationDays*amountperhour*8)-grossSalaryYearly;

        if(vacationDays==0){
            System.out.print("Yearly Gross Salary is = "+grossSalaryYearly);
        }
        else{
            System.out.print("Yearly Gross Salary is = "+grossSalaryYearly2);
        }

    }
    
}
