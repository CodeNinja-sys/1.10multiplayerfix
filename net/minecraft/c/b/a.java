/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.c.b;

import com.a.a.b.cm;
import com.a.a.d.mq;
import com.a.a.d.ov;
import java.util.List;
import net.minecraft.c.b.j;
import net.minecraft.f.ap;
import net.minecraft.q.f.k;
import net.minecraft.u.b.b;
import net.minecraft.u.b.m;
import net.minecraft.w.a.g;
import net.minecraft.x.d.b.ao;
import net.minecraft.x.d.b.bc;
import net.minecraft.x.d.b.bd;
import net.minecraft.x.d.b.bx;
import net.minecraft.x.p;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class a {
    private static final d a = org.apache.logging.log4j.c.c();
    private final j b;
    private final List c = ov.a();
    private final m d;
    private final short[] e = new short[64];
    private k f;
    private int g;
    private int h;
    private long i;
    private boolean j;

    public a(j j2, int n2, int n3) {
        this.b = j2;
        this.d = new m(n2, n3);
        this.f = j2.a().ac().a(n2, n3);
    }

    public m a() {
        return this.d;
    }

    public void a(g g2) {
        if (this.c.contains(g2)) {
            a.a("Failed to add player. {} already is in chunk {}, {}", g2, this.d.a, this.d.b);
        } else {
            if (this.c.isEmpty()) {
                this.i = this.b.a().B();
            }
            this.c.add(g2);
            if (this.j) {
                this.c(g2);
            }
        }
    }

    public void b(g g2) {
        if (this.c.contains(g2)) {
            if (this.j) {
                g2.a.a(new bd(this.d.a, this.d.b));
            }
            this.c.remove(g2);
            if (this.c.isEmpty()) {
                this.b.b(this);
            }
        }
    }

    public boolean a(boolean bl2) {
        if (this.f != null) {
            return true;
        }
        this.f = bl2 ? this.b.a().ac().d(this.d.a, this.d.b) : this.b.a().ac().a(this.d.a, this.d.b);
        return this.f != null;
    }

    public boolean b() {
        if (this.j) {
            return true;
        }
        if (this.f == null) {
            return false;
        }
        if (!this.f.i()) {
            return false;
        }
        this.g = 0;
        this.h = 0;
        this.j = true;
        ao ao2 = new ao(this.f, 65535);
        for (g g2 : this.c) {
            g2.a.a(ao2);
            this.b.a().ae().a(g2, this.f);
        }
        return true;
    }

    public void c(g g2) {
        if (this.j) {
            g2.a.a(new ao(this.f, 65535));
            this.b.a().ae().a(g2, this.f);
        }
    }

    public void c() {
        long l2 = this.b.a().B();
        if (this.f != null) {
            this.f.c(this.f.x() + l2 - this.i);
        }
        this.i = l2;
    }

    public void a(int n2, int n3, int n4) {
        if (this.j) {
            if (this.g == 0) {
                this.b.a(this);
            }
            this.h |= 1 << (n3 >> 4);
            if (this.g < 64) {
                short s2 = (short)(n2 << 12 | n4 << 8 | n3);
                for (int i2 = 0; i2 < this.g; ++i2) {
                    if (this.e[i2] != s2) continue;
                    return;
                }
                this.e[this.g++] = s2;
            }
        }
    }

    public void a(p p2) {
        if (this.j) {
            for (int i2 = 0; i2 < this.c.size(); ++i2) {
                ((g)this.c.get((int)i2)).a.a(p2);
            }
        }
    }

    public void d() {
        if (this.j && this.f != null && this.g != 0) {
            if (this.g == 1) {
                int n2 = (this.e[0] >> 12 & 0xF) + this.d.a * 16;
                int n3 = this.e[0] & 0xFF;
                int n4 = (this.e[0] >> 8 & 0xF) + this.d.b * 16;
                b b2 = new b(n2, n3, n4);
                this.a(new bx(this.b.a(), b2));
                if (this.b.a().n(b2).c().n()) {
                    this.a(this.b.a().q(b2));
                }
            } else if (this.g == 64) {
                this.a(new ao(this.f, this.h));
            } else {
                this.a(new bc(this.g, this.e, this.f));
                for (int i2 = 0; i2 < this.g; ++i2) {
                    int n5 = (this.e[i2] >> 12 & 0xF) + this.d.a * 16;
                    int n6 = this.e[i2] & 0xFF;
                    int n7 = (this.e[i2] >> 8 & 0xF) + this.d.b * 16;
                    b b3 = new b(n5, n6, n7);
                    if (!this.b.a().n(b3).c().n()) continue;
                    this.a(this.b.a().q(b3));
                }
            }
            this.g = 0;
            this.h = 0;
        }
    }

    private void a(ap ap2) {
        net.minecraft.x.d.b.j j2;
        if (ap2 != null && (j2 = ap2.bJ_()) != null) {
            this.a(j2);
        }
    }

    public boolean d(g g2) {
        return this.c.contains(g2);
    }

    public boolean a(cm cm2) {
        return mq.g(this.c, cm2).b();
    }

    public boolean a(double d2, cm cm2) {
        int n2 = this.c.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            g g2 = (g)this.c.get(i2);
            if (!cm2.a(g2) || !(this.d.a(g2) < d2 * d2)) continue;
            return true;
        }
        return false;
    }

    public boolean e() {
        return this.j;
    }

    public k f() {
        return this.f;
    }

    public double g() {
        double d2 = Double.MAX_VALUE;
        for (g g2 : this.c) {
            double d3 = this.d.a(g2);
            if (!(d3 < d2)) continue;
            d2 = d3;
        }
        return d2;
    }
}

