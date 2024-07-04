package Bank_managment_system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;


public class Login extends JFrame implements ActionListener {
    JButton login,clear,signup;//5040935973276930
    JTextField card_No;
    JPasswordField  pin_No;
    Login(){

        setTitle("Automated Teller Machine");
        setLayout(null);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2=i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l1=new JLabel(i3);
        l1.setBounds(18,10,200,150);
        add(l1);

        JLabel text=new JLabel("WELCOME TO ATM");
        text.setBounds(268,10,400,150);
        text.setFont(new Font("Osward",Font.BOLD,25));
        text.setBackground(Color.RED);
        add(text);

        JLabel card_no=new JLabel("Card No :");
        card_no.setBounds(63,145,150,100);
        card_no.setFont(new Font("Railways",Font.BOLD,20));
        card_no.setBackground(Color.RED);
        add(card_no);

        card_No=new JTextField();
        card_No.setBounds(280,170,200,50);
        card_No.setFont(new Font("Railways",Font.BOLD,20));
        card_No.setBackground(new Color(206, 253, 0));
        add(card_No);

        JLabel pin_no=new JLabel("pin No :");
        pin_no.setBounds(63,247,120,100);
        pin_no.setFont(new Font("Railways",Font.BOLD,20));
        pin_no.setBackground(Color.RED);
        add(pin_no);

        pin_No=new JPasswordField();
        pin_No.setBounds(280,273,200,50);
        pin_No.setFont(new Font("Railways",Font.BOLD,20));
        pin_No.setBackground(new Color(206, 253, 0));
        add(pin_No);

        login=new JButton("Sign in");
        login.setBounds(280,380,80,40);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);

         clear=new JButton("Clear");
        clear.setBounds(400,380,80,40);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);

         signup=new JButton("SignUp");
        signup.setBounds(280,440,200,40);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);
        add(signup);

        getContentPane().setBackground(new Color(0, 122, 200));

        setLocation(400,10);
        setSize(650,650);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent e){
            if(e.getSource()==clear){
                card_No.setText("");
                pin_No.setText("");

            }else if(e.getSource()==signup){
                setVisible(false);
                new SignupOne();
            }else if(e.getSource()==login){
                Conn con=new Conn();
                String card_no=card_No.getText();
                String Pin_no= pin_No.getText();
                String q="SELECT card_no,Pin_no from login WHERE card_no = '"+card_no+"' and Pin_no = '"+Pin_no+"' ";
                try {
                    ResultSet rs = con.s.executeQuery(q);
                    if(rs.next()){
                        setVisible(false);
                        new Transaction(Pin_no).setVisible(true);
                    }
                    else {
                        JOptionPane.showMessageDialog(null,"Incorrect card no and pin");
                    }
                }
                catch(Exception re){
                    System.out.println("Monu kumar");
                    System.out.println(re);
                    System.out.println("kumar raj");
                }
            }
    }
    public static void main(String[] args) {
            new Login();
    }
}
