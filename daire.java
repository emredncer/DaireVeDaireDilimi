import java.util.Scanner;
public class daire {
    public static void main(String[] args) {
        int r;
        double pi = 3.14, alan, cevre, alpha, alan2;
        Scanner input = new Scanner(System.in);
        System.out.print("Yarıçap değerini giriniz: ");
        r = input.nextInt();
        alan = (pi*r*r);
        cevre = (2*pi*r);
        System.out.println("dairenin çevresi: "+cevre);
        System.out.println("dairenin alanı: "+alan);
        Scanner inp = new Scanner(System.in);
        System.out.print("alanı bulunacak dilimin merkez açısını giriniz: ");
        alpha = inp.nextDouble();
        alan2 = (pi*(r*r)*alpha)/360;
        System.out.println("daire diliminin alanı: "+alan2);
    }
}
