
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class SaveButton extends JButton implements ActionListener{
    private Cube[] map;
    protected SaveButton(Cube[] map, Logic logic){
        this.setText("Save");
        this.map = map;
        this.setSize(new Dimension(10,7));
        this.addActionListener(this);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        File file = new File("mapInfo.txt");
        try{
            FileWriter fw = new FileWriter(file);
            PrintWriter pw = new PrintWriter(fw);
            pw.println((int)Math.sqrt(map.length));
            System.out.println("here");
            for(int i=0;i<map.length;i++){
                if(map[i].isObj){
                    pw.write(i+",");
                }
            }
            pw.write("/");
            pw.close();
        }catch(IOException exception){
            System.out.println("failed");
        }
    }
}
