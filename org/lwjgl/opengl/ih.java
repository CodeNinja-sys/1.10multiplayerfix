/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.IntBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.ab;
import org.lwjgl.opengl.PixelFormat;
import org.lwjgl.opengl.dr;
import org.lwjgl.opengl.ds;
import org.lwjgl.opengl.du;
import org.lwjgl.opengl.dx;
import org.lwjgl.opengl.eh;
import org.lwjgl.opengl.ei;
import org.lwjgl.opengl.ek;
import org.lwjgl.opengl.ii;
import org.lwjgl.opengl.im;

public final class ih
extends ei {
    public static final int d = 1;
    public static final int e = 2;
    public static final int f = 4;
    public static final int g = 8;
    public static final int h = 8315;
    public static final int i = 8316;
    public static final int j = 8317;
    public static final int k = 8318;
    public static final int l = 8319;
    public static final int m = 8320;
    public static final int n = 8321;
    public static final int o = 8322;
    public static final int p = 8323;
    public static final int q = 8324;
    public static final int r = 8325;
    public static final int s = 8326;
    public static final int t = 8359;
    private final int u;
    private final int v;

    public ih(int n2, int n3, PixelFormat pixelFormat, eh eh2) {
        this(n2, n3, pixelFormat, null, eh2);
    }

    public ih(int n2, int n3, PixelFormat pixelFormat, im im2, eh eh2) {
        this(n2, n3, pixelFormat, im2, eh2, null);
    }

    public ih(int n2, int n3, PixelFormat pixelFormat, im im2, eh eh2, ds ds2) {
        if (pixelFormat == null) {
            throw new NullPointerException("Pixel format must be non-null");
        }
        this.u = n2;
        this.v = n3;
        this.b = ih.a(n2, n3, pixelFormat, ds2, im2);
        dr dr2 = null;
        if (eh2 == null) {
            eh2 = dx.a();
        }
        if (eh2 != null) {
            dr2 = ((ek)eh2).n();
        }
        this.c = new du(this.b, ds2, (du)dr2);
    }

    private static ii a(int n2, int n3, PixelFormat pixelFormat, ds ds2, im im2) {
        if (im2 == null) {
            IntBuffer intBuffer = BufferUtils.d(1);
            return dx.t().a(n2, n3, pixelFormat, ds2, null, intBuffer);
        }
        return dx.t().a(n2, n3, pixelFormat, ds2, im2.r, im2.s);
    }

    public synchronized boolean k() {
        this.d();
        return dx.t().a(this.b);
    }

    public static int l() {
        return dx.t().l();
    }

    public synchronized void a(int n2, int n3) {
        this.d();
        dx.t().a(this.b, n2, n3);
    }

    public synchronized void b(int n2) {
        this.d();
        dx.t().a(this.b, n2);
    }

    public synchronized void c(int n2) {
        this.d();
        dx.t().b(this.b, n2);
    }

    public synchronized int o() {
        this.d();
        return this.v;
    }

    public synchronized int p() {
        this.d();
        return this.u;
    }

    static {
        ab.b();
    }
}

