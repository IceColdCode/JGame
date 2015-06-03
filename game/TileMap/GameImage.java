package TileMap;

import java.awt.*;
import javax.imageio.ImageIO;

public class GameImage {
  
  BufferedImage image;
  
  public GameImage(String s) {
    try{
      image = ImageIO.read(getClass().getResourceAsStream(s));
    } catch(Exception e) {
      e.printStackTrace();
    }
  }
  
