/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.a;

import com.sun.jna.a.ae;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.Window;
import javax.swing.JComponent;
import javax.swing.SwingUtilities;

public class ad
extends JComponent {
    private static final long a = 1L;
    private final ae b = this.a();
    private final JComponent c;
    private Rectangle d;

    public ad(JComponent jComponent) {
        this.c = jComponent;
    }

    public void addNotify() {
        super.addNotify();
        Window window = SwingUtilities.getWindowAncestor(this);
        this.setSize(this.getParent().getSize());
        window.addComponentListener(this.b);
        window.addWindowListener(this.b);
        Toolkit.getDefaultToolkit().addAWTEventListener(this.b, 48L);
    }

    public void removeNotify() {
        Toolkit.getDefaultToolkit().removeAWTEventListener(this.b);
        Window window = SwingUtilities.getWindowAncestor(this);
        window.removeComponentListener(this.b);
        window.removeWindowListener(this.b);
        super.removeNotify();
    }

    protected void paintComponent(Graphics graphics) {
        Rectangle rectangle = graphics.getClipBounds();
        if (this.d == null || !this.d.contains(rectangle)) {
            this.d = this.d == null ? rectangle : this.d.union(rectangle);
            this.c.repaint(this.d);
        } else {
            this.d = null;
        }
    }

    protected ae a() {
        return new ae(this);
    }

    static /* synthetic */ JComponent a(ad ad2) {
        return ad2.c;
    }
}

