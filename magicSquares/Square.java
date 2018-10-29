package magicSquares;

import java.awt.Color;
import java.util.Random;

public class Square 
{
	int size;
	
	int x;
	int y;
	
	Color colors[] = { Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.BLUE, Color.PINK }; 
	int countColor;
	
	boolean wayX;
	boolean wayY;
	
	public static int counter = 0;
	
	public Square()
	{	
		final Random random = new Random();
		this.wayX = random.nextBoolean();
		this.wayY = random.nextBoolean();
		
		this.size = 50 + random.nextInt(150);
		this.x = random.nextInt(700 - this.size);
		this.y = random.nextInt(500 - this.size);
		this.countColor = random.nextInt(5);
		Square.counter++;
	}
	
	public int getSize()
	{
		return size;
	}
	
	public int getX() 
	{
		return x;
	}
	
	public int getY() 
	{
		return y;
	}
	
	public Color getColor() {
		return this.colors[countColor];
	} 
	
	public void shiftColor() {
		countColor++;
		if(countColor > 5)
		{
			countColor = 0;
		}
	}
	
	public void changeSize() {
		final Random random = new Random();
		
		boolean change = random.nextBoolean();
		
		if(change == false) {
			size -= size/2;
		}
		else {
			size += size/2;
		}
	} 
	
	public void setSize(int size) 
	{
		this.size = size;
	}
	
	public void setX(int x)
	{
		this.x = x;
	}

	public void setY(int y)
	{
		this.y = y;
	}
	
	public void setColor(Color color)
	{
	}
	
	public void interSquare(Square squareTwo)
	{
		if(this.x == squareTwo.x || this.x + this.size == squareTwo.x + squareTwo.size)
		{
			if((this.y < squareTwo.y && this.y > squareTwo.y+squareTwo.size) || (this.y + this.size < squareTwo.y && this.y + this.size > squareTwo.y+squareTwo.size));
			{
				shiftColor();
				changeSize();
			}
		}
		if(this.y == squareTwo.y || this.y + this.size == squareTwo.y + squareTwo.size)
		{
			if((this.x < squareTwo.x && this.x > squareTwo.x+squareTwo.size) || (this.x + this.size < squareTwo.x && this.x + this.size > squareTwo.x+squareTwo.size))
			{
				shiftColor();
				changeSize();
			}
		}
	}

	public void waySquare()
	{		
		if(this.x + this.size >= 785)
		{
			this.wayX = false;
			shiftColor();
			changeSize();
		}
		if(this.x == 0)
		{
			this.wayX = true;
			shiftColor();
			changeSize();
		}
		if(this.y + this.size >= 560)
		{
			this.wayY = false;
			shiftColor();
			changeSize();
		}
		if(this.y == 0)
		{
			this.wayY = true;
			shiftColor();
			changeSize();
		}
		
		if(this.wayX == true)
		{
			x++;
		}
		else
		{
			x--;
		}
		
		if(this.wayY == true)
		{
			y++;
		}
		else
		{
			y--;
		}
	}

}
