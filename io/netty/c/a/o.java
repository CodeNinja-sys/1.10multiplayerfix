/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a;

import io.netty.b.g;
import io.netty.c.a.d;
import io.netty.c.a.y;
import io.netty.channel.bd;
import java.util.List;

public class o
extends d {
    private final int a;
    private final boolean c;
    private final boolean d;
    private boolean e;
    private int f;

    public o(int n2) {
        this(n2, true, false);
    }

    public o(int n2, boolean bl2, boolean bl3) {
        this.a = n2;
        this.c = bl3;
        this.d = bl2;
    }

    @Override
    protected final void a(bd bd2, g g2, List list) {
        Object object = this.a(bd2, g2);
        if (object != null) {
            list.add(object);
        }
    }

    protected Object a(bd bd2, g g2) {
        int n2 = o.a(g2);
        if (!this.e) {
            if (n2 >= 0) {
                g g3;
                int n3;
                int n4 = n2 - g2.p();
                int n5 = n3 = g2.m(n2) == 13 ? 2 : 1;
                if (n4 > this.a) {
                    g2.g(n2 + n3);
                    this.a(bd2, n4);
                    return null;
                }
                if (this.d) {
                    g3 = g2.z(n4);
                    g2.A(n3);
                } else {
                    g3 = g2.z(n4 + n3);
                }
                return g3.ab();
            }
            int n6 = g2.r();
            if (n6 > this.a) {
                this.f = n6;
                g2.g(g2.q());
                this.e = true;
                if (this.c) {
                    this.a(bd2, "over " + this.f);
                }
            }
            return null;
        }
        if (n2 >= 0) {
            int n7 = this.f + n2 - g2.p();
            int n8 = g2.m(n2) == 13 ? 2 : 1;
            g2.g(n2 + n8);
            this.f = 0;
            this.e = false;
            if (!this.c) {
                this.a(bd2, n7);
            }
        } else {
            this.f = g2.r();
            g2.g(g2.q());
        }
        return null;
    }

    private void a(bd bd2, int n2) {
        this.a(bd2, String.valueOf(n2));
    }

    private void a(bd bd2, String string) {
        bd2.a(new y("frame length (" + string + ") exceeds the allowed maximum (" + this.a + ')'));
    }

    private static int a(g g2) {
        int n2 = g2.q();
        for (int i2 = g2.p(); i2 < n2; ++i2) {
            byte by2 = g2.m(i2);
            if (by2 == 10) {
                return i2;
            }
            if (by2 != 13 || i2 >= n2 - 1 || g2.m(i2 + 1) != 10) continue;
            return i2;
        }
        return -1;
    }
}

