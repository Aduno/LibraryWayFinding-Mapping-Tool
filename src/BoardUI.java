import javax.swing.*;
import java.awt.*;

public class BoardUI extends JLabel {
    public static int RESOLUTION = 40;
    public static int DIMENSIONS = 900;
    private Color GRAY = new Color(0,0,0,(float)0.3);
    private Color WHITE = new Color(0,0,0,0);
    private ImageIcon icon = new ImageIcon("src/MapUtil/img/Library_map.png");
    private Logic logic;
    private State state;
    protected BoardUI(Logic logic, State state){
        int scale = (int) (DIMENSIONS*0.9);
        int height = icon.getIconHeight();
        int width = icon.getIconWidth();
        this.setIcon(new ImageIcon(icon.getImage().getScaledInstance((int)(width*0.97),(int)(height*0.97),Image.SCALE_DEFAULT)));
        this.setLayout(new GridLayout(RESOLUTION,RESOLUTION,0,0));
        this.logic = logic;
        this.state = state;
        update();
    }

    public void update(){
        Cube[] points = state.cubeMap;
        int size = DIMENSIONS/RESOLUTION;
        for(int i=0;i<RESOLUTION*RESOLUTION;i++){
            points[i].setContentAreaFilled(false);
            points[i].setPreferredSize(new Dimension(size,size));
            points[i].setRolloverEnabled(false);
            if(points[i].getActionListeners().length==0) {
                points[i].addActionListener(logic);
            }
            if(points[i].isObj){
                points[i].setBackground(GRAY);
                points[i].setOpaque(true);
            }else{
                points[i].setBackground(WHITE);
            }
            this.add(points[i]);
        }
    }
}
