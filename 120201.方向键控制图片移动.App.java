import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class App {
    JPanel myPanel=new JPanel();
    JLabel label_fly=new JLabel();
    int CELL=64;
    //构造方法
    public App() {
        myPanel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if(e.getKeyCode()==e.VK_UP){
                    label_fly.setBounds(label_fly.getX(),label_fly.getY()-CELL,CELL,CELL);
                }
                if(e.getKeyCode()==e.VK_LEFT){
                    label_fly.setBounds(label_fly.getX()-CELL,label_fly.getY(),CELL,CELL);
                }
                if(e.getKeyCode()==e.VK_RIGHT){
                    label_fly.setBounds(label_fly.getX()+CELL,label_fly.getY(),CELL,CELL);
                }
                if(e.getKeyCode()==e.VK_DOWN){
                    label_fly.setBounds(label_fly.getX(),label_fly.getY()+CELL,CELL,CELL);
                }
            }
        });
    }
    //显示窗体方法
    void go(){

        label_fly.setBounds(100,100,CELL,CELL);
        myPanel.add(label_fly);
        java.net.URL imgURL=App.class.getResource("img/plane0.png");
        label_fly.setIcon(new ImageIcon(imgURL));
        myPanel.setFocusable(true);
        myPanel.setLayout(null);
        JFrame frame = new JFrame("飞机小游戏");
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,512,720);
        //frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new App().go();
    }
}
