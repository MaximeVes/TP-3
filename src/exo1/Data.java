package exo1;

public class Data {
    // Attributs
    public int nombre;

    // Constructeur
    public Data(int p_nombre) {
        this.nombre = p_nombre;
    }

    // Getter
    public int getNombre() {
        return this.nombre;
    }

    // Autre méthodes
    public synchronized void incrementer() {
        this.nombre++;
    }

    public synchronized void decrementer() {
        this.nombre--;
    }
}
