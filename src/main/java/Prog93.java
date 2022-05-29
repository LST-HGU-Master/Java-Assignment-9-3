public class Prog93 {

    public static void main(String[] args) {

        InvisibleHero h;
        h = new InvisibleHero();
        System.out.println("勇者" + h.name + "が誕生した! HP:" + h.hp + ", isVisible: " + h.isVisible);
        h = new InvisibleHero("工太");
        System.out.println("勇者" + h.name + "が誕生した! HP:" + h.hp + ", isVisible: " + h.isVisible);
        h = new InvisibleHero("工太", 150);
        System.out.println("勇者" + h.name + "が誕生した! HP:" + h.hp + ", isVisible: " + h.isVisible);
        h = new InvisibleHero("工太", 150, false);
        System.out.println("勇者" + h.name + "が誕生した! HP:" + h.hp + ", isVisible: " + h.isVisible);

    }

}

