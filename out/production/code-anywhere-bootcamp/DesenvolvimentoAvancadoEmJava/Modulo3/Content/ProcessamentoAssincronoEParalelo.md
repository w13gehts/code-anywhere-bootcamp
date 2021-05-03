## Objetivos da Aula

1. Entender o conceito síncrono e assíncrono
2. Entender o funcionamento da API de Threads do Java
3. Entender o funcionamento da função ParallelStream do Java

#### Threads

Thread é um pequeno programa que trabalha como um subsistema, sendo uma forma de um processo se autodividir em duas ou mais tarefas. Essas tarefas múltiplas podem ser executadas simultaneamente para rodar mais rápido do que um programa em um único bloco ou praticamente juntas. 

```
public class ThreadJava {
    public static void main(String[] args) {
        GeradorPDF iniciarGeradorPDF= new GeradorPDF();
        BarraDeCarregamento iniciarBarraDeCarregamento = new BarraDeCarregamento(iniciarGeradorPDF);

        iniciarGeradorPDF.start();
        iniciarBarraDeCarregamento.start();
    }
}

class GeradorPDF extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Gerar PDF");
    }
}

class BarraDeCarregamento extends Thread  {
   private Thread iniciarGeradorPDF;

   public BarraDeCarregamento(Thread iniciarGeradorPDF) {
       this.iniciarGeradorPDF = iniciarGeradorPDF;
   }

   @Override
    public void run() {
       while (true) {
           try {
               Thread.sleep(500);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
           if (!iniciarGeradorPDF.isAlive()) {
               break;
           }
           System.out.println("Loading... ");
       }
   }
}
```

## Processamento Síncrono e Assíncrono

#### Processamento Síncrono

São todos os processamentos que ocorrem em sequência (sincronia). Os processos são executados em fila. É preciso que um processo termine para que outro processo seja executado. 

```
Imagine você lavando louça e, de repente, você se lembra que tem que fazer uma ligação. A ligação só poderá ser realizada quando o processo lavar louça for finalizado.
```

#### Processamento Assíncrono

Quando dois ou mais processos são realizados ao mesmo tempo é dado o nome de processamento assíncrono. Os processos são realizados simultaneamente sem que um processo necessite que outro termine para ser executado.

```
Lavar a louça e falar no telefone ao mesmo tempo. Se você não sabe como fazer isso, prenda o telefone entre a cabeça e o ombro e tenha as mãos livres para lavar louça.
```

