import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JButton;

public class Exercicio5 {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Exercício 5");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);

        JPanel painel = new JPanel();
        painel.setLayout(null);
        frame.add(painel);

        JLabel texto1 = new JLabel("Escolha um gênero:");
        painel.add(texto1);
        texto1.setBounds(25, 50, 150, 25);

        ButtonGroup grupoBotao = new ButtonGroup();
        JRadioButton botaoMasculino = new JRadioButton();
        JRadioButton botaoFeminino = new JRadioButton();
        JRadioButton botaoOutro = new JRadioButton();
        botaoMasculino.setText("Masculino");
        botaoFeminino.setText("Feminino");
        botaoOutro.setText("Outro");

        grupoBotao.add(botaoMasculino);
        grupoBotao.add(botaoFeminino);
        grupoBotao.add(botaoOutro);

        painel.add(botaoMasculino);
        painel.add(botaoFeminino);
        painel.add(botaoOutro);

        botaoMasculino.setBounds(25, 100, 100, 45);
        botaoFeminino.setBounds(25, 130, 100, 45);
        botaoOutro.setBounds(25, 160, 100, 45);

        JLabel exibirEscolha = new JLabel();
        String[] outroGenero = new String[2];
        painel.add(exibirEscolha);
        exibirEscolha.setBounds(25,275,300,50);

        JButton botaoEscolha = new JButton("Escolher");
        botaoEscolha.setBounds(25,220,100,50);
        painel.add(botaoEscolha);
        JTextField generoPersonalizado = new JTextField(75);
        botaoEscolha.addActionListener(escolherGenero -> {
            if((botaoFeminino.isSelected())||(botaoMasculino.isSelected())||(botaoOutro.isSelected())){
                if(botaoMasculino.isSelected()){
                    exibirEscolha.setText("O gênero escolhido foi masculino");
                }else if(botaoFeminino.isSelected()){
                    exibirEscolha.setText("O gênero escolhido foi feminino");
                }else{
                    outroGenero[0] = JOptionPane.showInputDialog("Digite o gênero preferido: ");
                    if((outroGenero[0].equals(""))||(outroGenero[0].equals(null))){
                        exibirEscolha.setText("Nenhum gênero foi escolhido");
                    }else{
                        exibirEscolha.setText("O gênero escolhido foi " + outroGenero[0].trim());
                    }
                }
            }
        });

    
        frame.setVisible(true);
    }
}
