package ds.hiephm.creation.singleton;

public class MultiThread {

    private static volatile MultiThread instance;

    private MultiThread() {
    }

    public static synchronized MultiThread getInstance() {
        if (instance == null) {
            synchronized (MultiThread.class){
                if(instance == null){
                    instance = new MultiThread();
                }
            }
        }
        return instance;
    }
}
