public class Main {
    public static void main(String[] args) {
//        //Criação da fila circular
        CircularQueue circularQueue = new CircularQueue(6);
//        LinkedQueue linkedQueue = new LinkedQueue();

        //Adição de elementos na fila
        circularQueue.add(1);
        circularQueue.add(3);
        circularQueue.add(5);
        circularQueue.add(7);
        //Imprime a fila
        System.out.println("Fila atual : " + circularQueue);

        //Remoção do primeiro elemento da fila
        System.out.println("Elemento removido: " + circularQueue.remove());
        //Imprime a fila
        System.out.println("Fila atual : " + circularQueue);
        //Remoção do primeiro elemento da fila
        System.out.println("Elemento removido: " + circularQueue.remove());
        //Imprime a fila
        System.out.println("Fila atual : " + circularQueue);

        System.out.println("Adicionando elementos 9 e 2");
        //Adição de novos elementos da fila (atingindo a capacidade máxima que é 6)
        circularQueue.add(9);
        circularQueue.add(2);
        //Imprime a fila
        System.out.println("Fila atual : " + circularQueue);

        System.out.println("Adicionando elemento 4");
        //Adição de um novo elemento à fila (excedendo a capacidade máxima)
        //Será que vamos ter um erro por inserir um elemento fora da capacidade da fila?
        circularQueue.add(4);
        //Aparentemente não tivemos erro, porquê?
        //Veja que na linha 15 e na linha 19 nós removemos 2 elementos da nossa fila
        //Como a nossa fila é circular, nós vamos reutilizar esses dois espaços que liberamos
        //Com isso podemos inserir 2 novos elementos sem obter nenhum erro

        //Imprime a fila
        //Perceba que o elemento 4 foi inserido no início da fila, reaproveitando o espaço anteriormente ocupado por outro elemento
        //Será que quando chamarmos o método remove() vamos remover o 4 da fila?
        System.out.println("Fila atual : " + circularQueue);
        //Remoção do primeiro elemento da fila
        System.out.println("Elemento removido: " + circularQueue.remove());
        //Perceba que o elemento que foi removido não foi o 4 e sim o 5, porque isso?
        //Lembrem que o que define onde está o início da nossa fila é a variável base e não a ordem dos elementos no array
        //Independente de inserir um elemento no início da fila, o que vale é a variável base
        //Depois de remover os elementos 1 e 3 que havíamos inserido na linha 7 e 8
        //a variável base passou a guardar a posição do elemento seguinte, que no caso é o 5
        //Por isso, em uma estrutura circular, nunca use como base a ordem dos elementos no array, e sim a variável que armazena o primeiro elemento (base)

        //Imprime a fila
        System.out.println("Fila atual : " + circularQueue);

        System.out.println("Adicionando elementos 6 e 8");
        //Vamos inserir mais 2 elementos para encher a nossa fila
        //Adição de novos elementos à fila
        circularQueue.add(6);
        circularQueue.add(8);

        //Imprime a fila
        //Veja que agora nossa fila está REALMENTE cheia
        System.out.println("Fila atual : " + circularQueue);

        //O que será que acontece agora se adicionarmos um novo valor à fila está REALMENTE cheia?
        System.out.println("Adicionando valor 30");
        //Adição de um novo elemento
        circularQueue.add(30);
        //Agora sim deu erro!

//        linkedQueue.add(1);
//        linkedQueue.add(2);
//        linkedQueue.add(4);
//
//        System.out.println(linkedQueue.remove());
//        System.out.println(linkedQueue.remove());
//        System.out.println(linkedQueue.remove());


        //Deixei esse exemplo aqui comentado para vocês entenderem a situação especial da fila circular vazia e cheia
//        circularQueue.add(1); //base = [0] top = [0] (base e top iguais, mas a pilha não está cheia)
//        circularQueue.add(2); //base = [0] top = [1]
//        circularQueue.add(3); //base = [0] top = [2]
//
//        System.out.println(circularQueue);
//
//        circularQueue.remove(); //base = [1] top = [2]
//        circularQueue.remove(); //base = [2] top = [2] (base e top igual, pilha cheia)
//
//        System.out.println(circularQueue);
//
//        circularQueue.add(4); //base = [0] top = [2] (Por conta de ser circular, como há espaço no início, volta para o início)
    }
}
