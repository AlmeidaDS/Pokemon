package com.company;

/**
 * Created by almeida on 17-10-2016.
 */
public class Pikachu extends  Pokemon {

   public String fraqueza = "Terra;";
   public String abilidades = "Static";
   public int attack = 25;
    public int defesa = 30;
    int peso = 65;
    float altura = 1.8f;
    int hp = 100;
    protected int ataqueEspecial = 40;
    protected int defesaEspecial = 30;


    public void quickAttack (Pokemon o){
        verificaMorte(o);
        int hpActualdaVitima = o.getHp();
        o.setHp(hpActualdaVitima - attack);
        System.out.println(" Vida é agora  PIKACHU: " + o.getHp());

    }
    public void thunderWave (Pokemon o){
        verificaMorte(o);
        float r;

        r = (attack*10/100);
        r+=attack;
        o.setHp(o.getHp() - (int) r);
        System.out.println("Vida é agora : " + o.getHp());
    }

    public void shockElectrico (Pokemon o) {
        verificaMorte(o);
      float y ;
        y = (attack*17/100);
        y+= attack;
        o.setHp(o.getHp() - (int) - y);
        System.out.println("Vida é agora (PIKACHU) : " + o.getHp());


    }

    private void verificaMorte(Pokemon o) {
        if (o.getHp() == 0){
            System.out.println("Morreu PIKACHU");


        }
    }
}