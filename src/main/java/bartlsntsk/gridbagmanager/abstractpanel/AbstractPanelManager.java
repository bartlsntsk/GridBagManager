package bartlsntsk.gridbagmanager.abstractpanel;

import java.util.ArrayList;
import java.util.List;

/**
 * Panel managing many panels of type T, which must extend AbstractGridBagPanel.
 * Basically it's creating a grid for panels of type T.
 *
 * @author bartlsntsk
 * @param <T> extends AbstractGridBagPanel
 *
 */
public abstract class AbstractPanelManager<T extends AbstractGridBagPanel> extends AbstractGridBagPanel {

    protected List<T> panels;

    public AbstractPanelManager() {
        super();
        panels = new ArrayList<>();
    }

    /**
     *
     * @param panel
     */
    public void addPanel(T panel) {
        panels.add(panel);
    }
    
    public void addPanels(List<T> panels)
    {
        panels.addAll(panels);
    }

    public void removePanel(T panel) {
        this.panels.remove(panel);
    }
    
    public void removePanels(List<T> panels)
    {
        this.panels.removeAll(panels);
    }
    
    /**
     *Removes all panels from this manager (clears list and removes panels). 
     * Consider yourself warned. You need to reload your panels again, then
     * you need to recreate your manager.
     * If you need to remove all components from this manager and leave the list untouched,
     * just call inherited method 'this.removeAll()' which won't affect this manager list of panels.
     */
    public void removeAllPanels()
    {
        this.panels.removeAll(this.panels);
        this.removeAll();
    }

    public List<T> getPanels() {
        return panels;
    }

    public T getPanel(int index) {
        return panels.get(index);
    }
    
    /**
     *Redraw manager removing one panel. Don't need to load all data again,
     * just delete specified panel from this managers list, then recreate,
     * revalidate, repaint.
     * @param panel
     */
    public void createPanelManagerWithout (T panel)
    {
        this.removePanel(panel);
        this.createPanel();
    }

    /**
     *Redraw manager removing List of panels. Don't need to load all data again,
     * just delete specified List of panels from this managers list, 
     * then recreate, revalidate, repaint.
     * @param panels
     */
    public void createPanelManagerWithout (List<T> panels)
    {
        this.removePanels(panels);
        this.createPanel();
    }
    
    /**
     *Add panel and redraw manager. Don't need to load all data again,
     * just add specified panel to this managers list, 
     * then recreate, revalidate, repaint.
     * @param panel
     */
    public void createPanelManagerAdd (T panel)
    {
        this.addPanel(panel);
        this.createPanel();
    }
    
    /**
     *Add panels and redraw manager. Don't need to load all data again,
     * just add specified List of panels to this managers list, 
     * then recreate, revalidate, repaint.
     * @param panels
     */
    public void createPanelManagerAdd (List<T> panels)
    {
        this.addPanels(panels);
        this.createPanel();
    }
}
