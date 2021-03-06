package kr.or.dgit.it_3st_1team.ui.user;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import kr.or.dgit.it_3st_1team.dto.Reserve;
import kr.or.dgit.it_3st_1team.dto.User;
import kr.or.dgit.it_3st_1team.service.BookService;
import kr.or.dgit.it_3st_1team.service.ReserveService;
import kr.or.dgit.it_3st_1team.service.TakeinoutService;
import kr.or.dgit.it_3st_1team.ui.LoginUI;
import kr.or.dgit.it_3st_1team.ui.StartUI;

@SuppressWarnings("serial")
public class BookinfoUI extends JFrame implements ActionListener {
	public JTextField tfBookcode;
	public JTextField tfauthor;
	public JTextField tfpublish;
	public JTextField tfpubyear;
	public JTextField tfisbn;
	private JPanel panel;
	private JLabel lblbookname;
	public JTextField tfBookname;
	private JLabel lblLocation;
	public JTextField tfLocation;
	private JLabel lblnum;
	public JTextField tfnum;
	private JLabel lblreservenum;
	public JTextField tfreservenum;
	private JButton btnreserve;
	private JButton btnClose;
	private JLabel lblinfo;
	public JTextPane tpinfo;
	private StartUI staui;
	
	public BookinfoUI() {
		initComponents();
	}
	public void setStartUI(StartUI staui) {
		this.staui = staui;
	}
	private void initComponents() {
		setTitle("상세 도서 보기");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(400, 250, 930, 520);
		panel = new JPanel();
		panel.setBackground(new Color(224,224,224));
		panel.setBounds(0, 0, 1150, 800);
		setContentPane(panel);
		panel.setLayout(null);
		
		JLabel lblBookcode = new JLabel("도서코드");
		lblBookcode.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		lblBookcode.setBounds(30, 38, 73, 15);
		panel.add(lblBookcode);
		
		lblbookname = new JLabel("도서명");
		lblbookname.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		lblbookname.setBounds(30, 78, 73, 15);
		panel.add(lblbookname);
		
		JLabel lblauthor = new JLabel("저자");
		lblauthor.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		lblauthor.setBounds(30, 117, 73, 15);
		panel.add(lblauthor);
		
		JLabel lblpublish = new JLabel("출판사");
		lblpublish.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		lblpublish.setBounds(30, 157, 73, 15);
		panel.add(lblpublish);
		
		JLabel lblpubyear = new JLabel("출판년도");
		lblpubyear.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		lblpubyear.setBounds(30, 197, 73, 15);
		panel.add(lblpubyear);
		
		JLabel lblIsbn = new JLabel("ISBN");
		lblIsbn.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		lblIsbn.setBounds(30, 237, 73, 15);
		panel.add(lblIsbn);
		
		lblLocation = new JLabel("도서 위치");
		lblLocation.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		lblLocation.setBounds(30, 277, 73, 15);
		panel.add(lblLocation);
		
		lblnum = new JLabel("비치수/보유수");
		lblnum.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		lblnum.setBounds(549, 38, 119, 15);
		panel.add(lblnum);
		
		lblreservenum = new JLabel("예약자수");
		lblreservenum.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		lblreservenum.setBounds(549, 78, 119, 15);
		panel.add(lblreservenum);
		
		lblinfo = new JLabel("도서 정보");
		lblinfo.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		lblinfo.setBounds(30, 317, 73, 15);
		panel.add(lblinfo);
		
		tfBookcode = new JTextField();
		tfBookcode.setEditable(false);
		tfBookcode.setBorder(new CompoundBorder(new LineBorder(new Color(192, 192, 192)), new EmptyBorder(0, 10, 0, 0)));
		tfBookcode.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		tfBookcode.setBounds(115, 30, 404, 30);
		panel.add(tfBookcode);
		tfBookcode.setColumns(10);
		
		tfBookname = new JTextField();
		tfBookname.setEditable(false);
		tfBookname.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		tfBookname.setColumns(10);
		tfBookname.setBorder(new CompoundBorder(new LineBorder(new Color(192, 192, 192)), new EmptyBorder(0, 10, 0, 0)));
		tfBookname.setBounds(115, 70, 404, 30);
		panel.add(tfBookname);
		
		tfauthor = new JTextField();
		tfauthor.setEditable(false);
		tfauthor.setBorder(new CompoundBorder(new LineBorder(new Color(192, 192, 192)), new EmptyBorder(0, 10, 0, 0)));
		tfauthor.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		tfauthor.setBounds(115, 110, 404, 30);
		panel.add(tfauthor);
		tfauthor.setColumns(10);
		
		tfpublish = new JTextField();
		tfpublish.setEditable(false);
		tfpublish.setBorder(new CompoundBorder(new LineBorder(new Color(192, 192, 192)), new EmptyBorder(0, 10, 0, 0)));
		tfpublish.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		tfpublish.setBounds(115, 150, 404, 30);
		panel.add(tfpublish);
		tfpublish.setColumns(10);
		
		tfpubyear = new JTextField();
		tfpubyear.setEditable(false);
		tfpubyear.setBorder(new CompoundBorder(new LineBorder(new Color(192, 192, 192)), new EmptyBorder(0, 10, 0, 0)));
		tfpubyear.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		tfpubyear.setBounds(115, 190, 404, 30);
		panel.add(tfpubyear);
		tfpubyear.setColumns(10);
		
		tfisbn = new JTextField();
		tfisbn.setEditable(false);
		tfisbn.setBorder(new CompoundBorder(new LineBorder(new Color(192, 192, 192)), new EmptyBorder(0, 10, 0, 0)));
		tfisbn.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		tfisbn.setBounds(115, 230, 404, 30);
		panel.add(tfisbn);
		tfisbn.setColumns(10);
		
		tfLocation = new JTextField();
		tfLocation.setEditable(false);
		tfLocation.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		tfLocation.setColumns(10);
		tfLocation.setBorder(new CompoundBorder(new LineBorder(new Color(192, 192, 192)), new EmptyBorder(0, 10, 0, 0)));
		tfLocation.setBounds(115, 270, 404, 30);
		panel.add(tfLocation);
		
		tfnum = new JTextField();
		tfnum.setEditable(false);
		tfnum.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		tfnum.setColumns(10);
		tfnum.setBorder(new CompoundBorder(new LineBorder(new Color(192, 192, 192)), new EmptyBorder(0, 10, 0, 0)));
		tfnum.setBounds(670, 30, 126, 30);
		panel.add(tfnum);
		
		tfreservenum = new JTextField();
		tfreservenum.setEditable(false);
		tfreservenum.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		tfreservenum.setColumns(10);
		tfreservenum.setBorder(new CompoundBorder(new LineBorder(new Color(192, 192, 192)), new EmptyBorder(0, 10, 0, 0)));
		tfreservenum.setBounds(670, 70, 126, 30);
		panel.add(tfreservenum);
		
		tpinfo = new JTextPane();
		tpinfo.setEditable(false);
		tpinfo.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		tpinfo.setBorder(new CompoundBorder(new LineBorder(new Color(192, 192, 192)), new EmptyBorder(0, 10, 0, 0)));
		tpinfo.setBounds(115, 310, 668, 140);
		panel.add(tpinfo);
		
		btnreserve = new JButton("예약");
		btnreserve.addActionListener(this);
		btnreserve.setForeground(Color.WHITE);
		btnreserve.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		btnreserve.setBackground(new Color(52, 152, 219));
		btnreserve.setBounds(808, 70, 70, 30);
		btnreserve.setBorder(null);
		panel.add(btnreserve);
		
		btnClose = new JButton("닫기");
		btnClose.addActionListener(this);
		btnClose.setForeground(Color.WHITE);
		btnClose.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
		btnClose.setBackground(new Color(52, 152, 219));
		btnClose.setBounds(808, 420, 70, 30);
		btnClose.setBorder(null);
		panel.add(btnClose);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnreserve) {
			actionPerformedBtnreserve(e);
		}
		if (e.getSource() == btnClose) {
			actionPerformedBtnClose(e);
		}
	}
	protected void actionPerformedBtnClose(ActionEvent e) {
		dispose();
	}
	protected void actionPerformedBtnreserve(ActionEvent e) {
		User user = StartUI.LOGINUSER;
		String isbn = tfisbn.getText();
		int ExistNum = BookService.getInstance().selectExistNum(isbn);
		TakeinoutService service = new TakeinoutService();
		int Num = service.selectOutNum(isbn);
		int inNum = ExistNum - Num;	//비치수
		
		if(inNum==0) {
			if(user!=null) {
				Reserve res = new Reserve();
				res.setCode(user.getCode());
				res.setBkcode(tfBookcode.getText());
				res.setIsbn(tfisbn.getText());
				res.setResday(new Date());
				List<Reserve> list = ReserveService.getInstance().selectalreadyReserve(res);
				if(list.isEmpty()) {
					ReserveService.getInstance().insertReserve(res);
					JOptionPane.showMessageDialog(null, "도서가 예약되었습니다.");
					int reservenum = Integer.parseInt(tfreservenum.getText());
					tfreservenum.setText(Integer.toString(reservenum+1));
				}else {
					JOptionPane.showMessageDialog(null, "이미 예약한 도서입니다.");
				}
			}else {
				LoginUI login = new LoginUI(staui);
				login.setVisible(true);
			}
		}else {
			JOptionPane.showMessageDialog(null, "도서관에 책이 있습니다.");
		}
		
		
		
	}
}
