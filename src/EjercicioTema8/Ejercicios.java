package EjercicioTema8;

public class Ejercicios {

    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.setEdad(33);
        persona.setNombre("Diego Rojas");
        persona.setTelefono("1512345678");

        System.out.println("La edad de "+persona.getNombre()+" es "+persona.getEdad()+" y su telefono es: "+persona.getTelefono());

    }
}

class Persona {
    private int edad;
    private String nombre;
    private String telefono;

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
