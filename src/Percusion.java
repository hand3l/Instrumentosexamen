public class Percusion extends Instrumento {
    private String tipoDePercusion;

    // Constructor
    public Percusion(String nombre, String tipoDePercusion) {
        super(nombre, "Percusión");
        this.tipoDePercusion = tipoDePercusion;
    }

    // Getters y Setters
    public String getTipoDePercusion() {
        return tipoDePercusion;
    }

    public void setTipoDePercusion(String tipoDePercusion) {
        this.tipoDePercusion = tipoDePercusion;
    }

    @Override
    public String imprimir () {
        return super.toString() + ", Tipo de percusión: " + tipoDePercusion;
    }
}

