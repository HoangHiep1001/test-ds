package ds.hiephm.creation.absfactory;

public class Test {
    public static void main(String[] args) {
        AnimalAbstractFactory animal = AnimalFactory.getCreate(Type.KL);
        animal.createDoge().create();
    }
}
