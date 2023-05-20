package EjerciciosTema3;

public class Ejercicios {
    //Ejercicio tema 3
    //Primera parte
    public static void main(String[] args) {
        int resultado = suma(4, 2, 8);
        System.out.println("La suma de los 3 parametros de mi funcion suma es: " + resultado);
        Coche miCoche = new Coche();
        miCoche.agregarPuerta();
        System.out.println("La cantidad de puertas actual de miCoche es:" + miCoche.puertas);
    }

    public static int suma(int a, int b, int c) {
        return a + c + b;
    }
}
    //Segunda parte
    class Coche {
        int puertas = 4;

        public void agregarPuerta() {
            this.puertas++;
        }
    }


