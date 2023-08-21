package Exercise;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MovingSineWave extends JPanel implements ActionListener {
    private int xOffset = 0;
    private final int waveFrequency = 100;
    private final int waveAmplitude = 100;
    private final int waveSpeed = 2;

    public MovingSineWave() {
        Timer timer = new Timer(20, this);
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawMovingSineWave(g);
    }

    private void drawMovingSineWave(Graphics g) {
        int height = getHeight();
        int centerY = height / 2;

        g.setColor(Color.BLACK);
        g.fillRect(0, 0, getWidth(), getHeight());

        g.setColor(Color.GREEN);
        for (int x = 0; x < getWidth(); x++) {
            int y = centerY + (int) (Math.sin((x + xOffset) * 2 * Math.PI / waveFrequency) * waveAmplitude);
            g.drawLine(x, centerY, x, y);
        }

        xOffset += waveSpeed;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Moving Sine Wave");
        MovingSineWave sineWave = new MovingSineWave();
        frame.add(sineWave);
        frame.setSize(800, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
