
package ProvaLDP;

import javax.swing.JOptionPane;

public class ProvaQ1 {
    public static void main(String[] args) {

        String p1;
        int n;
        int mult = 0;
        int i = 1;
        
        p1 = JOptionPane.showInputDialog("Digite um número:");
        n = Integer.parseInt(p1);
            
        do {
            
            if (i % 3 == 0){
                
                mult = mult + 1;
            }  
            
            i++;
        }        
        
        while (i <= n);{
            JOptionPane.showMessageDialog(null, "Apenas " +mult + " números são múltiplos de 3.");
        }
    }
}
