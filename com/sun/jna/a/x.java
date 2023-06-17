/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.a;

import java.awt.AlphaComposite;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import javax.swing.JPanel;

class x
extends JPanel {
    private static final long a = 1L;
    private Shape b;

    public x(Component component) {
        super(new BorderLayout());
        if (component != null) {
            this.add(component, "Center");
        }
    }

    public void a(Shape shape) {
        this.b = shape;
        this.repaint();
    }

    public void paint(Graphics graphics) {
        Graphics2D graphics2D = (Graphics2D)graphics.create();
        graphics2D.setComposite(AlphaComposite.Clear);
        graphics2D.fillRect(0, 0, this.getWidth(), this.getHeight());
        graphics2D.dispose();
        if (this.b != null) {
            graphics2D = (Graphics2D)graphics.create();
            graphics2D.setClip(this.b);
            super.paint(graphics2D);
            graphics2D.dispose();
        } else {
            super.paint(graphics);
        }
    }
}

