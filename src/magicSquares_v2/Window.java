import java.awt.*;
import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class Window{
  public static void main(String[] args) {
 
	//���������
	JFrame window=new JFrame("Window");
	//�������
	window.setSize(1400, 700);
 
	//�������� ���� ��� ������� �� �������
	window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
/*	�������� ����������
 *  ����� ������� � ���� ����������� �������.*/
	window.setLayout(new BorderLayout(50,50));

	Canvas canv=new Canvas();
	window.add(canv);		
	window.setVisible(true);		
  }
}

/* �����, ������� ����� �������� ��������*/
class Canvas extends JComponent{
 
	int[]X = {0, 600, 50, 1000, 200};
	int[]Y = {0, 180, 90, 270, 360};
	int[]len = {50, 100, 120, 75, 20};
	boolean[]EndX = {true, false, false, true, false};
	boolean[]EndY = {true, true, false, false, false};
	boolean var = false;
/*�����, ���������������� ������� ������ ����
 *��� ����������*/
  public void paintComponent(Graphics g){
	super.paintComponents(g);		
	Graphics2D g2d=(Graphics2D)g;
 
	if(!var) {
		g2d.setPaint(Color.BLUE);
		var = true;
	}
	else{
		g2d.setPaint(Color.RED);
		var = false;
	}
	
/* 	������ ������� ������ �������������	*/	
	for(int i = 0; i < 5; i++) {
		g2d.drawRect(X[i], Y[i], len[i], len[i]);
		
		//��������� �������
		if(X[i] < 0) {
			EndX[i] = true;
		}
		if(X[i]+len[i] > 1300) {
			EndX[i] = false;
		}
		if(Y[i] < 0) {
			EndY[i] = true;
		}
		if(Y[i]+len[i] > 600) {
			EndY[i] = false;
		}
		
		//����� ����������
		if(EndX[i]) {
			X[i] += 1;
		}
		else {
			X[i] -= 1;
		}
		
		if(EndY[i]) {
			Y[i] += 1;
		}
		else {
			Y[i] -= 1;
		}
		
		//����������� ��������� 
		for(int j = 0; j < 5; j++) {
			if (i == j) {
				continue;
			}
			
			if(X[i] == X[j] && ((Y[j] > Y[i] && Y[j] < (Y[i] + len[i])) || Y[j] + len[j] > Y[i] && Y[j] + len[j] < (Y[i] + len[i]))) {
				len[i] +=len[i]/2;
				len[j] +=len[j]/2;
			}
		}
		
	}
	
		try {
			TimeUnit.MILLISECONDS.sleep(50);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
	
		
	//�������� ���������� ���� ����� ���������� ���������
	super.repaint();
  }	
}