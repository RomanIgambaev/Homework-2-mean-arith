import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Введи 10 чисел, а я найду их среднее арифметическое");
            int number;
            int cointNum = 1;
            int sum = 0;
            while (cointNum <= 10) {
                number = scanner.nextInt();
                sum += number;
                cointNum++;
            }
            int meanArith = sum / 10;
            System.out.println("Среднее арифметическое твоих чисел: " + meanArith);
        }catch (Exception ex) {
            System.out.println("Ты ввёл что то не так");
        }
        }
    }

