package EjercicioTema9;

public class Ejercicios {

    public static void main(String[] args) {

        Cliente personaCliente = new Cliente();
        personaCliente.setEdad(8);
        personaCliente.setNombre("Leon Rojas");
        personaCliente.setTelefono("1112345678");
        personaCliente.setCredito(999);

        System.out.println("La edad de "+personaCliente.getNombre()+" es "+personaCliente.getEdad()+", su telefono es: "+personaCliente.getTelefono()+" y su credito es: "+personaCliente.getCredito());

        Trabajador personaTrabajador = new Trabajador();
        personaTrabajador.setEdad(19);
        personaTrabajador.setNombre("Axel Chambi");
        personaTrabajador.setTelefono("111221315678");
        personaTrabajador.setSalario(10999);

        System.out.println("La edad de "+personaTrabajador.getNombre()+" es "+personaTrabajador.getEdad()+", su telefono es: "+personaTrabajador.getTelefono()+" y su salario es: "+personaTrabajador.getSalario());

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

class Cliente extends Persona{
    private int credito;

    public int getCredito() {
        return this.credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }
}

class Trabajador extends Persona{
    private int salario;

    public int getSalario() {
        return this.salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}