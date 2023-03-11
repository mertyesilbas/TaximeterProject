import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    private static final DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String[] args) {
        // Create Variables
        double distanceKm, perKm = 2.20, totalPay = 10.0;

        // Create Scanner
        Scanner scanner = new Scanner(System.in);

        // Take Input
        System.out.println("Taksimetre Tutar Hesaplama Programına Hoşgeldiniz, \n" + "Lütfen Mesafeyi Giriniz(Km): ");
        distanceKm = scanner.nextDouble();
        System.out.println("Km Başı Ücretlendirme: 2.20 krş.\n" + "En Düşük Ücretlendirme: 20 TL");
        // Calculations
        totalPay += distanceKm * perKm;
        totalPay = (totalPay <= 20.0) ? 20.0 : totalPay;
        System.out.println("Hesaplanan Tutar: " + df.format(totalPay) + " TL");
    }
}