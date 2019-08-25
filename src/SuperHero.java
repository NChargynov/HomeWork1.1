public class SuperHero extends Man{

    private double weight;
    private double height;
    private CustomColor customColor;

    public SuperHero(String name, int age, double weight, double height, CustomColor customColor) {
        super(name, age);
        this.weight = weight;
        this.height = height;
        this.customColor = customColor;
    }

    void superAbilities(){
        System.out.println("Имеет Супер-Способность Летать. ");
    }

    void superAbilities(String damage){
        System.out.println(damage);
    }

    final void superAbilities(String damage, int number){
        System.out.println(number);
        for (int i=0 ; i<number; i++){
            System.out.println(damage);
        }

    }

    @Override
    public String getinfo() {
        return super.getinfo() + ' ' + getHeight() + ' ' + getWeight() + ' ' + getCustomColor();
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public CustomColor getCustomColor() {
        return customColor;
    }
}
