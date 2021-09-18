package ds.hiephm.creation.prototype;

public class Client {
    public static void main(String[] args) {
        Animal cat = new Animal("black","meo");
        Animal dog = cat.clone();

        dog.setSua("gogo");
        System.out.println(cat.toString());
        System.out.println(dog.toString());
    }
}
