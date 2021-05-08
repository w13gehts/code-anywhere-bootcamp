package map.exemplos;

import java.util.TreeMap;

public class ExercicioFinal {
    public static void main(String[] args) {
        //crie um Map e execute as seguintes operações:
        TreeMap<String, String> estadosBrasileiros = new TreeMap<>();

        //adicione os 26 estados Brasileiros no map, onde a sigla será a chave e o nome do estado o valor
        estadosBrasileiros.put("Acre", "AC");
        estadosBrasileiros.put("Alagoas", "AL");
        estadosBrasileiros.put("Amapá", "AP");
        estadosBrasileiros.put("Amazonas", "AM");
        estadosBrasileiros.put("Bahia", "BA");
        estadosBrasileiros.put("Ceará", "CE");
        estadosBrasileiros.put("Espírito Santo", "ES");
        estadosBrasileiros.put("Goiás", "GO");
        estadosBrasileiros.put("Maranhão", "MA");
        estadosBrasileiros.put("Mato Grosso", "MT");
        estadosBrasileiros.put("Mato Grosso do Sul", "MS");
        estadosBrasileiros.put("Minas Gerais", "MG");
        estadosBrasileiros.put("Pará", "PA");
        estadosBrasileiros.put("Paraíba", "PB");
        estadosBrasileiros.put("Paraná", "PR");
        estadosBrasileiros.put("Pernambuco", "PE");
        estadosBrasileiros.put("Piauí ", "PI");
        estadosBrasileiros.put("Rio de Janeiro", "RJ");
        estadosBrasileiros.put("Rio Grande do Norte", "RN");
        estadosBrasileiros.put("Rio Grande do Sul", "RS");
        estadosBrasileiros.put("Rondônia", "RO");
        estadosBrasileiros.put("Roraima", "RR");
        estadosBrasileiros.put("Santa Catarina", "SC");
        estadosBrasileiros.put("São Paulo", "SP");
        estadosBrasileiros.put("Sergipe", "SE");
        estadosBrasileiros.put("Tocantins", "TO");

        System.out.println(estadosBrasileiros);

        //remova o estado de Minas Gerais
        estadosBrasileiros.remove("Minas Gerais");
        System.out.println(estadosBrasileiros);

        //adicione o Distrito Federal
        estadosBrasileiros.put("Distrito Federal", "DF");
        System.out.println(estadosBrasileiros);

        //verifique o tamanho do mapa
        System.out.println(estadosBrasileiros.size());

        //remova o estado de Mato Grosso do Sul usando o nome
        estadosBrasileiros.remove("Mato Grosso do Sul");
        System.out.println(estadosBrasileiros);

        //navegue em todos os registros do map, mostrando no console no seguinte formato: NOME(SIGLA)
        for (String key: estadosBrasileiros.keySet()) {
            System.out.println(key + " (" +estadosBrasileiros.get(key) + ")");
        }

        //verifique se o estado de Santa Catarina existe no map buscando por sua sigla (SC)
        System.out.println(estadosBrasileiros.containsValue("SC"));

        //verifique se o estado de Maranhão existe no map buscando por seu nome
        System.out.println(estadosBrasileiros.containsKey("Maranhão"));
    }
}
