package orientacao_objetos.br.com.treinaweb.javaoo.classes;

import orientacao_objetos.br.com.treinaweb.javaoo.excecoes.AbasteciemntoVeixuloLigadoexception;
import orientacao_objetos.br.com.treinaweb.javaoo.excecoes.AcelerarVeiculoLigadoexception;
import orientacao_objetos.br.com.treinaweb.javaoo.excecoes.ChassiInvalidoException;
import orientacao_objetos.br.com.treinaweb.javaoo.excecoes.FrenagemVeiculoDesligadoExeception;

public class Veiculo {

    private String nome;
    private String marca;
    private String chassi;
    protected int quatidadeRodas;
    private float quatidadeCombustivel;
    private boolean ligado;
    protected float velocidade;

    public Veiculo() {
        this.ligado = false;
        this.velocidade = 0;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) throws ChassiInvalidoException{
        if (chassi.length() == 5) {
            this.chassi = chassi;
        } else {
            throw new ChassiInvalidoException(chassi);
        }
    }

    public int getQuatidadeRodas() {
        return quatidadeRodas;
    }


    public float getQuatidadeCombustivel() {
        return quatidadeCombustivel;
    }

    public boolean isLigado() {
        return ligado;
    }

    public float getVelocidade() {
        return velocidade;
    }

    public final void ligar (){
        this.ligado = true;
        this.velocidade = 0;
        System.out.println("O veiculo ligou");

    }

    public final void desligar (){
        this.ligado = false;
        this.velocidade = 0;
        System.out.println("O veiculo desligou");
    }

    public final void abastecer(float litros) throws AbasteciemntoVeixuloLigadoexception{
        if (!this.ligado){
            quatidadeCombustivel += litros;

        } else {
            throw new AbasteciemntoVeixuloLigadoexception();

        }

    }

    public void acelerar() throws AcelerarVeiculoLigadoexception{
        if (this.ligado){
            this.velocidade += 10;
        }else
            throw new AcelerarVeiculoLigadoexception();

    }

    public void  freiar() throws FrenagemVeiculoDesligadoExeception{
        if (this.ligado){
            this.velocidade -= 10;
        }else {
            throw  new FrenagemVeiculoDesligadoExeception();
        }

    }


}
