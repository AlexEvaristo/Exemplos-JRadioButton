package interface_grafica;

import javax.swing.*;
import java.awt.*;

public class Aula9_ExemploJComboBox {
    public static  void main(String[] args){
        JFrame janela =  new JFrame("Exemplos  JCombobox");

        janela.setSize(400, 300);

        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        janela.setLayout(new GridLayout(3, 1, 10, 10));


        //====Painel de Itens=====
        JPanel painelItens = new JPanel(new FlowLayout());

        painelItens.setBorder(BorderFactory.createTitledBorder("Escolha um Item"));

        String[] items = new String[]{"Item 1", "Item 2", "Item 3"};

        JComboBox<String> comboItens = new JComboBox<>(items);

        JButton botaoMostrar = new JButton("Mostrar Seleção");

        botaoMostrar.addActionListener(e -> {

            String selecionado = (String) comboItens.getSelectedItem();

            JOptionPane.showMessageDialog(janela, "Você escolheu: " + selecionado);
        });

        painelItens.add(comboItens);
        painelItens.add(botaoMostrar);

        //====Painel de Países====
        JPanel painelPaises = new JPanel(new FlowLayout());

        painelPaises.setBorder(BorderFactory.createTitledBorder("Selecione seu País"));

        String[] paises = {"Brasil", "Argentina", "Chile", "Estados Unidos", "Japão" };

        JComboBox<String> comboPaises = new JComboBox<>(paises);

        painelPaises.add(new JLabel("País: "));

        Button buttonPaises = new Button("Escolher País");

        buttonPaises.addActionListener(e -> {
            String selecionado = String.valueOf(comboPaises.getSelectedItem());
            JOptionPane.showMessageDialog(janela, "País escolhido foi: " + selecionado);
        });

        //====Painel de Cores====
        JPanel painelCores = new JPanel(new FlowLayout());

        painelCores.setBorder(BorderFactory.createTitledBorder("Trocar cor de Fundo"));

        String[] cores = {"Branco", "Amarelo", "Verde", "Azul"};

        JComboBox<String> comboCores = new JComboBox<>(cores);

        JPanel painelExemplo = new JPanel();

        painelExemplo.setPreferredSize(new Dimension(100, 50));

        painelExemplo.setBackground(Color.WHITE);

        comboCores.addActionListener(e-> {

            String corSelecionada = (String) comboCores.getSelectedItem();

            switch (corSelecionada) {

                case "Amarelo":
                    painelExemplo.setBackground(Color.YELLOW);
                    break;

                case "Verde":
                    painelExemplo.setBackground(Color.green);
                    break;

                case "Azul":
                    painelExemplo.setBackground(Color.CYAN);
                    break;

                default:
                    painelExemplo.setBackground(Color.WHITE);

            }
        });

        painelCores.add(comboCores);

        painelCores.add(painelExemplo);


        painelPaises.add(comboPaises);
        painelPaises.add(buttonPaises);

        janela.add(painelItens);

        janela.add(painelPaises);

        janela.add(painelCores);

        janela.setVisible(true);
    }

}
