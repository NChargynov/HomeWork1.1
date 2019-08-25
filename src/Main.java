public class Main {

    public static void main(String[] args) {
	// write your code here
        SuperHero superHero = new SuperHero("Супермен", 25, 90.6, 190.4,
                CustomColor.BLUE);
        System.out.println(superHero.getinfo());
        superHero.superAbilities();
        System.out.println("________________________");
        superHero.superAbilities("Супер Удар Рукой ");
        System.out.println("________________________");
        superHero.superAbilities("Серия ударов ногами ", 3);
        System.out.println("________________________");

        SpiderMan spiderManRed = new SpiderMan("Питер Паркер", 17, 65.4, 175.4,
                CustomColor.RED,"Американец");
        System.out.println(spiderManRed.getinfo());

        System.out.println("________________________");

        SpiderMan spiderManBlack = new SpiderMan("Эдди Броук", 25, 80.4, 180.4,
                CustomColor.BLACK,"Американец ");
        System.out.println(spiderManBlack.getinfo());

    }
}
