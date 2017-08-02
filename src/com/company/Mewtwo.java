package com.company;

/**
 * Created by almeida on 24-10-2016.
 */
public class Mewtwo extends  Pokemon {

    protected int hp = 40;
    protected int attack = 60;
    protected int defesa = 40;
    protected int especialAttack = 80;
    protected int defesaEspecial = 40;
    protected int velocidade = 70;


    /**
     * SUPER : faz referência à classe Mãe.
      * super() chama o construtor da classe Mãe.
     *
     * THIS : faz referência à própria classe.
     *
     * @param sexo
     */
    public Mewtwo(String sexo){
        super.setSexo(sexo);

    }

    public void setEspecialAttack(int especialAttack) {
        this.especialAttack = especialAttack;

    }


    public int getEspecialAttack() {
        return especialAttack;

    }

    public void setDefesaEspecial(int defesaEspecial) {
        this.defesaEspecial = defesaEspecial;
    }

    public int getDefesaEspecial() {
        return defesaEspecial;

    }
    public void unever (Pokemon  pokemon){
        float hpeguinte;
        float resolucao;
        hpeguinte = attack * 10 / 100;
        hpeguinte += attack;
        pokemon.setHp(pokemon.getHp() - (int) hpeguinte);
        System.out.println ("Hp actual é :" + pokemon.getHp());

    }
}

