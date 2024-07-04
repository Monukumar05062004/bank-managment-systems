package Bank_managment_system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
public class PracticeOfGuiProject extends JFrame {
    JLabel l1,l2,l3,l4,l5;
    JTextField t1,t2;
    JButton b1,b2;
    PracticeOfGuiProject(String s1){
        super(s1);
        setVisible(true);
        setSize(900,800);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    PracticeOfGuiProject(){

    }
    public void setComponent(){
        setLayout(null);
        Cursor cr=new Cursor(Cursor.HAND_CURSOR);
       l1 =new JLabel("Welcome to coding");
       l2 =new JLabel("SeeKho institute");
       l3 =new JLabel("Username");
       l4 =new JLabel("Password");
       t1=new JTextField();
       t2=new JTextField();
       l5=new JLabel();
       add(l5);
       l5.setBounds(50,700,120,30);
       b1=new JButton("Login");

        b2=new JButton("Clear");
        add(b2);
        b2.setCursor(cr);
        b2.setBounds(350,400,100,100);
        b2.addActionListener(new Clear());
        add(l4);
        l4.setBounds(200,250,100,30);
        l4.setFont(new Font("Railway",Font.BOLD,18));
        add(t1);
        t1.setBounds(350,200,100,30);

        add(t2);
        t2.setBounds(350,240,100,30);

        add(b1);
       b1 .setCursor(cr);
       b1.setBounds(200,400,100,100);
        b1.addActionListener(new Login());
        add(l1);
        l1.setBounds(200,50,300,30);
        l1.addMouseListener(new MouseL());

        add(l2);
        l2.setBounds(200,90,300,30);

        add(l3);
        l3.setBounds(200,200,100,30);


    }
    public static void main(String[] args) {
        PracticeOfGuiProject ob=new PracticeOfGuiProject("Welcome to coding Seekho Website");
        ob.setComponent();
    }
    class Login implements ActionListener{
        public void actionPerformed(ActionEvent e){
            String name=t1.getText();
            String pass =t2.getText();
            if(name.equals("monu")&&pass.equals("monu123")){
                l5.setText("Login Successful");
            }
            else   l5.setText("Login UnSuccessful");
        }
    }
    public class Clear implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(b2.getText().equals("Clear")){
                t1.setText("");
                t2.setText("");
            }
        }
    }
    class MouseL implements MouseListener{
       public void  mouseReleased(MouseEvent e1){

       }
       public void mouseClicked(MouseEvent e2){


       }
       public void mousePressed(MouseEvent e3){
           l1.setForeground(Color.WHITE);
       }
       public void mouseEntered(MouseEvent e4){

       }
       public void mouseExited(MouseEvent e5){

       }
    }
}
