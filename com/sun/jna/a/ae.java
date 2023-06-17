/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.a;

import com.sun.jna.a.ad;
import java.awt.AWTEvent;
import java.awt.Component;
import java.awt.event.AWTEventListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.HierarchyEvent;
import java.awt.event.HierarchyListener;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.SwingUtilities;

public class ae
extends WindowAdapter
implements AWTEventListener,
ComponentListener,
HierarchyListener {
    final /* synthetic */ ad a;

    protected ae(ad ad2) {
        this.a = ad2;
    }

    public void windowOpened(WindowEvent windowEvent) {
        this.a.repaint();
    }

    public void componentHidden(ComponentEvent componentEvent) {
    }

    public void componentMoved(ComponentEvent componentEvent) {
    }

    public void componentResized(ComponentEvent componentEvent) {
        this.a.setSize(this.a.getParent().getSize());
        this.a.repaint();
    }

    public void componentShown(ComponentEvent componentEvent) {
        this.a.repaint();
    }

    public void hierarchyChanged(HierarchyEvent hierarchyEvent) {
        this.a.repaint();
    }

    public void eventDispatched(AWTEvent aWTEvent) {
        Component component;
        if (aWTEvent instanceof MouseEvent && (component = ((MouseEvent)aWTEvent).getComponent()) != null && SwingUtilities.isDescendingFrom(component, ad.a(this.a))) {
            MouseEvent mouseEvent = SwingUtilities.convertMouseEvent(component, (MouseEvent)aWTEvent, ad.a(this.a));
            Component component2 = SwingUtilities.getDeepestComponentAt(ad.a(this.a), mouseEvent.getX(), mouseEvent.getY());
            if (component2 != null) {
                this.a.setCursor(component2.getCursor());
            }
        }
    }
}

