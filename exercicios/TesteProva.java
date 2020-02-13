package ExerciciosListas;

import java.util.HashSet;
import java.util.Set;

public class TesteProva {
    public static void main(String[] args) {
        Set<Integer> Inteiros = new HashSet<>();
        Prova prova = new Prova();

        Inteiros.add(1);
        Inteiros.add(2);
        Inteiros.add(3);
        Inteiros.add(4);

        prova.somaTotal(Inteiros);

    }
}
