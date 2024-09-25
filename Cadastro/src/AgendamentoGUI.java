import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AgendamentoGUI extends JFrame {
    private JTextField nomeField;
    private JTextField dataField;
    private JTextField horaField;
    private JTextField telefoneField;
    private JButton cadastrarButton;

    public AgendamentoGUI() {
        // Configuração da janela principal
        setTitle("Cadastro de Agendamento");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Criando o painel principal
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2, 10, 10));

        // Labels e campos de texto
        JLabel nomeLabel = new JLabel("Nome:");
        nomeField = new JTextField();

        JLabel dataLabel = new JLabel("Data do Agendamento (dd/mm/yyyy):");
        dataField = new JTextField();

        JLabel horaLabel = new JLabel("Hora do Agendamento (HH:mm):");
        horaField = new JTextField();

        JLabel telefoneLabel = new JLabel("Telefone:");
        telefoneField = new JTextField();

        // Botão de cadastrar
        cadastrarButton = new JButton("Cadastrar");

        // Adicionando componentes ao painel
        panel.add(nomeLabel);
        panel.add(nomeField);
        panel.add(dataLabel);
        panel.add(dataField);
        panel.add(horaLabel);
        panel.add(horaField);
        panel.add(telefoneLabel);
        panel.add(telefoneField);
        panel.add(new JLabel()); // espaço vazio
        panel.add(cadastrarButton);

        // Adiciona o painel ao frame
        add(panel);

        // Ação ao clicar no botão Cadastrar
        cadastrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cadastrarAgendamento();
            }
        });
    }

    // Método que será executado ao clicar no botão Cadastrar
    private void cadastrarAgendamento() {
        String nome = nomeField.getText();
        String data = dataField.getText();
        String hora = horaField.getText();
        String telefone = telefoneField.getText();

        // Exibe uma mensagem de confirmação com os dados inseridos
        JOptionPane.showMessageDialog(this,
                "Agendamento cadastrado:\n" +
                        "Nome: " + nome + "\n" +
                        "Data: " + data + "\n" +
                        "Hora: " + hora + "\n" +
                        "Telefone: " + telefone,
                "Sucesso",
                JOptionPane.INFORMATION_MESSAGE);

        // Limpa os campos após o cadastro
        nomeField.setText("");
        dataField.setText("");
        horaField.setText("");
        telefoneField.setText("");
    }

    // Método principal para rodar a aplicação
    public static void main(String[] args) {
        // Criando e exibindo a interface gráfica
        AgendamentoGUI tela = new AgendamentoGUI();
        tela.setVisible(true);
    }
}
