package jp.ac.uryukyu.ie.e185761;

/**
 * LivingThingクラス。キャラクターの生死に関する情報を管理する。
 */
public class LivingThing {
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead=false;
    /**
     * コンストラクタ。名前、HP、攻撃力を指定する。
     * @param name モンスター名
     * @param hitPoint モンスターのHP
     * @param attack モンスターの攻撃力
     */
    LivingThing(String name,int hitPoint,int attack){
        this.name=name;
        this.hitPoint=hitPoint;
        this.attack=attack;

        dead=false;
    }

    public boolean isDead(){
        return dead;
    }

    public String getName(){
        return name;
    }

    public int getHitPoint(){
        return hitPoint;
    }

    public int getAttack(){
        return attack;
    }

    public void setDead(boolean dead){
        this.dead=dead;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setHitPoint(int hitPoint){
        this.hitPoint=hitPoint;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void attack(LivingThing opponent){
        if(hitPoint<0)return;
        int damage = (int)(Math.random() * attack);
        System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);

        opponent.wounded(damage);
    }

    public void wounded(int damage){

    }

}
