package ds.hiephm.creation.prototype;

public class Animal implements Cloneable{
    private String color;
    private String name;
    private String sua;

    public Animal(String color, String name) {
        super();
        this.color = color;
        this.name = name;
    }

    public String getSua() {
        return sua;
    }

    public void setSua(String sua) {
        this.sua = sua;
    }

    @Override
    protected Animal clone() {
        try {
            return (Animal) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", sua='" + sua + '\'' +
                '}';
    }
}
