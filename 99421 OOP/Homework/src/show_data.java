/*
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

public class MainMenu extends JFrame implements ActionListener{
	
	JButton button = new JButton ( "��ŧ" );
	
	public MainMenu() {
		Container c = this.getContentPane();
		c.setLayout(new GridLayout(30,0));
		
		String[] Title = {"����ѷ STOU-TEC �ӡѴ"," ","Ẻ��������Ѥþ�ѡ�ҹ"," ","���Ѥ�����Ѻ�ҹ��ҹ ICT ��� �������Ѥá�͡��������´���仹�����ͷ��"," ","����ѷ STOU-TEC �ӡѴ �ӡ�äѴ���͡��������������"," "};
		for(int i = 0; i < Title.length; i++) {
			JLabel txt = new JLabel(Title[i],SwingConstants.CENTER);
			if(i == 0) {
				txt.setFont(new Font("TimeRoman",Font.ITALIC | Font.BOLD,24));
			}
			else {
				txt.setFont(new Font("TimeRoman",Font.ITALIC | Font.BOLD,12));
			}
			c.add(txt);
		}
		
		ArrayList<String> Question_list = new ArrayList<String>();
		Question_list.add("�Ţ��Шӵ�Ǣͧ�����Ѥ� (AP_ID) :");
		Question_list.add("����-���ʡ�� (AP_NAME) :");
		Question_list.add("������� (AP_ADDRESS) :");
		Question_list.add("�ѧ��Ѵ (AP_CHW) :");
		Question_list.add("�� (AP_SEX) :");
		Question_list.add("�زԡ���֡�Ң���٧�ش (AP_ED) :");
		Question_list.add("(�� B.S.,B.A.,M.S.,M.BA.,M.A.)");
		Question_list.add(" ");
		Question_list.add("�Ԫ��͡ (AP_MAJ)");
		Question_list.add("��������������ö���ͤس���ѵ�੾�е��˹� (QUAL_DESC)(�ͺ������Թ 5 ��¡��)");
		Question_list.add("���˹觷���ͧ�����Ѥ� (POS_NAME)(�ͺ������Թ 3 ���˹�)");
		
		for(int i = 0; i < Question_list.size(); i++) {
			c.add(new JLabel(Question_list.get(i)));
			
			if(Question_list.get(i) == "�� (AP_SEX) :") {
				JRadioButton sex_M = new JRadioButton("���");
				JLabel sex_N = new JLabel(" ");
				JRadioButton sex_F = new JRadioButton("˭ԧ");
				c.add(sex_M);
				c.add(sex_N);
				c.add(sex_F);
				
			}
			else if(Question_list.get(i) == "��������������ö���ͤس���ѵ�੾�е��˹� (QUAL_DESC)(�ͺ������Թ 5 ��¡��)") {
				String[] ABI = {"���͡��������������ö","Web_ASP","C++","Database Administrator,DB2","Database Administrator,ORACLE","Graphic Design","JAVA","Management","Network","Secretarial work,45 words/min","Secretarial work,60 words/min","System Analyst, Level 1","System Analyst, Level 2","Visual Basic"};
				JComboBox[] Ability_list = new JComboBox[ABI.length];			
				
				for(int j = 0; j < 5; j++) {
					if(j == 0) {
						c.add(new JLabel(" "));
					}
					c.add(new JLabel("��������������ö " + j));
					Ability_list[j] = new JComboBox(ABI);
					c.add(Ability_list[j]);
				}
				
			}
			else if(Question_list.get(i) == "���˹觷���ͧ�����Ѥ� (POS_NAME)(�ͺ������Թ 3 ���˹�)") {
				String[] POS = {"���͡���˹觷���ͧ�����Ѥ�","Technical Programmer","Web Developer","General Manager","ICT Specialist","E-Business Analyst","ICT Documenter","Database Administrator","PC Administrator","Network Specialist","ICT Manage"};
				JComboBox[] Postwork_list = new JComboBox[POS.length];
				
				for(int j = 0; j < 3; j++) {
					if(j == 0) {
						c.add(new JLabel(" "));
					}
					c.add(new JLabel("���˹觷���ͧ�����Ѥ� " + j));
					Postwork_list[j] = new JComboBox(POS);
					c.add(Postwork_list[j]);
				}		
			}
			else if(Question_list.get(i) == "(�� B.S.,B.A.,M.S.,M.BA.,M.A.)" || Question_list.get(i) == " ") {
				continue;
			}
			else {
				c.add(new JTextField());
			}
		}
		
		button.setLocation ( 75, 25 );
		c.add(button);
		button.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e)
	{
	    if (e.getSource() == button) {
	        System.out.println("OK");
	    }
	}

	public static void main(String[] args) {
		MainMenu frame = new MainMenu();
		frame.setSize(650,650);
		frame.setTitle("Ẻ��������Ѥþ�ѡ�ҹ");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setVisible(true);
				
	}
}
*/
