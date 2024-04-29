package src.structural.p14_flyweight;

public class Car {
    private String producer;
    private String vin;
    private String version;
    private String modelName;
    private Engine engine;

    public Car(String producer, String vin, String version, String modelName, Engine engine) {
        this.producer = producer;
        this.vin = vin;
        this.version = version;
        this.modelName = modelName;
        this.engine = engine;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "producer='" + producer + '\'' +
                ", vin='" + vin + '\'' +
                ", version='" + version + '\'' +
                ", modelName='" + modelName + '\'' +
                ", engine=" + engine +
                '}';
    }
}
