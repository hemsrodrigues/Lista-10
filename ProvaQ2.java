
package ProvaLDP;

import javax.swing.JOptionPane;

public class ProvaQ2 {
    public static void main(String[] args) {
        
        String p1;
        int idade;
        int maiores = 0;
        
        do {
            p1 = JOptionPane.showInputDialog("Digite uma idade:");
            idade = Integer.parseInt(p1);
            
            if(idade >= 18){
                
                maiores = maiores + 1;
            }
        }
        
        while (idade != 0);

        JOptionPane.showMessageDialog(null, "Apenas" +maiores + " são maiores de idade.");
    }
        
    }

