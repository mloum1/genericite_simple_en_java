package genericite_simple_en_java;

public class Paire<A, B> {
    private A first;
    private B second;
    
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
}
    

