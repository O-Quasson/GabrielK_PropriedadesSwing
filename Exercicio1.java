import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Exercicio1 {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Exercicio 1");
        //define o evento que ocorre quando clicar no "X"/fechar janela (no caso, encerra o programa)
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //define o tamanho do frame/tamanho da janela ao iniciar o programa
        frame.setSize(600,600);
        JPanel painel = new JPanel();
        //adiciona o JPanel dentro do frame/janela
        frame.add(painel);

        //define a cor de background do painel para verde
        painel.setBackground(Color.GREEN);
        //setborder define a borda, que no caso é definido para ter o texto "Painel de controle"
        //createTitledBorder define o texto
        painel.setBorder(BorderFactory.createTitledBorder("Painel de controle"));

        JButton botao = new JButton("Clique aqui!");
        //define a cor de background do botão para amarelo
        botao.setBackground(Color.YELLOW);
        //adiciona o botao dentro do painel
        painel.add(botao);

        //permite que a janela/frame seja vista
        frame.setVisible(true);
    };
};
