/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a;

import io.netty.b.g;
import io.netty.c.a.d;
import io.netty.c.a.o;
import io.netty.c.a.y;
import io.netty.channel.bd;
import java.util.List;

public class i
extends d {
    private final g[] a;
    private final int c;
    private final boolean d;
    private final boolean e;
    private boolean f;
    private int h;
    private final o i;

    public i(int n2, g g2) {
        this(n2, true, g2);
    }

    public i(int n2, boolean bl2, g g2) {
        this(n2, bl2, true, g2);
    }

    public i(int n2, boolean bl2, boolean bl3, g g2) {
        this(n2, bl2, bl3, new g[]{g2.i(g2.p(), g2.r())});
    }

    public i(int n2, g ... arrg) {
        this(n2, true, arrg);
    }

    public i(int n2, boolean bl2, g ... arrg) {
        this(n2, bl2, true, arrg);
    }

    public i(int n2, boolean bl2, boolean bl3, g ... arrg) {
        io.netty.c.a.i.a(n2);
        if (arrg == null) {
            throw new NullPointerException("delimiters");
        }
        if (arrg.length == 0) {
            throw new IllegalArgumentException("empty delimiters");
        }
        if (io.netty.c.a.i.a(arrg) && !this.d()) {
            this.i = new o(n2, bl2, bl3);
            this.a = null;
        } else {
            this.a = new g[arrg.length];
            for (int i2 = 0; i2 < arrg.length; ++i2) {
                g g2 = arrg[i2];
                io.netty.c.a.i.a(g2);
                this.a[i2] = g2.i(g2.p(), g2.r());
            }
            this.i = null;
        }
        this.c = n2;
        this.d = bl2;
        this.e = bl3;
    }

    private static boolean a(g[] arrg) {
        if (arrg.length != 2) {
            return false;
        }
        g g2 = arrg[0];
        g g3 = arrg[1];
        if (g2.j() < g3.j()) {
            g2 = arrg[1];
            g3 = arrg[0];
        }
        return g2.j() == 2 && g3.j() == 1 && g2.m(0) == 13 && g2.m(1) == 10 && g3.m(0) == 10;
    }

    private boolean d() {
        return this.getClass() != i.class;
    }

    @Override
    protected final void a(bd bd2, g g2, List list) {
        Object object = this.a(bd2, g2);
        if (object != null) {
            list.add(object);
        }
    }

    protected Object a(bd bd2, g g2) {
        if (this.i != null) {
            return this.i.a(bd2, g2);
        }
        int n2 = Integer.MAX_VALUE;
        g g3 = null;
        for (g g4 : this.a) {
            int n3 = io.netty.c.a.i.a(g2, g4);
            if (n3 < 0 || n3 >= n2) continue;
            n2 = n3;
            g3 = g4;
        }
        if (g3 != null) {
            g g5;
            int n4 = g3.j();
            if (this.f) {
                this.f = false;
                g2.A(n2 + n4);
                int n5 = this.h;
                this.h = 0;
                if (!this.e) {
                    this.a(n5);
                }
                return null;
            }
            if (n2 > this.c) {
                g2.A(n2 + n4);
                this.a(n2);
                return null;
            }
            if (this.d) {
                g5 = g2.z(n2);
                g2.A(n4);
            } else {
                g5 = g2.z(n2 + n4);
            }
            return g5.ab();
        }
        if (!this.f) {
            if (g2.r() > this.c) {
                this.h = g2.r();
                g2.A(g2.r());
                this.f = true;
                if (this.e) {
                    this.a(this.h);
                }
            }
        } else {
            this.h += g2.r();
            g2.A(g2.r());
        }
        return null;
    }

    private void a(long l2) {
        if (l2 > 0L) {
            throw new y("frame length exceeds " + this.c + ": " + l2 + " - discarded");
        }
        throw new y("frame length exceeds " + this.c + " - discarding");
    }

    private static int a(g g2, g g3) {
        for (int i2 = g2.p(); i2 < g2.q(); ++i2) {
            int n2;
            int n3 = i2;
            for (n2 = 0; n2 < g3.j() && g2.m(n3) == g3.m(n2); ++n2) {
                if (++n3 != g2.q() || n2 == g3.j() - 1) continue;
                return -1;
            }
            if (n2 != g3.j()) continue;
            return i2 - g2.p();
        }
        return -1;
    }

    private static void a(g g2) {
        if (g2 == null) {
            throw new NullPointerException("delimiter");
        }
        if (!g2.u()) {
            throw new IllegalArgumentException("empty delimiter");
        }
    }

    private static void a(int n2) {
        if (n2 <= 0) {
            throw new IllegalArgumentException("maxFrameLength must be a positive integer: " + n2);
        }
    }
}

