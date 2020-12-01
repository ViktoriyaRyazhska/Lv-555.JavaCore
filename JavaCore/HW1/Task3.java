import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Task3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
        System.out.println("Вкажість ціну за хвилину телефонного дзвінка із США:");
        int usa = Integer.parseInt(br.readLine());
        System.out.println("Вкажість ціну за хвилину телефонного дзвінка із України:");
        int ukraine = Integer.parseInt(br.readLine());
        System.out.println("Вкажість ціну за хвилину телефонного дзвінка із Франції:");
        int france = Integer.parseInt(br.readLine());
        System.out.println("Вкажість тривалість першого дзвінка:");
        int t1 = Integer.parseInt(br.readLine());
        System.out.println("Вкажість тривалість другого дзвінка:");
        int t2 = Integer.parseInt(br.readLine());
        System.out.println("Вкажість тривалість третього дзвінка:");
        int t3 = Integer.parseInt(br.readLine());
        int usat1 = usa * t1;
        int usat2 = usa * t2;
        int usat3 = usa * t3;
        int ukrainet1 = ukraine * t1;
        int ukrainet2 = ukraine * t2;
        int ukrainet3 = ukraine * t3;
        int francet1 = france * t1;
        int francet2 = france * t2;
        int francet3 = france * t3;
        int allusa = usat1 + usat2 + usat3;
        int allukraine = ukrainet1 + ukrainet2 + ukrainet3;
        int allfrance = francet1 + francet2 + francet3;
        int alltime = (t1 + t2 + t3) * 3;
        int allcost = allfrance + allukraine + allusa;
        System.out.println("Звіт:");
        System.out.println("Ціна за хвилину телефонного дзвінка із США = " + usa);
        System.out.println("Ціна за хвилину телефонного дзвінка із України = " + ukraine);
        System.out.println("Ціна за хвилину телефонного дзвінка із Франції = " + france);
        System.out.println("Ціна розмови із України за час першого дзвінка " + t1 + " = " + ukrainet1);
        System.out.println("Ціна розмови із України за час другого дзвінка " + t2 + " = " + ukrainet2);
        System.out.println("Ціна розмови із України за час третього дзвінка " + t3 + " = " + ukrainet3);
        System.out.println("Ціна розмови із США за час першого дзвінка " + t1 + " = " + usat1);
        System.out.println("Ціна розмови із США за час другого дзвінка " + t2 + " = " + usat2);
        System.out.println("Ціна розмови із США за час третього дзвінка " + t3 + " = " + usat3);
        System.out.println("Ціна розмови із Франції за час першого дзвінка " + t1 + " = " + francet1);
        System.out.println("Ціна розмови із Франції за час другого дзвінка " + t2 + " = " + francet2);
        System.out.println("Ціна розмови із Франції за час третього дзвінка " + t3 + " = " + francet3);
        System.out.println("Загальний час розмови  " + alltime + " із України коштуватиме " + allukraine);
        System.out.println("Загальний час розмови  " + alltime + " із США коштуватиме " + allusa);
        System.out.println("Загальний час розмови  " + alltime + " із Франції коштуватиме " + allfrance);
        System.out.println("Загальна сума всіх розмов = " + allcost);
    }
}
