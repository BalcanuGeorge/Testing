import java.util.Scanner;

public class forlooop {
    public static void main(String[] args) {

        //INSTRUCTIUNI REPETITIVE
        //FOR
        //1.
        String afisare = "George";
           for (int i = 0; i < 10; i++) {
            System.out.println(afisare);

        }

           for (int i = 0; i <= 10; i++) {
            System.out.println(i);

        }

           for (int i = 10; i >=1 ; i--) {
            System.out.println(i);

        }
        //2.
           for (int i = 3; i <50 ; i++) {
            if(i%2==0){
                System.out.println(i);
            }

        //3.
            for (int i = 0; i < 50; i+=4) {
                System.out.println(i);
            }

        //4.
            for (int i = 10; i < 100 ; i++) {
                if(i%3==0){
                    System.out.print(i + " ");
            }

        //5.
             for(int i = 100; i >=1; i--);
             if(i%5==0){
                 System.out.println(i);
             }

        //6.
             Scanner afisare2 = new Scanner(System.in);
                System.out.println("Introduceti un numar:");
               int numar = afisare2.nextInt();
                if(numar%2==0){
                    for (int i = 1; i < 5; i++) {
                        System.out.println(numar);
                    }else{
                        for (int i = 1; i <10 ; i++) {
                            System.out.println(numar);
                        }
                    }
                    
        //7.
              Scanner scannerText = new Scanner(System.in);
              Scanner scannerInt = new Scanner(System.in);
              System.out.println("Introduceti un text:");
              String text = scannerText.nextLine();
              System.out.println("Introduceti un numar:");
               int numar = scannerInt.nextInt();

                if(numar<5){
                    for (int i = 1; i <5 ; i++) {
                System.out.println(text);

                   }
                   }else{
                    for (int i = 1; i<5 ; i++) {
                System.out.print(text + " ");

            }
        }     
                    
        //8.
               int suma = 0;
                   for (int i = 0; i <=50 ; i++) {
                if(i%2 !=0){
                suma+=i;
                }
                System.out.println("Suma numerelor impare cuprinse intre 0 si 50 este " + suma);     
                   }         
              }              
                       
         //9.
               int suma = 0;
                   for (int i = 1; i <=10 ; i++) {
                suma+=i;
                }
               System.out.println("Suma numerelor cuprinse intre 1 si 10 este " + suma);
                    }
               }         
        
        
          //10.
               int suma = 0;
               int numere =0;
                   for (int i = 1; i <=10 ; i++) {
                suma+=i;
                numere ++;
                }
               int mediaAritmetica = suma/numere;
               System.out.println("Media aritmetica a numerelor cuprinse intre este 1 si 10 este " + mediaAritmetica);
                    }

               }

          //11.
               int suma = 0;
               int produs =1;
                   for (int i = 1; i <=3 ; i++) {
                suma+=i;
                produs *=i;
                }

               System.out.println("Produsul numerelor cuprinse intre este 1 si 3 este " + produs);
                    }

                }




