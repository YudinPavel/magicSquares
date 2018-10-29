package magicSquares;

import java.awt.*;
import java.util.concurrent.TimeUnit;

import javax.swing.*;

public class SquareGraphics extends JComponent
{	
	int x;
	int y;
	
	int size;
	Color color;
	
	Square wSquare;
	
	public SquareGraphics()
	{
		
	}
	
	public SquareGraphics(Square pSquare)
	{
		wSquare = pSquare;
		
		this.x = wSquare.getX();
		this.y = wSquare.getY();
		
		this.size = wSquare.getSize();
		this.color = wSquare.getColor();
	}
	
	public void paintComponent(Graphics gSquare)
	{
		super.paintComponents(gSquare);
		
		this.x = wSquare.getX();
		this.y = wSquare.getY();
		
		this.size = wSquare.getSize();
		
		gSquare.setColor(wSquare.getColor());	
		gSquare.drawRect(x, y, size, size);
		
		super.repaint();
	}
	
	public void setX(int x) 
	{
		this.x = x;
	}

	public void setY(int y) 
	{
		this.y = y;
	}

	public void setSize(int size) 
	{
		this.size = size;
	}

	public void setColor(Color color)
	{
		this.color = color;
	}
	////////////////////////
	////////////////////////
//	public int getX() 
//	{
//		return this.x;
//	}

//	public int getY() 
//	{
//		return this.y;
//	}
}
