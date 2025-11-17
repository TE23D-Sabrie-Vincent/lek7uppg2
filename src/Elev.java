public class Elev extends SkolPersoner {
    private String Klass;

    public Elev(String namn, int ålder, String Klass) {

        super(namn, ålder);
        this.Klass = Klass;
    }

    @Override  
    public String toString(){
        return "Elev: " + super.toString() + ", klass: " + Klass;

    }

}
