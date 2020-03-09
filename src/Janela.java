import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTabbedPane;

public class Janela extends JFrame{

	JMenuBar menubar = new JMenuBar();
	JMenu menu = new JMenu("Menu");
	
	JMenuItem setcontent_cliente = new JMenuItem("setcontent_cliente");
	JMenuItem setcontent_produto = new JMenuItem("setcontent_produto");
	JMenuItem internalframe_cliente = new JMenuItem("internalframe_cliente");
	JMenuItem internalframe_produto = new JMenuItem("internalframe_produto");
	JMenuItem tabbedpane_cliente = new JMenuItem("tabbedpane_cliente");
	JMenuItem tabbedpane_produto = new JMenuItem("tabbedpane_produto");
	
	JTabbedPane tabbed_pane = new JTabbedPane();
	
	public Janela () {
		super("Janela");
		setSize(1024, 1024);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.add(tabbed_pane);
		menubar.add(menu);
		menu.add(setcontent_cliente);
		menu.add(setcontent_produto);
		menu.add(internalframe_cliente);
		menu.add(internalframe_produto);
		menu.add(tabbedpane_cliente);
		menu.add(tabbedpane_produto);
		this.setJMenuBar(menubar);  
		setLayout(null);
		setVisible(true);
	}

	public JMenuBar getMenubar() {
		return menubar;
	}

	public void setMenubar(JMenuBar menubar) {
		this.menubar = menubar;
	}

	public JMenu getMenu() {
		return menu;
	}

	public void setMenu(JMenu menu) {
		this.menu = menu;
	}

	public JMenuItem getSetcontent_cliente() {
		return setcontent_cliente;
	}

	public void setSetcontent_cliente(JMenuItem setcontent_cliente) {
		this.setcontent_cliente = setcontent_cliente;
	}

	public JMenuItem getSetcontent_produto() {
		return setcontent_produto;
	}

	public void setSetcontent_produto(JMenuItem setcontent_produto) {
		this.setcontent_produto = setcontent_produto;
	}

	public JMenuItem getInternalframe_cliente() {
		return internalframe_cliente;
	}

	public void setInternalframe_cliente(JMenuItem internalframe_cliente) {
		this.internalframe_cliente = internalframe_cliente;
	}

	public JMenuItem getInternalframe_produto() {
		return internalframe_produto;
	}

	public void setInternalframe_produto(JMenuItem internalframe_produto) {
		this.internalframe_produto = internalframe_produto;
	}

	public JMenuItem getTabbedpane_cliente() {
		return tabbedpane_cliente;
	}

	public void setTabbedpane_cliente(JMenuItem tabbedpane_cliente) {
		this.tabbedpane_cliente = tabbedpane_cliente;
	}

	public JMenuItem getTabbedpane_produto() {
		return tabbedpane_produto;
	}

	public void setTabbedpane_produto(JMenuItem tabbedpane_produto) {
		this.tabbedpane_produto = tabbedpane_produto;
	}

	public JTabbedPane getTabbed_pane() {
		return tabbed_pane;
	}

	public void setTabbed_pane(JTabbedPane tabbed_pane) {
		this.tabbed_pane = tabbed_pane;
	}
	
}
