package magicSquares;

import java.awt.Color;
import java.awt.Graphics;
import java.util.concurrent.TimeUnit;

import javax.swing.*;

public class Window extends JFrame
{
	SquareGraphics graphSquare;
	
	public Window(Square[] ptrSquares)
	{
		super("Magic Squares");
		setBounds(0, 0, 800, 600);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		graphSquare = new SquareGraphics(ptrSquares);
		add(graphSquare);	
	}	
}

