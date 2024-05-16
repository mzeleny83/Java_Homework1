import java.math.BigDecimal;
import java.time.LocalDate;


public class Main {
    public static void ukol1() {
        System.out.println("Hello world!");
    }
    public static void ukol2() {
        String uzivatel = "Karel";
        System.out.println(uzivatel);
    }

    public static void ukol3() {
        int pocetLekci = 10;
        System.out.println(pocetLekci);
    }

    public static void ukol4() {
        double cena = 10.0;
        System.out.println(cena);
    }

    public static void ukol5() {
        double cena = 0; // Nastavíme do proměnné hodnotu 0
        // Desetkrát přičteme hodnotu jedna desetina (0,1):
        for (int i = 0; i < 10; i++) {
            cena += 0.1;
               // operátor "+=" znamená: přičti ke stávající
               // hodnotě navíc 0.1
        }
        System.out.println(cena);
        // Má vypsat "1.0". Ale vypíše "0.9999" !!!
    }

    public static void ukol6() {
        BigDecimal cena = BigDecimal.ZERO;  // Inicializace proměnné BigDecimal
        for (int i = 0; i < 10; i++) {
            cena = cena.add(BigDecimal.valueOf(0.1));
        }
        System.out.println(cena);
   }

    public static void ukol7() {
        int vykonMotoru = 120;
        System.out.println("Výkon Motoru je: "+vykonMotoru+" kW.");
    }

    public static void ukol8() {
        int velikostKosile = 37;
        System.out.println("Velikost košile je: "+ velikostKosile+ ".");
    }

    public static void ukol9() {
        System.out.println("Metoda *skoro* bez chybičky!");
    }

    public static void main(String[] args) {
        System.out.println("Oprav chyby a spusť všechny metody!");
        System.out.println("Komentáře odstraníš klávesovou "
                +"zkratkou <Ctrl>+</> - použij lomítko "
                +"na numerické klávesnici.");

        ukol1();
        ukol2();
        ukol3();
        ukol4();
        ukol5();
        ukol6();
        ukol7();
        ukol8();
        ukol9();

        String Name="Karel";
        String Surname="Vašek";
        LocalDate birthdate=LocalDate.of(1973,3,1);
        int numberOfContracts=1500;
        double weightOfCarrot=73.5;
        String cityOfSeat="Brno";
        String registrationPlate="4B43839";
        double consumption=6.3;
        String IPAddress="192.168.48.39";

        double averageWeightOfSoldCarrot=weightOfCarrot/numberOfContracts*1000;

        System.out.println("Průměrné množství prodané mrkve na jednu smlouvu je:"+averageWeightOfSoldCarrot+"kg");
    }}
