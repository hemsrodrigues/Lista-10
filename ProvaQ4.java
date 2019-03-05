
package ProvaLDP;


import javax.swing.JOptionPane;

public class ProvaQ4 {

    public static void main(String[] args) {

        String p1;
        String p2;
        char op;
        float conta;
        int a;
        int b;
        
        do {
            p1 = JOptionPane.showInputDialog("Digite o primeiro número:");
            a = Integer.parseInt(p1);
            p2 = JOptionPane.showInputDialog("Digite o segundo número:");
            b = Integer.parseInt(p2);
            p1 = JOptionPane.showInputDialog("Escolha uma opção:"
                    + " \n D - divisão"
                    + " \n P - potenciação"
                    + " \n A - adição"
                    + " \n S - subtração "
                    + "\n  M - multiplicação"
                    + " \n X - sair");
            op = p1.charAt(0);

            switch (op) {
                case 'D':
                    if (b != 0) {
                        conta = a / b;
                        JOptionPane.showMessageDialog(null, "Divisão = " + conta);
                    } else {
                        JOptionPane.showMessageDialog(null, "Opção inválida!");
                    }
                    break;
                case 'P':
                    conta = (int) Math.pow(a, b);
                    JOptionPane.showMessageDialog(null, "Potênciação = " + conta);
                    break;
                case 'A':
                    conta = a + b;
                    JOptionPane.showMessageDialog(null, "Adição = " + conta);
                    break;
                case 'S':
                    conta = a - b;
                    JOptionPane.showMessageDialog(null, "Subtração = " + conta);
                    break;
                case 'M':
                    conta = a * b;
                    JOptionPane.showMessageDialog(null, "Multiplicação = " + conta);
                    break;
                case 'X':
                    JOptionPane.showMessageDialog(null, "Volte sempre!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        }    
        
        while (op != 'X');
        
    }
}
