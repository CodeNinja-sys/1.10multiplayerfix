/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.a;

import com.sun.jna.a.r;
import com.sun.jna.a.s;
import com.sun.jna.a.w;
import com.sun.jna.a.x;
import com.sun.jna.a.y;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.Window;
import java.awt.image.Raster;
import javax.swing.JRootPane;
import javax.swing.RootPaneContainer;

class v
extends y {
    private static final String a = "apple.awt.draggableWindowBackground";

    private v() {
    }

    public boolean a() {
        return true;
    }

    private x a(Window window) {
        x x2;
        if (window instanceof RootPaneContainer) {
            RootPaneContainer rootPaneContainer = (RootPaneContainer)((Object)window);
            Container container = rootPaneContainer.getContentPane();
            if (container instanceof x) {
                x2 = (x)container;
            } else {
                x2 = new x(container);
                rootPaneContainer.setContentPane(x2);
            }
        } else {
            Component component;
            Component component2 = component = window.getComponentCount() > 0 ? window.getComponent(0) : null;
            if (component instanceof x) {
                x2 = (x)component;
            } else {
                x2 = new x(component);
                window.add(x2);
            }
        }
        return x2;
    }

    public void a(Window window, boolean bl2) {
        boolean bl3;
        boolean bl4 = bl3 = window.getBackground() != null && window.getBackground().getAlpha() == 0;
        if (bl2 != bl3) {
            this.a(window, bl2, "setWindowTransparent");
        }
    }

    private void a(Window window, String string) {
        JRootPane jRootPane;
        Boolean bl2;
        if (window instanceof RootPaneContainer && (bl2 = (Boolean)(jRootPane = ((RootPaneContainer)((Object)window)).getRootPane()).getClientProperty(a)) == null) {
            jRootPane.putClientProperty(a, Boolean.FALSE);
            if (window.isDisplayable()) {
                System.err.println(string + "(): To avoid content dragging, " + string + "() must be called before the window is realized, or " + a + " must be set to Boolean.FALSE before the window is realized.  If you really want content dragging, set " + a + " on the window's root pane to Boolean.TRUE before calling " + string + "() to hide this message.");
            }
        }
    }

    public void a(Window window, float f2) {
        if (window instanceof RootPaneContainer) {
            JRootPane jRootPane = ((RootPaneContainer)((Object)window)).getRootPane();
            jRootPane.putClientProperty("Window.alpha", new Float(f2));
            this.a(window, "setWindowAlpha");
        }
        this.a((Component)window, new w(this, window, f2));
    }

    protected void a(Component component, Raster raster) {
        if (raster != null) {
            this.a(component, this.a(raster));
        } else {
            this.a(component, new Rectangle(0, 0, component.getWidth(), component.getHeight()));
        }
    }

    public void a(Component component, Shape shape) {
        if (component instanceof Window) {
            Window window = (Window)component;
            x x2 = this.a(window);
            x2.a(shape);
            this.a(window, shape != r.a, "setWindowMask");
        }
    }

    private void a(Window window, boolean bl2, String string) {
        JRootPane jRootPane;
        JRootPane jRootPane2 = jRootPane = window instanceof RootPaneContainer ? ((RootPaneContainer)((Object)window)).getRootPane() : null;
        if (bl2) {
            if (jRootPane != null) {
                jRootPane.putClientProperty("transparent-old-bg", window.getBackground());
            }
            window.setBackground(new Color(0, 0, 0, 0));
        } else if (jRootPane != null) {
            Color color = (Color)jRootPane.getClientProperty("transparent-old-bg");
            if (color != null) {
                color = new Color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
            }
            window.setBackground(color);
            jRootPane.putClientProperty("transparent-old-bg", null);
        } else {
            window.setBackground(null);
        }
        this.a(window, string);
    }

    /* synthetic */ v(s s2) {
        this();
    }
}

