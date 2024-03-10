
package university.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Project extends JFrame implements ActionListener{
    
    Project(){
        
       setSize(1540,850) ;
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/cutmfront.jpg"));
        
        Image i2=i1.getImage().getScaledInstance(1500, 750,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image = new JLabel (i3);
        add(image);
        
       JMenuBar mb =new  JMenuBar ();
         JMenu newInformation =new   JMenu("New Information");
         newInformation .setForeground(Color.BLUE);
         
         mb.add(newInformation );
         
         JMenuItem facultyInfo = new   JMenuItem ("New faculty Information");
         facultyInfo.setBackground(Color.red);
         facultyInfo.addActionListener(this);
         newInformation .add(facultyInfo);
         
         JMenuItem studentInfo = new   JMenuItem ("New Student Information");
         studentInfo.setBackground(Color.red);
         studentInfo.addActionListener(this);
         newInformation .add(studentInfo);
         //details
         JMenu  details =new   JMenu("View details");
         details .setForeground(Color.BLUE);
         mb.add( details );
         
         JMenuItem facultdetails = new   JMenuItem (" View  faculty Details");
         facultdetails.setBackground(Color.red);
         facultdetails.addActionListener(this);
          details .add(facultdetails);
          
           
        JMenuItem studentdetails = new   JMenuItem ("View Student Details");
        studentdetails .setBackground(Color.red);
        studentdetails.addActionListener(this);
         details .add(studentdetails );
         
         //Leave
          JMenu  Leave =new   JMenu("Apply Leave");
          Leave .setForeground(Color.red);
          mb.add( Leave);
         
         JMenuItem facultLeave = new   JMenuItem ("faculty Leave");
         facultLeave.setBackground(Color.BLUE);
         facultLeave.addActionListener(this);
          Leave .add(facultLeave);
          
         JMenuItem studentLeave = new   JMenuItem ("Student Leave");
         studentLeave .setBackground(Color.GREEN);
         studentLeave.addActionListener(this);
         Leave .add(studentLeave );
        
        //Leave Details
          JMenu  LeaveDetails =new   JMenu("Leave Details");
          LeaveDetails .setForeground(Color.red);
          mb.add( LeaveDetails);
         
         JMenuItem facultLeaveDetails = new   JMenuItem ("faculty Leave Details");
         facultLeaveDetails.setBackground(Color.BLUE);
         facultLeaveDetails.addActionListener(this);
         LeaveDetails .add(facultLeaveDetails);
         
         JMenuItem studentLeaveDetails = new   JMenuItem ("Student Leave  Details");
         studentLeaveDetails .setBackground(Color.GREEN);
         studentLeaveDetails.addActionListener(this);
         LeaveDetails .add(studentLeaveDetails );
        
        //ExamDetails
         JMenu  Exam =new   JMenu("Examination");
         Exam .setForeground(Color.red);
         mb.add( Exam);
         
         JMenuItem ExamDetails = new   JMenuItem ("Examination Results");
        ExamDetails.setBackground(Color.BLUE);
        ExamDetails.addActionListener(this);
        Exam .add(ExamDetails);
        JMenuItem entermarks = new   JMenuItem ("Enter Marks");
       entermarks .setBackground(Color.GREEN);
       entermarks.addActionListener(this);
        Exam .add(entermarks );
        
        //update
         JMenu  UpdateInfo=new   JMenu(" Update Details");
         UpdateInfo .setForeground(Color.red);
         mb.add( UpdateInfo);
         
         JMenuItem updatefaculty = new   JMenuItem ("Update Faculty Details");
         updatefaculty .setBackground(Color.BLUE);
         updatefaculty.addActionListener(this);
         UpdateInfo .add(updatefaculty );
         JMenuItem updatestudent = new   JMenuItem ("Update Student Details");
         updatestudent.setBackground(Color.GREEN);
         updatestudent.addActionListener(this);
        UpdateInfo.add(updatestudent);
        
        //feeDetails
         JMenu  feeDetails=new   JMenu(" Fee Details");
         feeDetails .setForeground(Color.red);
         mb.add( feeDetails);
         
         JMenuItem feeStructure = new   JMenuItem ("Fee Structure");
        feeStructure  .setBackground(Color.BLUE);
         feeDetails .add(feeStructure  );
        JMenuItem feeform = new   JMenuItem ("Student fee form");
        feeform .setBackground(Color.GREEN);
        feeDetails.add(feeform);
        
        //utility
       
         JMenu  utility=new   JMenu(" utility");
      utility .setForeground(Color.red);
         mb.add(utility);
         
         JMenuItem notepad = new   JMenuItem ("Notepad");
        notepad   .setBackground(Color.BLUE);
         notepad.addActionListener(this);
        utility .add(notepad);
        JMenuItem Calc = new   JMenuItem ("Calculator");
        Calc .setBackground(Color.GREEN);
         Calc.addActionListener(this);
       utility.add(Calc);
        //Exit
         JMenu  Exit=new   JMenu("Exit");
         Exit .setForeground(Color.red);
         mb.add(Exit);
         
         JMenuItem  Ex= new JMenuItem ("Exit");
           Ex.setBackground(Color.BLUE);
           Ex.addActionListener(this);
          Exit .add(Ex);
      
       setJMenuBar(mb);
      
       setVisible(true);
        
    }
     public void actionPerformed(ActionEvent ae) {
    String msg  = ae.getActionCommand();
    if(msg.equals("Exit")){
        setVisible(false);
    } else if (msg.equals("Calculator")){
        
        try{
            Runtime.getRuntime().exec("calc.exc");
            
        }catch(Exception e){
            
        }
        
    }else if(msg.equals("New faculty Information")){
        new AddTeacher();
    }else if(msg.equals("New Student Information")){
         new AddStudent();
    } else if (msg.equals(" View  faculty Details")) {
    TeacherDetails teacherDetails = new TeacherDetails();
    teacherDetails.setVisible(true); // Make the TeacherDetails frame visible
} else if (msg.equals("View Student Details")) {
    StudentDetails studentDetails = new StudentDetails();
    studentDetails.setVisible(true); // Make the StudentDetails frame visible
}else if(msg.equals("faculty Leave")){
      new  TeacherLeave();
    
}else if(msg.equals("Student Leave")){
        new StudentLeave();
} else if(msg.equals("faculty Leave Details")){
      new  TeacherLeaveDetails();
}else if(msg.equals("Student Leave  Details")){
        new StudentLeaveDetails();
    }else if(msg.equals("Update Faculty Details")){
      new  UpdateTeacher();
}else if(msg.equals("Update Student Details")){
        new UpdateStudent();
    }else if(msg.equals("Enter Marks")){
        new EnterMarks();
     }else if(msg.equals("Examination Results")){
        new ExaminationDetails();
     }
     }
    
    public static void main(String args[]){
        new Project();
    }
}
