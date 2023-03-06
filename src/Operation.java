public class Operation implements Runnable {

    // Attributs
    private char operation;
    private Data d;

    // Constructeur
    public Operation(char p_operation, Data p_d) {
        this.operation = p_operation;
        this.d = p_d;
    }

    // Autres méthodes
    @Override
    public void run() {
        switch (this.operation) {
            case '+' -> {
                for (int i = 0; i < 100000; i++) {
                    d.incrementer();
                }
                System.out.println("[Incrémenter] = " + d.getNombre());
            }
            case '-' -> {
                for (int i = 0; i < 100000; i++) {
                    d.decrementer();
                }
                System.out.println("[Décrémenter] = " + d.getNombre());
            }
            default -> {
            }
        }
    }
}
