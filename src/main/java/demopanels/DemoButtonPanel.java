package demopanels;

import gridbagmanager.abstractpanel.AbstractGridBagPanel;
import java.awt.Color;
import javax.swing.JButton;

/**
 *
 * @author Bartosz
 */
public final class DemoButtonPanel extends AbstractGridBagPanel {

    JButton button;
    JButton button2;
    JButton button3;

    public DemoButtonPanel()
    {
        super();
        this.createPanel();
    }
    
    @Override
    public void createPanel() {
        this.initButtons();
        
        gbm.setIPad(18, 20);
        gbm.setInsets(10, 20, 20, 10);
        gbm.setWeights(1, 0);
        gbm.setFill("HORIZONTAL");
        gbm.setAnchor("NORTH");

        this.quickAdd(button);
        this.addNextY(button2);
        
        gbm.setWeights(1, 1);
        this.addNextY(button3);
        
        this.setBackground(Color.LIGHT_GRAY);
    }

    private void initButtons() {
        button = new JButton("Button");
        button2 = new JButton("Button2");
        button3 = new JButton("Button3");
    }
}
