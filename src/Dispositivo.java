public class Dispositivo {

    private int id;
    private String nombre;
    private String tipo;


    private static int contador = 0;

    public Dispositivo(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
        contador++;          // un solo contador para toda la clase
        this.id = contador;  // desafío: ID automático
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public static int getTotalCreados() {
        return contador;
    }

    public void mostrarInfo() {
        System.out.println("Objeto " + id + " -> ID " + id + " | " + nombre + " (" + tipo + ")");
    }
}