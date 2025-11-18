public class App {
    public static void main(String[] args) throws Exception {
        Rektor rektor = new Rektor("Johan den envise", 24, "Kontor 513A");
        Skola skola = new Skola("NTI gymnasiet", "Crafoords väg 67", rektor);


        Teacher l1 = new Teacher("Magnus larsson", 67 );
        Teacher l2 = new Teacher("Sara skitunge", 67);

        Elev e1 = new Elev("Noah", 16, "A");
        Elev e2 = new Elev("Viktor", 15, "B");
        Elev e3 = new Elev("Sigma", 17, "C");

        SkolKlass klassT21B = new SkolKlass("T21B", "Måndag-Fredag 08:00 - 15:00");

    }
}
