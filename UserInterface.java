package MapUtil;

import javax.swing.*;
import java.awt.*;

public class UserInterface extends JFrame{

    private Logic mapLogic;
    private BoardUI boardInterface;

    UserInterface() {
        this.mapLogic = new Logic();
        boardInterface = new BoardUI(mapLogic);


        this.setTitle("Mapping Tool");
        this.setBounds(new Rectangle(1020,1020));
        this.add(boardInterface);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setVisible(true);
    }
}
