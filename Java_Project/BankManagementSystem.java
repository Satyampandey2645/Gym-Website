//--->   AddTwoNumbers--Pascal Naming Convention used for Classes
//--->   addTwoNumbers--camel Case Naming Convention used for functions
/*public class Demo{
    public static void main(String args[]){

        System.out.println("Hello World");
    }
} 

class Outer{

}
*/
package bank.management.system;

//package Java_Project;

import javax.swing.*;

public class Login extends JFrame{
     
    Login(){
        setSize(800, 400);
        setVisible(true);
        setLocation(350,200); 
    }
    public static void main(String args[]) {
        new Login(); 
    }
}