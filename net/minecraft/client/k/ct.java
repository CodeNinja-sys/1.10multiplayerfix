/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k;

import io.netty.b.bi;
import java.util.ArrayList;
import net.minecraft.b.b;
import net.minecraft.client.f.u;
import net.minecraft.client.g.am;
import net.minecraft.client.g.bd;
import net.minecraft.client.k.b.l;
import net.minecraft.client.k.ch;
import net.minecraft.client.k.cr;
import net.minecraft.h.ag;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.u.bp;
import net.minecraft.w.aj;
import net.minecraft.x.a;
import net.minecraft.x.d.a.j;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class ct
extends l {
    private static final d a = org.apache.logging.log4j.c.c();
    private static final bp j = new bp("textures/gui/container/villager.png");
    private final aj k;
    private cr l;
    private cr m;
    private int v;
    private final net.minecraft.u.d.a w;

    public ct(net.minecraft.w.a.a a2, aj aj2, k k2) {
        super(new ag(a2, aj2, k2));
        this.k = aj2;
        this.w = aj2.aK();
    }

    @Override
    public void ct_() {
        super.ct_();
        int n2 = (this.p - this.c) / 2;
        int n3 = (this.q - this.d) / 2;
        this.l = (cr)this.b(new cr(1, n2 + 120 + 27, n3 + 24 - 1, true));
        this.m = (cr)this.b(new cr(2, n2 + 36 - 19, n3 + 24 - 1, false));
        this.l.k = false;
        this.m.k = false;
    }

    @Override
    protected void b(int n2, int n3) {
        String string = this.w.c();
        this.u.a(string, this.c / 2 - this.u.a(string) / 2, 6, 0x404040);
        this.u.a(net.minecraft.client.f.u.a("container.inventory", new Object[0]), 8, this.d - 96 + 2, 0x404040);
    }

    @Override
    public void bY_() {
        super.bY_();
        net.minecraft.b.d d2 = this.k.b(this.n.j);
        if (d2 != null) {
            this.l.k = this.v < d2.size() - 1;
            this.m.k = this.v > 0;
        }
    }

    @Override
    protected void a(ch ch2) {
        Object object;
        boolean bl2 = false;
        if (ch2 == this.l) {
            ++this.v;
            object = this.k.b(this.n.j);
            if (object != null && this.v >= ((ArrayList)object).size()) {
                this.v = ((ArrayList)object).size() - 1;
            }
            bl2 = true;
        } else if (ch2 == this.m) {
            --this.v;
            if (this.v < 0) {
                this.v = 0;
            }
            bl2 = true;
        }
        if (bl2) {
            ((ag)this.e).a(this.v);
            object = new a(bi.a());
            ((a)object).E(this.v);
            this.n.v().a(new j("MC|TrSel", (a)object));
        }
    }

    @Override
    protected void a(float f2, int n2, int n3) {
        bd.c(1.0f, 1.0f, 1.0f, 1.0f);
        this.n.N().a(j);
        int n4 = (this.p - this.c) / 2;
        int n5 = (this.q - this.d) / 2;
        this.a_(n4, n5, 0, 0, this.c, this.d);
        net.minecraft.b.d d2 = this.k.b(this.n.j);
        if (d2 != null && !d2.isEmpty()) {
            int n6 = this.v;
            if (n6 < 0 || n6 >= d2.size()) {
                return;
            }
            b b2 = (b)d2.get(n6);
            if (b2.h()) {
                this.n.N().a(j);
                bd.c(1.0f, 1.0f, 1.0f, 1.0f);
                bd.f();
                this.a_(this.f + 83, this.g + 21, 212, 0, 28, 21);
                this.a_(this.f + 83, this.g + 51, 212, 0, 28, 21);
            }
        }
    }

    @Override
    public void a(int n2, int n3, float f2) {
        super.a(n2, n3, f2);
        net.minecraft.b.d d2 = this.k.b(this.n.j);
        if (d2 != null && !d2.isEmpty()) {
            int n4 = (this.p - this.c) / 2;
            int n5 = (this.q - this.d) / 2;
            int n6 = this.v;
            b b2 = (b)d2.get(n6);
            cu cu2 = b2.a();
            cu cu3 = b2.b();
            cu cu4 = b2.d();
            bd.D();
            am.c();
            bd.f();
            bd.A();
            bd.g();
            bd.e();
            this.o.a = 100.0f;
            this.o.b(cu2, n4 + 36, n5 + 24);
            this.o.a(this.u, cu2, n4 + 36, n5 + 24);
            if (cu3 != null) {
                this.o.b(cu3, n4 + 62, n5 + 24);
                this.o.a(this.u, cu3, n4 + 62, n5 + 24);
            }
            this.o.b(cu4, n4 + 120, n5 + 24);
            this.o.a(this.u, cu4, n4 + 120, n5 + 24);
            this.o.a = 0.0f;
            bd.f();
            if (this.a(36, 24, 16, 16, n2, n3) && cu2 != null) {
                this.a(cu2, n2, n3);
            } else if (cu3 != null && this.a(62, 24, 16, 16, n2, n3) && cu3 != null) {
                this.a(cu3, n2, n3);
            } else if (cu4 != null && this.a(120, 24, 16, 16, n2, n3) && cu4 != null) {
                this.a(cu4, n2, n3);
            } else if (b2.h() && (this.a(83, 21, 28, 21, n2, n3) || this.a(83, 51, 28, 21, n2, n3))) {
                this.a(net.minecraft.client.f.u.a("merchant.deprecated", new Object[0]), n2, n3);
            }
            bd.E();
            bd.e();
            bd.j();
            am.b();
        }
    }

    public aj f() {
        return this.k;
    }

    static /* synthetic */ bp g() {
        return j;
    }
}

