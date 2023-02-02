public class Employee {
    public static void main(String[] args) {
        int age= 29;
        System.out.println("Age is ="+age);

        boolean isAManager=true;
        System.out.println("Is a Manager = "+isAManager);

        double yearsOfService= 2.5;
        System.out.println("Year Of Service = "+yearsOfService);
        
        int baseSalary = 3000;
        System.out.println("Base Salary is = "+baseSalary);

        double overtimePayment= 40;
        double total = baseSalary+overtimePayment;
        System.out.println("Total with Over Time Salary is= "+total);

        double firstBonus, secondBonus, thirdBonus;
        firstBonus=  10.00;
        secondBonus= 22.00;
        thirdBonus= 35.00;

        double sum= firstBonus+secondBonus+thirdBonus;
        System.out.println("Totall Bonus is = "+sum);

        

    }
    
}
