import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Insert your first name: ");
        String name = scanner.next();

        System.out.println("Insert your age: ");
        int age = scanner.nextInt();

        System.out.println("Your name is " + name + " and you're " + age + " years old.");
    }
}
