package Bank_managment_system;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.*;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
public class Deposit extends JFrame implements ActionListener{
    JButton deposit,exit;
    JTextField amount;
    String pinNo;
    Deposit(String pinNo){
        this.pinNo=pinNo;
        setLayout(null);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image img=i1.getImage().getScaledInstance(900,800,Image.SCALE_DEFAULT);
        ImageIcon i2=new ImageIcon(img);
        JLabel j1=new JLabel(i2);
        j1.setBounds(0,0,900,800);
        add(j1);

        JLabel text = new JLabel("Enter the amount you want to deposit");
        //text.setBackground(Color.black);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("system",Font.BOLD,16));
        text.setBounds(170,259,350,20);
        j1.add(text);

        amount=new JTextField();
        amount.setBackground(Color.white);
        amount.setForeground(Color.blue);
        amount.setFont(new Font("system",Font.BOLD,16));
        amount.setBounds(170,300,300,22);
        amount.addActionListener(this);
        j1.add(amount);

        deposit=new JButton("Deposit");
        deposit.setBounds(355,435,150,24);
        deposit.addActionListener(this );
        j1.add(deposit);
        setVisible(true);

        exit=new JButton("Exit");
        exit.setBounds(355,462,150,24);
        exit.addActionListener(this);
        j1.add(exit);
        setBounds(250,10,900,800);
    }
public  void actionPerformed(ActionEvent e){
        if(e.getSource()==exit){
            System.exit(0);
        }else{
            String number=amount.getText();
            Date date=new Date();
            if(number.equals("")){
                JOptionPane.showMessageDialog(null,"Sir please Enter some amount");
            }
            try {
                Conn c = new Conn();
                String Querymonu = "insert into bank values('"+pinNo+"','"+date+"','Deposite','"+number+"')";
                c.s.executeUpdate(Querymonu);
                JOptionPane.showMessageDialog(null,"Rs "+number+" deposit in your account");
                setVisible(false);
                new Transaction(pinNo).setVisible(true);

            }
            catch(Exception E){
                System.out.println(E);
            }
        }
}
    public static void main(String[] args) {
        new Deposit("");
    }
    
}
