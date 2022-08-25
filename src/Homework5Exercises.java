import java.util.Arrays;

public class Homework5Exercises {
    static int[] sirIntregi = {12,33,10,100};

    public static void main(String[] args) {
        System.out.println("Ex 1");
        System.out.println(sumaNumere(sirIntregi));
        System.out.println("Ex 2");
        System.out.println(cautNrImpareInArray(sirIntregi));
        System.out.println("Ex 3");
        System.out.println(Arrays.toString(returnNoGreater(sirIntregi,30)));

    }

    //1.  scrieti o functie care primeste un sir de numere intregi si returneaza suma lor
    public static int sumaNumere(int[] numere){
        int suma=0;
        for (int numar : numere){
            suma +=numar;
        }
        return suma;
    }

    //2 scrieti o functie care primeste un sir de numere intregi si returneaza numarul de elemente impare
    public static int cautNrImpareInArray(int[] sirNr){
        int nrImpare=0;
        for(int nr :sirNr){
            if (nr % 2 != 0){
                nrImpare++;
            }
        }
        return nrImpare;
    }

    //3- scrieti o functie care primeste un sir de numere intregi si un alt numar intreg. Returnati toate numerele mai mari decat numarul primit
    public static String[] returnNoGreater(int[] sirIntregi, int nrDeTestat){
        String resultSir ="";
        for (int i=0; i<sirIntregi.length; i++){
            if(sirIntregi[i] > nrDeTestat){
                resultSir = resultSir + sirIntregi[i] + ",";
            }
        }
        String[] resultArray = resultSir.split(",");
        return resultArray;
    }
}
