import javax.swing.JLabel;
import javax.swing.JPanel;

public class PainelCliente extends JPanel{

	public PainelCliente() {
		
		super();
		JLabel label = new JLabel("cliente");
		label.setBounds(100, 100, 100, 100);
		add(label);
		setVisible(true);
		
	}
}
