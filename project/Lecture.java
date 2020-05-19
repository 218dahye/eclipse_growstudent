package project;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

class lecturelist_lectureImagePanel extends JPanel {
	private Image bookimg;

	public lecturelist_lectureImagePanel(Image bookimg) {
		this.bookimg = bookimg;
		setSize(new Dimension(bookimg.getWidth(null), bookimg.getHeight(null)));
		setPreferredSize(new Dimension(bookimg.getWidth(null), bookimg.getHeight(null)));// pack()한 후 프레임 사이즈가 맞게 나오지 않을
																							// 때 설정해줌.
		setLayout(null);
	}

	public void paintComponent(Graphics g) {
		g.drawImage(bookimg, 0, 0, null);
	}
}

@SuppressWarnings("serial")
class Lecture {
	static subImagePanel lecturelist = new subImagePanel(new ImageIcon("./image/choice.png").getImage());
	static subImagePanel check = new subImagePanel(new ImageIcon("./image/short.png").getImage());
	static subImagePanel back = new subImagePanel(new ImageIcon("./image/long.png").getImage());
	// static lecturelist_lectureImagePanel lecturepanel = new
	// lecturelist_lectureImagePanel(
	// new ImageIcon("./image/book.png").getImage());
	static JButton button1 = new JButton("N1. 오픈소스소프트웨어");
	static JButton button2 = new JButton("N2. 데이터베이스");
	static JButton button3 = new JButton("N3. 정보보호");
	static JLabel 버튼1교수님 = new JLabel("1) 겸임 교수님: 강신재교수님");
	static JLabel 버튼1강의장소 = new JLabel("2) 강의 장소: 공7514");
	static JLabel 버튼1강의자료 = new JLabel("3) 교재: LMS 강의자료 ");
	static JLabel 버튼2교수님 = new JLabel("1) 겸임 교수님: 남인길교수님");
	static JLabel 버튼2강의장소 = new JLabel("2) 강의 장소: 공7507");
	static JLabel 버튼2강의자료 = new JLabel("3) 교재: 오라클로 배우는 데이터베이스 ");
	static JLabel 버튼3교수님 = new JLabel("1) 겸임 교수님: 김창훈교수님");
	static JLabel 버튼3강의장소 = new JLabel("2) 강의 장소: 공7714");
	static JLabel 버튼3강의자료 = new JLabel("3) 교재: 오라클로 배우는 데이터베이스 ");
	static JLabel 타이틀 = new JLabel("강의선택");
	static JButton 뒤로가기 = new JButton("뒤로가기");

