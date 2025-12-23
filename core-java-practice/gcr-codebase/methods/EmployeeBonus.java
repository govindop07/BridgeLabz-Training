import java.util.Random;

public class EmployeeBonus {

    public static double[][] generateEmployees(int n) {
        Random rand = new Random();
        double[][] data = new double[n][2]; // [0] = salary, [1] = years
        for (int i = 0; i < n; i++) {
            data[i][0] = 20000 + rand.nextInt(80001); // 20k–100k
            data[i][1] = 1 + rand.nextInt(15);        // 1–15 years
        }
        return data;
    }

    public static double[][] calculateNewSalaryAndBonus(double[][] data) {
        double[][] result = new double[data.length][3]; // old, new, bonus
        for (int i = 0; i < data.length; i++) {
            double oldSal = data[i][0];
            int years = (int) data[i][1];
            double bonusPct = years > 5 ? 0.05 : 0.02;
            double bonus = oldSal * bonusPct;
            double newSal = oldSal + bonus;

            result[i][0] = oldSal;
            result[i][1] = newSal;
            result[i][2] = bonus;
        }
        return result;
    }

    public static void printSummary(double[][] data) {
        double totalOld = 0, totalNew = 0, totalBonus = 0;
        System.out.println("Emp\tOld Salary\tNew Salary\tBonus");
        for (int i = 0; i < data.length; i++) {
            System.out.printf("%d\t%.0f\t\t%.0f\t\t%.0f%n",
                    i + 1, data[i][0], data[i][1], data[i][2]);
            totalOld += data[i][0];
            totalNew += data[i][1];
            totalBonus += data[i][2];
        }
        System.out.println("-----------------------------------------");
        System.out.printf("Total\t%.0f\t\t%.0f\t\t%.0f%n", totalOld, totalNew, totalBonus);
    }

    public static void main(String[] args) {
        double[][] employees = generateEmployees(10);
        double[][] updated = calculateNewSalaryAndBonus(employees);
        printSummary(updated);
    }
}