package Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String name, int age, double height){
        pessoaList.add(new Pessoa(name, age, height));
    }

    public List<Pessoa> ordenarProIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> comprarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa("Nome 1", 20, 1.50);
        ordenacaoPessoa.adicionarPessoa("Nome 2", 21, 1.82);
        ordenacaoPessoa.adicionarPessoa("Nome 3", 27, 1.70);
        ordenacaoPessoa.adicionarPessoa("Nome 4", 30, 1.59);

        System.out.println(ordenacaoPessoa.ordenarProIdade());
        System.out.println(ordenacaoPessoa.comprarPorAltura());
    }

}
