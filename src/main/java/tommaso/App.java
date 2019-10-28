package tommaso;


import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Inserisci l'indirizzo ip: ");
        String ip = scan.nextLine();
        System.out.println(ip_to_int32(ip));
    }

    public static String ip_to_int32(String ip) {
        double n = 0;
        String[] iparr = ip.split("\\.");
        int[] arraymodi = new int[iparr.length];
        int j = iparr.length;
        for (int i = 0; i < arraymodi.length; i++) {
            arraymodi[j - 1] = Integer.valueOf(iparr[i]);
            n += (arraymodi[i] * Math.pow(256, i));
            j--;
        }
        return String.valueOf(n);
    }
}
