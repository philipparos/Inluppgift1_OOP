abstract class Djur {
    private String namn;
    private int vikt;

    public Djur(){

    }
    public Djur(String namn, int vikt){
        this.namn = namn;
        this.vikt = vikt;
    }

    public void setNamn(String namn){
        this.namn = namn;
    }

    public String getNamn() {
        return namn;
    }

    public int getVikt() {
        return vikt;
    }

    public void setVikt(int vikt) {
        this.vikt = vikt;
    }
    abstract void print();
}
