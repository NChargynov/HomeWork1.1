final public class SpiderMan extends SuperHero {

    private String nation;
    private CustomColor customColor;

    public SpiderMan(String name, int age, double weight, double height,
                     CustomColor customColor, String nation) {
        super(name, age, weight, height, customColor);
        this.nation = nation;
        this.customColor = customColor;
    }

    @Override
    public String getinfo() {
        return super.getinfo() + ' ' + getNation();
    }

    public String getNation() {
        return nation;
    }

    @Override
    public CustomColor getCustomColor() {
        return customColor;
    }
}
