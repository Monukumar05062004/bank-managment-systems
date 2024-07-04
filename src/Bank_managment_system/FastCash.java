package Bank_managment_system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.ResultSet;
public class FastCash extends JFrame implements ActionListener{
    JButton deposite, withdrawl,pin_change,mini_st,fast_cash,balance_enq,exit;
    String pinNo;
    FastCash(String pinNo){
        this.pinNo=pinNo;
        setTitle("");
        setLayout(null);
//image of atm
        ImageIcon i2=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image t1= i2.getImage().getScaledInstance(800,800, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(t1);
        JLabel j1=new JLabel(i3);
        j1.setBounds(0,0,800,800);
        add(j1);

        JLabel select_level_tran=new JLabel("SELECT YOUR WITHDRAWAL AMOUNT");
        select_level_tran .setBounds(150,250,400,30);
        select_level_tran.setFont(new Font("Railway",Font.BOLD,18));
        select_level_tran.setForeground(Color.WHITE);
        j1.add(select_level_tran);

        deposite=new JButton("100");
        deposite.setBounds(148,369,150,28);
        deposite.addActionListener(this);
        j1.add(deposite);

        withdrawl=new JButton("500");
        withdrawl.setBounds(300,369,150,28);
        withdrawl.addActionListener(this);
        j1.add(withdrawl);

        fast_cash=new JButton("1000");
        fast_cash.setBounds(148,401,150,28);
        fast_cash.addActionListener(this);
        j1.add(fast_cash);

        mini_st=new JButton("2000");
        mini_st.setBounds(300,401,150,28);
        mini_st.addActionListener(this);
        j1.add(mini_st);

        pin_change=new JButton("5000");
        pin_change.setBounds(148,433,150,28);
        pin_change.addActionListener(this);
        j1.add(pin_change);

        balance_enq=new JButton("10000");
        balance_enq.setBounds(300,433,150,28);
        balance_enq.addActionListener(this);
        j1.add(balance_enq);

        exit=new JButton("Back");
        exit.setBounds(300,464,150,24);
        exit.addActionListener(this);
        j1.add(exit);
// Frame

        setBounds(400,10,800,900);
        setUndecorated(true);
        setVisible(true);
    }
    public  void actionPerformed(ActionEvent ob){
        if(ob.getSource()==exit){
           setVisible(false);
           new Transaction(pinNo).setVisible(true);
        }
       else{
           String amount =((JButton)ob.getSource()).getText().substring(3);
           Conn c =new Conn();
           try{
               ResultSet rs=c.s.executeQuery("select * from bank where pin ='"+pinNo+"'");
               int balance =0;
               while(rs.next()){
                   if(rs.getString("type").equals("Deposite")){
                       balance+=Integer.parseInt(rs.getString("amount"));
                   }else{
                       balance-=Integer.parseInt(rs.getString("amount"));
                   }
               }
           }catch(Exception e){

           }
        }
    }
    public static void main(String arg[]){
        new FastCash("");
    }
}

