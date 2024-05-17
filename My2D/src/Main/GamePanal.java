package Main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

import entity.Player1;
import tiles.tileM;

public class GamePanal extends JPanel implements Runnable{
	
	//SCREEN SETTING
	final int originalTileSize = 16;// 16 x 16 tile
	final int scale = 3;
	
	public final int tileSize = originalTileSize * scale;// 48 x 48 tiles
	public final int maxScreenCol = 15;
	public final int maxScreenRow = 12;
	public final int screenWidth = tileSize * maxScreenCol;//768 pixels
	public final int screenHeight = tileSize * maxScreenRow;//576 pixels
	
	//World Setting
	public final int maxworldcol = 50;
	public final int maxworldrow = 50;
	public final int worldWidth = tileSize * maxworldcol;
	public final int worldHeight = tileSize * maxworldrow;
	// FPS FOR CHARACTER SPEED
	int FPS = 60;
	
	tileM m = new tileM(this);
	KeyHandaler KeyH = new KeyHandaler();
	Thread gameThread;
	public Player1 player = new Player1(this,KeyH);
	
	
	
	
	public GamePanal() {
		this.setPreferredSize(new Dimension(screenWidth, screenHeight));
		this.setBackground(Color.BLACK);
		this.setDoubleBuffered(true);
		this.addKeyListener(KeyH);
		this.setFocusable(true);
	}
	
	
	public void startGameThread() {
		
		gameThread = new Thread(this);
		gameThread.start();
	}

	@Override
	public void run() {
		
		//DELTA ACCUMULATOR METHOD
		double drawInterval = 1000000000/FPS;
		double delta = 0;
		long lastTime = System.nanoTime();
		long currentTime;
		long timer = 0;
		int drawCount = 0;
		
		while(gameThread != null) {
			//CHECK THE CURRENT TIME
			currentTime = System.nanoTime();
			
			delta += (currentTime - lastTime) / drawInterval;
			timer += (currentTime - lastTime);
			lastTime = currentTime;
			
			if(delta >= 1) {
				
				//UPDATE INFORMATION OF PLAYRE CHARACTER
				update();
				
				//DRAW THE UPDATED SECTION
				repaint();
				delta--;
				drawCount ++;
				
			}
			if(timer >= 1000000000) {
				System.out.println("FPS" + drawCount);
				drawCount = 0;
				timer = 0;
			}
		}

			
	}
	
	public void update() {
		
		player.update();
		
	}
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D)g;
		
		m.draw(g2);//OR IT WILL HIDE CHARACTER
		
		player.draw(g2);
		
		g2.dispose();
	}


}
