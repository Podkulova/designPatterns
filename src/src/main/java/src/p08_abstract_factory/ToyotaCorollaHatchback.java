package src.p08_abstract_factory;

public class ToyotaCorollaHatchback extends ToyotaCorolla {
    @Override
    public String getType() {
        return "Hatchback";
    }

    @Override
    public Integer getCylinderNum() {
        return 4;
    }

    @Override
    public Float getEngineValue() {
        return 2.0F;
    }
}
