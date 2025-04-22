import javax.swing.JFrame;

import java.awt.GridBagLayout;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Pessoa pessoa = new Pessoa("Maria", 123);
        System.out.println(pessoa.nome + "\n" + pessoa.telefone);

        Botao botao1 = new Botao();

        botao1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        botao1.setLayout(new GridBagLayout());
        botao1.setSize(500, 300);
        botao1.setVisible(true);
    }
}
