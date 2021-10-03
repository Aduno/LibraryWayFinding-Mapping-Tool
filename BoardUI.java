package MapUtil;

import javax.swing.*;
import java.awt.*;

public class BoardUI extends JLabel {
    public static int RESOLUTION = 20;
    public static int DIMENSIONS = 1000;
    private ImageIcon icon = new ImageIcon("C:/Users/John/OneDrive - University of Ottawa/University/2021_4_Fall/GNG2101/Wayfinding Components/src/MapUtil/img/Floor00.png");
    private Logic logic;
    BoardUI(Logic logic){
        this.setIcon(new ImageIcon(icon.getImage().getScaledInstance(DIMENSIONS,DIMENSIONS, Image.SCALE_DEFAULT)));
        this.setLayout(new GridLayout(RESOLUTION,RESOLUTION,0,0));
        this.logic = logic;
        update();
    }

    public void update(){
        Cube point;
        int size = DIMENSIONS/RESOLUTION;
        for(int i=0;i<RESOLUTION*RESOLUTION;i++){
            point = new Cube();
            point.setContentAreaFilled(false);
            point.setPreferredSize(new Dimension(size,size));
            point.addActionListener(logic);
            this.add(point);
        }
    }
}
