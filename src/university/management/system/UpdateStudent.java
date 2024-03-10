

package university.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class UpdateStudent extends JFrame implements ActionListener{
    JTextField  cfcourse,ttfname,tAddress,tfPhone,tEmail,cfBRANCH,tfname;
    JLabel labelrollno;
    JButton Submit,Cancel;
    Choice crollno;

     UpdateStudent(){
         
         setSize(900,700);
        setLocation(350,50);
        
        setLayout(null);
        JLabel heading = new JLabel("Update Student Details"); 
         heading.setBounds(50, 10, 500, 50);
          heading.setFont(new Font("Tahoma",Font.ITALIC, 35));
        add( heading);
        //paste
         JLabel lblrollnumber =new JLabel("Select Roll Number");
        lblrollnumber.setBounds(50, 100, 200, 20);
         lblrollnumber.setFont(new Font("serif",Font.PLAIN, 25));
        add(lblrollnumber);
        
        crollno = new Choice();
        crollno.setBounds(250, 100, 200, 20);
        add(crollno);
        try{
            Conn c= new Conn();
            ResultSet rs = c.s.executeQuery("select * from student");
            while(rs.next()){
              crollno.add(rs.getString("rollnum"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
         JLabel lblname = new JLabel("Name"); 
          lblname.setBounds(50, 150, 100, 30);
          lblname.setFont(new Font("serif",Font.BOLD, 30));
        add(lblname);
        
        JLabel labelname=new JLabel();
        labelname.setBounds(200,150,150,30);
        labelname.setFont(new Font("Tahoma",Font.PLAIN, 20));
         add( labelname);
         
          JLabel fathername = new JLabel("Father's Name"); 
          fathername.setBounds(400, 150, 200, 30);
        fathername.setFont(new Font("serif",Font.BOLD, 30));
        add(  fathername);
        
         JLabel labelfname=new JLabel();
         labelfname.setBounds(600,150,150,30);
         labelfname.setFont(new Font("Tahoma",Font.PLAIN, 20));
         add( labelfname);
         
         JLabel roll = new JLabel("RollNum"); 
         roll.setBounds(50, 200, 200, 30);
         roll.setFont(new Font("serif",Font.BOLD, 30));
         add(  roll);
         
         labelrollno=new JLabel();
         labelrollno.setBounds(200,200,200,30);
         labelrollno.setFont(new Font("serif",Font.PLAIN, 30));
         add(labelrollno);
         
         JLabel ibldob=new JLabel("Date of Birth");
         ibldob.setBounds(400,200,200,30);
         ibldob.setFont(new Font("serif",Font.BOLD, 30));
         add(ibldob);
         
         JLabel labeldoc = new JLabel();
         labeldoc.setBounds(600,200,150,30);
          labeldoc.setFont(new Font("Tahoma",Font.PLAIN, 20));
         add(labeldoc);       
        
       //Address
        JLabel Address = new JLabel("Address"); 
          Address.setBounds(50, 250, 200, 30);
         Address.setFont(new Font("serif",Font.BOLD, 30));
        add(  Address);
        
        tAddress=new JTextField();
         tAddress.setBounds(200,250,150,30);
         tAddress.setFont(new Font("Tahoma",Font.PLAIN, 20));
         add( tAddress);
         
         //Phone
          JLabel Phone  = new JLabel("Phone Num"); 
          Phone.setBounds(400, 250, 200, 30);
         Phone.setFont(new Font("serif",Font.BOLD, 30));
        add(Phone);
        
        tfPhone=new JTextField();
         tfPhone.setBounds(600,250,150,30);
         tfPhone.setFont(new Font("Tahoma",Font.PLAIN, 20));
         add(  tfPhone);
        //two
        
        JLabel Email = new JLabel("Email Id"); 
          Email.setBounds(50, 300, 200, 30);
         Email.setFont(new Font("serif",Font.BOLD, 30));
        add( Email);
        
        tEmail=new JTextField();
         tEmail.setBounds(200,300,150,30);
        tEmail.setFont(new Font("Tahoma",Font.PLAIN, 20));
         add( tEmail);
         
         //one
         JLabel lebelx  = new JLabel("10thMarks"); 
         lebelx.setBounds(400, 300, 200, 30);
         lebelx.setFont(new Font("serif",Font.BOLD, 30));
         add(lebelx);
        
        JLabel  tenth1=new JLabel();
         tenth1.setBounds(600,300,150,30);
         tenth1.setFont(new Font("Tahoma",Font.PLAIN, 20));
         add( tenth1);
        
        //more one
         JLabel per  = new JLabel("12thMarks"); 
          per .setBounds(50, 350, 200, 30);
         per .setFont(new Font("serif",Font.BOLD, 30));
        add(per );
        
         JLabel twelve =new  JLabel();
         twelve .setBounds(200,350,150,30);
         add(twelve);
         
         //Addhar
          JLabel Addhar = new JLabel("Addhar Num"); 
         Addhar .setBounds(400, 350, 200, 30);
        Addhar.setFont(new Font("serif",Font.BOLD, 30));
        add(Addhar );
        
        JLabel Addhar1 =new JLabel();
        Addhar1 .setBounds(600,350,150,30);
         add( Addhar1);
         
         //course
        JLabel course= new JLabel("Course"); 
        course .setBounds(50, 400, 200, 30);
        course.setFont(new Font("serif",Font.BOLD, 30));
        add(course );
       
        cfcourse =new JTextField();
        cfcourse.setBounds(200, 400, 150, 30);
//        cfcourse.setBackground(Color.PINK);
        add(cfcourse); 
        //BRANCH
          JLabel BRANCH= new JLabel("BRANCH"); 
        BRANCH.setBounds(400, 400, 200, 30);
        BRANCH.setFont(new Font("serif",Font.BOLD, 30));
        add(BRANCH);
        
      
        cfBRANCH =new JTextField();
        cfBRANCH.setBounds(600, 400, 150, 30);
        //cfBRANCH.setBackground(Color.YELLOW);
        add(cfBRANCH); 
        
        try {
    Conn c = new Conn();
    String query = "SELECT * FROM student WHERE rollnum='" + crollno.getSelectedItem() + "'";
    ResultSet rs = c.s.executeQuery(query);
    while (rs.next()) {
        labelname.setText(rs.getString("name"));
        labelfname.setText(rs.getString("fname"));
        labeldoc.setText(rs.getString("dob"));
        tAddress.setText(rs.getString("Address"));
        tfPhone.setText(rs.getString("phone"));
        tEmail.setText(rs.getString("email"));
        twelve.setText(rs.getString("twelve"));
        tenth1.setText(rs.getString("tenth"));
        Addhar1.setText(rs.getString("addhar"));
        labelrollno.setText(rs.getString("rollnum"));
        cfcourse.setText(rs.getString("course"));
        cfBRANCH.setText(rs.getString("branch"));
    }
} catch (Exception e) {
    e.printStackTrace();
}

      crollno.addItemListener(new ItemListener(){
      
      public void itemStateChanged(ItemEvent ie){
              try {
    Conn c = new Conn();
    String query = "SELECT * FROM student WHERE rollnum='" + crollno.getSelectedItem() + "'";
    ResultSet rs = c.s.executeQuery(query);
    while (rs.next()) {
        labelname.setText(rs.getString("name"));
        labelfname.setText(rs.getString("fname"));
        labeldoc.setText(rs.getString("dob"));
        tAddress.setText(rs.getString("Address"));
        tfPhone.setText(rs.getString("phone"));
        tEmail.setText(rs.getString("email"));
        twelve.setText(rs.getString("twelve"));
        tenth1.setText(rs.getString("tenth"));
        Addhar1.setText(rs.getString("addhar"));
        labelrollno.setText(rs.getString("rollnum"));
        cfcourse.setText(rs.getString("course"));
        cfBRANCH.setText(rs.getString("branch"));
    }
} catch (Exception e) {
    e.printStackTrace();
}
          
      }
      });
        
        
        //Button
        Submit =new  JButton("Update");
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
    if (ae.getSource() == Submit) {
        String rollnum = labelrollno.getText();
        String Address = tAddress.getText();
        String email = tEmail.getText();
        String phone = tfPhone.getText();
        String course = cfcourse.getText();
        String branch = cfBRANCH.getText();

        try {
            String query = "UPDATE student SET Address='" + Address + "', email='" + email + "', phone='" + phone + "', course='" + course + "', branch='" + branch + "' WHERE rollnum='" + rollnum + "'";
            Conn con = new Conn();
            con.s.executeUpdate(query);

            JOptionPane.showMessageDialog(null, "Student Details updated Successfully");
            setVisible(false);

        } catch (Exception er) {
            er.printStackTrace();
        }

    } else {
        setVisible(false);
    }
}

    public static void main(String args[]){
        new UpdateStudent();
    }
    
}

