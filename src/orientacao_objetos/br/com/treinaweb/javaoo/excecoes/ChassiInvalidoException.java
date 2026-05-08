package orientacao_objetos.br.com.treinaweb.javaoo.excecoes;

public class ChassiInvalidoException extends Exception{

    public ChassiInvalidoException(String chassi){
        super(String.format("este chassi é invalido [%s]",chassi));
    }


}
