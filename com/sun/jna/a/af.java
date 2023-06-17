/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.a;

import com.sun.jna.Native;
import com.sun.jna.a.ag;
import com.sun.jna.a.ah;
import com.sun.jna.a.ai;
import com.sun.jna.a.aj;
import com.sun.jna.a.d.fe;
import com.sun.jna.a.d.fg;
import com.sun.jna.a.d.id;
import com.sun.jna.a.d.y;
import com.sun.jna.a.o;
import com.sun.jna.a.s;
import java.awt.Component;
import java.awt.Shape;
import java.awt.Window;
import java.awt.geom.Area;
import java.awt.geom.PathIterator;
import java.awt.image.Raster;
import java.util.ArrayList;
import javax.swing.JRootPane;
import javax.swing.RootPaneContainer;

class af
extends com.sun.jna.a.y {
    private af() {
    }

    private fg b(Component component) {
        fg fg2 = new fg();
        fg2.a(Native.b(component));
        return fg2;
    }

    public boolean a() {
        return Boolean.getBoolean("sun.java2d.noddraw");
    }

    private boolean a(Window window) {
        if (window instanceof RootPaneContainer) {
            JRootPane jRootPane = ((RootPaneContainer)((Object)window)).getRootPane();
            return jRootPane.getClientProperty("transparent-old-bg") != null;
        }
        return false;
    }

    private void a(Window window, byte by2) {
        if (window instanceof RootPaneContainer) {
            JRootPane jRootPane = ((RootPaneContainer)((Object)window)).getRootPane();
            Byte by3 = by2 == -1 ? null : new Byte(by2);
            jRootPane.putClientProperty("transparent-alpha", by3);
        }
    }

    private byte b(Window window) {
        JRootPane jRootPane;
        Byte by2;
        if (window instanceof RootPaneContainer && (by2 = (Byte)(jRootPane = ((RootPaneContainer)((Object)window)).getRootPane()).getClientProperty("transparent-alpha")) != null) {
            return by2;
        }
        return -1;
    }

    public void a(Window window, float f2) {
        if (!this.a()) {
            throw new UnsupportedOperationException("Set sun.java2d.noddraw=true to enable transparent windows");
        }
        this.a((Component)window, new ag(this, window, f2));
    }

    public void a(Window window, boolean bl2) {
        boolean bl3;
        if (!(window instanceof RootPaneContainer)) {
            throw new IllegalArgumentException("Window must be a RootPaneContainer");
        }
        if (!this.a()) {
            throw new UnsupportedOperationException("Set sun.java2d.noddraw=true to enable transparent windows");
        }
        boolean bl4 = bl3 = window.getBackground() != null && window.getBackground().getAlpha() == 0;
        if (bl2 == bl3) {
            return;
        }
        this.a((Component)window, new ah(this, window, bl2));
    }

    public void a(Component component, Shape shape) {
        if (shape instanceof Area && ((Area)shape).isPolygonal()) {
            this.a(component, (Area)shape);
        } else {
            super.a(component, shape);
        }
    }

    private void a(Component component, fe fe2) {
        this.a(component, new ai(this, component, fe2));
    }

    private void a(Component component, Area area) {
        y y2 = y.g;
        PathIterator pathIterator = area.getPathIterator(null);
        int n2 = pathIterator.getWindingRule() == 1 ? 2 : 1;
        float[] arrf = new float[6];
        ArrayList<id> arrayList = new ArrayList<id>();
        int n3 = 0;
        ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
        while (!pathIterator.isDone()) {
            int n4 = pathIterator.currentSegment(arrf);
            if (n4 == 0) {
                n3 = 1;
                arrayList.add(new id((int)arrf[0], (int)arrf[1]));
            } else if (n4 == 1) {
                ++n3;
                arrayList.add(new id((int)arrf[0], (int)arrf[1]));
            } else if (n4 == 4) {
                arrayList2.add(new Integer(n3));
            } else {
                throw new RuntimeException("Area is not polygonal: " + area);
            }
            pathIterator.next();
        }
        id[] arrid = (id[])new id().e(arrayList.size());
        id[] arrid2 = arrayList.toArray(new id[arrayList.size()]);
        for (int i2 = 0; i2 < arrid.length; ++i2) {
            arrid[i2].a = arrid2[i2].a;
            arrid[i2].b = arrid2[i2].b;
        }
        int[] arrn = new int[arrayList2.size()];
        for (int i3 = 0; i3 < arrn.length; ++i3) {
            arrn[i3] = (Integer)arrayList2.get(i3);
        }
        fe fe2 = y2.a(arrid, arrn, arrn.length, n2);
        this.a(component, fe2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected void b(Component component, Raster raster) {
        fe fe2;
        y y2 = y.g;
        fe fe3 = fe2 = raster != null ? y2.a(0, 0, 0, 0) : null;
        if (fe2 != null) {
            fe fe4 = y2.a(0, 0, 0, 0);
            try {
                o.a(raster, new aj(this, fe4, fe2));
            }
            finally {
                y2.a(fe4);
            }
        }
        this.a(component, fe2);
    }

    /* synthetic */ af(s s2) {
        this();
    }

    static /* synthetic */ fg a(af af2, Component component) {
        return af2.b(component);
    }

    static /* synthetic */ boolean a(af af2, Window window) {
        return af2.a(window);
    }

    static /* synthetic */ void a(af af2, Window window, byte by2) {
        af2.a(window, by2);
    }

    static /* synthetic */ byte b(af af2, Window window) {
        return af2.b(window);
    }
}

