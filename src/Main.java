import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть витрату пального на 100 км (літри): ");
        var fuelFor100Km = scanner.nextDouble();

        System.out.println("Введіть відстань, яку проїхало авто (км): ");
        var distance = scanner.nextDouble();
        var fuelUsed = (fuelFor100Km / 100) * distance;
        System.out.println("Скільки всього літрів пального витратило авто? " +fuelUsed);

    }
}