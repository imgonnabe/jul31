package jul31;

import java.awt.event.InputEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;

public class Menu {
	JFrame jf = new JFrame("메뉴 만들기");
	JTextArea textArea = new JTextArea("입력하세요", 5, 10);
	JScrollPane jScrollPane = new JScrollPane(textArea);// 스크롤바 만들기
	// 메뉴바
	JMenuBar menuBar = new JMenuBar();
	JMenu filMenu = new JMenu("파일");
	JMenu helpMenu = new JMenu("도움말");
	
	public Menu() {
		// 메뉴설정
		filMenu.add(new JMenuItem("새 파일 열기"));
		filMenu.add(new JMenuItem("저장하기"));
		filMenu.add(new JMenuItem("기존 파일에 추가"));
		filMenu.add(new JMenuItem("종료"));
		
		// 단축키
		filMenu.getItem(0).setAccelerator(
				KeyStroke.getKeyStroke(
						'N', InputEvent.CTRL_MASK ^ InputEvent.ALT_MASK
						)
				);
		
		helpMenu.add(new JMenuItem("이 프로그램은"));
		helpMenu.add(new JMenuItem("만든 사람"));
		// 조립과정
		menuBar.add(filMenu);
		menuBar.add(helpMenu);// 메뉴바에 붙임
		jf.setJMenuBar(menuBar);// 메뉴바를 프레임에 붙임
		jf.add(jScrollPane, "Center");// 중앙에 붙임
		jf.setSize(300, 600);// 가로세로 크기
		jf.setVisible(true);// 보여주기
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 닫기
	}
	
	public static void main(String[] args) {
		new Menu();
	}
}
