package ds.hiephm.creation.singleton;

public class EargerInit {
    private static final  EargerInit instance = new EargerInit();
    private EargerInit(){

    }
    public static EargerInit getInstance(){
        return instance;
    }
}
