import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
    }

    public int nOcorrencias(ArrayList<Integer> l, Integer el) {
        int contador = 0;
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i) == el) {
                contador++;
            }
        }

        return contador;
    }

}