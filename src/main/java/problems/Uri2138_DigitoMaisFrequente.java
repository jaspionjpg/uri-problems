package problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Uri2138_DigitoMaisFrequente {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        while (ler.hasNext()) {
            String n = ler.next();
            List<Produto> lista = lista();
            for (char h : n.toCharArray()) {
                for (int i = 0; i < lista.size(); i++) {
                    if ((h + "").equals(lista.get(i).getNome())) {
                        lista.get(i).setQuantidade((lista.get(i).getQuantidade()) + 1);
                    }
                }
            }
            sortAutoComplete(lista);
            System.out.println(lista.get(0).getNome());
        }
    }

    public static List<Produto> lista() {
        List<Produto> lista = new ArrayList<>();
        for (Integer i = 0; i < 10; i++) {
            lista.add(new Produto(i + ""));
        }
        return lista;

    }

    public static void sortAutoComplete(List<Produto> preferencia2) {
        Collections.sort(preferencia2, new Comparator<Produto>() {

            @Override
            public int compare(Produto auto2, Produto auto1) {
                if (auto1.getQuantidade().intValue() == auto2.getQuantidade().intValue()) {
                    return Integer.parseInt(auto1.getNome()) - Integer.parseInt(auto2.getNome());
                } else
                    return auto1.getQuantidade().intValue() - auto2.getQuantidade().intValue();
            }
        });
    }
}

class Produto {
    Integer quantidade = 0;
    String nome;

    public Produto(String nome) {
        this.nome = nome;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
