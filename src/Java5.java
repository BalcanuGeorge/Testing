import java.util.Scanner;

public class Exercitii5 {

    public static void main(String[] args) {
        //USER INPUT-CITIREA DE LA CONSOLA
        //String
        Scanner afisare = new Scanner(System.in);
        System.out.println("Introdu numele tau");
        String nume = afisare.nextLine();
        System.out.println("Numele tau este " + nume);
        System.out.println();

        //Valoare numerica
        Scanner numar = new Scanner(System.in);
        System.out.println("Introdu numarul tau preferat");
        int numarPreferat = numar.nextInt();
        System.out.println("Numarul tau preferat este " + numarPreferat);
        System.out.println();

        //Numar Double
        Scanner numar2 = new Scanner(System.in);
        System.out.println("Introdu numarul tau double");
        double numarDouble = numar2.nextDouble();
        System.out.println("Numarul tau double este " + numarDouble);
        System.out.println();

        //Numar Long
        Scanner numar3 = new Scanner(System.in);
        System.out.println("Introdu numarul tau long");
        double numarLong = numar3.nextDouble();
        System.out.println("Numarul tau long este " + numarLong);
        System.out.println();

        //Valoare de adevar
        Scanner valoare = new Scanner(System.in);
        System.out.println("Introdu booleanul tau");
        boolean bool  = valoare.nextBoolean();
        System.out.println("Booleanul tau este " + bool);
        System.out.println();


        //Caracter
        Scanner afisare2 = new Scanner(System.in);
        System.out.println("Introdu un caracter");
        char caracter = afisare2.next().charAt(0);
        System.out.println("Caracterul tau este " + caracter);
        System.out.println();


        //EXERCITII
        //1.
        Scanner afisare3 = new Scanner(System.in);
        System.out.println("Care este tara ta preferata?");
        String taraPreferata = afisare3.nextLine();
        System.out.println("Tara ta preferata este " +taraPreferata);
        System.out.println();

        //2.
        Scanner afisare4 = new Scanner(System.in);
        System.out.println("Care este varsta ta ?");
        int varstaMea = afisare4.nextInt();
        System.out.println("Varsta mea este " +varstaMea + " ani");
        System.out.println();

        //3.
        Scanner afisare5 = new Scanner(System.in);
        System.out.println("Introduce primul numar");
        int n1 =afisare5.nextInt();
        System.out.println("Introduce al doilea numar");
        int n2 =afisare5.nextInt();
        System.out.println("Introduce al treilea numar");
        int n3 =afisare5.nextInt();
        System.out.println("Introduce al patrulea numar");
        int n4 =afisare5.nextInt();
        System.out.println("Introduce al cincilea numar");
        int n5 =afisare5.nextInt();

        int suma = n1+n2+n3+n4+n5;
        int diferenta =n1-n2-n3-n4-n5;
        int media = suma/5;

        System.out.printf("Suma numerelor este %d, diferenta numerelor este %d iar media este %d", suma, diferenta, media);
        System.out.println();

        System.out.println("suma este " + suma);
        System.out.println("diferenta este " +diferenta);
        System.out.println("media este " + media);
        System.out.println();

        //4.
        Scanner afisare6 = new Scanner(System.in);
        System.out.println("Introduceti o temperatura in grade Celsius");
        int temperaturaGradeCelsius = afisare6.nextInt();
        int temperaturaGradeFahrenheit = temperaturaGradeCelsius * (9/5) + 32;
        System.out.println("Rezultatul in grade Fahrenheit este " +temperaturaGradeFahrenheit);
        System.out.println();

        //5.
        Scanner afisare7= new Scanner(System.in);
        System.out.println("Introduceti lungimea dreptunghiului");
        int lungime = afisare7.nextInt();
        System.out.println("Introduceti latimea dreptunghiului");
        int latime = afisare7.nextInt();
        int perimetrul = 2 * lungime + 2 * latime;
        int aria = lungime * latime;
        System.out.println("Perimetrul este " + perimetrul);
        System.out.println("Aria este " + aria);
        System.out.println();

        //6.
        Scanner afisare9 = new Scanner(System.in);
        System.out.println("Cat este ora?");
        int ora = afisare9.nextInt();
        System.out.println("Pana la miezul noptii mai sunt " + (24-ora));
        System.out.println();

        //7.
        Scanner afisare10 = new Scanner(System.in);
        System.out.println("Care este varsta ta?");
        int varstaTa = afisare10.nextInt();
        System.out.println("Te-ai nascut in anul " + (2023-varstaTa));
        System.out.println();

        //8.
        Scanner afisare11 = new Scanner(System.in);
        System.out.println("Cate pagini are carte pe care o citesti ?");
        int paginiCarte = afisare11.nextInt();
        System.out.println("Cate pagini citeste intr-o zi");
        int paginiCititeZi = afisare11.nextInt();
        System.out.println("Vei termina cartea in " + (paginiCarte/paginiCititeZi + " zile"));














    }


}




