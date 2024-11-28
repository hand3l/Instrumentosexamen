
public class Cuerda extends Instrumento {
    private int numeroDeCuerdas;

    // Constructor
    public Cuerda(String nombre, int numeroDeCuerdas) {
        super(nombre, "Cuerda");
        this.numeroDeCuerdas = numeroDeCuerdas;
    }

    // Getters y Setters
    public int getNumeroDeCuerdas() {
        return numeroDeCuerdas;
    }

    public void setNumeroDeCuerdas(int numeroDeCuerdas) {
        this.numeroDeCuerdas = numeroDeCuerdas;
    }

    @Override
    public String imprimir() {
        return super.toString() + ", Número de cuerdas: " + numeroDeCuerdas;
    }
}

