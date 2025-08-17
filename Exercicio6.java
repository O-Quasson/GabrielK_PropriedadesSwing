import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JLabel;
import java.awt.Color;

public class Exercicio6 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Exercicio 6");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);

        JPanel painelEsquerda = new JPanel();
        painelEsquerda.setBackground(Color.RED);
        JLabel textoEsquerda = new JLabel("Esquerda");
        painelEsquerda.add(textoEsquerda);

        JPanel painelDireita = new JPanel();
        painelDireita.setBackground(Color.BLUE);
        JLabel textoDireita = new JLabel("Direita");
        painelDireita.add(textoDireita);
        
        JSplitPane janelaDividida = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
        //toda JSplitPane tem uma linha dividindo ele. O setDividerLocation serve para dizer onde vai começar a linha/a posição inicial dela. 
        //nesse caso, por exemplo, essa linha vai começar a 40% da largura do frame, ou seja
        //o lado esquerdo vai ter 40% do tamanho da janela e o lado direito vai ter 60% do tamanho da janela
        janelaDividida.setDividerLocation((frame.getWidth()*40)/100);
        janelaDividida.setLeftComponent(painelEsquerda);
        janelaDividida.setRightComponent(painelDireita);

        frame.add(janelaDividida);
        frame.setVisible(true);
    }
}
