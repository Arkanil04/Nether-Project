package entity;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import Main.GamePanal;
import Main.KeyHandaler;

public class Player1 extends Player{
	
	
	GamePanal gp;
	KeyHandaler KeyH;
	
	public Player1(GamePanal gp , KeyHandaler KeyH) {
		
		this.gp = gp;
		this.KeyH = KeyH;
		
		setDefaultValue();
		getPlayerImage();
	}
	public void setDefaultValue() {
		
		
		x = 343;
		y = 530;
		speed = 4;
		direction = "down";
	}
	public void getPlayerImage() {
		
		try {
			
			up1 = ImageIO.read(getClass().getResourceAsStream("/Player1/boy_up_1.png"));
			up2 = ImageIO.read(getClass().getResourceAsStream("/Player1/boy_up_2.png"));
			down1 = ImageIO.read(getClass().getResourceAsStream("/Player1/boy_down_1.png"));
			down2 = ImageIO.read(getClass().getResourceAsStream("/Player1/boy_down_2.png"));
			left1 = ImageIO.read(getClass().getResourceAsStream("/Player1/boy_left_1.png"));
			left2 = ImageIO.read(getClass().getResourceAsStream("/Player1/boy_left_2.png"));
			right1 = ImageIO.read(getClass().getResourceAsStream("/Player1/boy_right_1.png"));
			right2 = ImageIO.read(getClass().getResourceAsStream("/Player1/boy_right_2.png"));
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void update() {
		
		
			if(KeyH.leftPress == true) {
				direction = "left";
				
				x -= speed;
			}
			else if(KeyH.rightPress == true) {
				direction = "right";
				
				x += speed;
			}
			
			spriteCounter++;
			if(spriteCounter > 17) {
				if(spriteNum == 1) {
					spriteNum = 2;
				}
				else if(spriteNum == 2) {
					spriteNum = 1;
				}
				spriteCounter = 0;
			}
		
		
		
	}
	public void draw(Graphics2D g2) {
		
//		g2.setColor(Color.BLUE); //FOR CHECKING ONLY
//		g2.fillRect(x, y, gp.tileSize, gp.tileSize); //FOR CHECKING
		
		BufferedImage image = null;
		
		switch(direction) {
		case "up":
			if(spriteNum == 1) {
				image = up1;
			}
			if(spriteNum == 2) {
				image = up2;
			}
			break;
		case "down":
			if(spriteNum == 1) {
				image = down1;
			}
			if(spriteNum == 2) {
				image = down2;
			}
			break;
		case "left":
			if(spriteNum == 1) {
				image = left1;
			}
			if(spriteNum == 2) {
				image = left2;
			}
			break;
		case "right":
			if(spriteNum == 1) {
				image = right1;
			}
			if(spriteNum == 2) {
				image = right2;
			}
			break;
		}
		if (x >= 283 && x <= 455)
			g2.drawImage(image, x, y, gp.tileSize, gp.tileSize, null);

		
	}

}
