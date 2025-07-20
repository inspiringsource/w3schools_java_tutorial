import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PongGame extends JPanel implements ActionListener, KeyListener {

    // Window dimensions
    final int WIDTH = 800, HEIGHT = 600;

    // Ball properties
    int ballX = 400, ballY = 300, ballDiameter = 20;
    int ballSpeedX = 3, ballSpeedY = 3;

    // Paddle properties
    int paddleWidth = 10, paddleHeight = 100;
    int playerY = 250, enemyY = 250;
    int paddleSpeed = 25;

    Timer timer;

    public PongGame() {
        JFrame frame = new JFrame("Java Pong");
        frame.setSize(WIDTH, HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(this);
        frame.setResizable(false);
        frame.setVisible(true);

        frame.setVisible(true);

        // Move these after setVisible
        this.setFocusable(true);
        this.requestFocusInWindow();
        this.addKeyListener(this);

        timer = new Timer(10, this); // Calls actionPerformed every 10ms
        timer.start();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Background
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, WIDTH, HEIGHT);

        // Ball
        g.setColor(Color.WHITE);
        g.fillOval(ballX, ballY, ballDiameter, ballDiameter);

        // Player paddle
        g.fillRect(50, playerY, paddleWidth, paddleHeight);

        // Enemy paddle
        g.fillRect(WIDTH - 60, enemyY, paddleWidth, paddleHeight);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Move ball
        ballX += ballSpeedX;
        ballY += ballSpeedY;

        // Bounce on top/bottom
        if (ballY <= 0 || ballY + ballDiameter >= HEIGHT) {
            ballSpeedY *= -1;
        }

        // Bounce on paddles
        if (ballX <= 60 && ballY + ballDiameter >= playerY && ballY <= playerY + paddleHeight) {
            ballSpeedX *= -1;
        }
        if (ballX + ballDiameter >= WIDTH - 60 && ballY + ballDiameter >= enemyY && ballY <= enemyY + paddleHeight) {
            ballSpeedX *= -1;
        }

        // Enemy AI (simple follow)
        if (enemyY + paddleHeight / 2 < ballY)
            enemyY += paddleSpeed;
        if (enemyY + paddleHeight / 2 > ballY)
            enemyY -= paddleSpeed;

        repaint();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();

        if (code == KeyEvent.VK_UP && playerY > 0) {
            playerY -= paddleSpeed;
        } else if (code == KeyEvent.VK_DOWN && playerY + paddleHeight < HEIGHT) {
            playerY += paddleSpeed;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    public static void main(String[] args) {
        new PongGame();
    }
}