/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.a;

import java.nio.Buffer;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.a;
import org.lwjgl.a.e;
import org.lwjgl.a.j;
import org.lwjgl.a.l;
import org.lwjgl.ab;
import org.lwjgl.c;

public class d {
    public static final int a = 1;
    public static final int b = 2;
    public static final int c = 4;
    private final e[] d;
    private int e;
    private boolean f;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public d(int n2, int n3, int n4, int n5, int n6, IntBuffer intBuffer, IntBuffer intBuffer2) {
        Object object = l.a;
        synchronized (object) {
            if ((org.lwjgl.a.d.c() & 1) == 0) {
                throw new c("Native cursors not supported");
            }
            org.lwjgl.a.a((Buffer)intBuffer, n2 * n3 * n6);
            if (intBuffer2 != null) {
                org.lwjgl.a.a((Buffer)intBuffer2, n6);
            }
            if (!j.e()) {
                throw new IllegalStateException("Mouse must be created before creating cursor objects");
            }
            if (n2 * n3 * n6 > intBuffer.remaining()) {
                throw new IllegalArgumentException("width*height*numImages > images.remaining()");
            }
            if (n4 >= n2 || n4 < 0) {
                throw new IllegalArgumentException("xHotspot > width || xHotspot < 0");
            }
            if (n5 >= n3 || n5 < 0) {
                throw new IllegalArgumentException("yHotspot > height || yHotspot < 0");
            }
            ab.b();
            n5 = n3 - 1 - n5;
            this.d = org.lwjgl.a.d.a(n2, n3, n4, n5, n6, intBuffer, intBuffer2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static int a() {
        Object object = l.a;
        synchronized (object) {
            if (!j.e()) {
                throw new IllegalStateException("Mouse must be created.");
            }
            return j.c().x();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static int b() {
        Object object = l.a;
        synchronized (object) {
            if (!j.e()) {
                throw new IllegalStateException("Mouse must be created.");
            }
            return j.c().y();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static int c() {
        Object object = l.a;
        synchronized (object) {
            if (j.c() != null) {
                return j.c().w();
            }
            return l.a().w();
        }
    }

    private static e[] a(int n2, int n3, int n4, int n5, int n6, IntBuffer intBuffer, IntBuffer intBuffer2) {
        e[] arre;
        IntBuffer intBuffer3 = BufferUtils.d(intBuffer.remaining());
        org.lwjgl.a.d.a(n2, n3, n6, intBuffer, intBuffer3);
        switch (org.lwjgl.d.a()) {
            case 2: {
                org.lwjgl.a.d.a(intBuffer3);
                arre = new e[n6];
                for (int i2 = 0; i2 < n6; ++i2) {
                    Object object = j.c().a(n2, n3, n4, n5, 1, intBuffer3, null);
                    long l2 = intBuffer2 != null ? (long)intBuffer2.get(i2) : 0L;
                    long l3 = System.currentTimeMillis();
                    arre[i2] = new e(object, l2, l3);
                    intBuffer3.position(n2 * n3 * (i2 + 1));
                }
                break;
            }
            case 3: {
                arre = new e[n6];
                for (int i3 = 0; i3 < n6; ++i3) {
                    int n7 = n2 * n3;
                    for (int i4 = 0; i4 < n7; ++i4) {
                        int n8 = i4 + i3 * n7;
                        int n9 = intBuffer3.get(n8) >> 24 & 0xFF;
                        if (n9 == 255) continue;
                        intBuffer3.put(n8, 0);
                    }
                    Object object = j.c().a(n2, n3, n4, n5, 1, intBuffer3, null);
                    long l4 = intBuffer2 != null ? (long)intBuffer2.get(i3) : 0L;
                    long l5 = System.currentTimeMillis();
                    arre[i3] = new e(object, l4, l5);
                    intBuffer3.position(n2 * n3 * (i3 + 1));
                }
                break;
            }
            case 1: {
                Object object = j.c().a(n2, n3, n4, n5, n6, intBuffer3, intBuffer2);
                e e2 = new e(object, -1L, -1L);
                arre = new e[]{e2};
                break;
            }
            default: {
                throw new RuntimeException("Unknown OS");
            }
        }
        return arre;
    }

    private static void a(IntBuffer intBuffer) {
        for (int i2 = 0; i2 < intBuffer.limit(); ++i2) {
            int n2 = intBuffer.get(i2);
            byte by2 = (byte)(n2 >>> 24);
            byte by3 = (byte)(n2 >>> 16);
            byte by4 = (byte)(n2 >>> 8);
            byte by5 = (byte)n2;
            int n3 = ((by2 & 0xFF) << 24) + ((by5 & 0xFF) << 16) + ((by4 & 0xFF) << 8) + (by3 & 0xFF);
            intBuffer.put(i2, n3);
        }
    }

    private static void a(int n2, int n3, int n4, IntBuffer intBuffer, IntBuffer intBuffer2) {
        for (int i2 = 0; i2 < n4; ++i2) {
            int n5 = i2 * n2 * n3;
            org.lwjgl.a.d.b(n2, n3, n5, intBuffer, intBuffer2);
        }
    }

    private static void b(int n2, int n3, int n4, IntBuffer intBuffer, IntBuffer intBuffer2) {
        for (int i2 = 0; i2 < n3 >> 1; ++i2) {
            int n5 = i2 * n2 + n4;
            int n6 = (n3 - i2 - 1) * n2 + n4;
            for (int i3 = 0; i3 < n2; ++i3) {
                int n7 = n5 + i3;
                int n8 = n6 + i3;
                int n9 = intBuffer.get(n7 + intBuffer.position());
                intBuffer2.put(n7, intBuffer.get(n8 + intBuffer.position()));
                intBuffer2.put(n8, n9);
            }
        }
    }

    Object d() {
        this.i();
        return this.d[this.e].a;
    }

    private void i() {
        if (this.f) {
            throw new IllegalStateException("The cursor is destroyed");
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void e() {
        Object object = l.a;
        synchronized (object) {
            if (this.f) {
                return;
            }
            if (j.a() == this) {
                try {
                    j.a(null);
                }
                catch (c c2) {
                    // empty catch block
                }
            }
            for (e e2 : this.d) {
                j.c().b(e2.a);
            }
            this.f = true;
        }
    }

    protected void f() {
        this.i();
        this.d[this.e].c = System.currentTimeMillis() + this.d[this.e].b;
    }

    protected boolean g() {
        this.i();
        return this.d.length > 1 && this.d[this.e].c < System.currentTimeMillis();
    }

    protected void h() {
        this.i();
        ++this.e;
        this.e %= this.d.length;
    }
}

