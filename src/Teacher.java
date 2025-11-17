import java.util.ArrayList;

public class Teacher extends SkolPersoner {

    private ArrayList<String> kurser = new ArrayList<>();

    public Teacher(String namn, int ålder) {
        super(namn, ålder);
    }

    public void läggTillKurs(String kurs){
        kurser.add(kurs);
    }

    @Override
    public String toString(){
        return "Lärare: " + super.toString() + ", kurser: " + kurser;
    }

}
