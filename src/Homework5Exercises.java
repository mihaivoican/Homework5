public class Homework5Exercises {
    static int[] sirIntregi = {12,33,10,100};

    public static void main(String[] args) {
        System.out.println(sumaNumere(sirIntregi));
    }

    //1.  scrieti o functie care primeste un sir de numere intregi si returneaza suma lor
    public static int sumaNumere(int[] numere){
        int suma=0;
        for (int numar : numere){
            suma +=numar;
        }
        return suma;
    }
}
