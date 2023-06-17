/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.a;

import com.sun.jna.a.aa;
import com.sun.jna.a.ab;
import com.sun.jna.a.o;
import com.sun.jna.a.r;
import com.sun.jna.a.t;
import com.sun.jna.a.u;
import com.sun.jna.a.z;
import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.Window;
import java.awt.geom.Area;
import java.awt.image.BufferedImage;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import javax.swing.Icon;
import javax.swing.JComponent;
import javax.swing.JLayeredPane;
import javax.swing.JRootPane;
import javax.swing.RootPaneContainer;
import javax.swing.SwingUtilities;

public abstract class y {
    protected Window a(Component component) {
        return component instanceof Window ? (Window)component : SwingUtilities.getWindowAncestor(component);
    }

    protected void a(Component component, Runnable runnable) {
        if (component.isDisplayable() && (!u.a || component.isVisible())) {
            runnable.run();
        } else if (u.a) {
            this.a(component).addWindowListener(new z(this, runnable));
        } else {
            component.addHierarchyListener(new aa(this, runnable));
        }
    }

    protected Raster a(Shape shape) {
        WritableRaster writableRaster = null;
        if (shape != r.a) {
            Rectangle rectangle = shape.getBounds();
            if (rectangle.width > 0 && rectangle.height > 0) {
                BufferedImage bufferedImage = new BufferedImage(rectangle.x + rectangle.width, rectangle.y + rectangle.height, 12);
                Graphics2D graphics2D = bufferedImage.createGraphics();
                graphics2D.setColor(Color.black);
                graphics2D.fillRect(0, 0, rectangle.x + rectangle.width, rectangle.y + rectangle.height);
                graphics2D.setColor(Color.white);
                graphics2D.fill(shape);
                writableRaster = bufferedImage.getRaster();
            }
        }
        return writableRaster;
    }

    protected Raster a(Component component, Icon icon) {
        WritableRaster writableRaster = null;
        if (icon != null) {
            Rectangle rectangle = new Rectangle(0, 0, icon.getIconWidth(), icon.getIconHeight());
            BufferedImage bufferedImage = new BufferedImage(rectangle.width, rectangle.height, 2);
            Graphics2D graphics2D = bufferedImage.createGraphics();
            graphics2D.setComposite(AlphaComposite.Clear);
            graphics2D.fillRect(0, 0, rectangle.width, rectangle.height);
            graphics2D.setComposite(AlphaComposite.SrcOver);
            icon.paintIcon(component, graphics2D, 0, 0);
            writableRaster = bufferedImage.getAlphaRaster();
        }
        return writableRaster;
    }

    protected Shape a(Raster raster) {
        Area area = new Area(new Rectangle(0, 0, 0, 0));
        o.a(raster, new ab(this, area));
        return area;
    }

    public void a(Window window, float f2) {
    }

    public boolean a() {
        return false;
    }

    public GraphicsConfiguration b() {
        GraphicsEnvironment graphicsEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice graphicsDevice = graphicsEnvironment.getDefaultScreenDevice();
        return graphicsDevice.getDefaultConfiguration();
    }

    public void a(Window window, boolean bl2) {
    }

    protected void a(Component component, boolean bl2) {
        if (component instanceof JComponent) {
            ((JComponent)component).setDoubleBuffered(bl2);
        }
        if (component instanceof JRootPane && bl2) {
            ((JRootPane)component).setDoubleBuffered(true);
        } else if (component instanceof Container) {
            Component[] arrcomponent = ((Container)component).getComponents();
            for (int i2 = 0; i2 < arrcomponent.length; ++i2) {
                this.a(arrcomponent[i2], bl2);
            }
        }
    }

    protected void b(Window window, boolean bl2) {
        Color color;
        Color color2 = color = bl2 ? new Color(0, 0, 0, 0) : null;
        if (window instanceof RootPaneContainer) {
            JComponent jComponent;
            RootPaneContainer rootPaneContainer = (RootPaneContainer)((Object)window);
            JRootPane jRootPane = rootPaneContainer.getRootPane();
            JLayeredPane jLayeredPane = jRootPane.getLayeredPane();
            Container container = jRootPane.getContentPane();
            JComponent jComponent2 = jComponent = container instanceof JComponent ? (JComponent)container : null;
            if (bl2) {
                jLayeredPane.putClientProperty("transparent-old-opaque", jLayeredPane.isOpaque());
                jLayeredPane.setOpaque(false);
                jRootPane.putClientProperty("transparent-old-opaque", jRootPane.isOpaque());
                jRootPane.setOpaque(false);
                if (jComponent != null) {
                    jComponent.putClientProperty("transparent-old-opaque", jComponent.isOpaque());
                    jComponent.setOpaque(false);
                }
                jRootPane.putClientProperty("transparent-old-bg", jRootPane.getParent().getBackground());
            } else {
                jLayeredPane.setOpaque(Boolean.TRUE.equals(jLayeredPane.getClientProperty("transparent-old-opaque")));
                jLayeredPane.putClientProperty("transparent-old-opaque", null);
                jRootPane.setOpaque(Boolean.TRUE.equals(jRootPane.getClientProperty("transparent-old-opaque")));
                jRootPane.putClientProperty("transparent-old-opaque", null);
                if (jComponent != null) {
                    jComponent.setOpaque(Boolean.TRUE.equals(jComponent.getClientProperty("transparent-old-opaque")));
                    jComponent.putClientProperty("transparent-old-opaque", null);
                }
                color = (Color)jRootPane.getClientProperty("transparent-old-bg");
                jRootPane.putClientProperty("transparent-old-bg", null);
            }
        }
        window.setBackground(color);
    }

    protected void b(Component component, Raster raster) {
        throw new UnsupportedOperationException("Window masking is not available");
    }

    protected void a(Component component, Raster raster) {
        if (component.isLightweight()) {
            throw new IllegalArgumentException("Component must be heavyweight: " + component);
        }
        this.b(component, raster);
    }

    public void a(Component component, Shape shape) {
        this.a(component, this.a(shape));
    }

    public void b(Component component, Icon icon) {
        this.a(component, this.a(component, icon));
    }

    protected void c(Window window, boolean bl2) {
        if (!(window instanceof t)) {
            Window[] arrwindow = window.getOwnedWindows();
            for (int i2 = 0; i2 < arrwindow.length; ++i2) {
                if (!(arrwindow[i2] instanceof t)) continue;
                if (bl2) {
                    return;
                }
                arrwindow[i2].dispose();
            }
            Boolean bl3 = Boolean.valueOf(System.getProperty("jna.force_hw_popups", "true"));
            if (bl2 && bl3.booleanValue()) {
                new t(window);
            }
        }
    }
}

