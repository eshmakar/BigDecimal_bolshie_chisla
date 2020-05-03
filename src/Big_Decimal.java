import java.math.BigDecimal;
import java.util.Scanner;

public class Big_Decimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigDecimal b = new BigDecimal(.1);
        BigDecimal b2;
        while (true) {
            System.out.println("Введите степень поднятия:");
            int b0 = scanner.nextInt();
            System.out.println("Выполняю....");
            long start = System.currentTimeMillis();
            b2 = b.pow(b0);
            String s = b2.toString();
            System.out.println("Длина цифр " + s.length());
            long stop = System.currentTimeMillis();
            System.out.println("Выполнено за: " + (double) (stop - start) / 1000 + " секунд, или за " + (double) (stop - start) / 1000 / 60 + " минут");
            System.out.println();

        }
    }
}