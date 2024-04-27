package src.creational.p08_abstract_factory;

public class AudiA4Hatchback extends AudiA4{
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
        return 1.9F;
    }
}