	static void Lecture() {

		check.setLayout(null);
		check.setBounds(0, 30, 200, 40);
		lecturelist.setLayout(null);
		lecturelist.setBounds(194, 10, 640, 640);
		back.setLayout(null);
		back.setBounds(0, 73, 200, 40);

		Font lecture = new Font("휴먼옛체", Font.BOLD, 22);
		Font labelfont = new Font("HY견고딕", Font.PLAIN, 15);
		Font titlefont = new Font("HY헤드라인M", Font.BOLD, 20);

		MainGrowStudent.contentPane.add(타이틀);
		MainGrowStudent.contentPane.add(check);

		MainGrowStudent.contentPane.add(뒤로가기);
		MainGrowStudent.contentPane.add(back);

		뒤로가기.setVisible(true);
		뒤로가기.setBounds(0, 73, 120, 35);
		뒤로가기.setBorderPainted(false);
		뒤로가기.setFocusPainted(false);
		뒤로가기.setBackground(new Color(230, 62, 34));
		뒤로가기.setFont(titlefont);
		타이틀.setVisible(true);
		타이틀.setBounds(17, 20, 300, 60);
		타이틀.setFont(titlefont);
		button1.setFont(lecture);
		button2.setFont(lecture);
		button3.setFont(lecture);

		버튼1교수님.setBounds(95, 155, 500, 20);
		버튼1강의장소.setBounds(95, 175, 200, 20);
		버튼1강의자료.setBounds(95, 195, 200, 20);

		버튼1교수님.setFont(labelfont);
		버튼1강의장소.setFont(labelfont);
		버튼1강의자료.setFont(labelfont);

		버튼2교수님.setBounds(95, 295, 500, 20);
		버튼2강의장소.setBounds(95, 315, 500, 20);
		버튼2강의자료.setBounds(95, 335, 500, 20);

		버튼2교수님.setFont(labelfont);
		버튼2강의장소.setFont(labelfont);
		버튼2강의자료.setFont(labelfont);

		버튼3교수님.setBounds(95, 455, 500, 20);
		버튼3강의장소.setBounds(95, 475, 500, 20);
		버튼3강의자료.setBounds(95, 495, 500, 20);

		버튼3교수님.setFont(labelfont);
		버튼3강의장소.setFont(labelfont);
		버튼3강의자료.setFont(labelfont);

		lecturelist.add(버튼1교수님);
		lecturelist.add(버튼1강의장소);
		lecturelist.add(버튼1강의자료);
		lecturelist.add(버튼2교수님);
		lecturelist.add(버튼2강의장소);
		lecturelist.add(버튼2강의자료);
		lecturelist.add(버튼3교수님);
		lecturelist.add(버튼3강의장소);
		lecturelist.add(버튼3강의자료);
		lecturelist.add(button1);
		lecturelist.add(button2);
		lecturelist.add(button3);

		// MainGrowStudent.contentPane.add(타이틀);
		button1.setBackground(Color.WHITE);
		button2.setBackground(Color.WHITE);
		button3.setBackground(Color.WHITE);

		button1.setFocusPainted(false);
		button2.setFocusPainted(false);
		button3.setFocusPainted(false);

		button1.setBorderPainted(false);
		button2.setBorderPainted(false);
		button3.setBorderPainted(false);

		// 설명.setBounds(10, 5, 400, 40);
		// lecturelist.add(설명);
		button1.setBounds(50, 110, 300, 30);
		button2.setBounds(50, 250, 228, 30);
		button3.setBounds(56, 410, 170, 30);

		lecturelist.setVisible(true);

		button1.addActionListener(event -> {
			init.오픈소스소프트웨어();

		});
		button2.addActionListener(event -> {
			init.데이터베이스();
			// Lb1.setText("종강까지 D-" + init.DdayNumber + " 2020년 " + init.Month + "월 " +
			// init.Day + "일 " + init.Today//
			// + "요일");//
			// Lb2.setText("체력 " + init.Power + " 지능 " + init.Intelli + " 돈 " + init.Money +
			// " 친화력 " + init.Friend);//

		});
		button3.addActionListener(event -> {
			init.정보보호();
			// Lb1.setText("종강까지 D-" + init.DdayNumber + " 2020년 " + init.Month + "월 " +
			// init.Day + "일 " + init.Today//
			// + "요일");
			// Lb2.setText("체력 " + init.Power + " 지능 " + init.Intelli + " 돈 " + init.Money +
			// " 친화력 " + init.Friend);//

		});
		뒤로가기.addActionListener(event -> {
			JOptionPane.showMessageDialog(null, "뒤로 이동합니다", "뒤로 이동", JOptionPane.INFORMATION_MESSAGE); // 메시지
			MainGrowStudent.활동선택메뉴();
			MainGrowStudent.choosepanel.setVisible(true);
			MainGrowStudent.contentPane.setVisible(true);
			lecturelist.setVisible(false);
			check.setVisible(false);
			back.setVisible(false);
			뒤로가기.setVisible(false);
			타이틀.setVisible(false);
		});

	}

	public void lecture() {

		// JLabel Lb1, Lb2;
		JLabel LLb1 = new JLabel();
		LLb1.setText("어떤 과목의 강의를 들으시겠습니까?");
		LLb1.setBounds(107, 142, 600, 90);

		Font label4font = new Font("HY견고딕", Font.BOLD, 30);
		LLb1.setFont(label4font);

		button1.setEnabled(true);
		button2.setEnabled(true);
		button3.setEnabled(true);

		lecturelist.add(button1);
		lecturelist.add(button2);
		lecturelist.add(button3);

		button1.setBounds(320, 260, 300, 50);
		button2.setBounds(320, 330, 300, 50);
		button3.setBounds(320, 410, 300, 50);

		Font f4 = new Font("휴먼엑스포", Font.BOLD, 25);
		button1.setFont(f4);
		button2.setFont(f4);
		button3.setFont(f4);

		button1.setBackground(Color.WHITE);
		button2.setBackground(Color.WHITE);
		button3.setBackground(Color.WHITE);

		lecturelist.setVisible(true);
		lecturelist.setLayout(null);
		lecturelist.add(LLb1);
		lecturelist.add(button1);
		lecturelist.add(button2);
		lecturelist.add(button3);

	}

}