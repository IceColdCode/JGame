package TileMap;

import java.awt.*;
import javax.imageio.ImageIO;

public class Sprite extends GameImage implements Runnable {
  
  // thread
  public int frameNumber;
  public String[frameNumber] framePaths;
  private Sprite animationSprite =  new Sprite(frameNumber, framePaths);
  private static Thread animationThread = new Thread("Sprite Animation Thread",animationSprite);
  private boolean running = false;
  
  // positioning
  public int x, y, dx, dy;
  
  // animation
  public int numberOfFrames;
  public BufferedImage[numberOfImages] frames;
  
  // sprite methods
  public void play(Graphics2d g) {
    
    running = true;
    
    while(running) {
      for(BufferedImage image : frames) {
        g.drawImage(image, x, y, null);
        x += dx;
        y += dy;
        animationThread.sleep(100);
      }
    }
    
  }
  public void run() {
    play();
  }
  
  // constructor time!
  public Sprite(int numOfFrames, String[numOfFrames] paths) {
    
    numberOfFrames = numOfFrames;
    
    try{
      for(int i = 0; i < numOfFrames; i++) {
        frames[i] = ImageIO.read(getClass().getResourceAsStream(paths[i]));
      }
    } catch(Exception e) {
      e.printStackTrace();
    }
    
  }
  
}
