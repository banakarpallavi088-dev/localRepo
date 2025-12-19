import  javax.swing.*;
import java.awt.*;
import java.awt.color.*;
import java.awt.event.*;
public class SR  {
    public static void main(String[] args) {
        JFrame frame=new JFrame("Student Personal Registration");
        frame.setLayout(new FlowLayout());
        frame.setSize(600,600);
        frame.getContentPane().setBackground(Color.PINK);
        
       
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       JLabel label1=new JLabel("Student Name:");
         label1.setBounds(10,20,100,10);
        
        JTextField user=new JTextField();
        user.setBounds(110,20,100,20);
        frame.add(label1);
        frame.add(user);

        JLabel label2=new JLabel("Student USN:");
        label2.setBounds(10,50,100,10);
        
        JTextField usn=new JTextField();
        usn.setBounds(110,50,100,20);
        frame.add(label2);

        frame.add(usn);
         frame.setSize(300,300);
        frame.setLayout(null);

        JLabel label3=new JLabel("Email ID:");
         label3.setBounds(10,125,100,10);
        
        JTextField t=new JTextField();
        t.setBounds(90,125,250,20);
        frame.add(label3);
        frame.add(t);

         JLabel label4=new JLabel("Phone num:");
         label4.setBounds(10,150,100,10);
        
        JTextField t1=new JTextField();
        t1.setBounds(90,150,250,20);
        frame.add(label4);
        frame.add(t1);


        JLabel genderlbl;
        genderlbl=new JLabel("Gender");
        genderlbl.setBounds(50,80,120,25);
        frame.add(genderlbl);

        JRadioButton rb1=new JRadioButton("Male");

       JRadioButton rb2= new JRadioButton("FeMale");
       rb1.setBounds(180,80,70,25);
       rb2.setBounds(260,80,80,25);
       ButtonGroup bg=new ButtonGroup();
          bg.add(rb1);
          bg.add(rb2);
       frame.add(rb1);
        frame.add(rb2);
       
        String dept[]={"CSE","ECE","EEE","ME","AI","AIML"};
        JLabel lab=new JLabel("department:");
        lab.setBounds(5,250,90,20);
        JComboBox cb=new JComboBox(dept);
        cb.setBounds(80,250,90,20);
        JLabel l=new JLabel("selected: none");
        l.setBounds(80,250,200,20);
    
        frame.add(lab);
       frame.add(cb);

        String sem[]={"1","2","3","4","5","6","7","8"};
        JLabel a=new JLabel("Semester:");
        a.setBounds(5,200,90,20);
        JComboBox bb1=new JComboBox(sem);
        bb1.setBounds(80,200,90,20);
        JLabel b=new JLabel("selected: none");
        b.setBounds(80,200,200,20);
       frame.add(a);
       frame.add(bb1);
     
     JLabel l1=new JLabel("Select Hobbies:");
     l1.setBounds(5,350,200,20);
     frame.add(l1);
       JCheckBox cb1 = new JCheckBox("Music");
       cb1.setBounds(100,350,200,20);
        JCheckBox cb2 = new JCheckBox("Sports");
         cb2.setBounds(100,380,200,20);
        JCheckBox cb3 = new JCheckBox("Reading");
         cb3.setBounds(100,400,200,20);
         JCheckBox cb4 = new JCheckBox("Singing");
         cb4.setBounds(100,420,200,20);
         


       frame. add(cb1);
        frame.add(cb2);
       frame. add(cb3);
       frame.add(cb4);
      JLabel msg=new JLabel();
      msg.setBounds(150,400,250,25);

      msg.setForeground(Color.MAGENTA);
      frame.add(msg);
       JButton B=new JButton("Submit");
       B.setBounds(100,500,90,20);
     
       
        JLabel L=new JLabel("Submit");
        
        frame.add(B);
        frame.add(L);
        frame.setSize(500,500);
        frame.setVisible(true);
        
 JButton b1=new JButton("Reset");
       b1.setBounds(100,550,90,20);
        JLabel L1=new JLabel("Reset");
        B.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String name=user.getText();
                String U=usn.getText();
                String Email=t.getText();
                String phone=t1.getText();

                if(name.isEmpty()||U.isEmpty()||Email.isEmpty()||phone.isEmpty())
                {
                    JOptionPane.showMessageDialog(frame, "Please fill all the fields");
                    return;
                }
                if(!phone.matches("\\d{10}")){
                    JOptionPane.showMessageDialog(frame, "Please enter correct 10 digit phone number");
                    return;
                }
       JOptionPane.showMessageDialog(frame, "Student Registrered Successfully");
                    return;

            }
        });

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
         user.setText(" ");
         usn.setText(" ");
         t.setText(" ");
         t1.setText(" ");
         bb1.setSelectedItem(false);
         cb1.setSelected(false);
         cb2.setSelected(false);
         cb3.setSelected(false);
         cb4.setSelected(false);




    }
});
        
        frame.add(b1);

        

        frame.setVisible(true);
        


    }
    
}
