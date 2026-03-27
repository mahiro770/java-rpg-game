public class Hero{
    String name = "ミナト";
    int hp = 100;

    //攻撃
    public void attack(Matango m){
        System.out.println(this.name + "の攻撃");
        m.hp -=5;
        System.out.println("５ポイントのダメージを与えた！");

        m.attack(this);
    }

//逃げる

    public void run (){
        System.out.println(this.name + "は逃げ出した！");
    }

}