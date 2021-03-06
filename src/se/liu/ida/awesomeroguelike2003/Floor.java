/*
 * An instance of a tile, passable
 */

package se.liu.ida.awesomeroguelike2003;

import java.awt.*;

import java.util.ArrayList;
import java.util.List;

public class Floor extends Tile
{
    private boolean solid = false;

    private String name = "floor";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override public void draw(Graphics2D g, final int x, final int y) {
	g.setColor(new Color(200, 200, 200));
	g.fillRect(x*TestGame.SQUARESIZE, y*TestGame.SQUARESIZE, TestGame.SQUARESIZE, TestGame.SQUARESIZE);
    }
}
