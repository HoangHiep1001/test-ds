package ds.hiephm.creation.absfactory;

import ds.hiephm.creation.absfactory.model.Cat;
import ds.hiephm.creation.absfactory.model.CatKL;
import ds.hiephm.creation.absfactory.model.Doge;
import ds.hiephm.creation.absfactory.model.DogeKL;

public class KLFactory extends AnimalAbstractFactory{
    public Doge createDoge() {
        return new DogeKL();
    }

    public Cat createCat() {
        return new CatKL();
    }
}
