/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.a.a;

import com.sun.jna.a.a.d;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GraphicsConfiguration;
import java.awt.Window;
import javax.swing.Icon;

class e
extends Window {
    private static final long c = 1L;
    final /* synthetic */ Icon a;
    final /* synthetic */ d b;

    e(d d2, Window window, GraphicsConfiguration graphicsConfiguration, Icon icon) {
        this.b = d2;
        this.a = icon;
        super(window, graphicsConfiguration);
    }

    public void paint(Graphics graphics) {
        this.a.paintIcon(this, graphics, 0, 0);
    }

    public Dimension getPreferredSize() {
        return new Dimension(this.a.getIconWidth(), this.a.getIconHeight());
    }

    public Dimension getMinimumSize() {
        return this.getPreferredSize();
    }

    public Dimension getMaximumSize() {
        return this.getPreferredSize();
    }
}

