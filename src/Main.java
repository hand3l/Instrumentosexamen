import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // objetos de instrumentos musicales
        Instrumento guitarra = new Cuerda("Guitarra", 6);
        Instrumento saxofon = new Viento("Saxofón", "Metal");
        Instrumento bateria = new Percusion("Batería", "Membrana");

        // Almacenar los objetos en una lista
        ArrayList<Instrumento> instrumentos = new ArrayList<>();
        instrumentos.add(guitarra);
        instrumentos.add(saxofon);
        instrumentos.add(bateria);

        // Mostrar los instrumentos en la lista
        for (Instrumento instrumento : instrumentos) {
            System.out.println(instrumento);
        }
    }
}

