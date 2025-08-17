import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Exercicio7 {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Exercicio 7");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);

        JLabel paisEscolhido= new JLabel("Selecione um dos países na lista acima");
        JPanel painel = new JPanel();
        painel.setLayout(null);
        painel.add(paisEscolhido);
        paisEscolhido.setBounds(25,200,500,50);

        String paises[] = {"Argentina", "Brasil", "Chile"};
        JComboBox opcoesCombo = new JComboBox(paises);
        opcoesCombo.addItemListener(trocarText -> {
            //itemListener serve pra mesma coisa que um actiolistener: reagir a mudanças na seleção
            paisEscolhido.setText("O país selecionado atualmente é " + opcoesCombo.getSelectedItem());
        });
        painel.add(opcoesCombo);
        opcoesCombo.setBounds(25, 150, 150, 25);

        String[] outroPais = new String[2];
        JButton botaoAdicionar = new JButton("Adicionar país");
        botaoAdicionar.addActionListener(adicionarPais -> {
            outroPais[0] = JOptionPane.showInputDialog("Digite o novo país a ser adicionado: ");
            if((outroPais[0].equals(""))||(outroPais[0].equals(null))){
                JOptionPane.showMessageDialog(null,"Nenhum país foi adicionado pois nenhum nome foi fornecido");
            }else{
                opcoesCombo.addItem(outroPais[0].trim());
            }
            
        });
        painel.add(botaoAdicionar);
        botaoAdicionar.setBounds(25,100,150,25);

        frame.add(painel);
        frame.setVisible(true);
    }
}
