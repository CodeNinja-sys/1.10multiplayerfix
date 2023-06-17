/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.a;

import com.sun.jna.a.al;
import com.sun.jna.a.c.a;
import com.sun.jna.a.c.ar;
import com.sun.jna.a.c.bw;
import com.sun.jna.a.c.f;
import com.sun.jna.a.c.g;
import com.sun.jna.a.c.i;
import com.sun.jna.a.c.o;
import com.sun.jna.ac;
import com.sun.jna.at;
import java.awt.Container;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Window;
import java.awt.image.BufferedImage;
import java.awt.image.Raster;
import javax.swing.SwingUtilities;

class as
extends com.sun.jna.a.ac {
    private static final long c = 1L;
    private ac d;
    private int[] e;
    private final int[] f;
    final /* synthetic */ al b;

    public as(al al2, Container container) {
        this.b = al2;
        super(al2, container);
        this.f = new int[4];
    }

    protected void a(BufferedImage bufferedImage, Rectangle rectangle) {
        Window window = SwingUtilities.getWindowAncestor(this);
        a a2 = com.sun.jna.a.c.a.g;
        f f2 = a2.a((String)null);
        o o2 = al.b(window);
        Point point = new Point();
        o2 = al.a(window, f2, o2, point);
        i i2 = a2.a(f2, (g)o2, new at(0L), null);
        Raster raster = bufferedImage.getData();
        int n2 = rectangle.width;
        int n3 = rectangle.height;
        if (this.d == null || this.d.g() != (long)(n2 * n3 * 4)) {
            this.d = new ac(n2 * n3 * 4);
            this.e = new int[n2 * n3];
        }
        for (int i3 = 0; i3 < n3; ++i3) {
            for (int i4 = 0; i4 < n2; ++i4) {
                raster.getPixel(i4, i3, this.f);
                int n4 = this.f[3] & 0xFF;
                int n5 = this.f[2] & 0xFF;
                int n6 = this.f[1] & 0xFF;
                int n7 = this.f[0] & 0xFF;
                this.e[i3 * n2 + i4] = n4 << 24 | n7 << 16 | n6 << 8 | n5;
            }
        }
        bw bw2 = new bw();
        a2.a(f2, o2, bw2);
        ar ar2 = a2.a(f2, bw2.I, 32, 2, 0, this.d, n2, n3, 32, n2 * 4);
        this.d.b(0L, this.e, 0, this.e.length);
        point.x += rectangle.x;
        point.y += rectangle.y;
        a2.a(f2, (g)o2, i2, ar2, 0, 0, point.x, point.y, n2, n3);
        a2.a(ar2.c());
        a2.a(f2, i2);
        a2.f(f2);
    }
}

