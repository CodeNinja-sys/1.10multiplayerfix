/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.f;

import net.minecraft.a.p;
import net.minecraft.g.cn;
import net.minecraft.q.f.b;
import net.minecraft.q.f.c;
import net.minecraft.q.f.h;
import net.minecraft.q.f.j;
import net.minecraft.q.f.l;
import net.minecraft.q.f.m;
import net.minecraft.u.b.n;
import net.minecraft.x.a;

public class d
implements c {
    private static final h d = new l();
    protected static final net.minecraft.g.c.b a = p.a.v();
    protected net.minecraft.u.b b;
    protected h c;
    private int e;

    public d() {
        this.b(4);
    }

    private static int b(int n2, int n3, int n4) {
        return n3 << 8 | n4 << 4 | n2;
    }

    private void b(int n2) {
        if (n2 != this.e) {
            this.e = n2;
            if (this.e <= 4) {
                this.e = 4;
                this.c = new m(this.e, this);
            } else if (this.e <= 8) {
                this.c = new j(this.e, this);
            } else {
                this.c = d;
                this.e = n.d(cn.w.a());
            }
            this.c.a(a);
            this.b = new net.minecraft.u.b(this.e, 4096);
        }
    }

    @Override
    public int a(int n2, net.minecraft.g.c.b b2) {
        net.minecraft.u.b b3 = this.b;
        h h2 = this.c;
        this.b(n2);
        for (int i2 = 0; i2 < b3.b(); ++i2) {
            net.minecraft.g.c.b b4 = h2.a(b3.a(i2));
            if (b4 == null) continue;
            this.b(i2, b4);
        }
        return this.c.a(b2);
    }

    public void a(int n2, int n3, int n4, net.minecraft.g.c.b b2) {
        this.b(net.minecraft.q.f.d.b(n2, n3, n4), b2);
    }

    protected void b(int n2, net.minecraft.g.c.b b2) {
        int n3 = this.c.a(b2);
        this.b.a(n2, n3);
    }

    public net.minecraft.g.c.b a(int n2, int n3, int n4) {
        return this.a(net.minecraft.q.f.d.b(n2, n3, n4));
    }

    protected net.minecraft.g.c.b a(int n2) {
        net.minecraft.g.c.b b2 = this.c.a(this.b.a(n2));
        return b2 == null ? a : b2;
    }

    public void a(a a2) {
        byte by2 = a2.E();
        if (this.e != by2) {
            this.b(by2);
        }
        this.c.a(a2);
        a2.b(this.b.a());
    }

    public void b(a a2) {
        a2.B(this.e);
        this.c.b(a2);
        a2.a(this.b.a());
    }

    public b a(byte[] arrby, b b2) {
        b b3 = null;
        for (int i2 = 0; i2 < 4096; ++i2) {
            int n2 = cn.w.a(this.a(i2));
            int n3 = i2 & 0xF;
            int n4 = i2 >> 8 & 0xF;
            int n5 = i2 >> 4 & 0xF;
            if ((n2 >> 12 & 0xF) != 0) {
                if (b3 == null) {
                    b3 = new b();
                }
                b3.a(n3, n4, n5, n2 >> 12 & 0xF);
            }
            arrby[i2] = (byte)(n2 >> 4 & 0xFF);
            b2.a(n3, n4, n5, n2 & 0xF);
        }
        return b3;
    }

    public void a(byte[] arrby, b b2, b b3) {
        for (int i2 = 0; i2 < 4096; ++i2) {
            int n2 = i2 & 0xF;
            int n3 = i2 >> 8 & 0xF;
            int n4 = i2 >> 4 & 0xF;
            int n5 = b3 == null ? 0 : b3.a(n2, n3, n4);
            int n6 = n5 << 12 | (arrby[i2] & 0xFF) << 4 | b2.a(n2, n3, n4);
            this.b(i2, (net.minecraft.g.c.b)cn.w.a(n6));
        }
    }

    public int a() {
        return 1 + this.c.a() + net.minecraft.x.a.a(this.b.b()) + this.b.a().length * 8;
    }
}

