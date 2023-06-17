/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k;

import io.netty.b.bi;
import java.util.List;
import net.minecraft.client.f.u;
import net.minecraft.client.g.bd;
import net.minecraft.client.k.b.l;
import net.minecraft.client.k.dn;
import net.minecraft.client.r;
import net.minecraft.h.aq;
import net.minecraft.h.ar;
import net.minecraft.h.i;
import net.minecraft.h.y;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.u.bp;
import net.minecraft.x.a;
import net.minecraft.x.d.a.j;
import org.lwjgl.a.g;

public class dh
extends l
implements i {
    private static final bp a = new bp("textures/gui/container/anvil.png");
    private final ar j;
    private dn k;
    private final net.minecraft.w.a.a l;

    public dh(net.minecraft.w.a.a a2, k k2) {
        super(new ar(a2, k2, net.minecraft.client.r.z().j));
        this.l = a2;
        this.j = (ar)this.e;
    }

    @Override
    public void ct_() {
        super.ct_();
        org.lwjgl.a.g.a(true);
        int n2 = (this.p - this.c) / 2;
        int n3 = (this.q - this.d) / 2;
        this.k = new dn(0, this.u, n2 + 62, n3 + 24, 103, 12);
        this.k.g(-1);
        this.k.h(-1);
        this.k.a(false);
        this.k.f(30);
        this.e.b(this);
        this.e.a(this);
    }

    @Override
    public void cs_() {
        super.cs_();
        org.lwjgl.a.g.a(false);
        this.e.b(this);
    }

    @Override
    protected void b(int n2, int n3) {
        bd.f();
        bd.k();
        this.u.a(net.minecraft.client.f.u.a("container.repair", new Object[0]), 60, 6, 0x404040);
        if (this.j.a > 0) {
            int n4 = 8453920;
            boolean bl2 = true;
            String string = net.minecraft.client.f.u.a("container.repair.cost", this.j.a);
            if (this.j.a >= 40 && !this.n.j.J.d) {
                string = net.minecraft.client.f.u.a("container.repair.expensive", new Object[0]);
                n4 = 0xFF6060;
            } else if (!this.j.b(2).c()) {
                bl2 = false;
            } else if (!this.j.b(2).a(this.l.e)) {
                n4 = 0xFF6060;
            }
            if (bl2) {
                int n5 = 0xFF000000 | (n4 & 0xFCFCFC) >> 2 | n4 & 0xFF000000;
                int n6 = this.c - 8 - this.u.a(string);
                int n7 = 67;
                if (this.u.a()) {
                    dh.a(n6 - 3, 65, this.c - 7, 77, -16777216);
                    dh.a(n6 - 2, 66, this.c - 8, 76, -12895429);
                } else {
                    this.u.a(string, n6, 68, n5);
                    this.u.a(string, n6 + 1, 67, n5);
                    this.u.a(string, n6 + 1, 68, n5);
                }
                this.u.a(string, n6, 67, n4);
            }
        }
        bd.e();
    }

    @Override
    protected void a(char c2, int n2) {
        if (this.k.a(c2, n2)) {
            this.f();
        } else {
            super.a(c2, n2);
        }
    }

    private void f() {
        String string = this.k.b();
        net.minecraft.h.r r2 = this.j.b(0);
        if (r2 != null && r2.c() && !r2.b().s() && string.equals(r2.b().q())) {
            string = "";
        }
        this.j.a(string);
        this.n.j.d.a(new j("MC|ItemName", new a(bi.a()).a(string)));
    }

    @Override
    protected void a(int n2, int n3, int n4) {
        super.a(n2, n3, n4);
        this.k.a(n2, n3, n4);
    }

    @Override
    public void a(int n2, int n3, float f2) {
        super.a(n2, n3, f2);
        bd.f();
        bd.k();
        this.k.g();
    }

    @Override
    protected void a(float f2, int n2, int n3) {
        bd.c(1.0f, 1.0f, 1.0f, 1.0f);
        this.n.N().a(a);
        int n4 = (this.p - this.c) / 2;
        int n5 = (this.q - this.d) / 2;
        this.a_(n4, n5, 0, 0, this.c, this.d);
        this.a_(n4 + 59, n5 + 20, 0, this.d + (this.j.b(0).c() ? 0 : 16), 110, 16);
        if ((this.j.b(0).c() || this.j.b(1).c()) && !this.j.b(2).c()) {
            this.a_(n4 + 99, n5 + 45, this.c, 0, 28, 21);
        }
    }

    @Override
    public void a(aq aq2, List list) {
        this.a(aq2, 0, aq2.b(0).b());
    }

    @Override
    public void a(aq aq2, int n2, cu cu2) {
        if (n2 == 0) {
            this.k.a(cu2 == null ? "" : cu2.q());
            this.k.c(cu2 != null);
            if (cu2 != null) {
                this.f();
            }
        }
    }

    @Override
    public void a(aq aq2, int n2, int n3) {
    }

    @Override
    public void a(aq aq2, y y2) {
    }
}

