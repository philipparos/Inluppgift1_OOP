public class Orm extends Djur implements DjurInterface {

    public Orm(String namn, int vikt){
        super(namn, vikt);
    }

    public double getMat(){
        return 20;
    }

    @Override
    void print() {
        System.out.println("Djuret " + getNamn()+ " ska ha " + getMat() + "g mat.");
    }
}
