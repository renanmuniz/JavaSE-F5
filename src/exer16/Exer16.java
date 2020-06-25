package exer16;

import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

public class Exer16 {

    private List<Pessoa> getDados() {
        List<Pessoa> pessoas = Arrays.asList(new Pessoa("Joao",32,220),
                                             new Pessoa("Maria",18,100),
                                             new Pessoa("Beatriz",13,750),
                                             new Pessoa("Carlos",50,330));
        return pessoas;
    }

    @Test
    public void exer16_1_Filter() {
        List<Pessoa> pessoas = getDados();
        pessoas.forEach((p) -> System.out.println(p));

        System.out.println("Filtrar pela letra M");
        List<Pessoa> lista = pessoas.stream().filter((p) -> p.getNome().startsWith("M")).collect(Collectors.toList());
        lista.forEach((p) -> System.out.println(p));

        System.out.println("Filtrar maior que 18 anos");
        Set<Pessoa> set = pessoas.stream().filter((p) -> p.getIdade() > 18).collect(Collectors.toSet());
        set.forEach((p) -> System.out.println(p));
    }

    @Test
    public void exer16_2_Sorted() {
        List<Pessoa> pessoas = getDados();
        pessoas.forEach((p) -> System.out.println(p));

        System.out.println("Ordenando por idade Crescente:");
        List<Pessoa> lista = pessoas.stream().sorted((p1,p2) -> Integer.compare(p1.getIdade(),p2.getIdade())).collect(Collectors.toList());
        lista.forEach((p) -> System.out.println(p));

        System.out.println("Ordenando por idade Decrescente:");
        List<Pessoa> lista2 = pessoas.stream().sorted((p1,p2) -> Integer.compare(p2.getIdade(),p1.getIdade())).collect(Collectors.toList());
        lista2.forEach((p) -> System.out.println(p));

        System.out.println("Ordenando por nome:");
        List<Pessoa> lista3 = pessoas.stream().sorted((p1,p2) -> p1.getNome().compareTo(p2.getNome())).collect(Collectors.toList());
        lista3.forEach((p) -> System.out.println(p));

        System.out.println("Filtrando maior que 18 anos + ordenando por idade crescente:");
        List<Pessoa> lista4 = pessoas.stream().filter((p) -> p.getIdade() > 18).sorted((p1,p2) -> Integer.compare(p1.getIdade(),p2.getIdade())).collect(Collectors.toList());
        lista4.forEach((p) -> System.out.println(p));
    }

    @Test
    public void exer16_3_Sorted_Referencia_Funcional() {
        List<Pessoa> pessoas = getDados();
        Comparator<Pessoa>crescente=((p1,p2) -> Integer.compare(p1.getIdade(),p2.getIdade()));

        System.out.println("Ordenando por idade crescente:");
        pessoas.stream().sorted(crescente).collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("Pipeline: filtrando menor/igual que 18 + ordenando por idade crescente");
        pessoas.stream().filter(p -> p.getIdade()<=18).sorted(crescente).collect(Collectors.toList()).forEach(System.out::println);
    }

    @Test
    public void exer16_4_Map() {
        List<Pessoa> pessoas = getDados();
        pessoas.forEach(p -> System.out.println(p));

        System.out.println("Mapeando salarios");
        List<Double> salarios = pessoas.stream().map(p1 -> p1.getSalario()).collect(Collectors.toList());
        System.out.println(salarios);

        System.out.println("pipeline: ordenando crescente e mapeando");
        salarios = pessoas.stream().sorted((p1, p2) -> Double.compare(p1.getSalario(), p2.getSalario())).map(p1 -> p1.getSalario()).collect(Collectors.toList());
        System.out.println(salarios);

        System.out.println("Mapeando pessoas para compras");
        List<Compra> compras = pessoas.stream().map(p1 -> new Compra(p1.getNome())).collect(Collectors.toList());
        System.out.println(compras);
    }

    @Test
    public void exer16_5_Funcoes_Gerais(){
        getDados().forEach(p-> System.out.println(p));
        Double valorTotal = getDados().stream().mapToDouble(p1->p1.getSalario()).sum();
        System.out.println("Total="+valorTotal);

        OptionalDouble valor = getDados().stream().mapToDouble(p1 -> p1.getSalario()).average();
        System.out.println("Media="+valor.getAsDouble());

        OptionalDouble maior = getDados().stream().mapToDouble(p1->p1.getSalario()).max();
        System.out.println("Maior="+maior.getAsDouble());

        OptionalDouble menor = getDados().stream().mapToDouble(p1->p1.getSalario()).min();
        System.out.println("Menor="+menor.getAsDouble());

        System.out.println("Qtd maior 18 = "+getDados().stream().filter(p->p.getIdade()>=18).count());

        System.out.println("Qtd menor 18 = "+getDados().stream().filter(p->p.getIdade()<18).count());
    }

    @Test
    public void exer16_6_paralelo(){
        System.out.println("Qta maior 18 paralelo = "+getDados().parallelStream().filter(p->p.getIdade()>=18).count());
    }















}
