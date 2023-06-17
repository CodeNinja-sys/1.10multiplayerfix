/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.a;

import com.sun.jna.a.ac;
import com.sun.jna.a.af;
import com.sun.jna.a.d.di;
import com.sun.jna.a.d.eu;
import com.sun.jna.a.d.ew;
import com.sun.jna.a.d.fg;
import com.sun.jna.a.d.fr;
import com.sun.jna.a.d.gf;
import com.sun.jna.a.d.hm;
import com.sun.jna.a.d.id;
import com.sun.jna.a.d.ie;
import com.sun.jna.a.d.y;
import com.sun.jna.ay;
import com.sun.jna.b.b;
import com.sun.jna.b.e;
import com.sun.jna.b.h;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Window;
import java.awt.image.BufferedImage;
import java.awt.image.Raster;
import javax.swing.SwingUtilities;

class ak
extends ac {
    private static final long c = 1L;
    private ew d;
    private eu e;
    private ay f;
    private Dimension g;
    final /* synthetic */ af b;

    public ak(af af2, Container container) {
        this.b = af2;
        super(af2, container);
    }

    private void a() {
        y y2 = y.g;
        if (this.e != null) {
            y2.a(this.e);
            this.e = null;
        }
        if (this.d != null) {
            y2.b(this.d);
            this.d = null;
        }
    }

    public void removeNotify() {
        super.removeNotify();
        this.a();
    }

    public void a(boolean bl2) {
        super.a(bl2);
        if (!bl2) {
            this.a();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected void a(BufferedImage bufferedImage, Rectangle rectangle) {
        Window window = SwingUtilities.getWindowAncestor(this);
        y y2 = y.g;
        di di2 = di.g;
        int n2 = rectangle.x;
        int n3 = rectangle.y;
        Point point = SwingUtilities.convertPoint(this, n2, n3, window);
        int n4 = rectangle.width;
        int n5 = rectangle.height;
        int n6 = window.getWidth();
        int n7 = window.getHeight();
        ew ew2 = di2.a((fg)null);
        gf gf2 = null;
        try {
            Object object;
            Object object2;
            if (this.d == null) {
                this.d = y2.a(ew2);
            }
            if (this.e == null || !window.getSize().equals(this.g)) {
                if (this.e != null) {
                    y2.a(this.e);
                    this.e = null;
                }
                object2 = new fr();
                object2.a.b = n6;
                object2.a.c = n7;
                object2.a.F = 1;
                object2.a.G = (short)32;
                object2.a.H = 0;
                object2.a.I = n6 * n7 * 4;
                object = new h();
                this.e = y2.a(this.d, (fr)object2, 0, (h)object, null, 0);
                this.f = ((h)object).d();
                this.g = new Dimension(n6, n7);
            }
            gf2 = y2.a(this.d, this.e);
            object2 = bufferedImage.getData();
            object = new int[4];
            int[] arrn = new int[n4];
            for (int i2 = 0; i2 < n5; ++i2) {
                int n8;
                for (n8 = 0; n8 < n4; ++n8) {
                    ((Raster)object2).getPixel(n8, i2, (int[])object);
                    int n9 = (object[3] & 0xFF) << 24;
                    int n10 = object[2] & 0xFF;
                    int n11 = (object[1] & 0xFF) << 8;
                    int n12 = (object[0] & 0xFF) << 16;
                    arrn[n8] = n9 | n10 | n11 | n12;
                }
                n8 = n7 - (point.y + i2) - 1;
                this.f.b((long)((n8 * n6 + point.x) * 4), arrn, 0, arrn.length);
            }
            ie ie2 = new ie();
            ie2.a = window.getWidth();
            ie2.b = window.getHeight();
            id id2 = new id();
            id2.a = window.getX();
            id2.b = window.getY();
            id id3 = new id();
            hm hm2 = new hm();
            fg fg2 = af.a(this.b, (Component)window);
            b b2 = new b();
            e e2 = new e();
            byte by2 = af.b(this.b, window);
            try {
                if (di2.a(fg2, null, b2, e2) && (e2.d() & 2) != 0) {
                    by2 = b2.d();
                }
            }
            catch (UnsatisfiedLinkError unsatisfiedLinkError) {
                // empty catch block
            }
            hm2.c = by2;
            hm2.F = 1;
            di2.a(fg2, ew2, id2, ie2, this.d, id3, 0, hm2, 2);
            di2.a(null, ew2);
        }
        catch (Throwable throwable) {
            di2.a(null, ew2);
            if (this.d != null && gf2 != null) {
                y2.a(this.d, gf2);
            }
            throw throwable;
        }
        if (this.d != null && gf2 != null) {
            y2.a(this.d, gf2);
        }
    }
}

