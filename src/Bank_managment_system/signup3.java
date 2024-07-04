package Bank_managment_system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;


public class signup3 extends JFrame implements ActionListener {
    JCheckBox atm,ib,esa,es,mb,cb;
    JRadioButton sa,Fda, ca,Rda;
    JButton b1,b2;
    String formno="0";
    signup3(String formno){
        this.formno=formno;

        JLabel l1=new JLabel("Page 3: Account Details");
        l1.setBounds(190,15,350,30);
        l1.setFont(new Font("Railway",Font.BOLD,22));
        add(l1);

        //Account type
        JLabel ac1=new JLabel("1.Account Type");
        ac1.setBounds(120,90,180,30);
        ac1.setFont(new Font("Railway",Font.BOLD,22));
        add(ac1);
                //sa
        sa=new JRadioButton("Saving Account");
        sa.setBounds(120,122,159,20);
        sa.setBackground(Color.WHITE);
        sa.setFont(new Font("Railway",Font.PLAIN,18));
        add(sa);
                //fda
        Fda=new JRadioButton("Fixed Deposit Account");
        Fda.setBounds(280,122,250,20);
        Fda.setBackground(Color.WHITE);
        Fda.setFont(new Font("Railway",Font.PLAIN,18));
        add(Fda);
                //ca
         ca=new JRadioButton("Current Account");
        ca.setBounds(120,144,159,20);
        ca.setBackground(Color.WHITE);
        ca.setFont(new Font("Railway",Font.PLAIN,18));
        add(ca);
                //Rda
        Rda=new JRadioButton("Recurring Deposit Account");
        Rda.setBounds(280,144,250,20);
        Rda.setBackground(Color.WHITE);
        Rda.setFont(new Font("Railway",Font.PLAIN,18));
        add(Rda);

        ButtonGroup groupButton=new ButtonGroup();
        groupButton.add(sa);
        groupButton.add(Fda);
        groupButton.add(ca);
        groupButton.add(Rda);

//Card No
        JLabel cn1=new JLabel("2.Card Number :");
        cn1.setBounds(120,170,250,30);
        cn1.setFont(new Font("Railway",Font.BOLD,22));
        add(cn1);
        JLabel j2=new JLabel("Your 16 Digit card No");
        j2.setBounds(120,202,350,20);
        j2.setFont(new Font("Railway",Font.PLAIN,18));
        add(j2);

        JLabel value_cn=new JLabel("XXXX-XXXX-XXXX-4876");
        value_cn.setBounds(300,176,260,20);
        value_cn.setFont(new Font("Railway",Font.PLAIN,19));
        add(value_cn);
//PiN
       JLabel pin=new JLabel("3.Generate a pin");
       pin.setBounds(120,232,350,30);
       pin.setFont(new Font("Railway",Font.BOLD,22));
       add(pin);
       JLabel Pin=new JLabel("Your 4 digit password");
       Pin.setBounds(120,265,350,20);
       Pin.setFont(new Font("Railway",Font.PLAIN,18));
       add(Pin);

       JLabel pin_val=new JLabel();
        pin_val.setBounds(300,232,150,30);
        pin_val.setFont(new Font("Railway",Font.PLAIN,22));
        add(pin_val);
//Services required
        JLabel sr=new JLabel("4.Services required");
        sr.setBounds(120,295,350,30);
        sr.setFont(new Font("Railway",Font.BOLD,22));
        add(sr);

        atm=new JCheckBox("ATM CARD");
        atm.setBounds(120,328,150,20);
        atm.setBackground(Color.WHITE);
        atm.setFont(new Font("Railway",Font.PLAIN,18));
        add(atm);

        ib=new JCheckBox("Internet Banking");
        ib.setBounds(280,328,250,18);
        ib.setBackground(Color.WHITE);
        ib.setFont(new Font("Railway",Font.PLAIN,18));
        add(ib);
        mb=new JCheckBox("Mobile Banking");
        mb.setBounds(120,350,150,20);
        mb.setBackground(Color.WHITE);
        mb.setFont(new Font("Railway",Font.PLAIN,18));
        add(mb);
        esa=new JCheckBox("Email & Sms Alerts");
        esa.setBounds(280,350,250,18);
        esa.setBackground(Color.WHITE);
        esa.setFont(new Font("Railway",Font.PLAIN,18));
        add(esa);

        cb=new JCheckBox("cheque Book");
        cb.setBounds(120,372,150,20);
        cb.setBackground(Color.WHITE);
        cb.setFont(new Font("Railway",Font.PLAIN,18));
        add(cb);

        es=new JCheckBox("E-Statement");
        es.setBounds(280,372,250,18);
        es.setBackground(Color.WHITE);
        es.setFont(new Font("Railway",Font.PLAIN,18));
        add(es);

        JRadioButton t_and_c=new JRadioButton("you are agree with all the rule and regulation");
        t_and_c.setBounds(120,445,450,24);
        t_and_c.setBackground(Color.WHITE);
        t_and_c.setFont(new Font("Railway",Font.PLAIN,20));
        add(t_and_c);
//submit
        b1=new JButton("Submit");
        b1.setBounds(120,515,120,50);
        b1.setFont(new Font("Railway",Font.BOLD,20));
        b1.setForeground(new Color(123, 0, 253));
        b1.setForeground(new Color(184, 0, 253));
        b1.addActionListener(this);
        add(b1);
//cancel
        b2=new JButton("Cancel");
        b2.setBounds(390,515,120,50);
      b2.setForeground(new Color(123, 0, 253));
        b2.setForeground(new Color(184, 0, 253));
       b2 .setFont(new Font("Railway",Font.BOLD,20));
       b2 .addActionListener(this);
        add(b2);

        //Frame
        getContentPane().setBackground(Color.WHITE);
        setBackground(Color.yellow);
        setLayout(null);
        setVisible(true);
        setBounds(400,10,650,650);
    }
    public  void actionPerformed(ActionEvent ae3) {
            String accountType = "";
            if (sa.isSelected()) {
                accountType = "Saving Account";
            } else if (Fda.isSelected()) {
                accountType = "Fixed Deposit Account";
            } else if (ca.isSelected()) {
                accountType = "current account";
            } else if(Rda.isSelected()){
                accountType = "Recurring Deposit Account";
            }

           //facility atm,ib,esa,es,mb,cb
            String facility="";
            if(atm.isSelected()){
                facility=facility+" ATM CARD";
            }
             if(ib.isSelected()){
                facility=facility+" Internet Banking";
            }
            if(esa.isSelected()){
                facility=facility+" Email & Sms Alerts";
            }
           if(es.isSelected()){
                facility=facility+" E-Statement";
            }
           if(mb.isSelected()){
                facility=facility+" Mobile Banking";
            }
           if(cb.isSelected()){
                facility=facility+" cheque Book";
            }
            Random obc1=new Random();
            String Card_no=""+ Math.abs((obc1.nextLong()%90000000l)+5040936000000000l);
            String pin=""+Math.abs((obc1.nextLong()%9000l)+1000l);
            try{
                if (ae3.getSource() == b1) {
                if(accountType.equals("")){
                    JOptionPane.showMessageDialog(null,"Account type is required");
                }else if(pin.length()!=4){
                        JOptionPane.showMessageDialog(null,"Enter a valid pin");
                }
                else{
                    Conn c1 = new Conn();
                    String query1 = "insert into signup3 values('"+formno+"','"+accountType+"','"+facility+"','"+pin+"','"+Card_no+"')";
                    String query2 = "insert into login values('"+formno+"','"+Card_no+"','"+ pin+"')";
                    c1.s.executeUpdate(query1);
                    c1.s.executeUpdate(query2);
                    JOptionPane.showMessageDialog(null,"your card no is "+Card_no+"\n"+"your pin no is "+pin);
                    setVisible(false);
                }

            }   else if(ae3.getSource()==b2){
                    System.exit(0);
                }
            }
            catch (Exception e){
                e.printStackTrace();
            }



    }
    public static void main(String args[]){
        new signup3("");
    }


}
