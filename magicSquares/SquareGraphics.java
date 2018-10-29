package magicSquares;

import java.awt.*;
import javax.swing.*;

public class SquareGraphics extends JComponent
{	
	Square[] sgSquare;
	
	public SquareGraphics(Square[] ptrSquare)
	{
		sgSquare = ptrSquare;
	}
	
	public void paintComponent(Graphics gSquare)
	{
		super.paintComponents(gSquare);
		
		for(int i = 0; i < Application.numSquares; ++i)
		{
			gSquare.setColor(sgSquare[i].getColor());	
			gSquare.drawRect(sgSquare[i].getX(), sgSquare[i].getY(), sgSquare[i].getSize(), sgSquare[i].getSize());
		}
		
		super.repaint();
	}
}
