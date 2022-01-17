import java.util.Scanner;

public class Validation {
    private int number;


    public int validation(){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                return number;
            } else
                scanner.next();
            System.out.println("Ввели некорректные данные. Попробуйте ещё раз:");
        }
    }

}
