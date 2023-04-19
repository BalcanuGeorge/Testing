
public class Java4 {

    public static void main(String[] args) {

        //CONCATENARE
        int numar =10;
        String text = "George";
        double numarDouble = 10.1;
        float numarFloat = 10.1f;
        boolean adevar = true;
        char c = '*';

        System.out.println("Numarul este " +numar);
        System.out.println("Variabila mea String are valoarea " +text);
        System.out.println("Valoarea Double este " +numarDouble);
        System.out.println("Valoarea Float este " +numarFloat);
        System.out.println("Booleanul este " +adevar);
        System.out.println("Caracterul este " +c);
        System.out.println();

        System.out.printf("Numarul meu este %d", numar);
        System.out.println();
        System.out.printf("Variabila mea String are valoarea %s", text);
        System.out.println();
        System.out.printf("Valoarea Double este %f", numarDouble);
        System.out.println();
        System.out.printf("Booleanul este %b", adevar);
        System.out.println();
        System.out.printf("Caracterul meu este %c", c);
        System.out.println();
        System.out.printf("Numarul meu este %d iar variabila mea String este %s", numar, text);
        System.out.println();


        //EXERCITII
        //
        int n1 = 10;
        int n2 = 5;
        int n3 = 7;
        System.out.printf("Primul numar este %d, al doilea este %d, al treilea este %d", n1, n2, n3);
        System.out.println();


        //
        int suma = n1+n2;
        int diferenta = n1-n2;
        int produs = n1*n2;
        int impartire = n1/n2;
        System.out.println("Suma este " +suma);
        System.out.println("Diferenta este " +diferenta);
        System.out.println("Produsul este " +produs);
        System.out.println("Impartirea este " +impartire);
        System.out.println();


        //
        int n4 =1000;
        int n5=270;
        int restulImpartirii = n4%n5;
        System.out.println("Restul impartirii lui n4 la n5 este " +restulImpartirii);
        System.out.printf("Restul impartirii lui %d la %d este egal cu %d", n4, n5, restulImpartirii);
        System.out.println();






    }
}


