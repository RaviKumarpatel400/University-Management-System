
package university.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
import com.toedter.calendar.JDateChooser;
public class AddTeacher extends JFrame implements ActionListener{
    JTextField tfname,ttfname,tAddress,tfPhone,tEmail,tfCGPA, tfper,tfAddhar;
    JLabel labelempId;
    JDateChooser datedob;
    JComboBox cbcourse;
    JComboBox cbBRANCH;
    JButton Submit,Cancel;
    Random ran =new Random();
    long first4 = Math.abs((ran.nextLong()%9000L)+1000L);
    
     AddTeacher(){
         
         setSize(900,700);
        setLocation(350,50);
        
        setLayout(null);
        JLabel heading = new JLabel("New Teacher Details"); 
         heading.setBounds(310, 30, 500, 50);
          heading.setFont(new Font("serif",Font.BOLD, 30));
        add( heading);
        
         JLabel name = new JLabel("Name"); 
          name.setBounds(50, 150, 100, 30);
          name.setFont(new Font("serif",Font.BOLD, 30));
        add(  name);
        
        tfname=new JTextField();
         tfname.setBounds(200,150,150,30);
         add( tfname);
         
          JLabel fathername = new JLabel("Father's Name"); 
          fathername.setBounds(400, 150, 200, 30);
        fathername.setFont(new Font("serif",Font.BOLD, 30));
        add(  fathername);
        
        ttfname=new JTextField();
         ttfname.setBounds(600,150,150,30);
         add( ttfname);
         
         
         JLabel empid = new JLabel("Employee Id"); 
         empid .setBounds(50, 200, 200, 30);
         empid .setFont(new Font("serif",Font.BOLD, 30));
        add(empid);
        
         labelempId = new JLabel("101"+first4); 
         labelempId.setBounds(200, 200, 250, 30);
      labelempId.setFont(new Font("serif",Font.BOLD, 30));
        add(  labelempId);
        
        //DOB
        JLabel DOB= new JLabel("Date Of Birth"); 
         DOB.setBounds(410, 200, 200, 30);
         DOB.setFont(new Font("serif",Font.BOLD, 30));
        add(DOB);
        datedob=new JDateChooser();
        datedob.setBounds(600,200, 150, 30);
        add(datedob); 
        
       //Address
        JLabel Address = new JLabel("Address"); 
          Address.setBounds(50, 250, 200, 30);
         Address.setFont(new Font("serif",Font.BOLD, 30));
        add(  Address);
        
        tAddress=new JTextField();
         tAddress.setBounds(200,250,150,30);
         add( tAddress);
         
         //Phone
          JLabel Phone  = new JLabel("Phone Num"); 
          Phone.setBounds(400, 250, 200, 30);
         Phone.setFont(new Font("serif",Font.BOLD, 30));
        add(Phone);
        
        tfPhone=new JTextField();
         tfPhone.setBounds(600,250,150,30);
         add(  tfPhone);
        //two
        
        JLabel Email = new JLabel("Email Id"); 
          Email.setBounds(50, 300, 200, 30);
         Email.setFont(new Font("serif",Font.BOLD, 30));
        add( Email);
        
        tEmail=new JTextField();
         tEmail.setBounds(200,300,150,30);
         add( tEmail);
         
         //one
          JLabel CGPA  = new JLabel("10thMarks"); 
        CGPA.setBounds(400, 300, 200, 30);
         CGPA.setFont(new Font("serif",Font.BOLD, 30));
        add(CGPA);
        
        tfCGPA=new JTextField();
         tfCGPA.setBounds(600,300,150,30);
         add(  tfCGPA);
        
        //more one
         JLabel per  = new JLabel("12thMarks"); 
          per .setBounds(50, 350, 200, 30);
         per .setFont(new Font("serif",Font.BOLD, 30));
        add(per );
        
        tfper =new JTextField();
         tfper .setBounds(200,350,150,30);
         add( tfper );
         
         //Addhar
          JLabel Addhar = new JLabel("Addhar Num"); 
         Addhar .setBounds(400, 350, 200, 30);
        Addhar.setFont(new Font("serif",Font.BOLD, 30));
        add(Addhar );
        
        tfAddhar =new JTextField();
         tfAddhar .setBounds(600,350,150,30);
         add( tfAddhar );
         
         //course
          JLabel course= new JLabel("Qualification"); 
        course .setBounds(50, 400, 200, 30);
        course.setFont(new Font("serif",Font.BOLD, 30));
        add(course );
        
        String course1[]= {"B.Tech","BBA","B.Tech(AGE)","Deploma","BCA","MSC"};
        
        cbcourse =new JComboBox(course1);
        cbcourse.setBounds(200, 400, 150, 30);
        cbcourse.setBackground(Color.PINK);
        add(cbcourse); 
        //BRANCH
          JLabel BRANCH= new JLabel("Department"); 
        BRANCH.setBounds(400, 400, 200, 30);
        BRANCH.setFont(new Font("serif",Font.BOLD, 30));
        add(BRANCH);
        
        String branch[]= {"CSE","CIVIL","AG","Mechanical","EEE","ECE","ITI"};
        
        cbBRANCH =new JComboBox(branch);
        cbBRANCH.setBounds(600, 400, 150, 30);
        cbBRANCH.setBackground(Color.YELLOW);
        add(cbBRANCH); 
        
        //Button
        Submit =new  JButton("Submit");
       Submit.setBounds(200, 500, 120, 30);
        Submit.setBackground(Color.BLACK);
        Submit.setForeground(Color.WHITE);
        Submit.addActionListener(this);
        Submit.setFont(new Font("Tahoma",Font.BOLD,16));
        add(Submit);
        
         Cancel =new  JButton("Cancel");
       Cancel.setBounds(600, 500, 120, 30);
        Cancel.setBackground(Color.BLACK);
        Cancel.setForeground(Color.WHITE);
        Cancel.addActionListener(this);
        Cancel.setFont(new Font("Tahoma",Font.BOLD,16));
        add(Cancel);
        
        setVisible(true);
     }
      public void actionPerformed(ActionEvent ae) {
          if(ae.getSource()==Submit){
            String name =tfname.getText();
            String fname = ttfname.getText();
            String Id=labelempId.getText();
            String dob =((JTextField)datedob.getDateEditor().getUiComponent()).getText();
            String Address = tAddress.getText();
            String phone = tfPhone.getText();
            String email= tEmail.getText();
            String tenth= tfCGPA.getText();
            String twelve=tfper.getText();
            String Addhar=tfAddhar.getText();
            String education=(String)cbcourse.getSelectedItem();
            String department=(String) cbBRANCH.getSelectedItem();
            
              try{
                  String query="insert into teacher values('"+name+"','"+fname+"','"+Id+"','"+dob+"','"+Address+"','"+phone+"','"+email+"','"+tenth+"','"+twelve+"','"+Addhar+"','"+education+"','"+department+"')";
                  Conn con=new Conn();
                  con.s.executeUpdate(query);
                  
                  JOptionPane.showMessageDialog(null,"Teacher Details Inserted Successfully");
                  setVisible(false);
                  
              }catch(Exception er){
                  er.printStackTrace();
              }
              
          }else{
              setVisible(false);
          }
      }
    
    public static void main(String args[]){
        new AddTeacher();
    }
    
}
