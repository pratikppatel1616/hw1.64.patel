package ElevatorDesign;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToggleButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.Button;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Color;

public class HW1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HW1 frame = new HW1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public HW1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JToggleButton tglbtnFloor = new JToggleButton("Floor 3");
		tglbtnFloor.setBackground(Color.BLACK);
		tglbtnFloor.setBounds(50, 82, 200, 50);
		tglbtnFloor.setForeground(Color.WHITE);
		tglbtnFloor.setFont(new Font("Tahoma", Font.PLAIN, 30));
		contentPane.add(tglbtnFloor);
		
		JToggleButton tglbtnFloor_1 = new JToggleButton("Floor 2");
		tglbtnFloor_1.setBackground(Color.BLACK);
		tglbtnFloor_1.setBounds(50, 156, 200, 50);
		tglbtnFloor_1.setForeground(Color.WHITE);
		tglbtnFloor_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		contentPane.add(tglbtnFloor_1);
		
		JToggleButton tglbtnFloor_2 = new JToggleButton("Floor 1");
		tglbtnFloor_2.setBackground(Color.BLACK);
		tglbtnFloor_2.setBounds(50, 235, 200, 50);
		tglbtnFloor_2.setForeground(Color.WHITE);
		tglbtnFloor_2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		contentPane.add(tglbtnFloor_2);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 130, 600, 2);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(0, 204, 600, 2);
		contentPane.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(0, 283, 600, 2);
		contentPane.add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(250, 10, 0, 274);
		contentPane.add(separator_3);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(250, 0, 1, 283);
		separator_4.setOrientation(SwingConstants.VERTICAL);
		contentPane.add(separator_4);
		
		JTextArea txtrSelectFloorBelow = new JTextArea();
		txtrSelectFloorBelow.setBounds(10, 10, 214, 37);
		txtrSelectFloorBelow.setFont(new Font("Monospaced", Font.PLAIN, 18));
		txtrSelectFloorBelow.setText("Select floor below:");
		contentPane.add(txtrSelectFloorBelow);
		
		JTextArea txtrAmenitiesOnRespective = new JTextArea();
		txtrAmenitiesOnRespective.setBounds(260, 10, 316, 37);
		txtrAmenitiesOnRespective.setFont(new Font("Monospaced", Font.PLAIN, 17));
		txtrAmenitiesOnRespective.setText("Amenities on respective floors:");
		contentPane.add(txtrAmenitiesOnRespective);
		
		JTextArea txtrOneIce = new JTextArea();
		txtrOneIce.setBounds(284, 80, 273, 40);
		txtrOneIce.setLineWrap(true);
		txtrOneIce.setText("One (1) Ice machine, turn left out of elevator");
		contentPane.add(txtrOneIce);
		
		JTextArea txtrTwoIce = new JTextArea();
		txtrTwoIce.setBounds(284, 154, 273, 40);
		txtrTwoIce.setLineWrap(true);
		txtrTwoIce.setText("Two (2) Ice machines, turn left out of elevator");
		contentPane.add(txtrTwoIce);
		
		JTextArea txtrPoolFitnessCenter = new JTextArea();
		txtrPoolFitnessCenter.setBounds(284, 224, 278, 58);
		txtrPoolFitnessCenter.setLineWrap(true);
		txtrPoolFitnessCenter.setText("Pool, Fitness Center, Business Center, Reception  Desk, Suite Shop, and Laundry Room");
		contentPane.add(txtrPoolFitnessCenter);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setBounds(0, 57, 600, 2);
		contentPane.add(separator_5);
		
		JButton btnDoorOpen = new JButton("Door Open");
		btnDoorOpen.setBounds(50, 319, 185, 65);
		btnDoorOpen.setBackground(Color.BLUE);
		btnDoorOpen.setHorizontalAlignment(SwingConstants.LEFT);
		btnDoorOpen.setFont(new Font("Tahoma", Font.PLAIN, 30));
		contentPane.add(btnDoorOpen);
		
		JButton btnDoorClose = new JButton("Door Close");
		btnDoorClose.setBounds(340, 319, 185, 65);
		btnDoorClose.setBackground(Color.BLUE);
		btnDoorClose.setHorizontalAlignment(SwingConstants.LEFT);
		btnDoorClose.setFont(new Font("Tahoma", Font.PLAIN, 30));
		contentPane.add(btnDoorClose);
		
		JButton btnAlarm = new JButton("Alarm");
		btnAlarm.setBounds(202, 394, 180, 50);
		btnAlarm.setBackground(Color.RED);
		btnAlarm.setFont(new Font("Tahoma", Font.PLAIN, 30));
		contentPane.add(btnAlarm);
		
		JButton btnCallFrontDesk = new JButton("Call Front Desk");
		btnCallFrontDesk.setBounds(164, 465, 257, 50);
		btnCallFrontDesk.setBackground(Color.RED);
		btnCallFrontDesk.setFont(new Font("Tahoma", Font.PLAIN, 30));
		contentPane.add(btnCallFrontDesk);
	}
}
