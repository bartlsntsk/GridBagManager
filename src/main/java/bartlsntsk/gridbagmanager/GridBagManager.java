package bartlsntsk.gridbagmanager;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

/**
 *
 * @author bartlsntsk
 */
public final class GridBagManager {

    private GridBagLayout gridBagLayout;
    private GridBagConstraints gbc;
    private Insets insets;

    /**
     * Constructor calling method initGridBag. Creates and initializes
     * GridBagLayout, GridBagConstraints and Insets objects of this class.
     */
    public GridBagManager() {
        initGridBag();
    }

    /**
     * Method initializing layout object, constraints object and insets object.
     * Default anchor: NORTH, default fill: BOTH, default insets: 0,0,0,0
     */
    private void initGridBag() {
        this.gridBagLayout = new GridBagLayout();
        this.gbc = new GridBagConstraints();

        this.insets = new Insets(0, 0, 0, 0);

        this.gbc.anchor = GridBagConstraints.NORTH;
        this.gbc.fill = GridBagConstraints.BOTH;
        this.gbc.gridx = 0;
        this.gbc.gridy = 0;
        this.gbc.gridheight = 1;
        this.gbc.gridwidth = 1;
        this.gbc.ipadx = 0;
        this.gbc.ipady = 0;
        this.gbc.weightx = 0;
        this.gbc.weighty = 0;
        this.gbc.insets = insets;

    }

    public GridBagLayout getGridBagLayout() {
        return gridBagLayout;
    }

    public GridBagConstraints getGbc() {
        return gbc;
    }

    public Insets getInsets() {
        return insets;
    }

    public void increaseX() {
        this.gbc.gridx++;
    }

    public void increaseX(int increase) {
        this.gbc.gridx += increase;
    }

    public void increaseY() {
        this.gbc.gridy++;
    }

    public void increaseY(int increase) {
        this.gbc.gridy += increase;
    }

    public void setX(int x) {
        this.gbc.gridx = x;
    }

    public void setY(int y) {
        this.gbc.gridy = y;
    }

    public void setXY(int x, int y) {
        this.gbc.gridx = x;
        this.gbc.gridy = y;
    }

    public void setXRelative() {
        this.gbc.gridx = GridBagConstraints.RELATIVE;
    }

    public void setYRelative() {
        this.gbc.gridx = GridBagConstraints.RELATIVE;
    }
    
    /**
     *Jump to next X=0, Y++
     */
    public void jumpToNextRow ()
    {
        this.gbc.gridx=0;
        this.gbc.gridy+=1;
    }

    public void setGridspan(int gridwidth, int gridheight) {
        this.gbc.gridwidth = gridwidth;
        this.gbc.gridheight = gridheight;
    }

    public void resetGridspan() {
        this.gbc.gridheight = 1;
        this.gbc.gridwidth = 1;
    }

    public void setWeights(double weightx, double weighty) {
        this.gbc.weightx = weightx;
        this.gbc.weighty = weighty;
    }

    public void resetWeights() {
        this.gbc.weightx = 0;
        this.gbc.weighty = 0;
    }

    public void setIPad(int ipadx, int ipady) {
        this.gbc.ipadx = ipadx;
        this.gbc.ipady = ipady;
    }

    /**
     * Sets ipadx and ipady = 0
     */
    public void resetIPad() {
        this.gbc.ipadx = 0;
        this.gbc.ipady = 0;
    }

    /**
     *
     * @param bottom int
     * @param left int
     * @param right int
     * @param top int
     */
    public void setInsets(int bottom, int left, int right, int top) {
        this.insets.bottom = bottom;
        this.insets.left = left;
        this.insets.right = right;
        this.insets.top = top;
    }

    /**
     * Sets insets to 0,0,0,0
     */
    public void resetInsets() {
        this.insets.bottom = 0;
        this.insets.left = 0;
        this.insets.right = 0;
        this.insets.top = 0;
    }

    /**
     * Sets anchor of GridBagConstraints gbc. NORTH,SOUTH,WEST,EAST,CENTER
     *
     * @param anchor string
     */
    public void setAnchor(String anchor) {
        switch (anchor) {
            case "NORTH":
                this.gbc.anchor = GridBagConstraints.NORTH;
                break;
            case "SOUTH":
                this.gbc.anchor = GridBagConstraints.SOUTH;
                break;
            case "WEST":
                this.gbc.anchor = GridBagConstraints.WEST;
                break;
            case "EAST":
                this.gbc.anchor = GridBagConstraints.EAST;
                break;
            case "CENTER":
                this.gbc.anchor = GridBagConstraints.CENTER;
                break;
            default:
                break; //TODO: anchor not found error handling
        }
    }

    /**
     * Sets GridBagConstraints fill BOTH, VERTICAL, HORIZONTAL, NONE
     *
     * @param fill string
     */
    public void setFill(String fill) {
        switch (fill) {
            case "BOTH":
                this.gbc.fill = GridBagConstraints.BOTH;
                break;
            case "VERTICAL":
                this.gbc.fill = GridBagConstraints.VERTICAL;
                break;
            case "HORIZONTAL":
                this.gbc.fill = GridBagConstraints.HORIZONTAL;
                break;
            case "NONE":
                this.gbc.fill = GridBagConstraints.NONE;
                break;
            default:
                break;
        }
    }

    public int getX() {
        return this.gbc.gridx;
    }

    public int getY() {
        return this.gbc.gridy;
    }

    public int[] getXY() {
        int[] xy = {this.gbc.gridx, this.gbc.gridy};
        return xy;
    }
}
