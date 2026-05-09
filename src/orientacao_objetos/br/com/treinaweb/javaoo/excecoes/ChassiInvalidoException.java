package orientacao_objetos.br.com.treinaweb.javaoo.excecoes;

import java.io.Serial;

public class ChassiInvalidoException extends Exception{

    @Serial
    private static final long serialVersionUID = 7301141137089902761L;

    public ChassiInvalidoException(String chassi){
        super(String.format("este chassi é invalido [%s]",chassi));
    }
    
}
