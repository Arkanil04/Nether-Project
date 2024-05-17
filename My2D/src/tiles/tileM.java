package tiles;

import java.awt.Graphics2D;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.imageio.ImageIO;

import Main.GamePanal;

public class tileM {
	
	GamePanal gp;
	tiles[] tile;
	int mapTileNum[][];
	int q;
	String s;
	
	public tileM(GamePanal gp) {
		
		this.gp = gp;
		
		tile = new tiles[15];
		mapTileNum = new int[gp.maxworldcol][gp.maxworldrow];
		
		getTileImage();
		Map();

	}
	
	public void getTileImage() {
		
		try {
			
			tile[0] = new tiles();
			tile[0].image = ImageIO.read(getClass().getResourceAsStream("/tiles/water.png"));
			
			tile[1] = new tiles();
			tile[1].image = ImageIO.read(getClass().getResourceAsStream("/tiles/wall.png"));
			
			tile[2] = new tiles();
			tile[2].image = ImageIO.read(getClass().getResourceAsStream("/tiles/grass.png"));
			tile[2].collision = true;
			
			
			tile[3] = new tiles();
			tile[3].image = ImageIO.read(getClass().getResourceAsStream("/tiles/earth.png"));
			
			}catch(IOException e) {
				e.printStackTrace();
		}
		
	}
	public  void Map() {
		
		try {
			
			InputStream is = getClass().getResourceAsStream("/map/cmap.txt");
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			
			int col = 0;
			int row = 0;
			while(col < gp.maxScreenCol && row < gp.maxScreenRow) {
				
				String line = br.readLine();
				
				while( col < gp.maxScreenCol) {
					
					String numbers[] = line.split(" ");
					
					int num = Integer.parseInt(numbers[col]);
					
					mapTileNum[col][row] = num;
					col++;
					q = num;
				}
				if(col == gp.maxScreenCol) {
					col = 0;
					row++;
				}
				
			}
			br.close();
			
			}catch(Exception e) {
		}
		
	}
	public void draw(Graphics2D g2) {
		
		
			g2.drawImage(tile[0].image, 0, 0, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[1].image, 49, 0, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[1].image, 98, 0, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[1].image, 146, 0, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[2].image, 192, 0, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[2].image, 241, 0, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[3].image, 290, 0, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[3].image, 339, 0, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[3].image, 388, 0, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[3].image, 437, 0, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[2].image, 486, 0, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[2].image, 535, 0, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[1].image, 584, 0, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[1].image, 633, 0, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[1].image, 682, 0, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[1].image, 731, 0, gp.tileSize, gp.tileSize, null);
			
			
			
			g2.drawImage(tile[0].image, 0, 49, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[1].image, 49, 49, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[1].image, 98, 49, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[1].image, 146, 49, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[2].image, 192, 49, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[2].image, 241, 49, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[3].image, 290, 49, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[3].image, 339, 49, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[3].image, 388, 49, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[3].image, 437, 49, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[2].image, 486, 49, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[2].image, 535, 49, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[1].image, 584, 49, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[1].image, 633, 49, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[1].image, 682, 49, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[1].image, 731, 49, gp.tileSize, gp.tileSize, null);
			
			
			
			
			g2.drawImage(tile[0].image, 0, 98, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[1].image, 49, 98, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[1].image, 98, 98, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[1].image, 146, 98, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[2].image, 192, 98, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[2].image, 241, 98, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[3].image, 290, 98, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[3].image, 339, 98, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[3].image, 388, 98, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[3].image, 437, 98, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[2].image, 486, 98, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[2].image, 535, 98, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[1].image, 584, 98, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[1].image, 633, 98, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[1].image, 682, 98, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[1].image, 731, 98, gp.tileSize, gp.tileSize, null);
			
			
			
			g2.drawImage(tile[0].image, 0, 147, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[1].image, 49, 147, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[1].image, 98, 147, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[1].image, 146, 147, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[2].image, 192, 147, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[2].image, 241, 147, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[3].image, 290, 147, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[3].image, 339, 147, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[3].image, 388, 147, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[3].image, 437, 147, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[2].image, 486, 147, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[2].image, 535, 147, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[1].image, 584, 147, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[1].image, 633, 147, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[1].image, 682, 147, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[1].image, 731, 147, gp.tileSize, gp.tileSize, null);
			
			
			g2.drawImage(tile[0].image, 0, 196, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[1].image, 49, 196, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[1].image, 98, 196, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[1].image, 146, 196, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[2].image, 192, 196, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[2].image, 241, 196, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[3].image, 290, 196, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[3].image, 339, 196, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[3].image, 388, 196, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[3].image, 437, 196, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[2].image, 486, 196, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[2].image, 535, 196, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[1].image, 584, 196, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[1].image, 633, 196, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[1].image, 682, 196, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[1].image, 731, 196, gp.tileSize, gp.tileSize, null);
			
			
			g2.drawImage(tile[0].image, 0, 245, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[1].image, 49, 245, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[1].image, 98, 245, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[1].image, 146, 245, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[2].image, 192, 245, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[2].image, 241, 245, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[3].image, 290, 245, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[3].image, 339, 245, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[3].image, 388, 245, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[3].image, 437, 245, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[2].image, 486, 245, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[2].image, 535, 245, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[1].image, 584, 245, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[1].image, 633, 245, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[1].image, 682, 245, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[1].image, 731, 245, gp.tileSize, gp.tileSize, null);
			
			
			g2.drawImage(tile[0].image, 0, 294, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[1].image, 49, 294, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[1].image, 98, 294, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[1].image, 146, 294, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[2].image, 192, 294, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[2].image, 241, 294, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[3].image, 290, 294, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[3].image, 339, 294, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[3].image, 388, 294, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[3].image, 437, 294, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[2].image, 486, 294, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[2].image, 535, 294, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[1].image, 584, 294, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[1].image, 633, 294, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[1].image, 682, 294, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[1].image, 731, 294, gp.tileSize, gp.tileSize, null);
			
			
			g2.drawImage(tile[0].image, 0, 343, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[1].image, 49, 343, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[1].image, 98, 343, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[1].image, 146, 343, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[2].image, 192, 343, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[2].image, 241, 343, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[3].image, 290, 343, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[3].image, 339, 343, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[3].image, 388, 343, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[3].image, 437, 343, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[2].image, 486, 343, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[2].image, 535, 343, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[1].image, 584, 343, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[1].image, 633, 343, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[1].image, 682, 343, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[1].image, 731, 343, gp.tileSize, gp.tileSize, null);
			
			
			g2.drawImage(tile[0].image, 0, 392, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[1].image, 49, 392, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[1].image, 98, 392, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[1].image, 146, 392, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[2].image, 192, 392, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[2].image, 241, 392, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[3].image, 290, 392, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[3].image, 339, 392, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[3].image, 388, 392, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[3].image, 437, 392, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[2].image, 486, 392, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[2].image, 535, 392, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[1].image, 584, 392, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[1].image, 633, 392, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[1].image, 682, 392, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[1].image, 731, 392, gp.tileSize, gp.tileSize, null);

			
			g2.drawImage(tile[0].image, 0, 441, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[1].image, 49, 441, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[1].image, 98, 441, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[1].image, 146, 441, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[2].image, 192, 441, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[2].image, 241, 441, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[3].image, 290, 441, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[3].image, 339, 441, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[3].image, 388, 441, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[3].image, 437, 441, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[2].image, 486, 441, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[2].image, 535, 441, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[1].image, 584, 441, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[1].image, 633, 441, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[1].image, 682, 441, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[1].image, 731, 441, gp.tileSize, gp.tileSize, null);
			
			
			g2.drawImage(tile[0].image, 0, 490, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[1].image, 49, 490, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[1].image, 98, 490, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[1].image, 146, 490, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[2].image, 192, 490, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[2].image, 241, 490, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[3].image, 290, 490, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[3].image, 339, 490, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[3].image, 388, 490, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[3].image, 437, 490, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[2].image, 486, 490, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[2].image, 535, 490, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[1].image, 584, 490, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[1].image, 633, 490, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[1].image, 682, 490, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[1].image, 731, 490, gp.tileSize, gp.tileSize, null);
			
			
			g2.drawImage(tile[0].image, 0, 539, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[1].image, 49, 539, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[1].image, 98, 539, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[1].image, 146, 539, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[2].image, 192, 539, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[2].image, 241, 539, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[3].image, 290, 539, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[3].image, 339, 539, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[3].image, 388, 539, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[3].image, 437, 539, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[2].image, 486, 539, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[2].image, 535, 539, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[1].image, 584, 539, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[1].image, 633, 539, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[1].image, 682, 539, gp.tileSize, gp.tileSize, null);
			g2.drawImage(tile[1].image, 731, 539, gp.tileSize, gp.tileSize, null);
			
			
	}

}
