import javax.swing.JFrame;
import java.awt.event.MouseListener;
import java.text.ParseException;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

public class Exercicio4 {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Exercicio 4");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);

        MaskFormatter mascara = null;
        JFormattedTextField campoIdade = new JFormattedTextField();
        JPanel painel = new JPanel();
        JLabel texto = new JLabel("Data de nascimento");
        int[] dia = new int[2];
        int[] mes = new int[2];
        int[] ano = new int[2];

        painel.setLayout(null);
        texto.setBounds(25,50,150,25);
        campoIdade.setBounds(25,75,250,50);
        
        try {
            mascara = new MaskFormatter("##/##/####");
            mascara.setPlaceholder("__________");
        } catch (ParseException e) {
            // TODO Auto-generated catch block
        }
        //para aplicar a máscara em um JFormattedTextField, primeiro temos que declarar uma variável do tipo MaskFormatter e definir/setar a máscara (no caso, como é data, usar # permite digitar apenas números) com os acessórios (nesse caso, é a / separando o dia, mês e ano)
        //a formatação do JFormattedTextField é aplicada por meio da propriedade .install do componente MaskFormatter
        mascara.install(campoIdade);
        
        MouseListener eventoCliqueCampo = new MouseListener() {

            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                // TODO Auto-generated method stub
                campoIdade.setText("");

            }

            @Override
            public void mousePressed(java.awt.event.MouseEvent e) {
                // TODO Auto-generated method stub
            }

            @Override
            public void mouseReleased(java.awt.event.MouseEvent e) {
                // TODO Auto-generated method stub
            }

            @Override
            public void mouseEntered(java.awt.event.MouseEvent e) {
                // TODO Auto-generated method stub
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent e) {
                // TODO Auto-generated method stub
            }
        };

        campoIdade.addMouseListener(eventoCliqueCampo);
        campoIdade.addActionListener(verificaData -> {
            String data = campoIdade.getText();

            dia[0] = Integer.parseInt(data.substring(0,2));
            mes[0] = Integer.parseInt(data.substring(3, 5));
            ano[0] = Integer.parseInt(data.substring(7));

            //if((dia[0]>31)||(mes[0]>12)||((mes[0]==2)&&(dia[0]>29)&&((ano[0] % 400 != 0) || ((ano[0] % 4 != 0) && (ano[0] % 100 == 0))))){
            if((dia[0]>31)||(mes[0]>12)||((mes[0]==2)&&(dia[0]>29)&&(ano[0]%4==0))){
                JOptionPane.showMessageDialog(null, "Por favor, insira uma data válida");
            }else{
                JOptionPane.showMessageDialog(null, "A data de nascimento escolhida foi " + campoIdade.getText());
            }
        });

        painel.add(texto);
        painel.add(campoIdade);
        frame.add(painel);
        frame.setVisible(true);
    }
}
