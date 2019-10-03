public class Hund extends Djur implements DjurInterface {

    public  Hund(String namn, int vikt){
        super(namn, vikt);
    }

    public double getMat(){
        return (getVikt() * 1000) / 100;
    }
    @Override
    void print() {
        System.out.println("Djuret " + getNamn()+ " ska ha " + getMat() + "g mat.");
    }
}
