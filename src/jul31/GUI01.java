package jul31;

import java.awt.Button;
import java.awt.Frame;

// 자바그래픽스
/*
 * CLI 커맨드 라인 인터페이스
 * GUI 그래픽 유저 인터페이스
 * 
 * 자바의 그래픽
 * AWT = 해당 os의 특징을 따라 화면을 구성한다. > 운영체제마다 다른 화면
 * 			Button
 * 
 * Swing = 자바에서 화면을 만든다. (Look And Feel) > 모든 운영체제가 같은 화면을 그린다.
 * 			JButton
 * 
 * JAVAFX = RIA를 디자인하고 테스트, 디버그, 배포까지 가능한 일련의 그래픽과 미디어의 통합 패키지
 * 
 * 용어
 * Container = 자바에서 창 역할을 한다.
 * 				한개 이상의 컨테이너 위에 컨테이너들이 올라간다.
 * 				컨테이너는 컴포넌트보다 작은 개념
 * 				JFrame, window, panel, dialog, applet
 * 
 * Component = 실제로 컨테이너 위에 올려져 화면 구성을 담당한다.
 * 				Button, TextField, TextArea, List
 * 
 * LayoutManager = 컨테이너 위에 컴포넌트들이 올려질 때 자리 배치 방법
 * 					FlowLayout, BorderLayout, GridLayout, CardLayout ...
 * 
 * 상속 받을 때는 많이 사용하는 요소를 상속받는 것이 좋다.
 * 화면 생성은 프로그램 초기에 이뤄져야 하므로 주로 생성자로 작업한다.
 * 
 * 기본 코드
 * 프레임.add(컴포넌트);
 * 
 * 프레임.setSize(int x, int y);
 * 
 * 프레임.setVisiable(boolean a);
 */
public class GUI01 {
	Frame frame = new Frame("프레임입니다.");
	Button btn = new Button("클릭");
	
	public GUI01() {
		frame.add(btn);
		frame.setSize(300, 600);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		new GUI01();
	}
}
