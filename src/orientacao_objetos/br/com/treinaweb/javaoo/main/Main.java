package orientacao_objetos.br.com.treinaweb.javaoo.main;


import orientacao_objetos.br.com.treinaweb.javaoo.classes.Carro;
import orientacao_objetos.br.com.treinaweb.javaoo.classes.Moto;
import orientacao_objetos.br.com.treinaweb.javaoo.classes.Veiculo;
import orientacao_objetos.br.com.treinaweb.javaoo.excecoes.AbasteciemntoVeixuloLigadoexception;
import orientacao_objetos.br.com.treinaweb.javaoo.excecoes.ChassiInvalidoException;

public class Main {

    public static void main(String[] args) {
        try {
            Veiculo corsa = new Carro("Corsa","GM");
            corsa.setChassi("12345");
            corsa.abastecer(10);
            ((Carro)corsa).setQuantidadePortas(4);
            System.out.println(corsa.getNome());
            System.out.println(corsa.getQuatidadeCombustivel());
            System.out.println(corsa.getQuatidadeRodas());
            System.out.println(String.format("O veiculo %s está ligado? %b", corsa.getNome(), corsa.isLigado()));
            corsa.abastecer(10);
            corsa.ligar();
            corsa.acelerar();
            System.out.println(String.format("Velocidade atual do veiculo : %f", corsa.getVelocidade()));
            corsa.freiar();
            System.out.println(String.format("Velocidade atual do veiculo : %f", corsa.getVelocidade()));
            corsa.abastecer(10);
            Carro celta =new Carro();
            celta.ligar();




        }
        catch (AbasteciemntoVeixuloLigadoexception e){
            System.out.println("Não pode abastecer veiculo ligado");
        }
        catch (ChassiInvalidoException e){
            System.out.println("o Chassi é inválido. " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("##Ocorreu um erro: " + e.getMessage());
        }


    }

}
