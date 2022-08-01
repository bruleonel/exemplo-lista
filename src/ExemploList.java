import java.util.ArrayList;
    import java.util.Collections;
    import java.util.Iterator;
    import java.util.List;
public class ExemploList {

private static String[] args;

    public static void main(String[] args) {
        ExemploList.args = args;

        //Formas criar listas usando Collections Java

        /*
        1° List notas = new ArrayList<>(); //antes do Java 5

        2° List<Double> notas = new ArrayList<>() //Generics(jdk 5) - Diamont Operator // Diam.Oper. usa só o sina<> sem o "Double"

        3° ArrayList<Double>notas = new Array List<>(); //Não recomendado

        4° List<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));

        5° List<Double> notas = Array.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        notas.add(10d);
        System.out.println(notas);
        A 5° Forma é Limitada pois não há como modificar o array

        6° List<Double> notas = Listof(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        notas.add(1d);
        System.out.println(notas);
        A 6° Forma é Limitada pois não há como modificar o array
        */
        System.out.print("Criando uma lista e adicionando as sete notas: ");
        List<Double> notas = new ArrayList<>(); // Melhor forma
        notas.add(7.0);
        notas.add(8.5);
        notas.add(3.6);
        notas.add(9.2);
        notas.add(7.1);
        notas.add(7.9);
        System.out.println(notas);

        System.out.println("Exibindo a posição da nota 7.0 "+ notas.indexOf(7d));

        System.out.println("Adicione na lista a nota 8.0 na posição 4:");
        notas.add(4, 8d);

        System.out.println(notas);

        // exibir a terceira nota add
        System.out.println("A terceira nota é a: " + notas.get(2));
        System.out.println(notas);

        //Exibir a menor nota
        System.out.println("A menor nota é: " + Collections.min(notas));

        //Exibir a maior nota
        System.out.println("A menor nota é: " + Collections.max(notas));

        //Soma de dos valores dentro da lista
        // É preciso chamar o método
        Iterator<Double> iterator = notas.iterator();
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        //Iterator há proximo? se true soma (significado do hasNext)
        System.out.println("A soma dos valores é: " + soma);




    }
}

