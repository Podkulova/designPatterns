package src.p08_abstract_factory;

public class AudiA4Sedan extends AudiA4{
    @Override
    public String getType() {
        return "Sedan";
    }

    @Override
    public Integer getCylinderNum() {
        return 6;
    }

    @Override
    public Float getEngineValue() {
        return 2.5F;
    }
}
