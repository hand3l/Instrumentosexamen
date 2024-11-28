public class Instrumento {
    private String nombre;
    private String tipo;

    // Constructor
    public Instrumento(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    // Getters y Setters
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

    @Override
    public String imprimir () {
        return "Instrumento: " + nombre + ", Tipo: " + tipo;
    }
}
