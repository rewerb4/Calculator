

package calcjava;

import javax.swing.SwingUtilities;


public class CalcJava 
{

   
    public static void main(String[] args) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() {

         @Override
         public void run() {
            new calcFrame();
         }
       });    
            
            
    }
     
    
}
