import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите целое число. Для завершения программы введите 0.");
        Scanner scanner = new Scanner(System.in);
        int maxSum = 0;
        int numberMaxSum = 0;
        while (true) {
            try {
                String str = scanner.nextLine();
                int currentNum = Integer.parseInt(str);
                if (currentNum == 0) {
                    break;
                }
                char[] array = str.toCharArray();
                int sumOfDigits = 0;
                if (currentNum < 0) {
                    for (int i = 1; i < array.length; i++) {
                        sumOfDigits += Character.getNumericValue(array[i]);
                    }
                } else {
                    for (char c : array) {
                        sumOfDigits += Character.getNumericValue(c);
                    }

                }
                if (sumOfDigits > maxSum) {
                    maxSum = sumOfDigits;
                    numberMaxSum = currentNum;

                }
            } catch (NumberFormatException e) {
                System.err.println("Введенные данные не являются целым числом. Введите целое число.");
            }

        }

        System.out.printf("Число с максимальной суммой цифр: %d", numberMaxSum);
    }
}