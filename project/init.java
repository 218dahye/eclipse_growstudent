package project;

import javax.swing.JOptionPane;

class init {
	static int DdayNumber = 14;
	static int Power = 100;
	static int Money = 100000;
	static int Friend = 50;
	static int Intelli = 30;
	static int Month = 5;
	static int Day = 1;
	static String Daily[] = { "금", "토", "일", "월", "화", "수", "목" };
	static String Today = null;

	static void MT() {
		if (Month == 5) {
			Today = Daily[Day % 7 - 1];

		} else if (Month == 5 && Day == 32) {
			Day = 1;
			Today = Daily[Day % 7 + 2];
		}
	}

 public	static int partampower() {
	 Power = Power - 25;
	 return Power;
 }
 public static int getpower() {
	 return Power;
 }
	static void N_intelli_up() {
		int random = (int) (Math.random() * 20 + 1);
		if (random >= 17) {
			Intelli += 20;
			JOptionPane.showMessageDialog(null, "너무 열심히 했다.\n 지식이 20만큼 올랐다!", "너무 힘듦", JOptionPane.INFORMATION_MESSAGE);
		} else if (random >= 8 && random < 17) {
			Intelli += 10;
			JOptionPane.showMessageDialog(null, "오늘은 적당히 했다.\n 지식이 10만큼 올랐다!", "조금 기쁘네",
					JOptionPane.INFORMATION_MESSAGE);
		} else {
			Intelli += 5;
			JOptionPane.showMessageDialog(null, "대충대충 했다.\n 지식이 5만큼 올랐다!", "넘나 귀찮은 것", JOptionPane.INFORMATION_MESSAGE);
		}
		Power -= 10;
		Day += 1;
		DdayNumber -= 1;
		Money -= 5000;
		MT();
	}

	static void N_money_up() {
		int random = (int) (Math.random() * 20 + 1);
		if (random >= 17) {
			Money += 40000;
			JOptionPane.showMessageDialog(null, "너무 열심히 했다.\n 알바비를 4만원 받았다!", "너무 힘듦", JOptionPane.INFORMATION_MESSAGE);
		} else if (random >= 8 && random < 17) {
			Money += 20000;
			JOptionPane.showMessageDialog(null, "오늘은 적당히 했다.\n 알바비를 2만원 받았다!", "조금 기쁘네",
					JOptionPane.INFORMATION_MESSAGE);
		} else {
			Money += 10000;
			Power -= 5;
			JOptionPane.showMessageDialog(null, "의욕이 넘쳐 실수를 했다.\n 체력이 5만큼 감소하고 알바비를 1만원 받았다!", "앗 안돼!",
					JOptionPane.INFORMATION_MESSAGE);
		}
		Power -= 10;
		Day += 1;
		DdayNumber -= 1;
		MT();
	}

	static void N_friend_up() {
		int random = (int) (Math.random() * 20 + 1);
		if (random >= 17) {
			Friend += 20;
			JOptionPane.showMessageDialog(null, "베프가 되었다!\n 친화력이 20만큼 올랐다!", "너무 즐거움", JOptionPane.INFORMATION_MESSAGE);
		} else if (random >= 8 && random < 17) {
			Friend += 10;
			JOptionPane.showMessageDialog(null, "재미있게 놀았다!.\n 친화력이 10만큼 올랐다!", "즐거움", JOptionPane.INFORMATION_MESSAGE);
		} else {
			Friend += 5;
			Power -= 2;
			JOptionPane.showMessageDialog(null, "조금 어색했네...\n 친화력이 5만큼 올랐다!", "어색해", JOptionPane.INFORMATION_MESSAGE);
		}
		Money -= 20000;
		Power -= 10;
		Day += 1;
		DdayNumber -= 1;
		MT();
	}

	static void N_power_up() {
		int random = (int) (Math.random() * 20 + 1);
		if (random >= 17) {
			Power += 25;
			JOptionPane.showMessageDialog(null, "이런 휴식이 올까?\n 체력이이 25만큼 올랐다!", "컨디션 좋아",
					JOptionPane.INFORMATION_MESSAGE);
		} else if (random >= 8 && random < 17) {
			Power += 15;
			JOptionPane.showMessageDialog(null, "너무 잘 쉬었다.\n 체력이 15만큼 올랐다!", "즐거움", JOptionPane.INFORMATION_MESSAGE);
		} else {
			Power += 5;
			JOptionPane.showMessageDialog(null, "자고 일어났는데 담이 걸렸네...\n 체력이 5만큼 올랐다!", "어색해",
					JOptionPane.INFORMATION_MESSAGE);
		}
		Day += 1;
		DdayNumber -= 1;
		MT();
	}

