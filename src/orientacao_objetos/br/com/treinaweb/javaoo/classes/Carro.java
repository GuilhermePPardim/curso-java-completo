package orientacao_objetos.br.com.treinaweb.javaoo.classes;

public class Carro extends Veiculo{

    public Carro(){
        this.quatidadeRodas = 4;

    }
    public Carro(String nome, String marca){
        this.quatidadeRodas = 4;
        this.setNome(nome);
        this.setMarca(marca);
    }
}
