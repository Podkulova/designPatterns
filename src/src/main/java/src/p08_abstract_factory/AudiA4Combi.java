package src.p08_abstract_factory;

public class AudiA4Combi extends AudiA4{
    @Override
    public String getType() {
        return "Combi";
    }

    @Override
    public Integer getCylinderNum() {
        return 6;
    }

    @Override
    public Float getEngineValue() {
        return 2.7F;
    }
}