	static void H_intelli_up() {
		int random = (int) (Math.random() * 20 + 1);
		if (random >= 17) {
			Intelli += 20;
			JOptionPane.showMessageDialog(null, "너무 열심히 했다.\n 지식이 20만큼 올랐다!", "너무 힘듦", JOptionPane.INFORMATION_MESSAGE);
		} else if (random >= 13 && random < 17) {
			Intelli += 10;
			JOptionPane.showMessageDialog(null, "오늘은 적당히 했다.\n 지식이 10만큼 올랐다!", "조금 기쁘네",
					JOptionPane.INFORMATION_MESSAGE);
		} else {
			Intelli += 5;
			JOptionPane.showMessageDialog(null, "대충대충 했다.\n 지식이 5만큼 올랐다!", "넘나 귀찮은 것", JOptionPane.INFORMATION_MESSAGE);
		}
		Power -= 20;
		Day += 1;
		DdayNumber -= 1;
		Money -= 5000;
		MT();
	}

	static void H_money_up() {
		int random = (int) (Math.random() * 20 + 1);
		if (random >= 17) {
			Money += 40000;
			JOptionPane.showMessageDialog(null, "너무 열심히 했다.\n 알바비를 4만원 받았다!", "너무 힘듦", JOptionPane.INFORMATION_MESSAGE);
		} else if (random >= 13 && random < 17) {
			Money += 20000;
			JOptionPane.showMessageDialog(null, "오늘은 적당히 했다.\n 알바비를 2만원 받았다!", "조금 기쁘네",
					JOptionPane.INFORMATION_MESSAGE);
		} else {
			Money += 10000;
			Power -= 5;
			JOptionPane.showMessageDialog(null, "의욕이 넘쳐 실수를 했다.\n 체력이 5만큼 감소하고 알바비를 1만원 받았다!", "앗 안돼!",
					JOptionPane.INFORMATION_MESSAGE);
		}
		Power -= 10;
		Day += 1;
		DdayNumber -= 1;
		MT();
	}

	static void H_friend_up() {
		int random = (int) (Math.random() * 20 + 1);
		if (random >= 17) {
			Friend += 20;
			JOptionPane.showMessageDialog(null, "베프가 되었다!\n 친화력이 20만큼 올랐다!", "너무 즐거움", JOptionPane.INFORMATION_MESSAGE);
		} else if (random >= 13 && random < 17) {
			Friend += 10;
			JOptionPane.showMessageDialog(null, "재미있게 놀았다!.\n 친화력이 10만큼 올랐다!", "즐거움", JOptionPane.INFORMATION_MESSAGE);
		} else {
			Friend += 5;
			Power -= 2;
			JOptionPane.showMessageDialog(null, "조금 어색했네...\n 친화력이 5만큼 올랐다!", "어색해", JOptionPane.INFORMATION_MESSAGE);
		}
		Money -= 20000;
		Power -= 10;
		Day += 1;
		DdayNumber -= 1;
		MT();
	}

	static void H_power_up() {
		int random = (int) (Math.random() * 20 + 1);
		if (random >= 17) {
			Power += 25;
			JOptionPane.showMessageDialog(null, "이런 휴식이 올까?\n 체력이이 25만큼 올랐다!", "컨디션 좋아",
					JOptionPane.INFORMATION_MESSAGE);
		} else if (random >= 8 && random < 17) {
			Power += 15;
			JOptionPane.showMessageDialog(null, "너무 잘 쉬었다.\n 체력이 15만큼 올랐다!", "즐거움", JOptionPane.INFORMATION_MESSAGE);
		} else {
			Power += 5;
			JOptionPane.showMessageDialog(null, "자고 일어났는데 담이 걸렸네...\n 체력이 5만큼 올랐다!", "어색해",
					JOptionPane.INFORMATION_MESSAGE);
		}
		Day += 1;
		DdayNumber -= 1;
		MT();
	}
	
	static void N_Cold() {
		int random = (int) (Math.random() * 15 + 1);
		if(Power<=30) {
			if(random>=13) {
				Day += 1;
				DdayNumber -= 1;
				MT();
				Power+=30;
				JOptionPane.showMessageDialog(null, "체력이 약해져서 감기에 걸렸다!","\n오늘 하루동안 집에서 쉬어야겠다", JOptionPane.WARNING_MESSAGE);
				JOptionPane.showMessageDialog(null, "하루동안 쉬어서 체력이 30만큼 올랐다!", "체력 회복", JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}
	static void H_Cold() {
		int random = (int) (Math.random() * 10 + 1);
		if(Power<=40) {
			if(random>=10) {
				Day += 1;
				DdayNumber -= 1;
				MT();
				Power+=20;
				JOptionPane.showMessageDialog(null, "체력이 약해져서 감기에 걸렸다! \n오늘 하루동안 집에서 쉬어야겠다","감기", JOptionPane.WARNING_MESSAGE);
				JOptionPane.showMessageDialog(null, "하루동안 쉬어서 체력이 20만큼 올랐다!", "체력 회복", JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}

}
