package magicSquares;

import java.awt.Color;
import java.awt.Graphics;
import java.util.concurrent.TimeUnit;

import javax.swing.*;

public class Window extends JFrame
{
//	Square[] wSquares;
//	SquareGraphics[] gSquare;
	
	Square wSquares; 
	SquareGraphics gSquare;
	
	public Window()
	{
	}
	
//	public Window(Square[] pSquares)
	public Window(Square pSquares)
	{
		super("Magic Squares");
		setBounds(0, 0, 800, 600);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		wSquares = pSquares;
		
//		gSquare = new SquareGraphics[Square.counter];
//		for(int i = 0; i < Square.counter; ++i)
//		{
//			gSquare[i] = new SquareGraphics(wSquares[i]);
//			add(gSquare[i]);
//		}
		gSquare = new SquareGraphics(wSquares);
		add(gSquare);
		
	}
	
	public void updateWindow(Square pSquares)
	{
		Graphics g = getGraphics();
		
//		System.out.println("x[" + counter + "]= " + gSquare[counter].getX());
//		System.out.println("y[" + counter + "]= " + gSquare[counter].getY());
		

//		gSquare[counter].setX(wSquares[counter].getX());
//		gSquare[counter].setY(wSquares[counter].getY());
//		gSquare[0].paintComponent(g);
	}
	
}

