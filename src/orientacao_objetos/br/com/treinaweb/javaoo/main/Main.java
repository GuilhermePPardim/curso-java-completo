package orientacao_objetos.br.com.treinaweb.javaoo.main;


import orientacao_objetos.br.com.treinaweb.javaoo.classes.Veiculo;

public class Main {

    public static void main(String[] args) {
        try {
            Veiculo corsa = new Veiculo();
            corsa.setMarca("GM");
            corsa.setNome("Corsa");
            corsa.setChassi("123450");
            corsa.abastecer(10);
            System.out.println(corsa.getNome());
            System.out.println(corsa.getQuatidadeCombustivel());
            corsa.ligar();
        }catch (Exception e) {
            System.out.println("##Ocorreu um erro: " + e.getMessage());
        }


    }

}
