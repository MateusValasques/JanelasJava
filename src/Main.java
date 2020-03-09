
public class Main {
	
	static Janela janela = new Janela();
	static PainelCliente painel_cliente = new PainelCliente();
	static PainelProduto painel_produto = new PainelProduto();

public static void main(String[] args) {
		
		Controlador controlador = new Controlador(janela, painel_cliente, painel_produto);
	}
}
