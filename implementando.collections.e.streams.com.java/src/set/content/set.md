## java.util.Set

- Implementações que aprenderemos:
  - java.util.HashSet
  - java.util.TreeSet
  - java.util.LinkedHashSet
- Por padrão, não garantem ordem
- Não permite itens repetidos
- Permite adição e remoção normalmente, não possui busca por item e atualização. Para leitura, apenas navegação
- Não permite mudança de ordenação
- 

|                   | Quando Utilizar                                              | Ordenação                                        | Performance                                                  |
| ----------------- | ------------------------------------------------------------ | :----------------------------------------------- | ------------------------------------------------------------ |
| **HashSet**       | Quando não é necessário manter uma ordenação.                | Não é ordenado, e não permite valores repetidos. | Por não ter repetição de valores e não ser ordenado, é a implementação mais performática. |
| **LinkedHashSet** | Quando é necessário manter a ordem de inserção dos elementos. | Mantém a ordem de inserção dos elementos.        | É a implementação mais lenta por ser necessário manter a ordem. |
| **TreeSet**       | Quando é necessário alterar a ordem através do uso de comparators. | Mantém a ordem e pode ser reordenado.            | É performático para leitura. Para modificação tem a necessidade de reordenar, sendo mais lento que o LinkedHashSet. |

