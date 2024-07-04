package Bank_managment_system;
import javax.swing.*;
import java.util.*;
import java.awt.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class SignupOne extends JFrame implements ActionListener{
    int number;
    JDateChooser dateChooser;
    JTextField Name,FName,Eml,City, Pincode;
    JRadioButton married,male,female,unmarried;
    JButton next;
    SignupOne(){

        setLayout(null);
        JLabel page=new JLabel("Page 1: personal details");
        page.setBounds(230,20,400,30);
        page.setForeground(Color.BLACK);
        page.setFont(new Font("Arial",Font.BOLD,18));
        add(page);

        Random ob=new Random();
        number=ob.nextInt(10,1000);
        setTitle("Sign up page");
        JLabel App_Form_no=new JLabel("Application form number is:"+number);
        App_Form_no.setBounds(150,60,300,30);
        App_Form_no.setForeground(Color.BLUE);
        App_Form_no.setFont(new Font("Arial",Font.BOLD,18));
        add(App_Form_no);

// name
        JLabel name=new JLabel("Name");
        name.setBounds(120,100,200,30);
        name.setForeground(Color.BLACK);
        name.setFont(new Font("Arial",Font.BOLD,18));
        add(name);

         Name=new JTextField();
        Name.setBounds(330,100,200,30);
        Name.setForeground(Color.BLACK);
        Name.setFont(new Font("Arial",Font.BOLD,18));
        name.setBackground(Color.BLACK);
        add(Name);
//F name
        JLabel fname=new JLabel("Father Name");
        fname.setBounds(120,140,200,30);
        fname.setForeground(Color.BLACK);
        fname.setFont(new Font("Arial",Font.BOLD,18));
        add(fname);

         FName=new JTextField();
        FName.setBounds(330,140,200,30);
        FName.setForeground(Color.BLACK);
        FName.setFont(new Font("Arial",Font.BOLD,18));
        add(FName);
//dob
        JLabel dob=new JLabel("Date of Birth");
        dob.setBounds(120,180,200,30);
        dob.setForeground(Color.BLACK);
        dob.setFont(new Font("Arial",Font.BOLD,18));
        add(dob);

         dateChooser=new JDateChooser();
        dateChooser.setBounds(330,180,200,30);
        dateChooser.setForeground(Color.BLACK);
        add(dateChooser);


//gender

        JLabel gender=new JLabel("Gender");
        gender.setBounds(120,220,200,30);
        gender.setForeground(Color.BLACK);
        gender.setFont(new Font("Arial",Font.BOLD,18));
        add(gender);

        male=new JRadioButton("Male");
        male.setBounds(330,220,100,20);
        male.setForeground(Color.BLACK);
        male.setFont(new Font("Arial",Font.BOLD,18));
        add(male);
        female=new JRadioButton("Female");
        female.setBounds(450,220,100,20);
        female.setForeground(Color.BLACK);
        female.setFont(new Font("Arial",Font.BOLD,15));
        add(female);

        ButtonGroup buttonGroup=new ButtonGroup();
        buttonGroup.add(male);
        buttonGroup.add(female);

//eml

        JLabel eml=new JLabel("Email address");
        eml.setBounds(120,260,200,30);
        eml.setForeground(Color.BLACK);
        eml.setFont(new Font("Arial",Font.BOLD,18));
        add(eml);

        Eml=new JTextField();
        Eml.setBounds(330,260,200,30);
        Eml.setForeground(Color.BLACK);
        Eml.setFont(new Font("Arial",Font.BOLD,18));
        add(Eml);
//marital
        JLabel marital=new JLabel("Marital status");
        marital.setBounds(120,300,200,30);
        marital.setForeground(Color.BLACK);
        marital.setFont(new Font("Arial",Font.BOLD,18));
        add(marital);

        married=new JRadioButton("Married");
        married.setBounds(330,300,100,20);
        married.setForeground(Color.BLACK);
        married.setFont(new Font("Arial",Font.BOLD,18));
        add(married);
        unmarried=new JRadioButton("single");
        unmarried.setBounds(450,300,100,20);
        unmarried.setForeground(Color.BLACK);
        unmarried.setFont(new Font("Arial",Font.BOLD,18));
        add(unmarried);

        ButtonGroup buttonGroup1=new ButtonGroup();
        buttonGroup1.add(married);
        buttonGroup1.add(unmarried);

//city

        JLabel city=new JLabel("City");
        city.setBounds(120,340,200,30);
        city.setForeground(Color.BLACK);
        city.setFont(new Font("Arial",Font.BOLD,18));
        add(city);

        City=new JTextField();
        City.setBounds(330,340,200,30);
        City.setForeground(Color.BLACK);
        City.setFont(new Font("Arial",Font.BOLD,18));
        add(City);
//Pincode
        JLabel pincode=new JLabel("Pincode");
        pincode.setBounds(120,380,200,30);
        pincode.setForeground(Color.BLACK);
        pincode.setFont(new Font("Arial",Font.BOLD,18));
        add(pincode);

        Pincode=new JTextField();
        Pincode.setBounds(330,380,200,30);
        Pincode.setForeground(Color.BLACK);
        Pincode.setFont(new Font("Arial",Font.BOLD,18));
        add( Pincode);

        next=new JButton("Next");
        next.setBounds(440,450,90,40);
        next.setForeground(new Color(117, 0, 253));
        next.addActionListener(this);
        add(next);

        setBounds(300,200,600,550);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent ae){
        String random=""+number;
        String JTextName =Name.getText();
        String JTextFName =FName.getText();
        String JTextEml =Eml.getText();
        String JTextCity =City.getText();
        String JTextPincode = Pincode.getText();
        String JDateOFb=((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String Gender =null;
        if(male.isSelected()){
             Gender="Male";
        }
        else{
            Gender="Female";
        }
        String  Matrital =null;
        if(married.isSelected()){
            Matrital="Married";
        }else{
            Matrital="single";
        }
        try {
            if (JTextFName.equals("")) {
                JOptionPane.showMessageDialog(null,"Enter your name");
            }
            else{
                Conn c=new Conn();
                String query="insert into signup values('"+random+"','"+JTextName+"','"+JTextFName+"','"+JTextEml+"','"+JTextCity+"','"+JTextPincode+"','"+JDateOFb+"','"+Gender+"','"+Matrital+"')";
                c.s.executeUpdate(query);

                setVisible(false);
                new signup2(random).setVisible(true);
            }
        }
        catch(Exception ae1){
            System.out.println(ae1);
        }

    }
    public static void main(String[] args) {
        new SignupOne();
    }
}
