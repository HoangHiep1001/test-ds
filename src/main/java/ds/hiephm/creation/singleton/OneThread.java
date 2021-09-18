package ds.hiephm.creation.singleton;

public class OneThread {
    private static OneThread instance;
    private OneThread(){

    }
    public static OneThread getInstance(){
        if(instance == null){
            instance = new OneThread();
        }
        return instance;
    }
}
