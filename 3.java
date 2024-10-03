import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(1,5);
        int countsChange = 10;
        int count = 0;
        String input = "";
        String result = "";
        String[] words = {"привет", "пока", "время", "почему", "кушать"};

        String resultWord = words[randomNumber - 1];

        for (int p = 0; p < resultWord.length(); p++) result += "_";

        System.out.println("Вы попали на поле чудес, угадываем слова по буквам!");
        System.out.println("Ваше слово - " + result);

        for (int i = 0; i<countsChange; i++){
            if (count == resultWord.length()){
                System.out.println("Вы выиграли! Поздравляю!");
                break;
            }

            System.out.println("Введите букву");
            System.out.println("Ваше число попыток - " + (countsChange - i));
            input = scanner.nextLine();

            if (input.length() > 1) System.out.println("Вы ввели больше одной буквы!");

            else {
                for (int j = 0; j < resultWord.length(); j++){
                    if (resultWord.charAt(j) == input.charAt(0)){
                        System.out.println("Вы угадали букву!");
                        result = result.substring(0, j) + input.charAt(0) + result.substring(j + 1);;
                        System.out.println("Ваше слово - " + result);
                        count++;
                        break;
                    }
                    else {
                        continue;
                    }
                }
            }
        }

        scanner.close();
    }
}