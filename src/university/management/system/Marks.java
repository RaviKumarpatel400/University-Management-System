
package university.management.system;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import net.proteanit.sql.DbUtils;


public class Marks extends JFrame implements ActionListener {
    
    String rollno;
    JButton Cancel;
    
    Marks( String rollno){
        this.rollno=rollno;
        
       setSize(500, 600);
        setLocation(500, 100);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
          JLabel heading = new JLabel("Centurion University"); 
         heading.setBounds(100, 100, 500, 35);
          heading.setFont(new Font("Tahoma",Font.BOLD, 20));
          add( heading);
        
        JLabel subheading = new JLabel("Result of Examination(Year)");
        subheading.setBounds(100, 50, 500, 20);
        subheading.setFont(new Font("Tahoma", Font.BOLD, 20));
        add(subheading);
        
          JLabel lblrollno = new JLabel("Roll Number"+rollno); 
         lblrollno.setBounds(80, 150, 500, 35);
          lblrollno.setFont(new Font("Tahoma",Font.PLAIN, 20));
          add(lblrollno);
        
        JLabel lblsemester = new JLabel();
        lblsemester.setBounds(60, 130, 500, 20);
        lblsemester.setFont(new Font("Tahoma", Font.PLAIN, 20));
        add(lblsemester);
        
         JLabel sub1 = new JLabel();
        sub1.setBounds(100, 200, 500, 20);
        sub1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        add(sub1);
        JLabel sub2 = new JLabel();
        sub2.setBounds(100, 230, 500, 20);
        sub2.setFont(new Font("Tahoma", Font.PLAIN, 20));
        add(sub2);
        JLabel sub3 = new JLabel();
        sub3.setBounds(100, 260, 500, 20);
        sub3.setFont(new Font("Tahoma", Font.PLAIN, 20));
        add(sub3);
        JLabel sub4 = new JLabel();
        sub4.setBounds(100, 290, 500, 20);
        sub4.setFont(new Font("Tahoma", Font.PLAIN, 20));
        add(sub4);
        JLabel sub5 = new JLabel();
        sub5.setBounds(100, 320, 500, 20);
        sub5.setFont(new Font("Tahoma", Font.PLAIN, 20));
        add(sub5);
        
        try{
            Conn c =new Conn();        
                ResultSet rs =c.s.executeQuery("select * from subject where rollno='"+rollno+"'");
             while(rs.next()){
                 sub1.setText(rs.getString("sub1"));
                 sub2.setText(rs.getString("sub2"));
                 sub3.setText(rs.getString("sub3"));
                 sub4.setText(rs.getString("sub4"));
                 sub5.setText(rs.getString("sub5"));
                 
             }
      ResultSet rs1 =c.s.executeQuery("select * from marks where rollno='"+rollno+"'");
       while(rs1.next()){
                 sub1 .setText(sub1.getText()+"-------"+rs1.getString("marks1"));
                 sub2 .setText(sub2.getText()+"-------"+rs1.getString("marks2"));
                 sub3 .setText(sub3.getText()+"-------"+rs1.getString("marks3"));
                 sub4 .setText(sub4.getText()+"-------"+rs1.getString("marks4"));
                 sub5 .setText(sub5.getText()+"-------"+rs1.getString("marks5"));
                   lblsemester.setText("semester"+rs1.getString("semester"));
                 
       }
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
          Cancel =new  JButton("Cancel");
       Cancel.setBounds(250, 500, 120, 30);
        Cancel.setBackground(Color.BLACK);
        Cancel.setForeground(Color.WHITE);
        Cancel.addActionListener(this);
        Cancel.setFont(new Font("Tahoma",Font.BOLD,16));
        add(Cancel);
        
        setVisible(true);
        
    }
    
     public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==Cancel){
             setVisible(false);
            
        }
    }
    
    public static void main(String args[]){
        new Marks("");
    }
    
}
