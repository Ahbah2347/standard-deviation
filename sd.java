import java.util.Arrays;

public class sd {
    public static void main(String[] args) {
        double[] dataSet = {48,36,40,29,45,51,38};
        double mean = Math.round(Arrays.stream(dataSet).sum() / dataSet.length);
        double[] dataSquared = Arrays.stream(dataSet).map((double data) -> Math.pow(Math.abs(data - mean), 2)).toArray();
        double variance = (double) Math.round((Arrays.stream(dataSquared).sum() / dataSet.length) * 10) / 10;
        double standardDeviation = (double) Math.round(Math.sqrt(variance) * 100) / 100;

        System.out.println("Mean: " + mean);
        System.out.println("Variance: " + variance);
        System.out.println("SD: " + standardDeviation);
    }
}