package ExerciciosListas;

import java.util.Set;

public class Prova {


    public void somaTotal(Set<Integer>conjuntoDeInteiros){
        int soma = 0;
        for (Integer i : conjuntoDeInteiros) {
            soma+= i;
        }
        System.out.println(soma);
    }
}