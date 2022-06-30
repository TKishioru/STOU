import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class FormCustomer extends JFrame {

	JTextField txtCusNum, txtCusName, txtCusAddr, txtCusPhone, txtCusMail, txtSearchCus;
	JLabel lCusNum, lCusName, lCusAddr, lCusPhone, lCusMail;
	JButton btnSaveCus, btnEditCus, btnDelCus;
	JTable tableCus;
	private DefaultTableModel modelCustomer;
	
	public FormCustomer() {
		
		String[] fonttxt = {"OptionPane.messageFont","OptionPane.messageFont","Label.font","Button.font","Table.font","TableHeader.font","TextField.font"};
		for(int i = 0 ;i < fonttxt.length; i ++) {
			UIManager.put(fonttxt[i], new Font("Tahoma", Font.PLAIN, 14));
		}

		Container c = this.getContentPane();
		c.setLayout(new BorderLayout());

		JPanel pNorth = new JPanel();
		pNorth.setLayout(new GridLayout(1, 2, 5, 5));
		pNorth.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		c.add(pNorth, BorderLayout.NORTH);
		
		JPanel panelSearch = new JPanel();
		//panelSearch.setBorder(BorderFactory.createTitledBorder("����"));
		JLabel txtfind = new JLabel("����"); 
		txtSearchCus = new JTextField();
		txtSearchCus.setPreferredSize(new Dimension(150, 30));
		panelSearch.add(txtfind);
		panelSearch.add(txtSearchCus);
		pNorth.add(panelSearch); 

		JPanel panelButton = new JPanel();
		panelButton.setLayout(new GridLayout(1, 3, 30, 10));
		btnSaveCus = new JButton("����������");
		btnEditCus = new JButton("���");
		btnDelCus = new JButton("ź");
		panelButton.add(btnSaveCus);
		panelButton.add(btnEditCus);
		panelButton.add(btnDelCus);
		panelButton.setBorder(BorderFactory.createEmptyBorder(30, 20, 20, 20));
		pNorth.add(panelButton);
		
		JPanel pWEST = new JPanel();
		pWEST.setLayout(new GridLayout(1, 2, 5, 5));
		pWEST.setBorder(BorderFactory.createEmptyBorder(5, 5, 20, 5));
		c.add(pWEST, BorderLayout.WEST);

		JPanel panelForm = new JPanel();
		panelForm.setLayout(new GridLayout(10, 1, 10, 5));
		lCusNum = new JLabel("�Ţ����١��� (CUST_NUM)");
		txtCusNum = new JTextField();
		txtCusNum.setPreferredSize(new Dimension(150, 30));
		panelForm.add(lCusNum);
		panelForm.add(txtCusNum);

		lCusName = new JLabel("�����١��� (CUST_NAME)");
		txtCusName = new JTextField();
		txtCusName.setPreferredSize(new Dimension(150, 30));
		panelForm.add(lCusName);
		panelForm.add(txtCusName);

		lCusAddr = new JLabel("��������١��� (CUST_ADDR)");
		txtCusAddr = new JTextField();
		txtCusAddr.setPreferredSize(new Dimension(150, 30));
		panelForm.add(lCusAddr);
		panelForm.add(txtCusAddr);

		lCusPhone = new JLabel("���Ѿ���١��� (CUST_PHONE)");
		txtCusPhone = new JTextField();
		txtCusPhone.setPreferredSize(new Dimension(150, 30));
		panelForm.add(lCusPhone);
		panelForm.add(txtCusPhone);

		lCusMail = new JLabel("������١��� (CUST_MAIL)");
		txtCusMail = new JTextField();
		txtCusMail.setPreferredSize(new Dimension(150, 30));
		panelForm.add(lCusMail);
		panelForm.add(txtCusMail);
		pWEST.add(panelForm);

		JPanel panelTable = new JPanel();
		panelTable.setBorder(BorderFactory.createEmptyBorder(15, 20, 5, 5));
		JScrollPane scrollTable = new JScrollPane();
		scrollTable.setPreferredSize(new Dimension(650, 300));

		tableCus = new JTable();
		Object data[][] = { { null, null, null, null, null }, 
				{ null, null, null, null, null },
				{ null, null, null, null, null }, };
		String col[] = { "�Ţ����١���", "�����١���", "��������١���", "�������Ѿ��", "�����" };
		modelCustomer = new DefaultTableModel(data, col) {
			public boolean isCellEditable(int row, int columns) {
				return false;
			}
		};
		tableCus.setModel(modelCustomer);
		scrollTable.setViewportView(tableCus);
		panelTable.add(scrollTable);
		c.add(panelTable, BorderLayout.EAST);
	}
	
	public static void main(String[] args) {
		FormCustomer frame = new FormCustomer();
		frame.setSize(1000,600);
		frame.setTitle("��èѴ��â�������١��� (CUSTOMER)");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setVisible(true);

	}
}
