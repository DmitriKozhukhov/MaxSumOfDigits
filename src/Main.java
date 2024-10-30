import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите целое число. Для завершения программы введите 0.");
        Scanner scanner = new Scanner(System.in);
        int maxSum = 0;
        int numberMaxSum = 0;
        while (true) {
            String str = scanner.nextLine();
            int currentNum = Integer.parseInt(str);
            //System.out.println(currentNum);
            if (currentNum == 0) {
                break;
            }
            char[] array = str.toCharArray();
            int sumOfDigits = 0;
            for (char c : array) {
                sumOfDigits += Character.getNumericValue(c);
            }
            if (sumOfDigits > maxSum) {
                maxSum = sumOfDigits;
                numberMaxSum = currentNum;

            }
        }
        System.out.printf("Число с максимальной суммой цифр: %d",numberMaxSum);
    }
}