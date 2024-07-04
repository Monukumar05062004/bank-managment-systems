package Bank_managment_system;
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
public class signup2 extends JFrame implements ActionListener{
    //int number;
    //JDateChooser dateChooser;
    JTextField  AadhaarNumber,pan;
    JRadioButton Text_Field_Senior_yes,Text_Field_Senior_no,eaccount_no,eaccount_yes;
    JButton next1;
    JComboBox category, income,qualification,occuption,religion;
    String formNo;
    signup2(String formNo){
        this.formNo=formNo;
        setLayout(null);
        JLabel page=new JLabel("Page 2: Additional Details");
        page.setBounds(160,20,400,30);
        page.setForeground(Color.BLACK);
        page.setFont(new Font("Arial",Font.BOLD,22));
        add(page);

//        Random ob=new Random();
//        number=ob.nextInt(10,1000);
       setTitle("New account Application Form -page 2");
//        JLabel App_Form_no=new JLabel("Application form number is:"+number);
//        App_Form_no.setBounds(150,60,300,30);
//        App_Form_no.setForeground(Color.BLUE);
//        App_Form_no.setFont(new Font("Arial",Font.BOLD,18));
//        add(App_Form_no);

// Religion
        JLabel name=new JLabel("Religion");
        name.setBounds(120,100,200,30);
        name.setForeground(Color.BLACK);
        name.setFont(new Font("Arial",Font.BOLD,18));
        add(name);
        String  valReligion[]={"Hindu","Muslim","Sikh","Christian","other"};
         religion =new JComboBox(valReligion);
        religion.setBounds(330,100,200,30);
        religion.setForeground(Color.BLACK);
        religion.setFont(new Font("Arial",Font.BOLD,18));
        religion.setBackground(Color.white);
        add(religion);
//Category
        JLabel fname=new JLabel("Category");
        fname.setBounds(120,140,200,30);
        fname.setForeground(Color.BLACK);
        fname.setFont(new Font("Arial",Font.BOLD,18));
        add(fname);

        String valCategory[]={"General","OBC","SC","ST","OTHERS"};
        category =new JComboBox(valCategory);
        category.setBounds(330,140,200,30);
        category.setForeground(Color.BLACK);
        category.setFont(new Font("Arial",Font.BOLD,18));
        category.setBackground(Color.WHITE);
        add(category);
//income
        JLabel dob=new JLabel("Income");
        dob.setBounds(120,180,200,30);
        dob.setForeground(Color.BLACK);
        dob.setFont(new Font("Arial",Font.BOLD,18));
        add(dob);

        String ValIncome[]={"Null","1<<income<<50000","50000<=income<<500000","Other"};
        income=new JComboBox(ValIncome);
        income.setBounds(330,180,200,30);
        income.setForeground(Color.BLACK);
        add(income);


//Education qualification

        JLabel gender=new JLabel("Degree");
        gender.setBounds(120,220,200,30);
        gender.setForeground(Color.BLACK);
        gender.setFont(new Font("Arial",Font.BOLD,18));
        add(gender);
        String valuequalification[]= {"Metric(10th)","inter(12th)","under Graduation","post graduation","other"};
        qualification=new JComboBox(valuequalification);
        qualification.setBounds(330,220,200,30);
        qualification.setForeground(Color.black);
        qualification.setBackground(Color.white);
        add(qualification);


//Occupation

        JLabel eml=new JLabel("Occupation");
        eml.setBounds(120,260,200,30);
        eml.setForeground(Color.BLACK);
        eml.setFont(new Font("Arial",Font.BOLD,18));
        add(eml);
        String valOccuption[]={"Doctor","Engg","Teacher","Farmer","other"};
        occuption=new JComboBox(valOccuption);
        occuption.setBounds(330,260,200,30);
        occuption.setForeground(Color.BLACK);
        occuption.setFont(new Font("Arial",Font.BOLD,18));
        add(occuption);
//Pan
        JLabel marital=new JLabel("Pan number");
        marital.setBounds(120,300,200,30);
        marital.setForeground(Color.BLACK);
        marital.setFont(new Font("Arial",Font.BOLD,18));
        add(marital);

        pan=new JTextField();
        pan.setBounds(330,300,200,30);
        pan.setForeground(Color.BLACK);
        pan.setBackground(Color.WHITE);
        add(pan);
// Aadhaar number

        JLabel aadhaarNumber=new JLabel("Aadhaar number");
        aadhaarNumber.setBounds(120,340,200,30);
        aadhaarNumber.setForeground(Color.BLACK);
        aadhaarNumber.setFont(new Font("Arial",Font.BOLD,18));
        add(aadhaarNumber);

        AadhaarNumber=new JTextField();
        AadhaarNumber.setBounds(330,340,200,30);
        AadhaarNumber.setForeground(Color.BLACK);
        AadhaarNumber.setFont(new Font("Arial",Font.BOLD,18));
        add( AadhaarNumber);
//senior citizen
        JLabel Senior=new JLabel("Senior citizen");
        Senior.setBounds(120,380,200,30);
        Senior.setForeground(Color.BLACK);
        Senior.setFont(new Font("Arial",Font.BOLD,18));
        add(Senior);

        Text_Field_Senior_yes=new JRadioButton("yes");
        Text_Field_Senior_yes.setBounds(330,380,100,20);
        Text_Field_Senior_yes.setForeground(Color.BLACK);
        Text_Field_Senior_yes.setFont(new Font("Arial",Font.BOLD,18));
        add(Text_Field_Senior_yes);

        Text_Field_Senior_no=new JRadioButton("no");
        Text_Field_Senior_no.setBounds(450,380,100,20);
        Text_Field_Senior_no.setForeground(Color.BLACK);
        Text_Field_Senior_no.setFont(new Font("Arial",Font.BOLD,18));
        add(Text_Field_Senior_no);

        ButtonGroup buttonGroup1=new ButtonGroup();
        buttonGroup1.add(Text_Field_Senior_yes);
        buttonGroup1.add(Text_Field_Senior_no);

//exitAccount
        JLabel exitAccount=new JLabel("Existing Account");
        exitAccount.setBounds(120,420,200,30);
        exitAccount.setForeground(Color.BLACK);
        exitAccount.setFont(new Font("Arial",Font.BOLD,18));
        add(exitAccount);

        eaccount_yes=new JRadioButton("yes");
        eaccount_yes.setBounds(330,420,100,20);
        eaccount_yes.setForeground(Color.BLACK);
        eaccount_yes.setFont(new Font("Arial",Font.BOLD,18));
        add(eaccount_yes);

        eaccount_no=new JRadioButton("No");
        eaccount_no.setBounds(450,420,100,20);
        eaccount_no.setForeground(Color.BLACK);
        eaccount_no.setFont(new Font("Arial",Font.BOLD,18));
        add(eaccount_no);
//Button
        next1=new JButton("Next");
        next1.setBounds(440,520,90,40);
        next1.setForeground(new Color(253, 0, 235));
        next1.addActionListener(this);
        add(next1);

        setBounds(400,10,650,650);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent ae){

        String sreligion =(String)religion.getSelectedItem();
        String Category =(String) category.getSelectedItem();
        String Income   =   (String)income.getSelectedItem();
        String Qualification=(String)qualification.getSelectedItem();
        String Occuption =(String) occuption.getSelectedItem();

        String JTextPancode = pan.getText();
        String aad = AadhaarNumber.getText();
        //String pin_no=Pincode.getText();
        //String JDateOFb=((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String Seniorcitizen =null;
        if(Text_Field_Senior_yes.isSelected()){
            Seniorcitizen="yes";
        }
        else{
            Seniorcitizen="no";
        }
        String  acc =null;
        if( eaccount_yes.isSelected()){
            acc="yes";
        }else{
            acc="No";
        }
        try {
            if (aad.equals("")) {
                JOptionPane.showMessageDialog(null,"Enter your aadhaar number");
            }
            else if(aad.length()!=9){
                JOptionPane.showMessageDialog(null,"Enter a valid aadhaar number");
            }
                Conn c = new Conn();
                String query0 = "insert into signup2 values('" + formNo + "','" + Occuption + "','" + JTextPancode + "','" + aad + "','" + sreligion + "','" + Category + "','" + Income + "','" + Qualification + "','" + Seniorcitizen + "','" + acc + "')";
                c.s.executeUpdate(query0);

                //signup3 class object

                    setVisible(false);
                    new signup3(formNo).setVisible(true);

        }
        catch(Exception ae1){
            System.out.println(ae1);
        }

    }
    public static void main(String[] args) {
        new signup2("");
    }
}
