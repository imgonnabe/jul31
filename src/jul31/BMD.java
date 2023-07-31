package jul31;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class GUI03 extends JFrame{
	private JTextField nameTF;
	private JTextField heightTF;
	private JTextField weightTF;
	private JButton resultBtn;
	private JButton resetBtn;
	private JLabel resultLb;
	
	public GUI03() {
		setLayout(new GridLayout(5, 1));
		JPanel nameP = new JPanel();
		nameP.setLayout(new GridLayout(1, 2));
		nameP.add(new JLabel("이름"));
		nameTF = new JTextField();
		nameP.add(nameTF);
		add(nameP);
		
		JPanel heightP = new JPanel();
		heightP.setLayout(new GridLayout(1, 2));
		heightP.add(new JLabel("키"));
		heightTF = new JTextField();
		heightP.add(heightTF);
		add(heightP);
		
		JPanel weightP = new JPanel();
		weightP.setLayout(new GridLayout(1, 2));
		weightP.add(new JLabel("몸무게"));
		weightTF = new JTextField();
		weightP.add(weightTF);
		add(weightP);
		
		JPanel buttonP = new JPanel();
		buttonP.setLayout(new GridLayout(1, 2));
		resetBtn = new JButton("초기화");
		buttonP.add(resetBtn);
		resultBtn = new JButton("결과보기");
		buttonP.add(resultBtn);
		add(buttonP);
		
		resultLb = new JLabel("결과값이 여기에 나타납니다.");
		add(resultLb);
		
		// 초기화
		resetBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				nameTF.setText("");
				heightTF.setText("");
				weightTF.setText("");
				
			}
		});
		
		// 결과보기
		resultBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String name = nameTF.getText();
				double height = Double.parseDouble(heightTF.getText());
				double weight = Double.parseDouble(weightTF.getText());
				System.out.println(name);
				System.out.println(height);
				System.out.println(weight);
				
				// 계산하기 (키-100)*0.9=표준몸무게
				// 비만도 = (몸무게/표준몸무게)*100
				// 비만 : 120이상
				// 저체중 : 80이하
				// 정상 : 80~120
				double stdWeight = (height - 100) * 0.9;
				double bimando = (weight / stdWeight) * 100;
				if (bimando >= 120) {
					resultLb.setText(name + "님, 당신은 비만입니다.");
				} else if (bimando <= 80) {
					resultLb.setText(name + "님, 당신은 저체중입니다.");
				} else {
					resultLb.setText(name + "님, 당신은 표준입니다.");
				}
			}
		});
		
		
	}
}

public class BMD {
	public static void main(String[] args) {
		GUI03 gui03 = new GUI03();
		gui03.setSize(300, 600);
		gui03.setTitle("비만도프로그램 : 0.2");
		gui03.setVisible(true);
		gui03.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
