package package_1;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class football implements ActionListener {
    private int i_1=0, i_2 =0;
    private JLabel label;
    private JButton button1, button2;
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == button1){
            i_1++;
            label.setText("" + i_1);
        }
        else {
            i_2++;
            label.setText("" + i_2);
        }
    }
    public static void main(String args[]) {
        JFrame frame = new JFrame("My first GUI"); //создаем фрейм окна, передавая ему название в конструктор
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//устанваливаем реакцию окна на закрытие по умолчанию
        frame.setSize(200, 150); //размеры окна в пикселях
//создали панель
        JPanel panel= new JPanel();
//задали свойство панели – цвет фона
        panel.setBackground(Color.PINK);
// задали свойство панели размеры
        panel.setPreferredSize( new Dimension(200,300));
        JButton button1 = new JButton("AC Milan");
        JButton button2 = new JButton("Real Madrid");
        JLabel label = new JLabel("I'm a JLabel", JLabel.CENTER);
        //JLabel l = new JLabel("<html><br>Hello World!<br/>blahblahblah</html>", JLabel.CENTER);
        panel.add(button1); //добавляем кнопку к окну
        panel.add(button2);
        panel.add(label);
        //panel.add(l);
//добавили панель к фрейму
        frame.getContentPane().add(panel);
//упакуем во фрейм
        frame.pack();
        ActionEvent e;
        int i_1=0, i_2 =0;

        frame.setVisible(true); //делаем окно видимым
    }
}
