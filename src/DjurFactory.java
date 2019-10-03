public class DjurFactory {

    private Djur djur;

    public Djur createAnimal(String namn){
        switch (namn.toLowerCase()){
            case "sixten":
                this.djur = new Hund("Sixten", 5);
                break;
            case "dogge":
                this.djur = new Hund("Dogge", 10);
                break;
            case "venus":
                this.djur = new Katt("Venus", 5 );
                break;
            case "ove":
                this.djur = new Katt("Ove",3);
                break;
            case "hypno":
                this.djur = new Orm("Hypno", 1);
                break;
        }
        return djur;
    }

}
