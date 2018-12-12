package money;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.Book;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;



import javax.swing.JButton;

public class BankManager extends JFrame implements ActionListener {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JButton btnNewButton,btnNewButton_1,btnNewButton_2,btnNewButton_3;

	public BankManager() {
		
		getContentPane().setLayout(null);

		btnNewButton = new JButton("등록");
		btnNewButton.setBounds(0, 272, 97, 23);
		getContentPane().add(btnNewButton);
		
		btnNewButton_1 = new JButton("수정");	
		btnNewButton_1.setBounds(126, 272, 97, 23);
		getContentPane().add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("삭제");
		btnNewButton_2.setBounds(0, 316, 97, 23);
		getContentPane().add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("전체검색");
		btnNewButton_3.setBounds(126, 316, 127, 23);
		getContentPane().add(btnNewButton_3);

		JLabel lblNewLabel = new JLabel("아이디");
		lblNewLabel.setBounds(12, 69, 57, 15);
		getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("이름");
		lblNewLabel_1.setBounds(12, 111, 57, 15);
		getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("나이");
		lblNewLabel_2.setBounds(12, 155, 57, 15);
		getContentPane().add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("전화번호");
		lblNewLabel_3.setBounds(12, 200, 57, 15);
		getContentPane().add(lblNewLabel_3);

		textField = new JTextField();
		textField.setBounds(67, 66, 116, 21);
		getContentPane().add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(67, 108, 116, 21);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setBounds(67, 152, 116, 21);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);

		textField_3 = new JTextField();
		textField_3.setBounds(67, 197, 116, 21);
		getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		btnNewButton.addActionListener(this);      //고객등록
		btnNewButton_1.addActionListener(this);	//고객정보수정
		btnNewButton_2.addActionListener(this);	//고객 탈퇴
		btnNewButton_3.addActionListener(this);	//고객 전체리스트

		setTitle("은행 고객등록화면");
		setSize(450, 450);
		setVisible(true);
	}

	public static void main(String[] args) {
		new BankManager();

	}

	@Override
	public void actionPerformed(ActionEvent e) {  	
		BankDAO ba = new BankDAO();	
		if (e.getSource() == btnNewButton) {
			
			String age=textField_2.getText();
			int ageInt=Integer.parseInt(age);

			BankDAO dao = new BankDAO();
			BankDTO dto = new BankDTO(textField.getText(),textField_1.getText(),ageInt,textField_3.getText());

			dao.insert(dto);

		}else if(e.getSource()==btnNewButton_1) {  //고객 정보 수정
			System.out.println("데이터가 수정되었습니다.");
			
			BankDAO dao = new BankDAO();
	//		BankDTO update = new BankDTO(textField.getText(),textField_3.getText());
			
		//	dao.delete(dto);
			
		//	dao.update(dto);
		}else if(e.getSource()==btnNewButton_2) {	//고객 탈퇴
			
		}else if(e.getSource()==btnNewButton_3) {	//고객 전체 리스트
			
			String age=textField_2.getText();
			int ageInt=Integer.parseInt(age);
			
			BankDAO dao = new BankDAO();
			BankDTO dto=new BankDTO(textField.getText(),textField_1.getText(), ageInt,textField_3.getText());
			
			dao.selectAll(dto);
			
	}
	}
}