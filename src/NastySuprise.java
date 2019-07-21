import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySuprise implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton trickbutton = new JButton("Trick");
	JButton treatbutton = new JButton("Treat");

	public static void main(String[] args) {
NastySuprise s = new NastySuprise();
s.suprise();
	}

	void suprise() {
		frame.add(panel);
		panel.add(treatbutton);
		panel.add(trickbutton);
		trickbutton.addActionListener(this);
		treatbutton.addActionListener(this);
		frame.setVisible(true);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton pressed = (JButton) e.getSource();

		if (pressed == trickbutton) {
			showPictureFromTheInternet("https://i.redd.it/dltqk6q2w0oz.jpg");
		} else if (pressed == treatbutton) {
			showPictureFromTheInternet("http://images1.fanpop.com/images/photos/1500000/SCARY-BABY-horror-world-1571400-640-480.jpg");
		}
	}
	private void showPictureFromTheInternet(String imageUrl) {
	     try {
	          URL url = new URL(imageUrl);
	          Icon icon = new ImageIcon(url);
	          JLabel imageLabel = new JLabel(icon);
	          JFrame frame = new JFrame();
	          frame.add(imageLabel);
	          frame.setVisible(true);
	          frame.pack();
	     } catch (MalformedURLException e) {
	          e.printStackTrace();
	     }
	}



}