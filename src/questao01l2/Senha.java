
package questao01l2;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class Senha extends JFrame {
    private JLabel qtd;
    private JTextField meuTextField;
    private JButton calcular;
    
    public static String gerarSenha() {
        int qtd = 8;
        String[] digitos = { "a", "1", "b", "2", "4", "5", "6", "7", "8",
                "9", "a", "b", "c", "d", "e" };
      
        StringBuilder senha = new StringBuilder();
       
        
          
        for (int i = 0; i < qtd; i++) {
            int j = (int) (Math.random() * digitos.length);
            senha.append(digitos[j]);
        }
        return senha.toString();
        
        
       
    }

      
       
         }
    
      
        
        
 
