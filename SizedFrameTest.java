import javax.swing.*;
import java.awt.*;

public class SizedFrameTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                SizedFrame frame = new SizedFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}

class SizedFrame extends JFrame {
    public SizedFrame() {

        // Obtém as dimensões da tela
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;

        // Configura a largura e altura do frame e deixa a plataforma decidir a localização
        setBounds(DEFAULT_X, DEFAULT_Y, DEFAULT_WIDTH, DEFAULT_HEIGHT);
        setSize(screenWidth / 2, screenHeight / 2);
        setLocationByPlatform(true);

        // Configura o título e o ícone do frame
        setTitle("Bianca Soares");
        Image img = kit.getImage("icon.png");
        setIconImage(img);
    }

    public static final int DEFAULT_WIDTH = 600;
    public static final int DEFAULT_HEIGHT = 600;
    public static final int DEFAULT_X = 600;
    public static final int DEFAULT_Y = 200;
    public static final String DEFAULT_TITLE = "Bianca Soares";
    public static final int DEFAULT_BOUNDS_X = 600;
    public static final int DEFAULT_BOUNDS_Y = 200; 
}