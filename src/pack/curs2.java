package pack;

import javax.swing.*; /*����������� ���������� swing
         Swing � ���������� ��� �������� ������������ ���������� ��� �������� �� ����� Java.
         Swing ������������� ����� ������ ������������ ���������� � �����
         ����� ������� ����� �������, ��� ���������� AWT.
         "*" - �������� ��� ���������� swing �������� ��� ���� �������� (jbutton,jlabel � �.�.)
         */ 
import javax.swing.border.EmptyBorder; //����������� ����� EmptyBorder
import java.awt.*; /*����������� ���������� ������������ ���������� awt
             ��� ����������� ������, ������������ � �������� Java �������� � ������ java
             ����� AWT (����������� java.awt) �������� ����� �������, ���������� 
             ��������� ����������� �������� � ��������� �������� ����������.
             "*" - �������� ��� ���������� awt �������� ��� ���� �������� 
             */

public class curs2 extends JFrame { /*�������� ������ curs2 - ��������� ������������ ������ JFrame
      public - �������� ������� �������, �.�. ��� ����� curs2 �������� �� ������ �����, ������ ������
      class - ����������������� �����.��� ������� �����������, ��� �� ���������� ������� ����� ����� (� ����� ������ curs2)
      �������� ������ curs2 ������������� ����� ����������� �������� �������({) � ����������� �������� �������(})
      extends ��������� �� ��, ��� curs1 � ��� �������� ������ JFrame
      JFrame - ����� � ���������� Swing, �������������� ����� ���� � ������ � ������� ���������
        */                          
	private JPanel contentPane; /*��������� ������ (JPanel), ��������� ������ ������ ������ (private)
                   ������ JPanel � ��� ������� ����������, �������������� ����� ������������� ������������, �� ������� ����� ��������� ������ ��������.
                   */
	/**
	 * Create the frame.
	 */
	public curs2() { /*��������� �����������
                         ����������� ������� public �������� ��� ����� curs2 ����� � �������� ������ ������*/
		setTitle("����������"); //�������� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //���������� ����������� �� �������� �����
		setBounds(100, 100, 300, 300); // ��������� � ������ ����
		contentPane = new JPanel(); /*�������� ������
                                ������ JPanel � ��� ������� ����������, �������������� ����� ������������� ������������, �� ������� ����� ��������� ������ ��������.
                                �������� new ������� ��������� ������ JPanel
                                */
		contentPane.setBorder(new EmptyBorder(10, 10, 0, 0)); /*������������� ����� � ��������� ������ ������
                                    EmptyBorder � ������ �����, ��������� ������� ������� ������ ������. 
                                    ������� �������� �������� � ������������ �������� ������ �������.
                                    */
		setContentPane(contentPane); //����� setContentPane() ��������� �������� ������ ����������� ����
		contentPane.setLayout(new GridLayout(7, 1, 0, 0)); /*������ �������� ���������� ������
                                      �������� ���������� ���������� GridLayout  ��������� ������ �� ������ ���������� ������ � ������
                                      ���� �������� ���������� ��������� ������������� � ����������� (������ ����� �����). 
                                      ���������� ������� ���������� �����, �������� � ���������� ����� �������� �� ����������� � �� ���������.
                                      � ����� ������ 7 �����, 1 �������, ���������� ����� �������� �� ���������� � �� ��������� ��� 
		                      */
		JLabel lblQ = new JLabel("����������:"); //�������� �������� ��� ����������� �������������� ������("������ ����� ���� (� ������):")
		lblQ.setHorizontalAlignment(SwingConstants.CENTER); //������������ ������ ����� �� ������
		contentPane.add(lblQ); //���������� ����� �� ������
		
		JLabel lblNewLabel = new JLabel(""); //�������� �����
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER); //������������ ������ ����� �� ������
		contentPane.add(lblNewLabel); //���������� ����� �� ������
		
		JLabel lblNewLabel_1 = new JLabel(""); //�������� �����
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER); //������������ ������ ����� �� ������
		contentPane.add(lblNewLabel_1); //���������� ����� �� ������
		
		JLabel lblNewLabel_2 = new JLabel(""); //�������� �����
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER); //������������ ������ ����� �� ������
		contentPane.add(lblNewLabel_2); //���������� ����� �� ������
		
		JLabel lblNewLabel_3 = new JLabel(""); //�������� �����
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER); //������������ ������ ����� �� ������
		contentPane.add(lblNewLabel_3); //���������� ����� �� ������
		
		JLabel lblNewLabel_4 = new JLabel(""); //�������� �����
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER); //������������ ������ ����� �� ������
		contentPane.add(lblNewLabel_4); //���������� ����� �� ������
		
		JLabel lblNewLabel_5 = new JLabel(""); //�������� �����
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER); //������������ ������ ����� �� ������
		contentPane.add(lblNewLabel_5); //���������� ����� �� ������
		
		/*������ ���������� rez1, rez2, rez3, rez4, rez5, rez6 �� ��������
                               ���������� ������������� ����*/
		double rez1=curs1.razmer1*curs1.razmer2;
		double rez2=4*(curs1.razmer3/0.2);
		double rez3=(curs1.razmer1*curs1.razmer2)*0.5;
		double rez4=curs1.razmer1*curs1.razmer2*0.25;
		double rez5=curs1.razmer1*curs1.razmer2*0.4;
		double rez6=curs1.razmer1*curs1.razmer2*0.35;

		/*��������������� �����
                %.2f ���������� �������� � ����� ��������� ����� �����
                %.0f �� ���������� ����� ����� �����
                ����������� ����� String.format() ������������ ��� �������� �������������� ������ ��� �� ������*/
		 String R1 = String.format("������� ���� (��. ������): %.2f", rez1); 
		 String R2 = String.format("��������� ������, ����������� ��� ����: %.0f", rez2); 
		 String R3 = String.format("Max ���-�� ����� � ����: %.0f", rez3);
		 String R4 = String.format("������ ����������� (��. ������): %.2f", rez4);
		 String R5 = String.format("������ ��������� (��. ������): %.2f", rez5);
		 String R6 = String.format("������ ������� (��. ������): %.2f", rez6);
		 /*����� �������� �� ��������� �����
                  ����� setText �������� �������� ��������� � ��������� ����*/
		 lblNewLabel.setText(R1);
		 lblNewLabel_1.setText(R2);  
		 lblNewLabel_2.setText(R3);  
		 lblNewLabel_3.setText(R4);
		 lblNewLabel_4.setText(R5);
		 lblNewLabel_5.setText(R6);
	}

}
