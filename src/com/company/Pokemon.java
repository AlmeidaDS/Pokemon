package com.company;

/**
 * Created by almeida on 17-10-2016.
 */
public abstract class Pokemon {

    protected int velocidade = 10;
    protected int peso = 50;
    protected float altura = 0.8f; /*metros */
    protected int hp = 70;
    protected String Sexo = "Masculino";
    protected int ataqueEspecial = 40;
    protected int defesaEspecial = 30;


    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;

    }


    public int getVelocidade() {
        return velocidade;

    }

    public void setPeso(int peso) {
        this.peso = peso;

    }

    public int getPeso() {
        return  this.peso = peso;

    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getAltura() {
        return altura;
    }

    public void setHp(int hp) {
        this.hp = hp;

    }

    public int getHp() {
        return hp;

    }
    public void setSexo(String sexo) {
        this.Sexo = sexo;

    }

    public String getSexo() {
        return Sexo;

    }
}

