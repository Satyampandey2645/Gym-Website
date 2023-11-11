
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener {
   
    JTextField panTextField, aadharTextField ;
    JButton next;   
    JRadioButton syes, sno, eyes, eno;
    JComboBox religions, category1, income1, educational1, occupation1;
    String formno;
    
    
    SignupTwo(String formno){
        
        this.formno = formno;
        setLayout(null);
        
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        
        JLabel additionalDetails = new JLabel("Page 2: Additional Details");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        additionalDetails.setBounds(290, 80, 400, 30);
        add(additionalDetails);
        
        JLabel religion = new JLabel("Religion: ");
        religion.setFont(new Font("Raleway", Font.BOLD, 20));
        religion.setBounds(100, 140, 100, 30);
        add(religion);
        
        String valReligion[] = {"Hindu", "Muslim", "Sikh", "Christian", "Other"};
        religions = new JComboBox(valReligion);
        religions.setBounds(300, 140, 400, 30);
        religions.setBackground(Color.WHITE);
        add(religions);
        
        JLabel category = new JLabel("Category: ");
        category.setFont(new Font("Raleway", Font.BOLD, 20));
        category.setBounds(100, 190, 200, 30);
        add(category);
        
        String valCategory[] = {"General", "OBC", "SC", "ST", "Other"};
        category1= new JComboBox(valCategory);
        category1.setBounds(300, 190, 400, 30);
        category.setBackground(Color.WHITE);
        add(category1);
        
        JLabel income = new JLabel("Income:");
        income.setFont(new Font("Raleway", Font.BOLD, 20));
        income.setBounds(100, 240, 200, 30);
        add(income);
        
        String valIncome[] = {"NULL", "< 1,50,000", "< 2,50,000", "< 5,00,000", "Upto 10,00,000"};
        income1 = new JComboBox(valIncome);
        income1.setBounds(300, 240, 400, 30);
        income1.setBackground(Color.WHITE);
        add(income1);
        
        JLabel educational = new JLabel("Educational ");
        educational.setFont(new Font("Raleway", Font.BOLD, 20));
        educational.setBounds(100, 290, 200, 30);
        add(educational);
       
        JLabel qualification = new JLabel("Qualification: ");
        qualification.setFont(new Font("Raleway", Font.BOLD, 20));
        qualification.setBounds(100, 315, 200, 30);
        add(qualification);
        
        String valEducation[] = {"Non-Graduation", "Graduate", "Post-Graduation", "Doctorate", "Others"};
        educational1 = new JComboBox(valEducation);
        educational1.setBounds(300, 315, 400, 30);
        educational1.setBackground(Color.WHITE);
        add(educational1);
        
        JLabel occupation = new JLabel("Occupation: ");
        occupation.setFont(new Font("Raleway", Font.BOLD, 20));
        occupation.setBounds(100, 390, 200, 30);
        add(occupation);
        
        String valOccupation[] = {"Salaried", "Self-Employed", "Bussiness", "Student", "Retired", "Others"};
        occupation1 = new JComboBox(valOccupation);
        occupation1.setBounds(300, 390, 400, 30);
        occupation1.setBackground(Color.WHITE);
        add(occupation1);
        
        JLabel PAN = new JLabel("PAN Number: ");
        PAN.setFont(new Font("Raleway", Font.BOLD, 20));
        PAN.setBounds(100, 440, 200, 30);
        add(PAN);
        
        panTextField = new JTextField();
        panTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        panTextField.setBounds(300, 440, 400, 30);
        add(panTextField);
        
        JLabel aadhar = new JLabel("Aadhar Number: ");
        aadhar.setFont(new Font("Raleway", Font.BOLD, 20));
        aadhar.setBounds(100, 490, 200, 30);
        add(aadhar);
        
        aadharTextField = new JTextField();
        aadharTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        aadharTextField.setBounds(300, 490, 400, 30);
        add(aadharTextField);
        
        JLabel citizen = new JLabel("Senior Citizen: ");
        citizen.setFont(new Font("Raleway", Font.BOLD, 20));
        citizen.setBounds(100, 540, 200, 30);
        add(citizen);
        
        syes = new JRadioButton("Yes");
        syes.setBounds(300, 540,100,30);
        syes.setBackground(Color.WHITE);
        add(syes);  
        
        sno = new JRadioButton("No");
        sno.setBounds(450, 540, 100, 30);
        sno.setBackground(Color.WHITE);
        add(sno);
        
        ButtonGroup citizengroup = new ButtonGroup(); 
        citizengroup.add(syes);
        citizengroup.add(sno);
        
        JLabel exist = new JLabel("Existing Account: ");
        exist.setFont(new Font("Raleway", Font.BOLD, 20));
        exist.setBounds(100, 590, 200, 30);
        add(exist);
        
        eyes = new JRadioButton("Yes");
        eyes.setBounds(300,590,100,30);
        eyes.setBackground(Color.WHITE);
        add(eyes);  
        
        eno = new JRadioButton("No");
        eno.setBounds(450, 590, 100, 30);
        eno.setBackground(Color.WHITE);
        add(eno);
        
        ButtonGroup existgroup = new ButtonGroup(); 
        existgroup.add(eyes);
        existgroup.add(eno);
        
        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        String sreligion = (String)religions.getSelectedItem();
        String scategory = (String)category1.getSelectedItem();
        String sincome = (String) income1.getSelectedItem();
        String seducation = (String) educational1.getSelectedItem();
        String soccupation = (String) occupation1.getSelectedItem();
        String citizen = null;
        
        if(syes.isSelected()){
            citizen = " Yes";
        } else if (sno.isSelected()){
            citizen = "No";
        } 
        
        String exist = null;
        if(eyes.isSelected()){
            exist = "Yes";
        } else if(eno.isSelected()){
            exist = "No";
        } 
        
        String sPAN = panTextField.getText();
        String saadhar = aadharTextField.getText();
        
        try {
                Conn c = new Conn();
                String query = "insert into signuptwo values('"+formno+"', '"+sreligion+"', '"+scategory+"', '"+sincome+"', '"+seducation+"', '"+soccupation+"', '"+sPAN+"', '"+saadhar+"', '"+citizen+"', '"+exist+"')";
                c.s.executeUpdate(query);
                
                setVisible(false);
                new SignupThree(formno).setVisible(true);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public static void main(String args[]) {
        new SignupTwo("");
    }
}

