import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MenuReport extends JFrame{
	
	public MenuReport(String A01, String A02, String A03, String A04, String A06, String A07)
	{
		Container c = this.getContentPane();
		c.setLayout(new GridLayout(24,1));
		
		JLabel new_label00 = new JLabel("��������´�ͧ��Ѥ�", SwingConstants.CENTER);
		new_label00.setFont(new Font("Tahoma" ,Font.ITALIC |Font.BOLD, 25));
		new_label00.setForeground(Color.red);
		c.add(new_label00); 
		 
		JPanel panel11 = new JPanel();
		JLabel label11 = new JLabel("�Ţ��Шӵ�Ǣͧ�����Ѥ� (AP_ID) :" + A01);
		panel11.add(label11);
		c.add(panel11); 
		
		JPanel panel12 = new JPanel();
		JLabel label12 = new JLabel("����-���ʡ�� (AP_NAME) :" + A02);
		panel12.add(label12);
		c.add(panel12); 
		
		JPanel panel13 = new JPanel();
		JLabel label13 = new JLabel("������� (AP_ADDRESS) :" + A03);
		panel13.add(label13);
		c.add(panel13); 
		
		JPanel panel14 = new JPanel();
		JLabel label14 = new JLabel("�ѧ��Ѵ (AP_CHW) :" + A04);
		panel14.add(label14);
		c.add(panel14); 
		
		//***
		JPanel panel15 = new JPanel();
		JLabel label15 = new JLabel("�� (AP_SEX) :" + "���");
		panel15.add(label15);
		c.add(panel15); 
		
		JPanel panel16 = new JPanel();
		JLabel label16 = new JLabel("�زԡ���֡�Ң���٧�ش (AP_ED) :" + A06);
		panel16.add(label16);
		c.add(panel16); 
		
		JPanel panelx6 = new JPanel();
		JLabel labelx6 = new JLabel("(�� B.S.,B.A.,M.S.,M.BA.,M.A.)");
		panelx6.add(labelx6);
		c.add(panelx6); 
		
		JPanel panel17 = new JPanel();
		JLabel label17 = new JLabel("�Ԫ��͡ (AP_MAJ)");
		JLabel ans17 = new JLabel(A07);
		panel17.add(label17);
		panel17.add(ans17);
		c.add(panel17); 
		/*
		JPanel panel18 = new JPanel();
		JLabel label18 = new JLabel("��������������ö���ͤس���ѵ�੾�е��˹� (QUAL_DESC)(�ͺ������Թ 5 ��¡��)");	
		panel18.add(label18);
		c.add(panel18); 
		
		JPanel panela1 = new JPanel();
		JLabel labela1 = new JLabel("��������������ö 1");
		panela1.add(labela1);
		c.add(panela1); 

		JPanel panela2 = new JPanel();
		JLabel labela2 = new JLabel("��������������ö 2");	
		panela2.add(labela2);
		c.add(panela2); 
		
		JPanel panela3 = new JPanel();
		JLabel labela3 = new JLabel("��������������ö 3");	
		panela3.add(labela3);
		c.add(panela3); 
		
		JPanel panela4 = new JPanel();
		JLabel labela4 = new JLabel("��������������ö 4");	
		panela4.add(labela4);
		c.add(panela4); 
		
		JPanel panela5 = new JPanel();
		JLabel labela5 = new JLabel("��������������ö 5");
		panela5.add(labela5);
		c.add(panela5); 
		
		JPanel panel19 = new JPanel();
		JLabel label19 = new JLabel("���˹觷���ͧ�����Ѥ� (POS_NAME)(�ͺ������Թ 3 ���˹�)");
		panel19.add(label19);
		c.add(panel19); 
		
		JPanel panelp1 = new JPanel();
		JLabel labelp1 = new JLabel("���˹觷���ͧ�����Ѥ� 1");
		panelp1.add(labelp1);
		c.add(panelp1); 
		
		JPanel panelp2 = new JPanel();
		JLabel labelp2 = new JLabel("���˹觷���ͧ�����Ѥ� 2");
		panelp2.add(labelp2);
		c.add(panelp2); 
		
		JPanel panelp3 = new JPanel();
		JLabel labelp3 = new JLabel("���˹觷���ͧ�����Ѥ� 3");	
		panelp3.add(labelp3);
		c.add(panelp3); 
		*/
	}
}
