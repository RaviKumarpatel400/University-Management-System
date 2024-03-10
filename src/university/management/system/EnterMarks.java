
package university.management.system;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class EnterMarks  extends JFrame implements ActionListener{
    Choice crollno;
    JComboBox cbsemester;
    JTextField sub1,sub2,sub3,sub4,sub5,marks1,marks2,marks3,marks4,marks5;
    JButton Cancel,Submit;
    EnterMarks (){
        
        setSize(1000, 500);
        setLocation(300, 150);
        setLayout(null);

        getContentPane().setBackground(Color.WHITE);
         
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/exam.jpg"));        
        Image i2=i1.getImage().getScaledInstance(400, 300,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image = new JLabel (i3);
        image.setBounds(500,40,400,300);
        add(image);
        
        //paste
          JLabel heading = new JLabel("Enter Marks of Students"); 
         heading.setBounds(50, 0, 500, 40);
          heading.setFont(new Font("Tahoma",Font.BOLD, 20));
        add( heading);
        //paste
         JLabel lblrollnumber =new JLabel("Select Roll Number");
        lblrollnumber.setBounds(50, 70, 150, 20);
        lblrollnumber.setFont(new Font("serif",Font.PLAIN, 20));
        add(lblrollnumber);
        
        crollno = new Choice();
        crollno.setBounds(200, 70, 150, 20);
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
        //heading
         JLabel lblsemester =new JLabel("Select Semester");
        lblsemester.setBounds(50, 110, 150, 20);
        lblsemester.setFont(new Font("serif",Font.PLAIN, 20));
        add(lblsemester);
        
        String semester[]={"1st","2nd","3rd","4th","5th","6th","7th","8th"};
        cbsemester = new JComboBox(semester);
        cbsemester.setBounds(200,110,150,20);
        add(cbsemester);
        
         JLabel subject =new JLabel("Enter Subject");
          subject.setBounds(50, 150, 200, 40);
          subject.setFont(new Font("serif",Font.PLAIN, 20));
          add(subject);
         JLabel Marks =new JLabel("Enter Marks");
         Marks.setBounds(300, 150, 200, 40);
         Marks .setFont(new Font("serif",Font.PLAIN, 20));
        add(Marks);
        
        //subject
        sub1 = new JTextField();
        sub1.setBounds(50, 200, 200, 20);
        add(sub1);
        sub2 = new JTextField();
        sub2.setBounds(50, 230, 200, 20);
        add(sub2);
        sub3 = new JTextField();
        sub3.setBounds(50, 260, 200, 20);
        add(sub3);
        sub4 = new JTextField();
        sub4.setBounds(50, 290, 200, 20);
        add(sub4);
        sub5 = new JTextField();
        sub5.setBounds(50, 320, 200, 20);
        add(sub5);
        //marks
        marks1 = new JTextField();
        marks1.setBounds(280, 200, 200, 20);
        add(marks1);
        marks2 = new JTextField();
        marks2.setBounds(280, 230, 200, 20);
        add(marks2);
        marks3 = new JTextField();
        marks3.setBounds(280, 260, 200, 20);
        add(marks3);
        marks4 = new JTextField();
        marks4.setBounds(280, 290, 200, 20);
        add(marks4);
        marks5 = new JTextField();
        marks5.setBounds(280, 320, 200, 20);
        add(marks5);
        
         //Button
        Submit =new  JButton("Submit");
       Submit.setBounds(70, 360, 150, 25);
        Submit.setBackground(Color.BLACK);
        Submit.setForeground(Color.WHITE);
        Submit.addActionListener(this);
        Submit.setFont(new Font("Tahoma",Font.BOLD,16));
        add(Submit);
        
         Cancel =new  JButton("Cancel");
       Cancel.setBounds(280, 360, 150, 25);
        Cancel.setBackground(Color.BLACK);
        Cancel.setForeground(Color.WHITE);
        Cancel.addActionListener(this);
        Cancel.setFont(new Font("Tahoma",Font.BOLD,16));
        add(Cancel);
         
         setVisible(true);
        
    }
  public void actionPerformed(ActionEvent ae) {
    if (ae.getSource() == Submit) {
        try {
            Conn c = new Conn();

            String query1 = "insert into subject values('" + crollno.getSelectedItem() + "', '" + cbsemester.getSelectedItem() + "','" + sub1.getText() + "','" + sub2.getText() + "','" + sub3.getText() + "','" + sub4.getText() + "','" + sub5.getText() + "')";

            String query2 = "insert into marks values('" + crollno.getSelectedItem() + "', '" + cbsemester.getSelectedItem() + "','" + marks1.getText() + "','" + marks2.getText() + "','" + marks3.getText() + "','" + marks4.getText() + "','" + marks5.getText() + "')";
            
            c.s.executeUpdate(query1);
            c.s.executeUpdate(query2);

            JOptionPane.showMessageDialog(null, "Marks inserted Successfully");
            setVisible(false);

        } catch (Exception e) {
            e.printStackTrace();
        }


    } else {
        setVisible(false);
    }
}

    public static void main(String args[]){
        new EnterMarks ();
    }
}
