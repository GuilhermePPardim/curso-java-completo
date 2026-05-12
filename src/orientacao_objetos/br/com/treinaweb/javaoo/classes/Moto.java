package orientacao_objetos.br.com.treinaweb.javaoo.classes;

import orientacao_objetos.br.com.treinaweb.javaoo.excecoes.AcelerarVeiculoLigadoexception;
import orientacao_objetos.br.com.treinaweb.javaoo.excecoes.FrenagemVeiculoDesligadoExeception;

public class Moto extends Veiculo {

    public Moto(){
        this.quatidadeRodas = 2;
    }

    public Moto(String nome, String marca){
        this.quatidadeRodas = 2;
        this.setNome(nome);
        this.setMarca(marca);
    }
    @Override
    public void acelerar () throws AcelerarVeiculoLigadoexception{
        if (this.isLigado()){
            this.velocidade += 3;

        }else {
            throw new AcelerarVeiculoLigadoexception();
        }

    }
    @Override
    public void freiar() throws FrenagemVeiculoDesligadoExeception{
        if (this.isLigado()){
            this.velocidade -= 3;
        }else throw new FrenagemVeiculoDesligadoExeception();
    }

    @Override
    public void preparar() {
        System.out.println("Colocar capacete");
    }
}
