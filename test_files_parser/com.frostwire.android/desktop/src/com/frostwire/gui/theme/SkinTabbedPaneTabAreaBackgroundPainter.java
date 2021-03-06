/*
 * Created by Angel Leon (@gubatron), Alden Torres (aldenml)
 * Copyright (c) 2011-2014, FrostWire(R). All rights reserved.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.frostwire.gui.theme;

import java.awt.Graphics2D;

import javax.swing.JComponent;

/**
 * 
 * @author gubatron
 * @author aldenml
 *
 */
public final class SkinTabbedPaneTabAreaBackgroundPainter extends AbstractSkinPainter {

    private final State state;

    public SkinTabbedPaneTabAreaBackgroundPainter(State state) {
        this.state = state;
    }

    @Override
    protected void doPaint(Graphics2D g, JComponent c, int width, int height, Object[] extendedCacheKeys) {
        switch (state) {
        case Disabled:
        case EnableMouseOver:
        case EnablePressed:
        case Enable:
            paintBorder(g, width, height);
            break;
        }
    }

    private void paintBorder(Graphics2D g, int width, int height) {
        g.setPaint(SkinColors.GENERAL_BORDER_COLOR);
        int y = height - 1;
        g.drawLine(0, y, width, y);
    }

    public static enum State {
        Disabled, EnableMouseOver, EnablePressed, Enable
    }
}
