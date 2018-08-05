package breakout;

import javax.swing.ImageIcon;

public class Ball extends Sprite implements Commons
{
	private int xdir;
	private int ydir;
	
	public Ball()
	{
		xdir = 2;
		ydir = -2;
		
		ImageIcon ii = new ImageIcon("src/breakout/ball.png");
		image = ii.getImage();
		
		i_width = image.getWidth(null);
		i_height = image.getHeight(null);
		
		restetState();
	}
	
	public void move()
	{
		x += xdir;
		y += ydir;
		
		if (x == 0)
		{
			setXDir(2);
		}
		
		if (x == WIDTH - i_width)
		{
			setXDir(-2);
		}
		
		if (y == 0)
		{
			setYDir(2);
		}
	}
	
	private void restetState()
	{
		x = INIT_BALL_X;
		y = INIT_BALL_Y;
	}
	
	public void setXDir(int x)
	{
		xdir = x;
	}
	
	public void setYDir(int y)
	{
		ydir = y;
	}
	
	public int getYDir()
	{
		return ydir;
	}	
}
