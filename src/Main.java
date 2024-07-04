package src;

public class Main {
    public static void main(String[] args) {
        SalaryCalculator salaryCalculator = new SalaryCalculatorImpl();

        double a = salaryCalculator.calculateSalary(new Person());
        System.out.println(a);
    }
}
