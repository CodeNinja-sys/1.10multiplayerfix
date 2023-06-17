/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.a.a;

import com.sun.jna.a.a.d;
import java.awt.AlphaComposite;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.Image;
import java.awt.Point;
import java.awt.datatransfer.Transferable;
import java.awt.dnd.DragGestureEvent;
import java.awt.dnd.DragGestureListener;
import java.awt.dnd.DragSource;
import java.awt.dnd.DragSourceDragEvent;
import java.awt.dnd.DragSourceDropEvent;
import java.awt.dnd.DragSourceEvent;
import java.awt.dnd.DragSourceListener;
import java.awt.dnd.DragSourceMotionListener;
import java.awt.dnd.DropTargetDragEvent;
import java.awt.dnd.DropTargetDropEvent;
import java.awt.dnd.DropTargetEvent;
import java.awt.dnd.InvalidDnDOperationException;
import java.awt.image.BufferedImage;
import javax.swing.Icon;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.JTree;
import javax.swing.text.JTextComponent;

public abstract class a
implements DragGestureListener,
DragSourceListener,
DragSourceMotionListener {
    public static final Dimension a = new Dimension(250, 250);
    public static final float b = 0.5f;
    public static final int c = -1;
    public static final Transferable d = null;
    protected static final int e = 2;
    protected static final int f = 1;
    protected static final int g = 0x40000000;
    protected static final int h = 0;
    static final int i = 64;
    static final boolean j = System.getProperty("os.name").toLowerCase().indexOf("mac") != -1;
    static final int k = j ? 512 : 128;
    static final int l = j ? 768 : 192;
    static final int m = 9152;
    private static int n = -1;
    private static Transferable o = d;
    private int p;
    private boolean q = true;
    private Component r;
    private d s;
    private Point t;
    private Dimension u = a;
    private float v = 0.5f;
    private String w;
    private boolean x;

    static int a() {
        return n;
    }

    public static Transferable a(DropTargetEvent dropTargetEvent) {
        if (dropTargetEvent instanceof DropTargetDragEvent) {
            try {
                return (Transferable)dropTargetEvent.getClass().getMethod("getTransferable", null).invoke(dropTargetEvent, null);
            }
            catch (Exception exception) {
            }
        } else if (dropTargetEvent instanceof DropTargetDropEvent) {
            return ((DropTargetDropEvent)dropTargetEvent).getTransferable();
        }
        return o;
    }

    protected a(Component component, int n2) {
        Object object;
        this.r = component;
        this.p = n2;
        try {
            String[] arrstring;
            String string;
            object = System.getProperty("DragHandler.alpha");
            if (object != null) {
                try {
                    this.v = Float.parseFloat((String)object);
                }
                catch (NumberFormatException numberFormatException) {
                    // empty catch block
                }
            }
            if ((string = System.getProperty("DragHandler.maxDragImageSize")) != null && (arrstring = string.split("x")).length == 2) {
                try {
                    this.u = new Dimension(Integer.parseInt(arrstring[0]), Integer.parseInt(arrstring[1]));
                }
                catch (NumberFormatException numberFormatException) {}
            }
        }
        catch (SecurityException securityException) {
            // empty catch block
        }
        this.a(component);
        object = DragSource.getDefaultDragSource();
        ((DragSource)object).createDefaultDragGestureRecognizer(component, this.p, this);
    }

    private void a(Component component) {
        if (component instanceof JTree) {
            ((JTree)component).setDragEnabled(false);
        } else if (component instanceof JList) {
            ((JList)component).setDragEnabled(false);
        } else if (component instanceof JTable) {
            ((JTable)component).setDragEnabled(false);
        } else if (component instanceof JTextComponent) {
            ((JTextComponent)component).setDragEnabled(false);
        } else if (component instanceof JColorChooser) {
            ((JColorChooser)component).setDragEnabled(false);
        } else if (component instanceof JFileChooser) {
            ((JFileChooser)component).setDragEnabled(false);
        }
    }

    protected boolean a(DragGestureEvent dragGestureEvent) {
        int n2 = dragGestureEvent.getTriggerEvent().getModifiersEx() & 0x23C0;
        if (n2 == 64) {
            return (this.p & 2) != 0;
        }
        if (n2 == k) {
            return (this.p & 1) != 0;
        }
        if (n2 == l) {
            return (this.p & 0x40000000) != 0;
        }
        return true;
    }

    protected void a(int n2) {
        n = n2;
    }

    protected abstract Transferable b(DragGestureEvent var1);

    protected Icon a(DragGestureEvent dragGestureEvent, Point point) {
        return null;
    }

    protected void c(DragGestureEvent dragGestureEvent) {
    }

    public void dragGestureRecognized(DragGestureEvent dragGestureEvent) {
        block7: {
            if ((dragGestureEvent.getDragAction() & this.p) != 0 && this.a(dragGestureEvent)) {
                this.a(dragGestureEvent.getTriggerEvent().getModifiersEx() & 0x23C0);
                Transferable transferable = this.b(dragGestureEvent);
                if (transferable == null) {
                    return;
                }
                try {
                    Point point = new Point(0, 0);
                    Icon icon = this.a(dragGestureEvent, point);
                    Point point2 = dragGestureEvent.getDragOrigin();
                    this.t = new Point(point.x - point2.x, point.y - point2.y);
                    Icon icon2 = this.a(icon, this.t);
                    Cursor cursor = null;
                    if (icon2 != null && DragSource.isDragImageSupported()) {
                        GraphicsConfiguration graphicsConfiguration = dragGestureEvent.getComponent().getGraphicsConfiguration();
                        dragGestureEvent.startDrag(cursor, this.a(graphicsConfiguration, icon2), this.t, transferable, this);
                    } else {
                        if (icon2 != null) {
                            Point point3 = this.r.getLocationOnScreen();
                            point3.translate(point2.x, point2.y);
                            Point point4 = new Point(-this.t.x, -this.t.y);
                            this.s = new d(this.r, icon2, this.a(point3), point4);
                            this.s.a(this.v);
                        }
                        dragGestureEvent.startDrag(cursor, transferable, this);
                    }
                    this.c(dragGestureEvent);
                    this.x = false;
                    dragGestureEvent.getDragSource().addDragSourceMotionListener(this);
                    o = transferable;
                }
                catch (InvalidDnDOperationException invalidDnDOperationException) {
                    if (this.s == null) break block7;
                    this.s.a();
                    this.s = null;
                }
            }
        }
    }

    protected Icon a(Icon icon, Point point) {
        return icon;
    }

    protected Image a(GraphicsConfiguration graphicsConfiguration, Icon icon) {
        int n2 = icon.getIconWidth();
        int n3 = icon.getIconHeight();
        BufferedImage bufferedImage = graphicsConfiguration.createCompatibleImage(n2, n3, 3);
        Graphics2D graphics2D = (Graphics2D)bufferedImage.getGraphics();
        graphics2D.setComposite(AlphaComposite.Clear);
        graphics2D.fillRect(0, 0, n2, n3);
        graphics2D.setComposite(AlphaComposite.getInstance(2, this.v));
        icon.paintIcon(this.r, graphics2D, 0, 0);
        graphics2D.dispose();
        return bufferedImage;
    }

    private int e(int n2) {
        if ((n2 & 2) != 0 && n2 != 2) {
            return 2;
        }
        if ((n2 & 1) != 0 && n2 != 1) {
            return 1;
        }
        return n2;
    }

    protected Cursor b(int n2) {
        switch (n2) {
            case 2: {
                return DragSource.DefaultMoveDrop;
            }
            case 1: {
                return DragSource.DefaultCopyDrop;
            }
            case 0x40000000: {
                return DragSource.DefaultLinkDrop;
            }
        }
        return DragSource.DefaultMoveNoDrop;
    }

    protected int c(int n2) {
        return this.e(this.p & n2);
    }

    protected int a(DragSourceEvent dragSourceEvent) {
        if (dragSourceEvent instanceof DragSourceDragEvent) {
            DragSourceDragEvent dragSourceDragEvent = (DragSourceDragEvent)dragSourceEvent;
            return dragSourceDragEvent.getDropAction();
        }
        if (dragSourceEvent instanceof DragSourceDropEvent) {
            return ((DragSourceDropEvent)dragSourceEvent).getDropAction();
        }
        return 0;
    }

    protected int b(DragSourceEvent dragSourceEvent) {
        int n2 = this.a(dragSourceEvent);
        if (dragSourceEvent instanceof DragSourceDragEvent) {
            int n3;
            DragSourceDragEvent dragSourceDragEvent = (DragSourceDragEvent)dragSourceEvent;
            if (n2 == 0 && (n3 = dragSourceDragEvent.getGestureModifiersEx() & 0x23C0) == 0) {
                n2 = this.c(dragSourceDragEvent.getTargetActions());
            }
        }
        return n2;
    }

    protected void c(DragSourceEvent dragSourceEvent) {
        if (!this.q) {
            return;
        }
        Cursor cursor = this.b(this.b(dragSourceEvent));
        dragSourceEvent.getDragSourceContext().setCursor(cursor);
    }

    static String d(int n2) {
        switch (n2) {
            case 2: {
                return "MOVE";
            }
            case 3: {
                return "MOVE|COPY";
            }
            case 0x40000002: {
                return "MOVE|LINK";
            }
            case 0x40000003: {
                return "MOVE|COPY|LINK";
            }
            case 1: {
                return "COPY";
            }
            case 0x40000001: {
                return "COPY|LINK";
            }
            case 0x40000000: {
                return "LINK";
            }
        }
        return "NONE";
    }

    private void a(String string, DragSourceEvent dragSourceEvent) {
    }

    public void dragDropEnd(DragSourceDropEvent dragSourceDropEvent) {
        this.a("end", dragSourceDropEvent);
        this.a(-1);
        o = d;
        if (this.s != null) {
            if (dragSourceDropEvent.getDropSuccess()) {
                this.s.a();
            } else {
                this.s.b();
            }
            this.s = null;
        }
        DragSource dragSource = dragSourceDropEvent.getDragSourceContext().getDragSource();
        dragSource.removeDragSourceMotionListener(this);
        this.x = false;
    }

    private Point a(Point point) {
        point.translate(this.t.x, this.t.y);
        return point;
    }

    public void dragEnter(DragSourceDragEvent dragSourceDragEvent) {
        this.a("enter", dragSourceDragEvent);
        if (this.s != null) {
            this.s.a(this.a(dragSourceDragEvent.getLocation()));
        }
        this.c(dragSourceDragEvent);
    }

    public void dragMouseMoved(DragSourceDragEvent dragSourceDragEvent) {
        this.a("move", dragSourceDragEvent);
        if (this.s != null) {
            this.s.a(this.a(dragSourceDragEvent.getLocation()));
        }
        if (this.x) {
            this.c(dragSourceDragEvent);
        }
        this.x = true;
    }

    public void dragOver(DragSourceDragEvent dragSourceDragEvent) {
        this.a("over", dragSourceDragEvent);
        if (this.s != null) {
            this.s.a(this.a(dragSourceDragEvent.getLocation()));
        }
        this.c(dragSourceDragEvent);
    }

    public void dragExit(DragSourceEvent dragSourceEvent) {
        this.a("exit", dragSourceEvent);
    }

    public void dropActionChanged(DragSourceDragEvent dragSourceDragEvent) {
        this.a("change", dragSourceDragEvent);
        this.a(dragSourceDragEvent.getGestureModifiersEx() & 0x23C0);
        if (this.s != null) {
            this.s.a(this.a(dragSourceDragEvent.getLocation()));
        }
        this.c(dragSourceDragEvent);
    }
}

