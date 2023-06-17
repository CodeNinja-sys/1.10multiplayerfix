/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.a;

import com.sun.jna.Native;
import com.sun.jna.a.am;
import com.sun.jna.a.an;
import com.sun.jna.a.ao;
import com.sun.jna.a.ap;
import com.sun.jna.a.aq;
import com.sun.jna.a.ar;
import com.sun.jna.a.c.a;
import com.sun.jna.a.c.bh;
import com.sun.jna.a.c.bu;
import com.sun.jna.a.c.bw;
import com.sun.jna.a.c.bz;
import com.sun.jna.a.c.cc;
import com.sun.jna.a.c.f;
import com.sun.jna.a.c.g;
import com.sun.jna.a.c.i;
import com.sun.jna.a.c.k;
import com.sun.jna.a.c.n;
import com.sun.jna.a.c.o;
import com.sun.jna.a.c.p;
import com.sun.jna.a.s;
import com.sun.jna.a.y;
import com.sun.jna.at;
import com.sun.jna.ay;
import com.sun.jna.b.e;
import com.sun.jna.b.h;
import com.sun.jna.bd;
import java.awt.Component;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Window;
import java.awt.image.Raster;
import java.util.ArrayList;
import javax.swing.RootPaneContainer;

class al
extends y {
    private boolean a;
    private long[] b = new long[0];
    private static final long c = 0xFFFFFFFFL;
    private static final String d = "_NET_WM_WINDOW_OPACITY";

    private al() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static k b(f f2, o o2, Raster raster) {
        a a2 = com.sun.jna.a.c.a.g;
        Rectangle rectangle = raster.getBounds();
        int n2 = rectangle.x + rectangle.width;
        int n3 = rectangle.y + rectangle.height;
        k k2 = a2.a(f2, (g)o2, n2, n3, 1);
        i i2 = a2.a(f2, k2, new at(0L), null);
        if (i2 == null) {
            return null;
        }
        a2.a(f2, i2, new at(0L));
        a2.a(f2, (g)k2, i2, 0, 0, n2, n3);
        ArrayList arrayList = new ArrayList();
        try {
            int n4;
            com.sun.jna.a.o.a(raster, new am(arrayList));
            bh[] arrbh = (bh[])new bh().e(arrayList.size());
            for (n4 = 0; n4 < arrbh.length; ++n4) {
                Rectangle rectangle2 = (Rectangle)arrayList.get(n4);
                arrbh[n4].a = (short)rectangle2.x;
                arrbh[n4].b = (short)rectangle2.y;
                arrbh[n4].c = (short)rectangle2.width;
                arrbh[n4].F = (short)rectangle2.height;
                ay ay2 = arrbh[n4].g();
                ay2.a(0L, (short)rectangle2.x);
                ay2.a(2L, (short)rectangle2.y);
                ay2.a(4L, (short)rectangle2.width);
                ay2.a(6L, (short)rectangle2.height);
                arrbh[n4].c(false);
            }
            n4 = 1;
            a2.a(f2, i2, new at(1L));
            a2.a(f2, (g)k2, i2, arrbh, arrbh.length);
        }
        finally {
            a2.a(f2, i2);
        }
        return k2;
    }

    public boolean a() {
        return this.c().length > 0;
    }

    private static long a(GraphicsConfiguration graphicsConfiguration) {
        try {
            Object object = graphicsConfiguration.getClass().getMethod("getVisual", null).invoke(graphicsConfiguration, null);
            return ((Number)object).longValue();
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return -1L;
        }
    }

    public GraphicsConfiguration b() {
        if (this.a()) {
            GraphicsEnvironment graphicsEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();
            GraphicsDevice[] arrgraphicsDevice = graphicsEnvironment.getScreenDevices();
            for (int i2 = 0; i2 < arrgraphicsDevice.length; ++i2) {
                GraphicsConfiguration[] arrgraphicsConfiguration = arrgraphicsDevice[i2].getConfigurations();
                for (int i3 = 0; i3 < arrgraphicsConfiguration.length; ++i3) {
                    long l2 = al.a(arrgraphicsConfiguration[i3]);
                    long[] arrl = this.c();
                    for (int i4 = 0; i4 < arrl.length; ++i4) {
                        if (l2 != arrl[i4]) continue;
                        return arrgraphicsConfiguration[i3];
                    }
                }
            }
        }
        return super.b();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private synchronized long[] c() {
        if (this.a) {
            return this.b;
        }
        this.a = true;
        a a2 = com.sun.jna.a.c.a.g;
        f f2 = a2.a((String)null);
        if (f2 == null) {
            return this.b;
        }
        bd bd2 = null;
        try {
            int n2 = a2.a(f2);
            bu bu2 = new bu();
            bu2.c = n2;
            bu2.F = 32;
            bu2.G = 4;
            at at2 = new at(14L);
            e e2 = new e();
            bd2 = a2.a(f2, at2, bu2, e2);
            if (bd2 != null) {
                int n3;
                ArrayList<n> arrayList = new ArrayList<n>();
                bu[] arrbu = (bu[])bd2.e(e2.d());
                for (n3 = 0; n3 < arrbu.length; ++n3) {
                    cc cc2 = bz.g.a(f2, arrbu[n3].a);
                    if (cc2.b != 1 || cc2.F.J == 0) continue;
                    arrayList.add(arrbu[n3].b);
                }
                this.b = new long[arrayList.size()];
                for (n3 = 0; n3 < this.b.length; ++n3) {
                    this.b[n3] = ((Number)arrayList.get(n3)).longValue();
                }
                long[] arrl = this.b;
                return arrl;
            }
        }
        finally {
            if (bd2 != null) {
                a2.a(bd2.g());
            }
            a2.f(f2);
        }
        return this.b;
    }

    private static o b(Window window, f f2, o o2, Point point) {
        if (window instanceof Frame && !((Frame)window).isUndecorated() || window instanceof Dialog && !((Dialog)window).isUndecorated()) {
            int[] arrn;
            a a2 = com.sun.jna.a.c.a.g;
            p p2 = new p();
            p p3 = new p();
            h h2 = new h();
            e e2 = new e();
            a2.a(f2, o2, p2, p3, h2, e2);
            ay ay2 = h2.d();
            int[] arrn2 = arrn = ay2.e(0L, e2.d());
            int n2 = arrn2.length;
            int n3 = 0;
            if (n3 < n2) {
                int n4 = arrn2[n3];
                o o3 = new o((long)n4);
                bw bw2 = new bw();
                a2.a(f2, o3, bw2);
                point.x = -bw2.a;
                point.y = -bw2.b;
                o2 = o3;
            }
            if (ay2 != null) {
                a2.a(ay2);
            }
        }
        return o2;
    }

    private static o c(Component component) {
        int n2 = (int)Native.a(component);
        if (n2 == 0) {
            return null;
        }
        return new o((long)n2);
    }

    public void a(Window window, float f2) {
        if (!this.a()) {
            throw new UnsupportedOperationException("This X11 display does not provide a 32-bit visual");
        }
        an an2 = new an(this, window, f2);
        this.a((Component)window, an2);
    }

    public void a(Window window, boolean bl2) {
        boolean bl3;
        if (!(window instanceof RootPaneContainer)) {
            throw new IllegalArgumentException("Window must be a RootPaneContainer");
        }
        if (!this.a()) {
            throw new UnsupportedOperationException("This X11 display does not provide a 32-bit visual");
        }
        if (!window.getGraphicsConfiguration().equals(this.b())) {
            throw new IllegalArgumentException("Window GraphicsConfiguration '" + window.getGraphicsConfiguration() + "' does not support transparency");
        }
        boolean bl4 = bl3 = window.getBackground() != null && window.getBackground().getAlpha() == 0;
        if (bl2 == bl3) {
            return;
        }
        this.a((Component)window, new ao(this, window, bl2));
    }

    private void a(Window window, ar ar2) {
        ap ap2 = new ap(this, window, ar2);
        this.a((Component)window, ap2);
    }

    protected void b(Component component, Raster raster) {
        this.a(this.a(component), new aq(this, raster));
    }

    /* synthetic */ al(s s2) {
        this();
    }

    static /* synthetic */ o b(Component component) {
        return al.c(component);
    }

    static /* synthetic */ o a(Window window, f f2, o o2, Point point) {
        return al.b(window, f2, o2, point);
    }

    static /* synthetic */ k a(f f2, o o2, Raster raster) {
        return al.b(f2, o2, raster);
    }
}

