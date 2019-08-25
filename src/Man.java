public class Man {

    private int age;
    private String name;

    public Man(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getinfo(){
        return getName() + " " + getAge();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
