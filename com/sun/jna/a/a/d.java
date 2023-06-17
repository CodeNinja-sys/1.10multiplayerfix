/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.a.a;

import com.sun.jna.a.a.e;
import com.sun.jna.a.a.f;
import com.sun.jna.a.a.g;
import com.sun.jna.a.r;
import java.awt.Component;
import java.awt.GraphicsConfiguration;
import java.awt.Point;
import java.awt.Window;
import javax.swing.Icon;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

public class d {
    private static final float a = 0.5f;
    private Window b;
    private Point c;
    private static final int d = 33;

    public d(Component component, Icon icon, Point point, Point point2) {
        Window window = component instanceof Window ? (Window)component : SwingUtilities.getWindowAncestor(component);
        GraphicsConfiguration graphicsConfiguration = window.getGraphicsConfiguration();
        this.b = new e(this, JOptionPane.getRootFrame(), graphicsConfiguration, icon);
        this.b.setFocusableWindowState(false);
        this.b.setName("###overrideRedirect###");
        f f2 = new f(this, icon, point2);
        this.b.pack();
        r.a(this.b, f2);
        r.a(this.b, 0.5f);
        this.a(point);
        this.b.setVisible(true);
    }

    public void a(float f2) {
        r.a(this.b, f2);
    }

    public void a() {
        this.b.dispose();
        this.b = null;
    }

    public void a(Point point) {
        if (this.c == null) {
            this.c = point;
        }
        this.b.setLocation(point.x, point.y);
    }

    public void b() {
        Timer timer = new Timer(33, null);
        timer.addActionListener(new g(this, timer));
        timer.setInitialDelay(0);
        timer.start();
    }

    static /* synthetic */ Window a(d d2) {
        return d2.b;
    }

    static /* synthetic */ Point b(d d2) {
        return d2.c;
    }
}

