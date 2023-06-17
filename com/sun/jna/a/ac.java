/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.a;

import com.sun.jna.a.y;
import java.awt.AWTEvent;
import java.awt.AlphaComposite;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.AWTEventListener;
import java.awt.event.ContainerEvent;
import java.awt.image.BufferedImage;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public abstract class ac
extends JPanel
implements AWTEventListener {
    private static final long b = 1L;
    private boolean c;
    final /* synthetic */ y a;

    public ac(y y2, Container container) {
        this.a = y2;
        super(new BorderLayout());
        this.add((Component)container, "Center");
        this.a(true);
        if (container instanceof JPanel) {
            ((JComponent)container).setOpaque(false);
        }
    }

    public void addNotify() {
        super.addNotify();
        Toolkit.getDefaultToolkit().addAWTEventListener(this, 2L);
    }

    public void removeNotify() {
        Toolkit.getDefaultToolkit().removeAWTEventListener(this);
        super.removeNotify();
    }

    public void a(boolean bl2) {
        this.c = bl2;
        this.setOpaque(!bl2);
        this.setDoubleBuffered(!bl2);
        this.repaint();
    }

    public void eventDispatched(AWTEvent aWTEvent) {
        if (aWTEvent.getID() == 300 && SwingUtilities.isDescendingFrom(((ContainerEvent)aWTEvent).getChild(), this)) {
            Component component = ((ContainerEvent)aWTEvent).getChild();
            this.a.a(component, false);
        }
    }

    public void paint(Graphics graphics) {
        if (this.c) {
            Rectangle rectangle = graphics.getClipBounds();
            int n2 = rectangle.width;
            int n3 = rectangle.height;
            if (this.getWidth() > 0 && this.getHeight() > 0) {
                BufferedImage bufferedImage = new BufferedImage(n2, n3, 3);
                Graphics2D graphics2D = bufferedImage.createGraphics();
                graphics2D.setComposite(AlphaComposite.Clear);
                graphics2D.fillRect(0, 0, n2, n3);
                graphics2D.dispose();
                graphics2D = bufferedImage.createGraphics();
                graphics2D.translate(-rectangle.x, -rectangle.y);
                super.paint(graphics2D);
                graphics2D.dispose();
                this.a(bufferedImage, rectangle);
            }
        } else {
            super.paint(graphics);
        }
    }

    protected abstract void a(BufferedImage var1, Rectangle var2);
}

