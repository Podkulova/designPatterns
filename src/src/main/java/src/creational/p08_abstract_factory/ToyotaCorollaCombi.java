package src.creational.p08_abstract_factory;

public class ToyotaCorollaCombi extends ToyotaCorolla {
    @Override
    public String getType() {
        return "Combi";
    }

    @Override
    public Integer getCylinderNum() {
        return 4;
    }

    @Override
    public Float getEngineValue() {
        return 2.F;
    }
}
