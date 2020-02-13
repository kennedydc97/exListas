package ExerciciosListas;

import java.util.*;

public class testes {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();

        lista.add("alberto");
        lista.add("clementina");
        lista.add("irineu");

        lista.remove(2);

        for(String valor : lista){
            System.out.println(valor);
        }

        System.out.println("----------------------");

        Set<String> listaHash = new HashSet<>();

        listaHash.add("fácil");
        listaHash.add("difícil");
        listaHash.add("fácil");
        listaHash.add("Fácil");
        listaHash.add("qualquer");
        listaHash.add("coisa");
        listaHash.add("hodor");
        listaHash.add("limão");

        listaHash.remove("difícil");

        for (String i : listaHash) {
            System.out.println(i);
        }

        Map<Integer, String> mapa = new HashMap<>();

        mapa.put(4, "fizemos 4 gols contra você");
        mapa.put(2, "fizemos 12 gols contra você");
        mapa.put(5, "fizemos 21 gols contra você");
        mapa.put(1, "fizemos 32 gols contra você");
        mapa.put(7, "fizemos 41 gols contra você");
        mapa.put(12, "fizemos 52 gols contra você");

        mapa.remove(12);

//        String valor = mapa.get(1);

        for(Integer key :mapa.keySet()){
            String valor = mapa.get(key);
            System.out.println(valor + " " + key);
        }


        System.out.println("----------Exercicios-----------");


        System.out.println("----------exercicio 1-----------");

        Map<Integer, String> dicionario = new HashMap<>();

        dicionario.put(0, "Ovos");
        dicionario.put(1, "Água");
        dicionario.put(2, "Escopeta");
        dicionario.put(3, "Cavalo");
        dicionario.put(4, "Dentista");
        dicionario.put(5, "Fogo");

        for(Integer i :dicionario.keySet()){
            String itens = dicionario.get(i);
            System.out.println(i + " " + itens);
        }


        System.out.println("----------exercicio 2-----------");

        Map<String, String> dicionarioApelidos = new HashMap<>();

        dicionarioApelidos.put("João", "Juan, Fissura, Maromba");
        dicionarioApelidos.put("Miguel", "Night Watch, Bruce Wayne, Tampinha");
        dicionarioApelidos.put("Maria", "Wonder Woman, Mary, Marilene");
        dicionarioApelidos.put("Lucas", "Lukinha, Jorge, George");

        for(String i :dicionarioApelidos.keySet()){
            String itens = dicionarioApelidos.get(i);
            System.out.println(i + " " + itens);
        }

        System.out.println("--------exercicio 3-------------");


        List<Integer> listaVazia = new ArrayList<>();
        listaVazia.add(1);
        listaVazia.add(5);
        listaVazia.add(5);
        listaVazia.add(6);
        listaVazia.add(7);
        listaVazia.add(8);
        listaVazia.add(8);
        listaVazia.add(8);

        for(Integer i: listaVazia){
            System.out.println(i);
        }

        System.out.println("---------exercicio 4------------");

        Set<Integer> conjunto = new HashSet<>();

        conjunto.add(1);
        conjunto.add(5);
        conjunto.add(5);
        conjunto.add(6);
        conjunto.add(7);
        conjunto.add(8);
        conjunto.add(8);
        conjunto.add(8);

        for (Integer i : conjunto) {
            System.out.println(i);
        }




    }
}
