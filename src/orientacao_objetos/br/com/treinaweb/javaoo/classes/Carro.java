package orientacao_objetos.br.com.treinaweb.javaoo.classes;

public class Carro extends Veiculo{

    private int quantidadePortas;

    public int getQuantidadePortas() {
        return quantidadePortas;
    }

    public void setQuantidadePortas(int quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }

    public Carro(){
        this.quatidadeRodas = 4;

    }

    @Override
    public void preparar() {
        System.out.println("Colocar cinto de segurança");
    }

    public Carro(String nome, String marca){
        this.quatidadeRodas = 4;
        this.setNome(nome);
        this.setMarca(marca);
    }

}
