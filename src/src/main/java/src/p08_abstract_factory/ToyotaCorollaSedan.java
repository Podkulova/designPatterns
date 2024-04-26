package src.p08_abstract_factory;

public class ToyotaCorollaSedan extends ToyotaCorolla {
    @Override
    public String getType() {
        return "Sedan";
    }

    @Override
    public Integer getCylinderNum() {
        return 4;
    }

    @Override
    public Float getEngineValue() {
        return 1.8F;
    }
}
