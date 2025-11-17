public class Rektor extends SkolPersoner {

    private String kontor;

    public Rektor(String namn, int ålder, String kontor){
        super(namn, ålder);
        this.kontor = kontor;
    }

    @Override

    public String toString(){
        return "Rektor: " + super.toString() + ", kontor: " + kontor; 
    }

}
