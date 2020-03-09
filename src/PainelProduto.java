import javax.swing.JLabel;
import javax.swing.JPanel;

public class PainelProduto extends JPanel{

	public PainelProduto() {
		
		super();
		setVisible(true);
		JLabel label = new JLabel("produto");
		label.setBounds(100, 100, 100, 100);
		add(label);
		
	}
}
