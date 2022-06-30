import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainMenu extends JFrame implements ActionListener {
	JButton btnOK;
	JTextField tf11,tf12,tf13,tf14,tf16,tf17;
	JRadioButton sex_M,sex_F;
	JComboBox Ability01;
	
	public MainMenu()
	{
		Container c = this.getContentPane();
		c.setLayout(new GridLayout(24,1));
		
		JLabel label00 = new JLabel("����ѷ STOU-TEC �ӡѴ", SwingConstants.CENTER);
		label00.setFont(new Font("Tahoma" ,Font.ITALIC |Font.BOLD, 25));
		label00.setForeground(Color.red);
		c.add(label00); 
		
		JPanel panel01 = new JPanel();
		JLabel label01 = new JLabel("Ẻ��������Ѥþ�ѡ�ҹ", SwingConstants.CENTER);
		label01.setFont(new Font("Tahoma" ,Font.BOLD, 15)) ;
		panel01.add(label01);
		c.add(panel01);
		
		JPanel panel02 = new JPanel();
		JLabel label02 = new JLabel("���Ѥ�����Ѻ�ҹ��ҹ ICT ��� �������Ѥá�͡��������´���仹�����ͷ��", SwingConstants.CENTER);
		label02.setFont(new Font("Tahoma" ,Font.BOLD, 15)) ;
		panel02.add(label02);
		c.add(panel02); 
		
		JPanel panel03 = new JPanel();
		JLabel label03 = new JLabel("����ѷ STOU-TEC �ӡѴ �ӡ�äѴ���͡��������������", SwingConstants.CENTER);
		label03.setFont(new Font("Tahoma" ,Font.BOLD, 15)) ;
		panel03.add(label03);
		c.add(panel03); 
		 
		JPanel panel11 = new JPanel();
		JLabel label11 = new JLabel("�Ţ��Шӵ�Ǣͧ�����Ѥ� (AP_ID) :");
		tf11 = new JTextField(20);
		panel11.add(label11);
		panel11.add(tf11);
		c.add(panel11); 
		
		JPanel panel12 = new JPanel();
		JLabel label12 = new JLabel("����-���ʡ�� (AP_NAME) :");
		tf12 = new JTextField(20);
		panel12.add(label12);
		panel12.add(tf12);
		c.add(panel12); 
		
		JPanel panel13 = new JPanel();
		JLabel label13 = new JLabel("������� (AP_ADDRESS) :");
		tf13 = new JTextField(20);
		panel13.add(label13);
		panel13.add(tf13);
		c.add(panel13); 
		
		JPanel panel14 = new JPanel();
		JLabel label14 = new JLabel("�ѧ��Ѵ (AP_CHW) :");
		tf14 = new JTextField(20);
		panel14.add(label14);
		panel14.add(tf14);
		c.add(panel14); 
		
		JPanel panel15 = new JPanel();
		JLabel label15 = new JLabel("�� (AP_SEX) :");
		JRadioButton sex_M = new JRadioButton("���");
		JRadioButton sex_F = new JRadioButton("˭ԧ");
		panel15.add(label15);
		panel15.add(sex_M);
		panel15.add(sex_F);
		c.add(panel15); 
		
		JPanel panel16 = new JPanel();
		JLabel label16 = new JLabel("�زԡ���֡�Ң���٧�ش (AP_ED) :");
		tf16 = new JTextField(20);
		panel16.add(label16);
		panel16.add(tf16);
		c.add(panel16); 
		
		JPanel panelx6 = new JPanel();
		JLabel labelx6 = new JLabel("(�� B.S.,B.A.,M.S.,M.BA.,M.A.)");
		panelx6.add(labelx6);
		c.add(panelx6); 
		
		JPanel panel17 = new JPanel();
		JLabel label17 = new JLabel("�Ԫ��͡ (AP_MAJ)");
		tf17 = new JTextField(20);
		panel17.add(label17);
		panel17.add(tf17);
		c.add(panel17); 
		
		JPanel panel18 = new JPanel();
		JLabel label18 = new JLabel("��������������ö���ͤس���ѵ�੾�е��˹� (QUAL_DESC)(�ͺ������Թ 5 ��¡��)");	
		panel18.add(label18);
		c.add(panel18); 
		
		JPanel panela1 = new JPanel();
		JLabel labela1 = new JLabel("��������������ö 1");
		JComboBox Ability01 = new JComboBox(new String[]{"���͡��������������ö","Web_ASP","C++","Database Administrator,DB2","Database Administrator,ORACLE","Graphic Design","JAVA","Management","Network","Secretarial work,45 words/min","Secretarial work,60 words/min","System Analyst, Level 1","System Analyst, Level 2","Visual Basic"});	
		panela1.add(labela1);
		panela1.add(Ability01);
		c.add(panela1); 
		
		JPanel panela2 = new JPanel();
		JLabel labela2 = new JLabel("��������������ö 2");
		JComboBox Ability02 = new JComboBox(new String[]{"���͡��������������ö","Web_ASP","C++","Database Administrator,DB2","Database Administrator,ORACLE","Graphic Design","JAVA","Management","Network","Secretarial work,45 words/min","Secretarial work,60 words/min","System Analyst, Level 1","System Analyst, Level 2","Visual Basic"});	
		panela2.add(labela2);
		panela2.add(Ability02);
		c.add(panela2); 
		
		JPanel panela3 = new JPanel();
		JLabel labela3 = new JLabel("��������������ö 3");
		JComboBox Ability03 = new JComboBox(new String[]{"���͡��������������ö","Web_ASP","C++","Database Administrator,DB2","Database Administrator,ORACLE","Graphic Design","JAVA","Management","Network","Secretarial work,45 words/min","Secretarial work,60 words/min","System Analyst, Level 1","System Analyst, Level 2","Visual Basic"});	
		panela3.add(labela3);
		panela3.add(Ability03);
		c.add(panela3); 
		
		JPanel panela4 = new JPanel();
		JLabel labela4 = new JLabel("��������������ö 4");
		JComboBox Ability04 = new JComboBox(new String[]{"���͡��������������ö","Web_ASP","C++","Database Administrator,DB2","Database Administrator,ORACLE","Graphic Design","JAVA","Management","Network","Secretarial work,45 words/min","Secretarial work,60 words/min","System Analyst, Level 1","System Analyst, Level 2","Visual Basic"});	
		panela4.add(labela4);
		panela4.add(Ability04);
		c.add(panela4); 
		
		JPanel panela5 = new JPanel();
		JLabel labela5 = new JLabel("��������������ö 5");
		JComboBox Ability05 = new JComboBox(new String[]{"���͡��������������ö","Web_ASP","C++","Database Administrator,DB2","Database Administrator,ORACLE","Graphic Design","JAVA","Management","Network","Secretarial work,45 words/min","Secretarial work,60 words/min","System Analyst, Level 1","System Analyst, Level 2","Visual Basic"});	
		panela5.add(labela5);
		panela5.add(Ability05);
		c.add(panela5); 
		
		JPanel panel19 = new JPanel();
		JLabel label19 = new JLabel("���˹觷���ͧ�����Ѥ� (POS_NAME)(�ͺ������Թ 3 ���˹�)");
		panel19.add(label19);
		c.add(panel19); 
		
		JPanel panelp1 = new JPanel();
		JLabel labelp1 = new JLabel("���˹觷���ͧ�����Ѥ� 1");
		JComboBox Position01 = new JComboBox(new String[]{"���͡���˹觷���ͧ�����Ѥ�","Technical Programmer","Web Developer","General Manager","ICT Specialist","E-Business Analyst","ICT Documenter","Database Administrator","PC Administrator","Network Specialist","ICT Manage"});	
		panelp1.add(labelp1);
		panelp1.add(Position01);
		c.add(panelp1); 
		
		JPanel panelp2 = new JPanel();
		JLabel labelp2 = new JLabel("���˹觷���ͧ�����Ѥ� 2");
		JComboBox Position02 = new JComboBox(new String[]{"���͡���˹觷���ͧ�����Ѥ�","Technical Programmer","Web Developer","General Manager","ICT Specialist","E-Business Analyst","ICT Documenter","Database Administrator","PC Administrator","Network Specialist","ICT Manage"});	
		panelp2.add(labelp2);
		panelp2.add(Position02);
		c.add(panelp2); 
		
		JPanel panelp3 = new JPanel();
		JLabel labelp3 = new JLabel("���˹觷���ͧ�����Ѥ� 3");
		JComboBox Position03 = new JComboBox(new String[]{"���͡���˹觷���ͧ�����Ѥ�","Technical Programmer","Web Developer","General Manager","ICT Specialist","E-Business Analyst","ICT Documenter","Database Administrator","PC Administrator","Network Specialist","ICT Manage"});	
		panelp3.add(labelp3);
		panelp3.add(Position03);
		c.add(panelp3); 
		
		JPanel panel2 = new JPanel();
		btnOK = new JButton("��ŧ");
		btnOK.addActionListener(this);
		panel2.add(btnOK);
		c.add(panel2);

	}

	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == btnOK) 
		{
			//String val = Ability01.getSelectedItem().toString();
			//System.out.println(val);
			MenuReport menureport = new MenuReport(tf11.getText(),tf12.getText(),tf13.getText(),tf14.getText(),tf16.getText(),tf17.getText());
			menureport.setSize(650,650);
			menureport.setTitle("����ѷ STOU-TEC �ӡѴ");
			menureport.setDefaultCloseOperation(EXIT_ON_CLOSE);
			menureport.setLocationRelativeTo(null);
			menureport.setVisible(true);
		}
	}
	
	public static void main(String[] args) {
		MainMenu mainmenu = new MainMenu();
		mainmenu.setSize(650,650);
		mainmenu.setTitle("����ѷ STOU-TEC �ӡѴ");
		mainmenu.setDefaultCloseOperation(EXIT_ON_CLOSE);
		mainmenu.setLocationRelativeTo(null);
		mainmenu.setVisible(true);
	}

}
