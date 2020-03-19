import java.util.Scanner;

public class CovertCurrency {
    public static void main(String[] args) {
        final float rate = 23695.00f;
        Scanner scanner = new Scanner(System.in);
        System.out.println("input USD currency: ");
        float usd = scanner.nextFloat();
        float vnd = usd * rate;
        System.out.printf("%5.2f"+" USD = "+"%5.2f VND",usd,vnd);
    }
}
