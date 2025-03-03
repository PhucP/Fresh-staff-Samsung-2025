package double_p.com.Creational_Pattern.Prototype;

public class Galaxy implements Cloneable{
    private String name;

    public Galaxy(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    protected Galaxy clone() throws CloneNotSupportedException {
        return new Galaxy(name);
    }
}
