package ds.hiephm.creation.absfactory;

public class AnimalFactory {
    public static AnimalAbstractFactory getCreate(Type type){
        switch (type){
            case KL:
                return new KLFactory();
            case PAPER:
                return new PaperFactory();
            default:
                throw new UnsupportedOperationException("unsupport");
        }
    }
}
