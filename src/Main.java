import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //normalde mesafe başına tutar 0,10 TL ;
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz : ");
        int yas = input.nextInt();
        if (yas <= 0) System.out.println("Geçersiz yaş girdiniz");
        System.out.println("Lütfen gideceğiniz yerin uzaklığını giriniz : ");
        int km = input.nextInt();
        if (km <= 0) System.out.println("Geçersiz uzaklık girdiniz");
        System.out.println("Lütfen yolculuk tipini giriniz : \n 1-Tek yön \n 2-Gidiş-dönüş");
        int tip = input.nextInt();
        if (tip != 1 && tip != 2) {
            System.out.println("Hatalı veri girdiniz...");
        }
        double normal = km * 0.10;
        System.out.println("Normal fiyat : " + normal);
        if (tip == 1) {
            if (yas < 12) {
                normal = normal / 2;
            } else if (yas > 12 && yas < 24) {
                normal = normal - (normal * (0.1));
            } else if (yas > 65) {
                normal = normal - (normal * 0.3);
            }
            System.out.println("İndirim uygulandıysa indirimli fiyat : " + normal);
        }
        if (tip==2){
            normal = normal - (normal*0.2) ;
            if (yas < 12) {
                normal = normal / 2;
            } else if (yas > 12 && yas < 24) {
                normal = normal - (normal * (0.1));
            } else if (yas > 65) {
                normal = normal - (normal * 0.3);
            }
            System.out.println("İndirim uygulandıysa indirimli fiyat : " + normal);
        }
    }
}