package ds.hiephm.creation.absfactory;

import ds.hiephm.creation.absfactory.model.Cat;
import ds.hiephm.creation.absfactory.model.Doge;

public abstract class AnimalAbstractFactory {
    public abstract Doge createDoge();
    public abstract Cat createCat();
}
