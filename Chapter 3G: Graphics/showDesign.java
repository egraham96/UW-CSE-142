/* Write a complete program in a class named ShowDesign that uses the DrawingPanel to draw the following figure: 

The window is 200 pixels wide and 200 pixels tall. The background is white and the foreground is black. There are 20 pixels between each of the four rectangles, and the rectangles are concentric (their centers are at the same point). 
Use a loop to draw the repeated rectangles.
*/


public class ShowDesign {
    
        public static void main(String[] args) {
            DrawingPanel panel = new DrawingPanel(200, 200);
            Graphics g = panel.getGraphics();
            int x = 80;
            int y = 80;
            int width = 40;
            int height = 40;
            for (int i = 0; i < 4; i++) {
                drawRectangle(g, x, y, width, height);
                x = x - 20;
                y = y - 20;
                width = width + 40;
                height = height + 40;
            }
        }
      
        public static void drawRectangle (Graphics g, int x, int y, int width, int height) {
            g.setColor(Color.BLACK);
            g.drawRect(x, y, width, height);
        }  
}