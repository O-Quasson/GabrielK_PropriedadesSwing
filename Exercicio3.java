import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JScrollPane;

public class Exercicio3 {
    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        
        JTextArea areaTexto = new JTextArea();
        frame.setLayout(null);
        

        areaTexto.setRows(10);
        areaTexto.setColumns(30);
        areaTexto.setLineWrap(true);
        areaTexto.setText("Lorem ipsum dolor sit amet. Et molestiae perferendis ea iure dolor non quae dolor aut iure error et consequatur incidunt ex consequatur beatae.\n\nA voluptas esse sit ipsum fuga sit provident consequuntur eum modi commodi est voluptatum iusto ea incidunt laudantium At recusandae animi. Quo maiores distinctio cum facere voluptatem in repellat voluptatibus id vero dolore aut assumenda odio. Eum sequi voluptas aut odit necessitatibus ea eaque consectetur nam assumenda animi. Aut aliquid blanditiis ab quasi animi et iste accusamus ut numquam laboriosam et nulla officiis qui praesentium nihil est quidem voluptas.\n\nAut ipsa culpa qui commodi iusto sed doloribus itaque et placeat perspiciatis. Et laboriosam omnis qui voluptas eligendi quo eligendi vitae!");
        areaTexto.setBackground(Color.LIGHT_GRAY);
        //https://docs.oracle.com/javase/tutorial/uiswing/components/textarea.html
        areaTexto.setFont(new Font("Arial", 0, 12));

        //você precisa colocar o JScrollPane porque, ao definir o tamanho do campo, se você colocar uma quantidade de texto maior do que o tamanho do campo, o texto simplesmente não será possível de ser visto, ele continuará no campo, sim, mas ele ficará fora de tela
        JScrollPane scroll = new JScrollPane(areaTexto);
        scroll.setBounds(125,75,250,100);
        frame.add(scroll);

        frame.setVisible(true);
    }
}