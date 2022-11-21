import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class interfaceteste {
	
	public class actionMesage implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "Não");
		}
	}
	public class actionMesageEscolha1 implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "Não");
		}
	}
	
	public class actionMesageEscolha2 implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "Não");
		}
	}
	
	
	public class ActionButton implements ActionListener {
		public void actionPerformed (ActionEvent e) {
			System.exit(0);
		}
	}
	public class actionMesage2 implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			JButton btnInserirHQ = new JButton ("Inserir HQ"); 
			btnInserirHQ.addActionListener(new interfaceteste () .new actionMesageEscolha2());
			
			JButton btnInserirObra = new JButton ("Inserir Obra Educacional"); 
			btnInserirObra.addActionListener(new interfaceteste () .new actionMesageEscolha1());
			
			JPanel painel = new JPanel();
			painel.add(btnInserirHQ);
			painel.add(btnInserirObra);

				
		}	
	}
	
	
	public static void main(String[] args) {
		JButton btnInserir = new JButton ("Inserir"); 
		btnInserir.addActionListener(new interfaceteste () .new actionMesage());
		
		JButton btnBuscarNome = new JButton ("Buscar por nome"); 
		btnBuscarNome.addActionListener(new interfaceteste () .new actionMesage2());
		
		JButton btnBuscarEditora = new JButton ("Buscar por Editora"); 
		btnBuscarEditora.addActionListener(new interfaceteste () .new actionMesage2());
		
		JButton btnBuscarAutor = new JButton ("Buscar por autor"); 
		btnBuscarAutor.addActionListener(new interfaceteste () .new actionMesage2());
		
		JButton btnBuscarIsbm = new JButton ("Buscar por ISBM"); 
		btnBuscarIsbm.addActionListener(new interfaceteste () .new actionMesage2());
		
		JButton btnBuscarPreco = new JButton ("Buscar por preço"); 
		btnBuscarPreco.addActionListener(new interfaceteste () .new actionMesage2());
		
		JButton btnImprimirDadosPrin = new JButton ("Imprimir todos os livros com os dados principais"); 
		btnImprimirDadosPrin.addActionListener(new interfaceteste () .new actionMesage2());
		
		JButton btnImprimirDados = new JButton ("Imprimir todos os livros com todos os dados"); 
		btnImprimirDados.addActionListener(new interfaceteste () .new actionMesage2());
		
		JButton btnImprimirLivroVendido = new JButton ("Imprimir livro mais vendido"); 
		btnImprimirLivroVendido.addActionListener(new interfaceteste () .new actionMesage2());
		
		
		JButton botaoSair = new JButton("Sair");
		botaoSair.addActionListener(new interfaceteste().new ActionButton());
		
		
		JPanel painel = new JPanel();
		painel.add(btnInserir);
		painel.add(btnBuscarNome);
		painel.add(btnImprimirLivroVendido);
		painel.add(btnImprimirDados);
		painel.add(btnImprimirDadosPrin);
		painel.add(btnBuscarPreco);
		painel.add(btnBuscarIsbm);
		painel.add(btnBuscarAutor);
		painel.add(botaoSair);
		
		
		JFrame janela = new JFrame("Cadastro de livros no sistema");
		janela.add(painel);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.pack();
		janela.setVisible(true);
		janela.setLocationRelativeTo(null);  
		FlowLayout layout = (FlowLayout) painel.getLayout();
		layout.setAlignment(FlowLayout.LEFT);

	}


	public void setLocationRelativeTo() {
		// TODO Auto-generated method stub
		
	}


	private static void setSize(int i, int j) {
		// TODO Auto-generated method stub
		
	}


	private static void setLocation(int i, int j) {
		// TODO Auto-generated method stub
		
	}

	}
	
