/* Modify your Squares2 program from the previous exercise into a new class Squares3 that draws the following figures. 
(Go back to that problem and copy/paste your code here as a starting point.) Parameterize your program so that the figures have the sizes shown below. 
The top-right figure has size 50, and the bottom-right figure has size 180. */


public class Squares3 {
    
        public static void main(String[] args) {
            DrawingPanel panel = new DrawingPanel(400, 300);
            panel.setBackground(Color.CYAN);
            Graphics g = panel.getGraphics();
            drawSquare(g, 50, 50, 20);
            drawSquare(g, 250, 10, 10);
            drawSquare(g, 180, 115, 36);
    
        }
        
     
        public static void drawSquare (Graphics g, int x, int y, int size) {
            g.setColor(Color.RED);
            int adder = size * 5;
            for (int i = 0; i <= 5; i++) {
                g.drawRect(x, y, ((x + adder) - (x + (size * i))), ((y + adder) - (y + (size * i))));
            }
            
            g.setColor(Color.BLACK);
            g.drawLine(x, y, x + adder, y + adder);
        }
}