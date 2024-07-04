package Bank_managment_system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Date;
public class Credit extends Frame implements ActionListener{
    String Pin_no;
    JTextField tf;
    JButton exit,credit;
    Credit(String Pin_no){
        this.Pin_no=Pin_no;
       // this.number=number;
        setVisible(true);
        ImageIcon ii=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image im=ii.getImage().getScaledInstance(800,900,Image.SCALE_DEFAULT);
        ImageIcon ii1=new ImageIcon(im);
        JLabel j1=new JLabel(ii1);
        j1.setBounds(0,0,800,900);
        add(j1);

        JLabel print_jl=new JLabel("Enter the amount you want to credit");
        print_jl.setForeground(Color.WHITE);
        print_jl.setBounds(162,285,300,20);
        print_jl.setFont(new Font("Railways",Font.BOLD,16));
        j1.add(print_jl);

        tf=new JTextField();
        tf.setBounds(162,315,250,20);
        j1.add(tf);

        credit=new JButton("Enter");
        credit.setBounds(310,489,150,22);
        credit.addActionListener(this);
        j1.add(credit);

        exit=new JButton("exit");
        exit.setBounds(310,520,150,22);
        exit.addActionListener(this);
        j1.add(exit);
        //setUndecorated(true);
        setLayout(null);
        setBounds(400,10,800,900);
    }
    public void actionPerformed(ActionEvent e){
     if(e.getSource()==exit)  {
         System.exit(0);
     }else{
         String num1=tf.getText();
        // int number1=Integer.parseInt(number)-Integer.parseInt(num1);
        // number=""+number1;
         Date date=new Date();
         try{
            Conn on=new Conn();
            String  q="insert into bank values('"+Pin_no+"','"+date+"','"+"withdrawal"+"','"+num1+"')";
            on.s.executeUpdate(q);
             JOptionPane.showMessageDialog(null,"Rs "+num1+"credited  from your account");
            setVisible(false);
            new Transaction(Pin_no).setVisible(true);
         }
         catch(Exception e1){
             System.out.println(e1);
         }
     }
    }
    public static void main(String[] args) {
       new Credit("");
    }
}
