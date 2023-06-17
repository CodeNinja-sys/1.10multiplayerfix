/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k.b;

import io.netty.b.bi;
import net.minecraft.a.w;
import net.minecraft.client.g.am;
import net.minecraft.client.g.bd;
import net.minecraft.client.k.b.l;
import net.minecraft.client.k.b.o;
import net.minecraft.client.k.b.s;
import net.minecraft.client.k.b.u;
import net.minecraft.client.k.cc;
import net.minecraft.client.k.ch;
import net.minecraft.f.aq;
import net.minecraft.h.ao;
import net.minecraft.h.y;
import net.minecraft.m.cu;
import net.minecraft.u.bp;
import net.minecraft.x.a;
import net.minecraft.x.d.a.j;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class m
extends l {
    private static final d a = org.apache.logging.log4j.c.c();
    private static final bp j = new bp("textures/gui/container/beacon.png");
    private final y k;
    private o l;
    private boolean m;

    public m(net.minecraft.w.a.a a2, y y2) {
        super(new ao(a2, y2));
        this.k = y2;
        this.c = 230;
        this.d = 219;
    }

    @Override
    public void ct_() {
        super.ct_();
        this.l = new o(this, -1, this.f + 164, this.g + 107);
        this.r.add(this.l);
        this.r.add(new s(this, -2, this.f + 190, this.g + 107));
        this.m = true;
        this.l.k = false;
    }

    @Override
    public void bY_() {
        super.bY_();
        int n2 = this.k.c(0);
        net.minecraft.d.c c2 = net.minecraft.d.c.a(this.k.c(1));
        net.minecraft.d.c c3 = net.minecraft.d.c.a(this.k.c(2));
        if (this.m && n2 >= 0) {
            u u2;
            net.minecraft.d.c c4;
            int n3;
            int n4;
            int n5;
            int n6;
            this.m = false;
            int n7 = 100;
            for (n6 = 0; n6 <= 2; ++n6) {
                n5 = aq.a[n6].length;
                n4 = n5 * 22 + (n5 - 1) * 2;
                for (n3 = 0; n3 < n5; ++n3) {
                    c4 = aq.a[n6][n3];
                    u2 = new u(this, n7++, this.f + 76 + n3 * 24 - n4 / 2, this.g + 22 + n6 * 25, c4, n6);
                    this.r.add(u2);
                    if (n6 >= n2) {
                        u2.k = false;
                        continue;
                    }
                    if (c4 != c2) continue;
                    u2.a(true);
                }
            }
            n6 = 3;
            n5 = aq.a[3].length + 1;
            n4 = n5 * 22 + (n5 - 1) * 2;
            for (n3 = 0; n3 < n5 - 1; ++n3) {
                c4 = aq.a[3][n3];
                u2 = new u(this, n7++, this.f + 167 + n3 * 24 - n4 / 2, this.g + 47, c4, 3);
                this.r.add(u2);
                if (3 >= n2) {
                    u2.k = false;
                    continue;
                }
                if (c4 != c3) continue;
                u2.a(true);
            }
            if (c2 != null) {
                u u3 = new u(this, n7++, this.f + 167 + (n5 - 1) * 24 - n4 / 2, this.g + 47, c2, 3);
                this.r.add(u3);
                if (3 >= n2) {
                    u3.k = false;
                } else if (c2 == c3) {
                    u3.a(true);
                }
            }
        }
        this.l.k = this.k.a(0) != null && c2 != null;
    }

    @Override
    protected void a(ch ch2) {
        if (ch2.j == -2) {
            this.n.j.d.a(new net.minecraft.x.d.a.a(this.n.j.s.f));
            this.n.a((cc)null);
        } else if (ch2.j == -1) {
            String string = "MC|Beacon";
            a a2 = new a(bi.a());
            a2.E(this.k.c(1));
            a2.E(this.k.c(2));
            this.n.v().a(new j("MC|Beacon", a2));
            this.n.j.d.a(new net.minecraft.x.d.a.a(this.n.j.s.f));
            this.n.a((cc)null);
        } else if (ch2 instanceof u) {
            u u2 = (u)ch2;
            if (u2.a()) {
                return;
            }
            int n2 = net.minecraft.d.c.a(net.minecraft.client.k.b.u.a(u2));
            if (net.minecraft.client.k.b.u.b(u2) < 3) {
                this.k.b(1, n2);
            } else {
                this.k.b(2, n2);
            }
            this.r.clear();
            this.ct_();
            this.bY_();
        }
    }

    @Override
    protected void b(int n2, int n3) {
        am.a();
        this.a(this.u, net.minecraft.client.f.u.a("tile.beacon.primary", new Object[0]), 62, 10, 0xE0E0E0);
        this.a(this.u, net.minecraft.client.f.u.a("tile.beacon.secondary", new Object[0]), 169, 10, 0xE0E0E0);
        for (ch ch2 : this.r) {
            if (!ch2.g()) continue;
            ch2.b(n2 - this.f, n3 - this.g);
            break;
        }
        am.c();
    }

    @Override
    protected void a(float f2, int n2, int n3) {
        bd.c(1.0f, 1.0f, 1.0f, 1.0f);
        this.n.N().a(j);
        int n4 = (this.p - this.c) / 2;
        int n5 = (this.q - this.d) / 2;
        this.a_(n4, n5, 0, 0, this.c, this.d);
        this.o.a = 100.0f;
        this.o.b(new cu(w.bY), n4 + 42, n5 + 109);
        this.o.b(new cu(w.k), n4 + 42 + 22, n5 + 109);
        this.o.b(new cu(w.m), n4 + 42 + 44, n5 + 109);
        this.o.b(new cu(w.l), n4 + 42 + 66, n5 + 109);
        this.o.a = 0.0f;
    }

    static /* synthetic */ bp f() {
        return j;
    }

    static /* synthetic */ void a(m m2, String string, int n2, int n3) {
        m2.a(string, n2, n3);
    }
}

