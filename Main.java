import javax.swing.JOptionPane;

public class Main extends obj1 {
    
    public static void main(String[] args) {

        int chooseConversation = Integer.parseInt(JOptionPane.showInputDialog("Chose a conversation between 1 - 3"));
       
        
        if (chooseConversation == 1) {
            
            /* The following will create a textbox to input your name */
            String name = JOptionPane.showInputDialog("Enter your name");

            /* The following will create a message box with the text "Bonjour" and your name */
            JOptionPane.showMessageDialog(null, "Bonjour " + name + "!");

        } else if (chooseConversation == 2) {

            int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
            JOptionPane.showMessageDialog(null, "You are " + age + " years old");

        }else if (chooseConversation == 3) {

            double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
            JOptionPane.showMessageDialog(null, "You are " + height + " cm tall");

        } else {

            JOptionPane.showMessageDialog(null, "You have entered an invalid number");
        }

        

        
    }
}
