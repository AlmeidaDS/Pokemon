package com.company;

/**
 * Created by almeida on 17-10-2016.
 */
public class Raichu extends Pikachu {

    protected int defesa = 30;
    protected int hp = 30;
    protected int velocidade = 60;
    protected int attack = 50;
    protected  int especialAttack = 40;
    protected int espcialDefesa = 30;


    public int getEspecialAttack() {
        return especialAttack;
    }

    public void setEspecialAttack(int especialAttack) {
        this.especialAttack = especialAttack;
    }

    public int getEspcialDefesa() {
        return espcialDefesa;
    }

    public void setEspcialDefesa(int espcialDefesa) {
        this.espcialDefesa = espcialDefesa;
    }

    /**
     * +16
     * @param
     */
    public void lightingRod(Pokemon p){

         int d;
         d = (especialAttack*16/100);
         d += especialAttack;
         p.setHp(getHp() - (int) d);
        System.out.println ("A vida é:" + p.getHp());

        if (this.hp == 0){
            System.out.println ("Your Dead Homie , Sorry !" );
        }

    }

}