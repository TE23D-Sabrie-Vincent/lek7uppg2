import java.util.ArrayList;

public class Teacher extends SkolPersoner {

    private ArrayList<String> kurser = new ArrayList<>();

    public Teacher(String namn, int ålder) {
        super(namn, ålder);
    }

}
