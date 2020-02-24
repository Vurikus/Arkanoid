import javax.swing.*;

public class Game {
    public static void main(String[] args) {

        JFrame game = new JFrame("ARCANOID");
        GamePanel panel = new GamePanel();
        game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;

        game.setContentPane(panel);
        game.setResizable(false);
        game.pack();

        panel.start();

        game.setVisible(true);

    }
}
