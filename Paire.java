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






    ///

    public static void main(String[] args) {
        Paire<String, Integer> p = new Paire<String, Integer>("un", 1);
        Integer i = p.getB();
        String s = p.getA();
        System.out.println(p);
    }
}
