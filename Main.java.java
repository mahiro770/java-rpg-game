public class Main{
    public static void main(String[] args){
    

        SuperHero sh = new SuperHero();
        Hero h = new Hero();
        Matango m = new Matango('A');
        PoisonMatango pm = new PoisonMatango('B');

        System.out.println("=====戦闘開始=====");

        sh.attack(m);
        pm.poisonAttack(h);
         h.run();
        sh.run();

        System.out.println("=====戦闘終了=====");



        



    }
}
