import java.awt.EventQueue;
import javax.swing.JFrame;

public class SimpleFrameTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                SimpleFrame frame = new SimpleFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}

class SimpleFrame extends JFrame {
    public SimpleFrame() {
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        setLocation(600, 200);
        setTitle("Bianca Soares");
    }

    public static final int DEFAULT_WIDTH = 600;
    public static final int DEFAULT_HEIGHT = 600;
    public static final int DEFAULT_X = 600;
    public static final int DEFAULT_Y = 200;
    public static final String DEFAULT_TITLE = "Bianca Soares";
}
