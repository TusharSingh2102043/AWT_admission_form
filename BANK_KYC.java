import  java.awt.Label;
import java.awt.*;
import java.awt.event.*;

//Simple KYC Form in Java AWT
class KC extends Frame {
    Label lblTitle,lblName,lblFather,lblPAN,lblAadhar,lblGender,lblOCP,lblACCT,lblAddress,libIP;
    TextField txtName,txtFather,txtPAN,txtAadhar;
    TextArea txtAddress;
    Checkbox checkMale, checkFemale,checkOther,ACCT1,ACCT2,ACCT3,ACCT4;
    CheckboxGroup cbg;
    Choice OCP,IP;
    Button btnSave,btnClear;

    public KC() {
        super("KNOW YOUR CUSTOMER(KYC) FORM");
        setSize(1000, 700);
        setLayout(null);
        setVisible(true);
        Color formColor = new Color(135, 206, 235);
        setBackground(formColor);

        Font titleFont = new Font("arial", Font.BOLD, 25);
        Font labelFont =new  Font("arial", Font.PLAIN, 18);
        Font textFont =new  Font("arial", Font.PLAIN, 15);

        lblTitle=new Label("KNOW YOUR CUSTOMER");
        lblTitle.setBounds(380,40,350,50);
        lblTitle.setFont(titleFont);
        lblTitle.setForeground(Color.YELLOW);
        add(lblTitle);

        lblName=new Label("Name");
        lblName.setBounds(20,100,150,30);
        lblName.setFont(labelFont);
        lblName.setForeground(Color.BLACK);
        add(lblName);

        txtName=new TextField();
        txtName.setBounds(170,100,400,30);
        txtName.setFont(textFont);
        add(txtName);

        lblFather=new Label("Father/Spouse Name");
        lblFather.setBounds(20,150,150,30);
        lblFather.setFont(labelFont);
        lblFather.setForeground(Color.BLACK);
        add(lblFather);

        txtFather=new TextField();
        txtFather.setBounds(170,150,400,30);
        txtFather.setFont(textFont);
        add(txtFather);

        lblPAN=new Label("PAN");
        lblPAN.setBounds(20,200,150,30);
        lblPAN.setFont(labelFont);
        lblPAN.setForeground(Color.BLACK);
        add(lblPAN);

        txtPAN=new TextField();
        txtPAN.setBounds(170,200,400,30);
        txtPAN.setFont(textFont);
        add(txtPAN);

        lblAadhar=new Label("Aadhar No.");
        lblAadhar.setBounds(20,200,150,30);
        lblAadhar.setFont(labelFont);
        lblAadhar.setForeground(Color.BLACK);
        add(lblAadhar);

        txtAadhar=new TextField();
        txtAadhar.setBounds(170,200,400,30);
        txtAadhar.setFont(textFont);
        add(txtAadhar);


        lblGender=new Label("Gender");
        lblGender.setBounds(200,250,150,30);
        lblGender.setFont(labelFont);
        lblGender.setForeground(Color.BLACK);
        add(lblGender);

        cbg = new CheckboxGroup();

        checkMale = new Checkbox("Male",cbg,true);
        checkMale.setBounds(350,250, 100, 30);
        checkMale.setFont(labelFont);
        checkMale.setForeground(Color.BLACK);
        add(checkMale);

        checkFemale = new Checkbox("Female",cbg,false);
        checkFemale.setBounds(450,250, 100, 30);
        checkFemale.setFont(labelFont);
        checkFemale.setForeground(Color.BLACK);
        add(checkFemale);

        checkOther = new Checkbox("Other",cbg,false);
        checkOther.setBounds(550,250, 100, 30);
        checkOther.setFont(labelFont);
        checkOther.setForeground(Color.BLACK);
        add(checkOther);

        libIP = new Label("Identity Proof");
        libIP.setBounds(200,300,150,30);
        libIP.setFont(labelFont);
        libIP.setForeground(Color.BLACK);
        add(libIP);

        IP = new Choice();
        IP= new Choice();
        IP.setFont(labelFont);
        IP.setBounds(350, 300, 400, 50);
        IP.add("Pan Card");
        IP.add("Aadhar Card");
        IP.add("Driving License");
        IP.add("Voter ID");
        IP.add("Other(Please Specify)");
        add(IP);




        lblOCP=new Label("Occupation");
        lblOCP.setBounds(200,350,150,30);
        lblOCP.setFont(labelFont);
        lblOCP.setForeground(Color.BLACK);
        add(lblOCP);

        OCP= new Choice();
        OCP.setFont(labelFont);
        OCP.setBounds(350, 350, 400, 50);
        OCP.add("PRIVATE");
        OCP.add("PUBLIC");
        OCP.add("GOVERNMENT");
        OCP.add("BUSINESS");
        OCP.add("HOUSEWIFE");
        OCP.add("STUDENT");
        OCP.add("OTHER(Please Specify)");
        add(OCP);

        lblACCT=new Label("Account Type");
        lblACCT.setBounds(200,400,150,30);
        lblACCT.setFont(labelFont);
        lblACCT.setForeground(Color.BLACK);
        add(lblACCT);

        ACCT1=new Checkbox("SB");
        ACCT1.setBounds(350, 400, 100, 50);
        ACCT1.setFont(labelFont);
        ACCT1.setForeground(Color.BLACK);
        add(ACCT1);

        ACCT2=new Checkbox("CURR");
        ACCT2.setBounds(450, 400, 100, 50);
        ACCT2.setFont(labelFont);
        ACCT2.setForeground(Color.BLACK);
        add(ACCT2);

        ACCT3=new Checkbox("RD");
        ACCT3.setBounds(550, 400, 100, 50);
        ACCT3.setFont(labelFont);
        ACCT3.setForeground(Color.BLACK);
        add(ACCT3);

        ACCT4=new Checkbox("FD");
        ACCT4.setBounds(650, 400, 100, 50);
        ACCT4.setFont(labelFont);
        ACCT4.setForeground(Color.BLACK);
        add(ACCT4);

        lblAddress=new Label("Address");
        lblAddress.setBounds(200,450,150,30);
        lblAddress.setFont(labelFont);
        lblAddress.setForeground(Color.BLACK);
        add(lblAddress);

        txtAddress=new TextArea(10,30);
        txtAddress.setBounds(350,450,400,100);
        txtAddress.setFont(labelFont);
        add(txtAddress);


        btnSave=new Button("SUBMIT");
        btnSave.setBounds(400,600,150,30);
        btnSave.setFont(labelFont);
        btnSave.setBackground(Color.BLUE);
        btnSave.setForeground(Color.BLACK);
        add(btnSave);

        btnClear=new Button("CLOSE");
        btnClear.setBounds(560,600,150,30);
        btnClear.setFont(labelFont);
        btnClear.setBackground(Color.RED);
        btnClear.setForeground(Color.BLACK);
        add(btnClear);


        // Close Button Code
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
}
public class BANK_KYC {
    public static void main(String[] args) {
        KYC K = new KYC();
    }
}