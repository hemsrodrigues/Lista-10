
package ProvaLDP;

import javax.swing.JOptionPane;

public class ProvaQ3 {
    public static void main(String[] args) {
        
        String p1;
        int valor;
        int pn = 0;
        
        do {
        
            p1 = JOptionPane.showInputDialog("Digite um número:");
            valor = Integer.parseInt(p1);
        
            if(valor % 2 == 0 & valor < 0){
                pn = pn + 1;
            }
        }
        
        while(valor != 0);
        
        JOptionPane.showMessageDialog(null,  " Foram digitados " +pn + " números pares e negativos.");
    }
}


