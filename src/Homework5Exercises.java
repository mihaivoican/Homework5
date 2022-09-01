import java.util.Arrays;
import java.util.Random;

public class Homework5Exercises {
    static int[] sirIntregi = {12, 33, 10, 100};

    public static void main(String[] args) {
        //some comments
        System.out.println("Ex 1");
        System.out.println(sumaNumere(sirIntregi));
        System.out.println("Ex 2");
        System.out.println(cautNrImpareInArray(sirIntregi));
        System.out.println("Ex 3");
        System.out.println(Arrays.toString(returnNoGreater(sirIntregi, 30)));
        System.out.println("Ex 4");
        System.out.println(adaugDonatii(100000));
        System.out.println("Ex 5");
        System.out.println(adaugDonatii2(1000000, 2));
        System.out.println("Ex 6");
        spargeFraza("Aseara am fost la pasure. A fost frumos pana la un punct. Apoi a venit ploaia. Am fugit repede la masini. Asta a fost escapada de duminica.");
    }

    //1.  scrieti o functie care primeste un sir de numere intregi si returneaza suma lor
    public static int sumaNumere(int[] numere) {
        int suma = 0;
        for (int numar : numere) {
            suma += numar;
        }
        return suma;
    }

    //2 scrieti o functie care primeste un sir de numere intregi si returneaza numarul de elemente impare
    public static int cautNrImpareInArray(int[] sirNr) {
        int nrImpare = 0;
        for (int nr : sirNr) {
            if (nr % 2 != 0) {
                nrImpare++;
            }
        }
        return nrImpare;
    }

    //3- scrieti o functie care primeste un sir de numere intregi si un alt numar intreg. Returnati toate numerele mai mari decat numarul primit
    public static String[] returnNoGreater(int[] sirIntregi, int nrDeTestat) {
        String resultSir = "";
        for (int i = 0; i < sirIntregi.length; i++) {
            if (sirIntregi[i] > nrDeTestat) {
                resultSir = resultSir + sirIntregi[i] + ",";
            }
        }
        String[] resultArray = resultSir.split(",");
        return resultArray;
    }

    //4) scrieti o functie care primeste un numar intreg reprezentand targetul de donatii. Donatiile se vor face cu ajutorul obiectului Random. Primim donatii pana cand ajungem la suma dorita. Cand ajungem la suma dorita afisam un mesaj de succes.
    public static String adaugDonatii(int valMax) {
        int total = 0;
        Random rand = new Random();
        do {
            total += rand.nextInt(valMax);
        } while (total <= valMax);
        return "S-a atins suma dorita. Multumim pt donatii";
    }

    //5) rescrieti functia de la 4 cu urmatoarea modificare: functia va primi si un numar maxim de donatii. Cand acesta se termina, campania se va incheia
    public static String adaugDonatii2(int valMax, int nrDonatii) {
        int total = 0;
        int nrDonatiiCrt = 0;
        Random rand = new Random();
        do {
            total += rand.nextInt(valMax);
            nrDonatiiCrt++;
        } while (total <= valMax && nrDonatiiCrt < nrDonatii);
        if (total >= valMax) {
            return "S-a atins suma dorita. Multumim pt donatii";
        } else if (nrDonatiiCrt == nrDonatii) {
            return "Multumim pt donatii. Campania s-a incheiat";
        } else {
            return "Ceva ciudat s-a intamplat!";
        }
    }

    //6  scrieti o functie care primeste un string cu o fraza (mai multe propozitii despartite prin punct). Printati fiecare propozitie pe o linie noua
    public static void spargeFraza(String fraza){
        String[] frazaSparta = fraza.split("[.]");
        for(String propozitie :frazaSparta){
            System.out.println(propozitie.trim() +".");
        }
    }
}
