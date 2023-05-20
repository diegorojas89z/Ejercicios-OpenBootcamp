package EjerciciosTema4;

public class EjercicioDoWhile {

    public static void main(String[] args) {
        int numeroWhile = 0;
        do {
            numeroWhile = numeroWhile + 1;
            System.out.println(numeroWhile);
            break;
        }
        while (numeroWhile < 3);
    }
}
