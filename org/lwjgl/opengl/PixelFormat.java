/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import org.lwjgl.opengl.ij;

public final class PixelFormat
implements ij {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;

    public PixelFormat() {
        this(0, 8, 0);
    }

    public PixelFormat(int n2, int n3, int n4) {
        this(n2, n3, n4, 0);
    }

    public PixelFormat(int n2, int n3, int n4, int n5) {
        this(0, n2, n3, n4, n5);
    }

    public PixelFormat(int n2, int n3, int n4, int n5, int n6) {
        this(n2, n3, n4, n5, n6, 0, 0, 0, false);
    }

    public PixelFormat(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, boolean bl2) {
        this(n2, n3, n4, n5, n6, n7, n8, n9, bl2, false);
    }

    public PixelFormat(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, boolean bl2, boolean bl3) {
        this.a = n2;
        this.b = n3;
        this.c = n4;
        this.d = n5;
        this.e = n6;
        this.g = n7;
        this.h = n8;
        this.i = n9;
        this.j = bl2;
        this.k = bl3;
        this.l = false;
        this.m = false;
    }

    private PixelFormat(PixelFormat pixelFormat) {
        this.a = pixelFormat.a;
        this.b = pixelFormat.b;
        this.c = pixelFormat.c;
        this.d = pixelFormat.d;
        this.e = pixelFormat.e;
        this.f = pixelFormat.f;
        this.g = pixelFormat.g;
        this.h = pixelFormat.h;
        this.i = pixelFormat.i;
        this.j = pixelFormat.j;
        this.k = pixelFormat.k;
        this.l = pixelFormat.l;
        this.m = pixelFormat.m;
    }

    public int a() {
        return this.a;
    }

    public PixelFormat a(int n2) {
        if (n2 < 0) {
            throw new IllegalArgumentException("Invalid number of bits per pixel specified: " + n2);
        }
        PixelFormat pixelFormat = new PixelFormat(this);
        pixelFormat.a = n2;
        return pixelFormat;
    }

    public int b() {
        return this.b;
    }

    public PixelFormat b(int n2) {
        if (n2 < 0) {
            throw new IllegalArgumentException("Invalid number of alpha bits specified: " + n2);
        }
        PixelFormat pixelFormat = new PixelFormat(this);
        pixelFormat.b = n2;
        return pixelFormat;
    }

    public int c() {
        return this.c;
    }

    public PixelFormat c(int n2) {
        if (n2 < 0) {
            throw new IllegalArgumentException("Invalid number of depth bits specified: " + n2);
        }
        PixelFormat pixelFormat = new PixelFormat(this);
        pixelFormat.c = n2;
        return pixelFormat;
    }

    public int d() {
        return this.d;
    }

    public PixelFormat d(int n2) {
        if (n2 < 0) {
            throw new IllegalArgumentException("Invalid number of stencil bits specified: " + n2);
        }
        PixelFormat pixelFormat = new PixelFormat(this);
        pixelFormat.d = n2;
        return pixelFormat;
    }

    public int e() {
        return this.e;
    }

    public PixelFormat e(int n2) {
        if (n2 < 0) {
            throw new IllegalArgumentException("Invalid number of samples specified: " + n2);
        }
        PixelFormat pixelFormat = new PixelFormat(this);
        pixelFormat.e = n2;
        return pixelFormat;
    }

    public PixelFormat f(int n2) {
        return this.a(n2, this.e);
    }

    public PixelFormat a(int n2, int n3) {
        if (n3 < 0 || n2 < 0 || n3 == 0 && 0 < n2 || n3 < n2) {
            throw new IllegalArgumentException("Invalid number of coverage samples specified: " + n3 + " - " + n2);
        }
        PixelFormat pixelFormat = new PixelFormat(this);
        pixelFormat.e = n3;
        pixelFormat.f = n2;
        return pixelFormat;
    }

    public int f() {
        return this.g;
    }

    public PixelFormat g(int n2) {
        if (n2 < 0) {
            throw new IllegalArgumentException("Invalid number of auxiliary buffers specified: " + n2);
        }
        PixelFormat pixelFormat = new PixelFormat(this);
        pixelFormat.g = n2;
        return pixelFormat;
    }

    public int g() {
        return this.h;
    }

    public PixelFormat h(int n2) {
        if (n2 < 0) {
            throw new IllegalArgumentException("Invalid number of bits per pixel in the accumulation buffer specified: " + n2);
        }
        PixelFormat pixelFormat = new PixelFormat(this);
        pixelFormat.h = n2;
        return pixelFormat;
    }

    public int h() {
        return this.i;
    }

    public PixelFormat i(int n2) {
        if (n2 < 0) {
            throw new IllegalArgumentException("Invalid number of alpha bits in the accumulation buffer specified: " + n2);
        }
        PixelFormat pixelFormat = new PixelFormat(this);
        pixelFormat.i = n2;
        return pixelFormat;
    }

    public boolean i() {
        return this.j;
    }

    public PixelFormat a(boolean bl2) {
        PixelFormat pixelFormat = new PixelFormat(this);
        pixelFormat.j = bl2;
        return pixelFormat;
    }

    public boolean j() {
        return this.k;
    }

    public PixelFormat b(boolean bl2) {
        PixelFormat pixelFormat = new PixelFormat(this);
        pixelFormat.k = bl2;
        if (bl2) {
            pixelFormat.l = false;
        }
        return pixelFormat;
    }

    public PixelFormat c(boolean bl2) {
        PixelFormat pixelFormat = new PixelFormat(this);
        pixelFormat.l = bl2;
        if (bl2) {
            pixelFormat.k = false;
        }
        return pixelFormat;
    }

    public boolean k() {
        return this.m;
    }

    public PixelFormat d(boolean bl2) {
        PixelFormat pixelFormat = new PixelFormat(this);
        pixelFormat.m = bl2;
        return pixelFormat;
    }
}

