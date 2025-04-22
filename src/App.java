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
         
        String primeiroNumeroEmTexto = "20";
        String segundoNumeroEmTexto = "30";

        try {
            int primeiroNumero = Integer.parseInt(primeiroNumeroEmTexto);
            int segundoNumero = Integer.parseInt(segundoNumeroEmTexto);
            if (segundoNumero == 0) {
                throw new RuntimeException("E impossivel dividir um numero por zero");
            }
            System.out.println("A soma  e:" + (primeiroNumero + segundoNumero));

        } catch (Exception ex) {
           
            System.out.println("algo deu errado : " + ex.getMessage());
        }
        System.out.println("Esta acontecendo depois do erro");
    }
}
