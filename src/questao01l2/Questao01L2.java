
package questao01l2;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Questao01L2 extends JFrame {

    
    public static void main(String[] args) {    
        Senha s1 = new Senha();
         System.out.println(s1.gerarSenha());
                      
        s1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         JOptionPane.showMessageDialog(null,"Senha Gerada: "+ s1.gerarSenha());
        
    }

  
}
