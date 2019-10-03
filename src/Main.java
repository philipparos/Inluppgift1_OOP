import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        DjurFactory djur = new DjurFactory();

        String namn = JOptionPane.showInputDialog("Vilket djur ska få mat?");
        Djur returneratDjur = djur.createAnimal(namn);
        returneratDjur.print();
    }
}
