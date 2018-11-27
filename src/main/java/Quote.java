/**
 * Created by vapa1115 on 11/27/2018.
 */
public class Quote {
    private String name;
    private String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static Quote create(String name, String type) {
        Quote doc = new Quote();
        doc.setName(name);
        doc.setType(type);
        return doc;
    }
}
