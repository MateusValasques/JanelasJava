import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener{
	
	Janela janela;
	PainelCliente painel_cliente;
	PainelProduto painel_produto;
	
	public Controlador (Janela janela, 	PainelCliente painel_cliente, PainelProduto painel_produto) {
		this.janela = janela;
		this.painel_cliente = painel_cliente;
		this.painel_produto = painel_produto;
		addEventos();
	}
	
	public void addEventos(){
		janela.getSetcontent_cliente().addActionListener(this);
		janela.getSetcontent_produto().addActionListener(this);

		janela.getInternalframe_cliente().addActionListener(this);
		janela.getInternalframe_produto().addActionListener(this);
		

		janela.getTabbedpane_cliente().addActionListener(this);
		janela.getTabbedpane_produto().addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (janela.getSetcontent_cliente() == e.getSource()) {
			janela.setContentPane(painel_cliente);
			janela.repaint();
			janela.validate();
			
		}
		if (janela.getSetcontent_produto() == e.getSource()) {
			janela.setContentPane(painel_produto);
			janela.repaint();
			janela.validate();
		}
		if (janela.getInternalframe_cliente() == e.getSource()) {
			
		}
		if (janela.getInternalframe_produto() == e.getSource()) {
			
		}
		if (janela.getTabbedpane_cliente() == e.getSource()) {
			
			janela.getTabbed_pane().addTab("Cliente", painel_cliente);
			janela.getTabbed_pane().addTab("Produto", painel_produto);
			janela.setContentPane(janela.getTabbed_pane());
		}
		if (janela.getTabbedpane_produto() == e.getSource()) {

			janela.getTabbed_pane().addTab("Cliente", painel_cliente);
			janela.getTabbed_pane().addTab("Produto", painel_produto);
			janela.setContentPane(janela.getTabbed_pane());
		}
	}

}
