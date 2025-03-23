public class Prova1 {
    public static int m(char c) {
        int t = 11;
        if (c == 'A')
            t = 7;
        if (c == 'B')
            t = 5;
        if (c == 'C')
            t = 3;
        else
            t = t / 2;
        return t;
    }
    
    public static void main(String[] args) {
        System.out.println(m('A')); // Teste com 'A'
    }
}
