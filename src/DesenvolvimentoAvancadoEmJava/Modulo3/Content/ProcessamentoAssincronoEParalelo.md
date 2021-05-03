## Objetivos da Aula

1. Entender o conceito síncrono e assíncrono
2. Entender o funcionamento da API de Threads do Java
3. Entender o funcionamento da função ParallelStream do Java

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

#### Future

Classe que encapsula uma chamada feita em paralelo, sendo possível cancelar a execução de uma tarefa, descobrir se a execução já terminou com sucesso ou erro, entre outras operações.

```
public class FutureExemplo {
    private static final ExecutorService pessoasParaExecutarAtividade = Executors.newFixedThreadPool(3);

    public static void main(String[] args) throws InterruptedException {
        Casa casa = new Casa(new Quarto());
        List<Future<String>> futuros =
                new CopyOnWriteArrayList<>(casa.obterAfazeresDaCasa().stream()
                    .map(atividade -> pessoasParaExecutarAtividade.submit(() -> {
                            try {
                                return atividade.realizar();
                            } catch (InterruptedException e){
                                e.printStackTrace();
                            }
                            return null;
                        }))
                        .collect(Collectors.toList()));

        while (true) {
            int numeroDeAtividadesNaoFinalizadas = 0;
            for (Future<?> futuro : futuros) {
                if (futuro.isDone()) {
                    try {
                        System.out.println("Parabens, voce terminou de " + futuro.get());
                        futuros.remove(futuro);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (ExecutionException e) {
                        e.printStackTrace();
                    }
                } else {
                    numeroDeAtividadesNaoFinalizadas++;
                }
            }

            if (futuros.stream().allMatch(Future::isDone)) {
                break;
            }
            System.out.println("Numero de atividades nao finalizadas: " + numeroDeAtividadesNaoFinalizadas);
            Thread.sleep(500);
        }
    pessoasParaExecutarAtividade.shutdown();
    }
}

class Casa {
    private List<Comodo> comodos;

    Casa(Comodo... comodos) {
        this.comodos = Arrays.asList(comodos);
    }

    List<Atividade> obterAfazeresDaCasa() {
        return this.comodos.stream().map(Comodo::obterAfazeresDoComodo)
            .reduce(new ArrayList<Atividade>(), (pivo, atividades) -> {
                pivo.addAll(atividades);
                return pivo;
        });
    }
}

interface Atividade {
    String realizar() throws InterruptedException;
}

abstract class Comodo {
    abstract List<Atividade> obterAfazeresDoComodo();
}

class Quarto extends Comodo {
    @Override
    List<Atividade> obterAfazeresDoComodo() {
        return Arrays.asList(
                this::arrumarACama,
                this::varrerOQuarto,
                this::arrumarGuardaRoupa
        );
    }

    private String arrumarGuardaRoupa() throws InterruptedException {
        Thread.sleep(5000);
        String arrumarOGuardaRoupa = "Arrumar o guarda roupa";
        System.out.println(arrumarOGuardaRoupa);
        return arrumarOGuardaRoupa;
    }

    private String varrerOQuarto() throws InterruptedException {
        Thread.sleep(7000);
        String varrerOQuarto = "Varrer o quarto";
        System.out.println(varrerOQuarto);
        return varrerOQuarto;
    }

    private String arrumarACama() throws InterruptedException {
        Thread.sleep(9000);
        String arrumarACama = "Arrumar a cama";
        System.out.println(arrumarACama);
        return arrumarACama;
    }
}
```

#### Parallel

Você pode executar stream em série ou em paralelo (*Serial ou Parallel*). Quando uma `Stream` é executada em paralelo, java particiona ou divide as streams em várias substreams. Operações de agregação iteram e processam esses substreams em paralelo e, em seguida, combinam os resultados. A intenção da *parallel stream*, é permitir que o processamento seja dividido entre os processadores de sua máquina, por exemplo, se você precisa ordenar uma grande Collection, isto pode ser feito de maneira serial, e consequentemente por uma única Thread, ou de maneira paralela, com duas ou mais Threads.

```
public class ParallelStreamExemplo {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        IntStream.range (1, 100000).forEach(num -> fatorial(num)); //Serial
        long fim = System.currentTimeMillis();
        System.out.println("Tempo de execucao Serial: " +(fim-inicio));

        inicio = System.currentTimeMillis();
        IntStream.range (1, 100000).parallel().forEach(num -> fatorial(num)); //Parallel
        fim = System.currentTimeMillis();
        System.out.println("Tempo de execucao Parallel: " +(fim-inicio));
    }

    public static long fatorial (long num) {
        long fat = 1;

        for (long i = 2; i <= num; i++) {
            fat *= i;
        }
        return fat;
    }
}
```

