package Act_2_18;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Hora myTime = new Hora();
        Scanner input = new Scanner(System.in);
        boolean restartApp = true;
        while (restartApp){
            System.out.println("Tria una opcio: ");
            System.out.println("    1- Canviar hora");
            System.out.println("    2- Mostrar hora");
            System.out.println("    3- Sortir.");

            int opcio = input.nextInt();
            switch (opcio) {
                case 1:
                    int hour, minute, second;
                    System.out.println("*");
                    System.out.println("*");
                    System.out.println("*");
                    System.out.println("*");
                    System.out.println("*");
                    System.out.println("*");
                    System.out.println("*");
                    System.out.println("*");
                    System.out.println("*");
                    System.out.println("Quin format empraràs (12H/24H)? ");
                    int formatTime = input.nextInt();
                    System.out.println("Canviar hora amb segons? ");
                    System.out.println("    1- Si");
                    System.out.println("    2- No");
                    int canviarAmbSegons = input.nextInt();
                    switch (canviarAmbSegons) {
                        case 1:
                            System.out.println("Introdueix l'hora: ");
                            hour = input.nextInt();
                            System.out.println("Introdueix els minuts: ");
                            minute = input.nextInt();
                            System.out.println("Introdueix els segons: ");
                            second = input.nextInt();
                            System.out.println("Serà PM o AM?");
                            System.out.println("    1- AM");
                            System.out.println("    2- PM");
                            int am_pm = input.nextInt();
                            myTime.setAmPm(am_pm);
                            myTime.setTime_withSeconds(hour, minute, second, formatTime);
                            break;
                        case 2:
                            System.out.println("Introdueix l'hora: ");
                            hour = input.nextInt();
                            System.out.println("Introdueix els minuts: ");
                            minute = input.nextInt();
                            System.out.println("Serà PM o AM?");
                            System.out.println("    1- AM");
                            System.out.println("    2- PM");
                            am_pm = input.nextInt();
                            myTime.setAmPm(am_pm);
                            myTime.setTime(hour, minute, formatTime);
                            break;
                        default:
                            System.out.println("ERROR! Introdueix 's' o 'n'.");
                            break;
            }
                    break;
                case 2:
                    System.out.println("*");
                    System.out.println("*");
                    System.out.println("*");
                    System.out.println("*");
                    System.out.println("*");
                    System.out.println("*");
                    System.out.println("*");
                    System.out.println("*");
                    System.out.println("*");
                    System.out.print("Tria si vols el format de 12 o 24 hores: ");
                    int option_format = input.nextInt();
                    System.out.println("Mostrar hora amb segons? ");
                    System.out.println("    1- Si");
                    System.out.println("    2- No");
                    int mostrarAmbSegons = input.nextInt();
                    if (option_format == 24 && mostrarAmbSegons == 1) {
                        myTime.showTime_24();
                    } else if (option_format == 12) {
                        myTime.showTime_12();
                    } else {
                        System.out.println("ERROR!");
                    }
                    break;
                case 3:
                    restartApp = false;
                    break;
                default:
                    System.out.println("ERROR!");
                    break;
            }
        }
    }
}
