package ds.hiephm.creation.factorymethod;

/**
 * Factory Pattern: là một creational pattern, sử dụng trong việc khơi tạo đối tượng linh hoạt
 */
public class AnimalFactory {
    public static Animal getAnimal(AnimalType type){
        switch (type){
            case CAT:
                return new Cat();
            case DOGE:
                return new Doge();
            default:
                throw new IllegalArgumentException("This bank type is unsupported");
        }

    }
}
