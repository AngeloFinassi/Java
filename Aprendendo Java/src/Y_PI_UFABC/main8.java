import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salary = input.nextDouble();
        double rate;
        
        if (salary <= 400.00) {
            rate = 0.15;
        } else if (salary <= 800.00) {
            rate = 0.12;
        } else if (salary <= 1200.00) {
            rate = 0.10;
        } else if (salary <= 2000.00) {
            rate = 0.07;
        } else {
            rate = 0.04;
        }
        
        double moneyEarned = salary * rate;
        double newSalary = salary + moneyEarned;

        System.out.printf("Novo salario: %.2f\n", newSalary);
        System.out.printf("Reajuste ganho: %.2f\n", moneyEarned);
        System.out.printf("Em percentual: %.0f %%\n", rate * 100);
        
        input.close();
    }
}