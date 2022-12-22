package package_3;
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.Scanner;
import javax.imageio.*;

public class Picture{
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();

       // s = in.nextLine();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.show();
    }
}
class MyFrame extends JFrame{
    public MyFrame(){
        setTitle("Main frame");
        setSize(300, 200);
        MyPanel panel = new MyPanel();
        Container pane = getContentPane();
        pane.add(panel);
    }
}
class MyPanel extends JPanel{
    private Image im;
    public MyPanel(){
        try {
            Scanner in = new Scanner(System.in);
            String s;
            s = in.nextLine();
            im = ImageIO.read(new File(s));
            //"C:\\Users\\Elena\\IdeaProjects\\fifth\\src\\favicon.png"
            //C:\Users\Elena\Downloads\ozero.jpg
            //C:\Users\Elena\IdeaProjects\fifth\src\package_4_2\2.jpg
        }
        catch (IOException ex){}
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(im, 22, 22, null);
    }
}
