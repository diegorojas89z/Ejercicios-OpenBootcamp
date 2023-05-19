package EjerciciosTema4;

public class EjercicioSwitch {

    public static void main(String[]args){
        String estacion = "Otoño";

        switch (estacion){
            case "Invierno":
                System.out.println("La estacion es invierno");
                break;
            case "Verano":
                System.out.println("La estacion es verano");
                break;
            case "Otoño":
                System.out.println("La estacion es otoño");
                break;
            case "Primavera":
                System.out.println("La estacion es primavera");
                break;
            default:
                System.out.println("Usted no ingresó ninguna estación");
        }
    }
}
