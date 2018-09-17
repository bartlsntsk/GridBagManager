package demopanels;

import bigby.gridbagmanager.abstractpanel.AbstractGridBagPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author bigby
 */
public final class DemoPanel extends AbstractGridBagPanel {

    JLabel textLabel;
    JTextField textField;
    JButton button;

    public DemoPanel ()
    {
        super();
        this.createPanel();
    }
    
    @Override
    public void createPanel() {
        this.initComponents();
        
        gbm.setIPad(10, 10);//ipadx and ipady are set to 0 by default
        gbm.setInsets(10, 20, 20, 10);//insets are set to 0 by default

        this.quickAdd(textLabel);//adding without changing gridx or gridy, but with weights=0
        
        gbm.setWeights(1, 0);
        gbm.setIPad(50, 100);
        this.addNextX(textField);//add on next X coord
        
        gbm.setGridspan(2, 1);
        gbm.setX(0);
        gbm.setWeights(1, 1);
        gbm.setIPad(5,5);
        this.addNextY(button);//add on next Y coord
        
    }
    
    public void initComponents()
    {
        textLabel = new JLabel("Text");
        textField = new JTextField("Text text text");
        button = new JButton("Click");
    }

}
