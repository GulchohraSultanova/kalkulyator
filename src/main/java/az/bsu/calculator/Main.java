package az.bsu.calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        homePage();
    }

    public static void homePage() {

        Scanner sc = new Scanner(System.in);

        System.out.println("=========> Calculator <=========");

        System.out.println(" ______________________________");
        System.out.println("|                              |");
        System.out.println("|     Son hesablar     - 1     |");
        System.out.println("|     Ölçü çevirici    - 2     |");
        System.out.println("|     Elmi Calculator  - 3     |");
        System.out.println("|     Adi Calculator   - 4     |");
        System.out.println(" ______________________________");

        System.out.printf("\nZəhmət olmasa seçim edin : ");
        choiseEnter();
    }

    public static void choiseEnter() {
        
        Scanner sc = new Scanner(System.in);
        int choise = sc.nextInt();
        choiseBool(choise);
    }

    public static void choiseBool(int choise) {

        if (choise > 4 || choise < 1) {
            System.out.printf("Seçiminizi düzgün edin : ");
            choiseEnter();
        } else if (choise == 1) {
            lastCalculation();
        } else if (choise == 2) {
            valueConverter();
        } else if (choise == 3) {
            scientificCalculator();
        } else if (choise == 4) {
            simpleCalculator();
        }
    }

    public static void lastCalculation() {

    }

    public static void valueConverter() {

    }

    public static void scientificCalculator() {

    }

    public static void simpleCalculator() {

    }
}
