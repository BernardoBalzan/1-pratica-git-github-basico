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

    public int nroRepeat(ArrayList< Integer > l) {
        int aux1 = 0;
        int repetidos = 0;
        for (int i = 0; i < l.size(); i++) {
            aux1 = l.get(i);
            for (int j = 0; j < l.size(); j++) {
                if (aux1 == l.get(j)) {
                    repetidos++;
                }
            }
        }
        return repetidos;
    }

}