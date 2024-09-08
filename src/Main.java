import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] numbers15 = new double[15];
        numbers15[0] = 1.5;
        numbers15[1] = 1.9;
        numbers15[2] = -1;
        numbers15[3] = -23.4;
        numbers15[4] = -33.4;
        numbers15[5] = 1.4;
        numbers15[6] = 23.4;
        numbers15[7] = 44.4;
        numbers15[8] = -1.5;
        numbers15[9] = -4.5;
        numbers15[10] = 24.5;
        numbers15[11] = 15.5;
        numbers15[12] = -5.5;
        numbers15[13] = -55.5;
        numbers15[14] = 66.6;

        System.out.println("Массив чисел: " + Arrays.toString(numbers15));

        double positive = 0;
        int count = 0;
        boolean negative = false;
        for (double numbers : numbers15) {
            if (numbers < 0 && !negative) {
                negative = true;
            } else if (negative && numbers > 0) {
                positive += numbers;
                count++;
            }
        }
            double averagePositive = (count > 0) ? positive / count : 0;
            System.out.println("Подсчет; " + averagePositive);

        }
    }