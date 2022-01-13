public class Stations {
    protected String name;
    protected boolean type;

    public Stations(String name, boolean type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public boolean isType() {
        return type;
    }

    @Override
    public String toString() {
        if (type == true)
            return "---" +
                    "name='" + name;
        else
            return "----" +
                    "name='" + name;
    }
}
