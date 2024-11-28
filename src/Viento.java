public class Viento extends Instrumento {
    private String material;

    // Constructor
    public Viento(String nombre, String material) {
        super(nombre, "Viento");
        this.material = material;
    }

    // Getters y Setters
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String imprimir () {
        return super.toString() + ", Material: " + material;
    }
}
