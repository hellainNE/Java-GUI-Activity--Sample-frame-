import java.awt.*;
public class Main{
public static void main(String[] args){
//frame
  Frame frame1= new Frame("Frame_Nesle");
  frame1.setSize(800,500);
  frame1.setLocation(500,150);
  frame1.setLayout(null);
  frame1.setVisible(true);
//labels and fonts
  Label label = new Label("User Registration");
  label.setBounds(150,40,500,50);
  label.setAlignment(Label.CENTER); 
  Font myFont = new Font("Arial", Font.BOLD, 18);
  label.setFont(myFont);

  Label namelabel =  new Label ("Name: ");
  namelabel.setBounds(150, 100, 60, 50);
  Font myFont1 = new Font("Arial", Font.BOLD, 14);
  namelabel.setFont(myFont1);

  Label addressLabel =  new Label ("Address: ");
  addressLabel.setBounds(150, 160, 65, 50);
  Font myFont2 = new Font("Arial", Font.BOLD, 14);
  addressLabel.setFont(myFont2);

  Label emailLabel =  new Label ("Email: ");
  emailLabel.setBounds(150, 220, 60, 50);
  Font myFont3 = new Font("Arial", Font.BOLD, 14);
  emailLabel.setFont(myFont3);

  Label birthLabel =  new Label ("Date of Birth: ");
  birthLabel.setBounds(150, 280, 100, 50);
  Font myFont4 = new Font("Arial", Font.BOLD, 14);
  birthLabel.setFont(myFont4);

//text field 
TextField namelabelTF = new TextField();
namelabelTF.setBounds(255, 115, 350, 20);

TextField addresslabelTF = new TextField();
addresslabelTF.setBounds(255, 175, 350, 20);

TextField emaillabelTF = new TextField();
emaillabelTF.setBounds(255, 235, 350, 20);

TextField birthlabelTF = new TextField();
birthlabelTF.setBounds(255, 295, 350, 20);

//button
Button submit = new Button("Submit");  
submit.setBounds(150, 380, 100, 30);  
submit.setFont(new Font("Arial", Font.BOLD, 14));
submit.setBackground(Color.LIGHT_GRAY); 
submit.setCursor(new Cursor(Cursor.HAND_CURSOR));

Button cancel = new Button("Cancel");  
cancel.setBounds(510,380,100,30);  
cancel.setFont(new Font("Arial", Font.BOLD, 14));
cancel.setBackground(Color.LIGHT_GRAY); 
cancel.setCursor(new Cursor(Cursor.HAND_CURSOR));

  frame1.add(label);
  frame1.add(namelabel);
  frame1.add(addressLabel);
  frame1.add(emailLabel);
  frame1.add(birthLabel);
  frame1.add(namelabelTF);
  frame1.add(addresslabelTF);
  frame1.add(emaillabelTF);
  frame1.add(birthlabelTF);
  frame1.add(submit);
  frame1.add(cancel);
}
}