public class Solver {
    double sum;

    public void sumOfLinearCombination(double[] variables, double index, double stopPoint) {
        sum = 0;
        for (double variable : variables) {
            for (double j = index; j <= stopPoint; j++) {
                sum += variable * j;
            }
        }
        System.out.println("Result: " + sum);
    }

    public void sumOfSequenceOfTerms(double[] variables, double index, double stopPoint) {
        sum = 0;
        for (double variable : variables) {
            sum += variable;
        }
        System.out.println("Result: " + sum);
    }

    public void sumOfConstantV1(double constant, double index, double stopPoint) {
        sum = 0;
        for (double i = index; i <= stopPoint; i++) {
            sum += constant * i;
        }
        System.out.println("Result: " + sum);
    }

    public void sumOfConstantV2(double constant, double index, double stopPoint) {
        sum = 0;
        for (double i = index; i <= stopPoint; i++) {
            sum += constant;
        }
        System.out.println("Result: " + sum);
    }
}