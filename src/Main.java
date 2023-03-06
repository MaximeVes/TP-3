public class Main {
    public static void main(String[] args) {
        // Déclaration, Initialisation, Instanciation
        Data d = new Data(0);
        Thread t1 = new Thread(new Operation('+', d));
        Thread t2 = new Thread(new Operation('-', d));

        // Starts
        t1.start();
        t2.start();
        while (t1.isAlive() && t2.isAlive()) {
            try {
                Thread.sleep(10);
            } catch (Exception e) {
            }
        }
        System.out.println("[Valeur Finale] = " + d.getNombre());
    }
}