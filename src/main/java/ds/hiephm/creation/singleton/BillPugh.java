package ds.hiephm.creation.singleton;

public class BillPugh {
    private BillPugh(){

    }
    public BillPugh getInstance(){
        return HelperInsatance.instance;
    }

    private static class HelperInsatance {
        private static final BillPugh instance = new BillPugh();
    }
}
