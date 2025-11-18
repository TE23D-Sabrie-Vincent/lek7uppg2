import java.util.ArrayList;

public class Skola {

    private String namn;
    private String adress;
    private Rektor rektor;
    private ArrayList<SkolKlass> klasser = new ArrayList<>();

    public Skola(String namn, String adress, Rektor rektor) {
        this.namn = namn;
        this.adress = adress;
        this.rektor = rektor;
    }

    public void läggTillKlass(SkolKlass klass){
        klasser.add(klass);
    }

    @Override
    public String toString(){
        return "" + namn + "\n Adress:" + adress + "\nrektor" 
        + rektor.Getnamn() + "\nAntal elever " + klasser.size();
    }

}
