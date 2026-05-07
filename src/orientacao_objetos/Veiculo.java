package br.com.treinaweb.javaoo.classes;

import org.w3c.dom.ls.LSOutput;

public class Veiculo {

    private String nome;
    private String marca;
    private String chassi;
    private int quatidadeRodas;
    private float quatidadeCombustivel;

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

    public void setChassi(String chassi) throws Exception{
        if (chassi.length() == 5) {
            this.chassi = chassi;
        } else {
            throw new Exception("O chassi informado é invalido");
        }
    }

    public int getQuatidadeRodas() {
        return quatidadeRodas;
    }


    public float getQuatidadeCombustivel() {
        return quatidadeCombustivel;
    }

    public void setQuatidadeCombustivel(float quatidadeCombustivel) {
        this.quatidadeCombustivel = quatidadeCombustivel;
    }

    public void ligar (){
        System.out.println("O veiculo ligou");

    }

    public void desligar (){
        System.out.println("O veiculo desligou");
    }

    public void abastecer(float litros){
        quatidadeCombustivel += litros;
    }



}
