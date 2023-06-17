/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.a.a;

import com.sun.jna.a.a.d;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.geom.Area;
import javax.swing.Icon;

class f
implements Icon {
    final /* synthetic */ Icon a;
    final /* synthetic */ Point b;
    final /* synthetic */ d c;

    f(d d2, Icon icon, Point point) {
        this.c = d2;
        this.a = icon;
        this.b = point;
    }

    public int getIconHeight() {
        return this.a.getIconHeight();
    }

    public int getIconWidth() {
        return this.a.getIconWidth();
    }

    public void paintIcon(Component component, Graphics graphics, int n2, int n3) {
        graphics = graphics.create();
        Area area = new Area(new Rectangle(n2, n3, this.getIconWidth(), this.getIconHeight()));
        area.subtract(new Area(new Rectangle(n2 + this.b.x - 1, n3 + this.b.y - 1, 3, 3)));
        graphics.setClip(area);
        this.a.paintIcon(component, graphics, n2, n3);
        graphics.dispose();
    }
}

