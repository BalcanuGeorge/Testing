import java.util.Scanner;

public class swwitch {

    public static void main(String[] args) {

        //INTRUCTIUNI DECIZIONALE
        //SWITCH
        //1.

        Scanner afisare1 = new Scanner(System.in );
        System.out.println("Ce culoare are semaforul?");
        String culoareasSemaforului = afisare1.nextLine();

        switch(culoareasSemaforului){
            case "galben":
                System.out.println("Asteptam, suntem atenti!");
                break;
            case "verde":
                System.out.println("Putem trece strada!");
                break;
            case "rosu":
                System.out.println("Stam pe loc, nu trecem strada!");
                break;
            default:
                System.out.println("Ai introdus o alta culoare care nu esti valida!");
                break;
            System.out.println();

        //2.
            Scanner afisare2 = new Scanner(System.in);
            System.out.println("Care este luna curenta?");
            String lunaCurenta = afisare2.nextLine();

            switch(lunaCurenta){
                case "decembrie.":
                case "ianuarie":
                case "februarie":
                    System.out.println("Este iarna!");
                    break;
                case "martie":
                case "aprilie":
                case "mai":
                    System.out.println("Este primvara!");
                    break;
                case "iunie":
                case "iulie":
                case "august":
                    System.out.println("Este vara!");
                    break;
                case "septembtrie":
                case "octombrie":
                case "noiembrie":
                    System.out.println("Este toamna!");
                    break;
                System.out.println();


        //3.
                Scanner afisare3 = new Scanner(System.in);
                System.out.println("Ce nota ai obtinut la examen?");
                int notaObtinuta = afisare3.nextInt();

                switch (notaObtinuta){
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        System.out.println("Ai picat!");
                        break;
                    case 5:
                    case 6:
                        System.out.println("Este ok dar mai ai de munca!");
                        break;
                    case 7:
                    case 8:
                    case 9:
                        System.out.println("Bravo!");
                        break;
                    case 10:
                        System.out.println("Felicitari!");
                        break;
                    default:
                        System.out.println("Ai introdus o alta nota care nu este valida");
                        break;
                    System.out.println();



        //4.
                    Scanner afisare4 = new Scanner(System.in);
                    System.out.println("In ce clasa esti?");
                    int clasa = afisare4.nextInt();

                    switch (clasa){
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            System.out.println("Esti in scoala primara!");
                            break;
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                            System.out.println("Esti in scoala generala!");
                            break;
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                            System.out.println("Esti in liceu!");
                            break;
                        default:
                            System.out.println("Nu ai introdus o valoare valida");
                            break;
                        System.out.println();



        //5.
                        Scanner afisare5 = new Scanner(System.in);
                        System.out.println("Spune-mi detalii despre anumite tari!");
                        String taraPreferata =afisare5.nextLine();

                        switch (taraPreferata){
                            case "Romania":
                                System.out.println("Este tara mea natala!");
                                break;
                            case "Germania":
                                System.out.println("Imi place limba germana, istoria si cultura!");
                                break;
                            case "Italia":
                                System.out.println("Imi place Roma, peisajele, mancarea!");
                                break;
                            case "Croatia":
                                System.out.println("Imi place litoralul, plajele, tunelurile subterane si muntii stancosi!");
                                break;
                            case "Austria":
                            case "Elvetia":
                                System.out.println("Imi plac muntii Alpi, raurile de munte, peisajele in general!");
                                break;
                            case "Norvegia":
                            case "Danemarca":
                                System.out.println("Imi plac peisajele, cultura, istoria si tot ce tine de vikingi!");
                                break;
                            case "Franta":
                                System.out.println("Capitala Paris este destinatie favorita pentru milioane de turisti!");
                                break;
                            case "Olanda":
                                System.out.println("Orasul Amsterdam este destinatia principala!");
                                break;
                            case "Belgia":
                                System.out.println("Orasul Brugges este cel mai frumos oras vizitat de catre mine!");
                                break;
                            case "Moldova":
                                System.out.println("Capitala este Chisinau!");
                                break;
                        }

                    }
                }



