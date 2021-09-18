package ds.hiephm.creation.absfactory;

import ds.hiephm.creation.absfactory.model.Cat;
import ds.hiephm.creation.absfactory.model.CatPaper;
import ds.hiephm.creation.absfactory.model.Doge;
import ds.hiephm.creation.absfactory.model.DogePaper;

public class PaperFactory extends AnimalAbstractFactory{
    public Doge createDoge() {
        return new DogePaper();
    }

    public Cat createCat() {
        return new CatPaper();
    }
}
