public class Katt extends Djur implements DjurInterface {

    public Katt(String namn, int vikt) {
        super(namn, vikt);
    }

    public double getMat(){
        return (getVikt() * 1000) / 150;
    }
    @Override
    void print() {
        System.out.println("Djuret " + getNamn()+ " ska ha " + getMat() + "g mat.");
    }
}