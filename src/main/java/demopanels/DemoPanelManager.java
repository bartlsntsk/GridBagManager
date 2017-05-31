package demopanels;

import gridbagmanager.abstractpanel.AbstractPanelManager;
import java.awt.Color;
import javax.swing.JLabel;

/**
 *
 * @author Bartosz
 */
public class DemoPanelManager extends AbstractPanelManager<DemoPanel> {

    public DemoPanelManager() {
        super();
    }

    @Override
    public void createPanel() {
        gbm.setFill("HORIZONTAL"); //it is set to BOTH by default
        gbm.setWeights(1, 0); //weights are 0, 0 by default
        gbm.setInsets(10, 10, 10, 10);
        
        int column = 0; //we want to set Y+=1 if we reach desired number of columns
        
        for (int i = 0; i < panels.size(); i++) {
            if (column == 5) {   //if it is already 5 column
                gbm.increaseY(); //jump down
                gbm.setX(0);     //and start at X=0
                column = 0;      //repeat
            }

            column++;
            this.addNextX(panels.get(i)); //insert into next column

            if (i == panels.size() - 1) {    //inserting empty component at the bottom
                gbm.setWeights(1, 1);        //with weights=1 ; comment out body of IF and
                gbm.setGridspan(5, 1);       //insert small number of panels into DemoPanelManager
                this.addNextY(new JLabel()); //to see why
            }
        }

        this.setBackground(Color.LIGHT_GRAY);
    }

}
