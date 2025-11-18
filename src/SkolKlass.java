import java.util.ArrayList;

public class SkolKlass {

    private String namn;
    private ArrayList<Elev> Elever = new ArrayList<>();
    private String schema;

    public SkolKlass(String namn, String schema) {
        this.namn = namn;
        this.schema = schema;

    }

    public void läggTillElev(Elev e) {
        Elever.add(e);
    }

    @Override
    public String toString() {
        return "Klass: " + namn + ", Elever: " + Elever.size() + ", Schema: " + schema;
    }

}
