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

    public int nroRepeat(ArrayList<Integer> l) {
        ArrayList<Integer> nroRepetidos = new ArrayList<>();
        
        for (int i = 0; i < l.size(); i++) {
            for (int j = i + 1; j < l.size(); j++) {
                if (l.get(i).equals(l.get(j)) && !nroRepetidos.contains(l.get(i))) {
                    nroRepetidos.add(l.get(i));
                    break;
                }
            }
        }
        
        return nroRepetidos.size();
    }

}