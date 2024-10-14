import java.util.HashMap;

public class Tupla {
    HashMap<String, Registre> fields;

    public Tupla() {
        fields = new HashMap<>();
    }

    public void addField(String name, Registre value) {
        fields.put(name, value);
    }

    public Object getField(String name) {
        return fields.get(name);
    }
}

