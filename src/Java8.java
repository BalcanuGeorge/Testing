import java.util.Scanner;

public class ternar {

    public static void main(String[] args) {
        //INSTRUCTIUNI DECIZIONALE
        //TERNAR

        //1.
        Scanner afisare1 = new Scanner(System.in);
        System.out.println("Introduceti un numar:");
        int numarIntrodus = afisare1.nextInt();

        String mesaj = numarIntrodus>0 ? "Numarul este pozitiv!" : "Numarul este negativ!";
        System.out.println(mesaj);
        System.out.println();
        //SAU
        System.out.println(numarIntrodus>0 ? "Numarul este pozitiv!" : "Numarul este negativ!");

        //2.
        Scanner afisare2= new Scanner(System.in);
        int varsta = afisare2.nextInt();
        ystem.out.println(varsta>18 ? "Esti major!" : "Esti minor!");
        System.out.println();

        //3.
        Scanner afisare3 = new Scanner(System.in);
        System.out.println("Iti este somn?");
        boolean adevar = afisare3.nextBoolean();
        System.out.println(adevar? "Mergi si culca-te": "Stai cu noi pana mai tarziu!");
        System.out.println();

        //4.
        Scanner afisare4 = new Scanner(System.in);
        System.out.println("Introduceti primul numar :");
        int primulNumar = afisare4.nextInt();
        System.out.println("Introduceti al doilea numar");
        int alDoileaNumar = afisare4.nextInt();
        System.out.println(primulNumar>alDoileaNumar? "Primul numar este mai mare!":"Al doilea numar este mai mare!");
        System.out.println();

        //5.
        int nr1 =199;
        int nr2 = 299;
        Scanner afisare5 =new Scanner(System.in);
        System.out.println("Introduceti un numar:");
        int numarIntrodus = afisare5.nextInt();
        System.out.println(numarIntrodus>nr1+nr2?"Numarul introdus este mai mare decat cele doua numere":"Numarul introdus nu este mai mare decat cele doua numere");
        System.out.println();

        //6.
        Scanner afisare6 = new Scanner(System.in);
        System.out.println("Introduceti primul numar:");
        int numar = afisare6.nextInt();
        System.out.println("Introduceti al doilea numar:");
        int numar2 = afisare6.nextInt();
        System.out.println(numar+numar2>100? "Suma este mai mare decat 100":"Suma este mai mica decat 100");
        System.out.println();

        //7.
        Scanner afisare7 =new Scanner(System.in);
        System.out.println("Introdu primul numar");
        int primulNumar = afisare7.nextInt();
        System.out.println("Introdu al doilea numar");
        int aldoileaNumar = afisare7.nextInt();
        System.out.println("Introdu al treilea numar");
        int alTreileaNumar = afisare7.nextInt();
        int mediaAritmetica = (primulNumar+aldoileaNumar+alTreileaNumar)/3;
        System.out.println(mediaAritmetica>50? "Media este mai mare decat 50!":"Media este mai mica decat 50");
        System.out.println();


    }
}
