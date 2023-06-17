/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.a;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.security.AccessController;
import java.util.HashMap;
import java.util.Map;
import org.lwjgl.BufferUtils;
import org.lwjgl.a.d;
import org.lwjgl.a.k;
import org.lwjgl.a.l;
import org.lwjgl.ab;
import org.lwjgl.c;
import org.lwjgl.opengl.dx;
import org.lwjgl.opengl.gc;

public class j {
    public static final int a = 22;
    private static boolean b;
    private static ByteBuffer c;
    private static int d;
    private static int e;
    private static int f;
    private static int g;
    private static IntBuffer h;
    private static int i;
    private static int j;
    private static int k;
    private static int l;
    private static boolean m;
    private static d n;
    private static String[] o;
    private static final Map p;
    private static boolean q;
    private static ByteBuffer r;
    private static int s;
    private static boolean t;
    private static int u;
    private static int v;
    private static int w;
    private static int x;
    private static int y;
    private static long z;
    private static int A;
    private static int B;
    private static int C;
    private static int D;
    private static final int E = 50;
    private static boolean F;
    private static gc G;
    private static final boolean H;
    private static boolean I;

    private j() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static d a() {
        Object object = org.lwjgl.a.l.a;
        synchronized (object) {
            return n;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static d a(d d2) {
        Object object = org.lwjgl.a.l.a;
        synchronized (object) {
            if ((org.lwjgl.a.d.c() & 1) == 0) {
                throw new IllegalStateException("Mouse doesn't support native cursors");
            }
            d d3 = n;
            n = d2;
            if (org.lwjgl.a.j.e()) {
                if (n != null) {
                    G.a(n.d());
                    n.f();
                } else {
                    G.a((Object)null);
                }
            }
            return d3;
        }
    }

    public static boolean b() {
        return I;
    }

    public static void a(boolean bl2) {
        I = bl2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void a(int n2, int n3) {
        Object object = org.lwjgl.a.l.a;
        synchronized (object) {
            if (!org.lwjgl.a.j.e()) {
                throw new IllegalStateException("Mouse is not created");
            }
            d = x = n2;
            e = y = n3;
            if (!org.lwjgl.a.j.x() && (org.lwjgl.a.d.c() & 1) != 0) {
                G.a(d, e);
            } else {
                A = n2;
                B = n3;
            }
        }
    }

    private static void A() {
        ab.b();
        o = new String[16];
        for (int i2 = 0; i2 < 16; ++i2) {
            org.lwjgl.a.j.o[i2] = "BUTTON" + i2;
            p.put(o[i2], i2);
        }
        q = true;
    }

    private static void B() {
        k = 0;
        j = 0;
        i = 0;
        r.position(r.limit());
    }

    static gc c() {
        return G;
    }

    private static void a(gc gc2) {
        if (b) {
            return;
        }
        if (!q) {
            org.lwjgl.a.j.A();
        }
        G = gc2;
        G.u();
        m = G.s();
        b = true;
        l = G.t();
        c = BufferUtils.a(l);
        h = BufferUtils.d(3);
        if (n != null && G.w() != 0) {
            org.lwjgl.a.j.a(n);
        }
        r = ByteBuffer.allocate(1100);
        r.limit(0);
        org.lwjgl.a.j.b(F);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void d() {
        Object object = org.lwjgl.a.l.a;
        synchronized (object) {
            if (!dx.v()) {
                throw new IllegalStateException("Display must be created.");
            }
            org.lwjgl.a.j.a(org.lwjgl.a.l.a());
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static boolean e() {
        Object object = org.lwjgl.a.l.a;
        synchronized (object) {
            return b;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void f() {
        Object object = org.lwjgl.a.l.a;
        synchronized (object) {
            if (!b) {
                return;
            }
            b = false;
            c = null;
            h = null;
            G.v();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void g() {
        Object object = org.lwjgl.a.l.a;
        synchronized (object) {
            if (!b) {
                throw new IllegalStateException("Mouse must be created before you can poll it");
            }
            G.a(h, c);
            int n2 = h.get(0);
            int n3 = h.get(1);
            int n4 = h.get(2);
            if (org.lwjgl.a.j.x()) {
                i += n2;
                j += n3;
                d += n2;
                e += n3;
                f += n2;
                g += n3;
            } else {
                i = n2 - f;
                j = n3 - g;
                f = d = n2;
                g = e = n3;
            }
            if (I) {
                d = Math.min(dx.C() - 1, Math.max(0, d));
                e = Math.min(dx.D() - 1, Math.max(0, e));
            }
            k += n4;
            org.lwjgl.a.j.C();
        }
    }

    private static void C() {
        r.compact();
        G.a(r);
        r.flip();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static boolean a(int n2) {
        Object object = org.lwjgl.a.l.a;
        synchronized (object) {
            if (!b) {
                throw new IllegalStateException("Mouse must be created before you can poll the button state");
            }
            if (n2 >= l || n2 < 0) {
                return false;
            }
            return c.get(n2) == 1;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static String b(int n2) {
        Object object = org.lwjgl.a.l.a;
        synchronized (object) {
            if (n2 >= o.length || n2 < 0) {
                return null;
            }
            return o[n2];
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static int a(String string) {
        Object object = org.lwjgl.a.l.a;
        synchronized (object) {
            Integer n2 = (Integer)p.get(string);
            if (n2 == null) {
                return -1;
            }
            return n2;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static boolean h() {
        Object object = org.lwjgl.a.l.a;
        synchronized (object) {
            if (!b) {
                throw new IllegalStateException("Mouse must be created before you can read events");
            }
            if (r.hasRemaining()) {
                s = r.get();
                boolean bl2 = t = r.get() != 0;
                if (org.lwjgl.a.j.x()) {
                    u = r.getInt();
                    v = r.getInt();
                    C = x += u;
                    D = y += v;
                } else {
                    int n2 = r.getInt();
                    int n3 = r.getInt();
                    u = n2 - C;
                    v = n3 - D;
                    x = n2;
                    y = n3;
                    C = n2;
                    D = n3;
                }
                if (I) {
                    x = Math.min(dx.C() - 1, Math.max(0, x));
                    y = Math.min(dx.D() - 1, Math.max(0, y));
                }
                w = r.getInt();
                z = r.getLong();
                return true;
            }
            return false;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static int i() {
        Object object = org.lwjgl.a.l.a;
        synchronized (object) {
            return s;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static boolean j() {
        Object object = org.lwjgl.a.l.a;
        synchronized (object) {
            return t;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static int k() {
        Object object = org.lwjgl.a.l.a;
        synchronized (object) {
            return u;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static int l() {
        Object object = org.lwjgl.a.l.a;
        synchronized (object) {
            return v;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static int m() {
        Object object = org.lwjgl.a.l.a;
        synchronized (object) {
            return x;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static int n() {
        Object object = org.lwjgl.a.l.a;
        synchronized (object) {
            return y;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static int o() {
        Object object = org.lwjgl.a.l.a;
        synchronized (object) {
            return w;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static long p() {
        Object object = org.lwjgl.a.l.a;
        synchronized (object) {
            return z;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static int q() {
        Object object = org.lwjgl.a.l.a;
        synchronized (object) {
            return d;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static int r() {
        Object object = org.lwjgl.a.l.a;
        synchronized (object) {
            return e;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static int s() {
        Object object = org.lwjgl.a.l.a;
        synchronized (object) {
            int n2 = i;
            i = 0;
            return n2;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static int t() {
        Object object = org.lwjgl.a.l.a;
        synchronized (object) {
            int n2 = j;
            j = 0;
            return n2;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static int u() {
        Object object = org.lwjgl.a.l.a;
        synchronized (object) {
            int n2 = k;
            k = 0;
            return n2;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static int v() {
        Object object = org.lwjgl.a.l.a;
        synchronized (object) {
            return l;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static boolean w() {
        Object object = org.lwjgl.a.l.a;
        synchronized (object) {
            return m;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static boolean x() {
        Object object = org.lwjgl.a.l.a;
        synchronized (object) {
            return F;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void b(boolean bl2) {
        Object object = org.lwjgl.a.l.a;
        synchronized (object) {
            boolean bl3 = F;
            F = bl2;
            if (org.lwjgl.a.j.e()) {
                if (bl2 && !bl3) {
                    A = d;
                    B = e;
                } else if (!bl2 && bl3 && (org.lwjgl.a.d.c() & 1) != 0) {
                    G.a(A, B);
                }
                G.b(bl2);
                org.lwjgl.a.j.g();
                x = d;
                y = e;
                C = d;
                D = e;
                org.lwjgl.a.j.B();
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void y() {
        Object object = org.lwjgl.a.l.a;
        synchronized (object) {
            block6: {
                if (H && n != null && n.g() && org.lwjgl.a.j.z()) {
                    n.h();
                    try {
                        org.lwjgl.a.j.a(n);
                    }
                    catch (c c2) {
                        if (!org.lwjgl.d.i) break block6;
                        c2.printStackTrace();
                    }
                }
            }
        }
    }

    static boolean b(String string) {
        Boolean bl2 = (Boolean)AccessController.doPrivileged(new k(string));
        return bl2;
    }

    public static boolean z() {
        return G.B();
    }

    static {
        l = -1;
        p = new HashMap(16);
        H = org.lwjgl.d.a() == 3 || org.lwjgl.d.a() == 2;
        I = !org.lwjgl.a.j.b("org.lwjgl.input.Mouse.allowNegativeMouseCoords");
    }
}

