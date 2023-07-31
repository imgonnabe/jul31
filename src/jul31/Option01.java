package jul31;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Option01 extends JFrame {
	public Option01() {
		super("j옵션을 사용한다.");
		
		JOptionPane.showMessageDialog(this, "성공했습니다.");
		int result = JOptionPane.showConfirmDialog(this, "선택하세요.");
		System.out.println(result);
		if (result == 0) {
			JOptionPane.showMessageDialog(this, "Yes를 눌렀습니다.");
		} else {
			JOptionPane.showMessageDialog(this, "No를 눌렀습니다.");
		}
		
		String name = JOptionPane.showInputDialog(this, "이름을 입력하세요.");
		JOptionPane.showConfirmDialog(this, "당신이 입력한 이름은 " + name + "입니다.");
		
		setSize(300, 600);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Option01();
	}
}
