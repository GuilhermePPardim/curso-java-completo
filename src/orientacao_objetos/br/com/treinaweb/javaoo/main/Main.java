package orientacao_objetos.br.com.treinaweb.javaoo.main;


import orientacao_objetos.br.com.treinaweb.javaoo.classes.Carro;

public class Main {

    public static void main(String[] args) {
        try {
            //Carro corsa = new Carro();
            //corsa.setMarca("GM");
            //corsa.setNome("Corsa");
            Carro corsa = new Carro("Corsa","GM");
            corsa.setChassi("12345");
            corsa.abastecer(10);
            System.out.println(corsa.getNome());
            System.out.println(corsa.getQuatidadeCombustivel());
            System.out.println(corsa.getQuatidadeRodas());
            corsa.ligar();
            Carro celta =new Carro();
            celta.ligar();
        }catch (Exception e) {
            System.out.println("##Ocorreu um erro: " + e.getMessage());
        }


    }

}
