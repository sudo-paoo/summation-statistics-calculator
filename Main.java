import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solver sv = new Solver();
        while (true) {
            System.out.println("Choose from the following:");
            System.out.println("[1] Summation of 2 or more variables (summation of a series, linear combination)");
            System.out.println("[2] Summation of 2 or more variables (summation of sequence of terms)");
            System.out.println("[3] Summation of a constant (c Σ xi)");
            System.out.println("[4] Summation of a constant (Σc = nc)");
            System.out.print(">>>> ");

            int choice = sc.nextInt();
            double constant, startingPoint, stoppingPoint;
            int variableCount;
            double[] variables;
            switch (choice) {
                case 1:
                case 2:
                    System.out.print("Enter how many variables: ");
                    variableCount = sc.nextInt();
                    variables = new double[variableCount];
                    for (int i = 0; i < variableCount; i++) {
                        System.out.print("Enter a variable: ");
                        variables[i] = sc.nextDouble();
                    }
                    System.out.print("Enter your starting point: ");
                    startingPoint = sc.nextDouble();
                    System.out.print("Enter your stopping point: ");
                    stoppingPoint = sc.nextDouble();
                    sc.nextLine();
                    if (choice == 1)
                        sv.sumOfLinearCombination(variables, startingPoint, stoppingPoint);
                    else
                        sv.sumOfSequenceOfTerms(variables, startingPoint, stoppingPoint);
                    break;
                case 3:
                case 4:
                    System.out.print("Enter your constant: ");
                    constant = sc.nextDouble();
                    System.out.print("Enter your starting point: ");
                    startingPoint = sc.nextDouble();
                    System.out.print("Enter your stopping point: ");
                    stoppingPoint = sc.nextDouble();
                    sc.nextLine();
                    if (choice == 3)
                        sv.sumOfConstantV1(constant, startingPoint, stoppingPoint);
                    else
                        sv.sumOfConstantV2(constant, startingPoint, stoppingPoint);
                    break;
                default:
                    System.out.println("Invalid choice. Try again");
                    break;
            }
            System.out.print("Enter any key to solve again, n if stop: ");
            if (sc.nextLine().equalsIgnoreCase("n")) {
                break;
            }
        }
        sc.close();
    }
}
