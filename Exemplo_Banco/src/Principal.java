import javax.swing.JOptionPane;
public class Principal {

    public static void main(String[] args){
        int conta;
        Double saldo, limite, rendimento;

      int opcao = Integer.parseInt( JOptionPane.showInputDialog("Banco:\n<1>Conta corrente\n<2>Conta Poupança\n<3>Sair"));

      switch (opcao){
          case 1:
              conta = Integer.parseInt(JOptionPane.showInputDialog(" Numero da conta:"));
              saldo = Double.parseDouble(JOptionPane.showInputDialog(" Saldo:"));
              limite = Double.parseDouble(JOptionPane.showInputDialog(" Rendimento:"));
              ContaCorrente cc1 = new ContaCorrente(conta,saldo,limite);
              JOptionPane.showMessageDialog(null, "Saldo: " +cc1.getSaldo()+ "\nSaldo com rendimento: "+cc1.consultaSaldoTotal(), "Conta Corrente ", JOptionPane.INFORMATION_MESSAGE);


              break;
          case 2:
              conta = Integer.parseInt(JOptionPane.showInputDialog(" Numero da conta:"));
              saldo = Double.parseDouble(JOptionPane.showInputDialog(" Saldo:"));
              rendimento = Double.parseDouble(JOptionPane.showInputDialog(" Rendimento:"));
              ContaPoupanca cp1 = new ContaPoupanca(conta,saldo,rendimento);
              cp1.atualizaRendimento();
              JOptionPane.showMessageDialog(null, "Saldo: " +cp1.getSaldo(), "Conta Poupança ", JOptionPane.INFORMATION_MESSAGE);


              break;
          case 3:
              break;
          default:JOptionPane.showMessageDialog(null,"Escolha inválida", "Erro", JOptionPane.ERROR);
      }
        }



    }

