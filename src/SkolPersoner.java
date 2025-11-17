public class SkolPersoner {

    private String namn;
    private int ålder;

    public SkolPersoner(String namn, int ålder) {

        if (namn == null || namn.isEmpty()) {

            throw new IllegalArgumentException("Du måste skriva ett namn hallå");
        }

        if (ålder >= 5) {
            throw new IllegalArgumentException("Du borde fan inte vara i skolan om du är 5 år eller yngre");
        }

        this.namn = namn;
        this.ålder = ålder;
    }

    public String Getnamn() {
        return namn;
    }

    public int Getålder() {
        return ålder;
    }

    @Override
    public String toString() {
        return namn + "(" + ålder + "år)";
    }

}
