package genericite_simple_en_java;

public class Paire<A, B> {
    private A first;
    private B second;

    // Constructeur sans paramètres
    public Paire() {
    }

    public Paire(A first, B second) {
        this.first = first;
        this.second = second;
    }

    public A getA() {
        return first;
    }

    public B getB() {
        return second;
    }

    public void setA(A first) {
        this.first = first;
    }

    public void setB(B second) {
        this.second = second;
    }

    public String toString() {
        return "(" + first + ", " + second + ")";
    }

    // parametrage des methodes d'instance
    // cette methode s'appliquera sur les objets de type A
    public A methodeA() {
        return first;
    }

    // cette methode s'appliquera sur les objets de type B
    public B methodeB() {
        return second;
    }

    // methode pour la comparaison des deux premières composantes de deux paires

    public <C> boolean memeFirst(Paire<A, C> p) {
        return p.getA() == this.getB();
    }

    ///

    public static void main(String[] args) {
        Paire<String, Integer> p = new Paire<String, Integer>("un", 1);
        Integer i = p.getB();
        String s = p.getA();
        System.out.println(p);
        System.out.println(p.methodeA());
        System.out.println(p.methodeB());

        Paire<String, Integer> p1 = new Paire<String, Integer>("deux", 2);

        System.out.println("verification de type ");
        System.out.println(p.memeFirst(p1));
    }
}
