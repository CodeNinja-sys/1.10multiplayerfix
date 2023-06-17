/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.c.a;

import com.a.a.n.a.ci;
import java.io.File;
import java.io.IOException;
import java.util.Queue;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import net.minecraft.c.a;
import net.minecraft.c.a.b;
import net.minecraft.c.a.e;
import net.minecraft.c.a.f;
import net.minecraft.c.a.g;
import net.minecraft.c.a.h;
import net.minecraft.client.i.i;
import net.minecraft.client.r;
import net.minecraft.n.m;
import net.minecraft.q.a.u;
import net.minecraft.q.ab;
import net.minecraft.q.aj;
import net.minecraft.q.am;
import net.minecraft.q.aw;
import net.minecraft.q.l;
import net.minecraft.q.v;
import net.minecraft.u.ao;
import net.minecraft.u.cb;
import org.apache.logging.log4j.c;

public class d
extends a {
    private static final org.apache.logging.log4j.d k = org.apache.logging.log4j.c.c();
    private final r l;
    private final aj m;
    private boolean n;
    private boolean o;
    private i p;

    public d(r r2, String string, String string2, aj aj2, com.c.a.e.c c2, com.c.a.c.i i2, com.c.a.f f2, net.minecraft.c.b.h h2) {
        super(new File(r2.y, "saves"), r2.M(), r2.ah(), c2, i2, f2, h2);
        this.e(r2.K().c());
        this.f(string);
        this.g(string2);
        this.c(r2.u());
        this.d(aj2.c());
        this.b(256);
        this.a(new b(this));
        this.l = r2;
        this.m = this.af() ? net.minecraft.q.e.b.H : aj2;
    }

    @Override
    public m t() {
        return new net.minecraft.c.a.a(this);
    }

    @Override
    public void a(String string, String string2, long l2, ab ab2, String string3) {
        this.a(string);
        this.d = new v[3];
        this.i = new long[this.d.length][100];
        u u2 = this.ag().a(string, true);
        this.a(this.ac(), u2);
        net.minecraft.q.a.d d2 = u2.c();
        if (d2 == null) {
            d2 = new net.minecraft.q.a.d(this.m, string2);
        } else {
            d2.a(string2);
        }
        for (int i2 = 0; i2 < this.d.length; ++i2) {
            int n2 = 0;
            if (i2 == 1) {
                n2 = -1;
            }
            if (i2 == 2) {
                n2 = 1;
            }
            if (i2 == 0) {
                this.d[i2] = this.af() ? (v)new net.minecraft.q.e.b(this, u2, d2, n2, this.c).j() : (v)new v(this, u2, d2, n2, this.c).j();
                this.d[i2].a(this.m);
            } else {
                this.d[i2] = (v)new aw((a)this, u2, n2, this.d[0], this.c).j();
            }
            this.d[i2].a(new net.minecraft.q.ao(this, this.d[i2]));
        }
        this.av().a(this.d);
        if (this.d[0].F().H() == null) {
            this.a(this.l.w.aq);
        }
        this.w();
    }

    @Override
    public boolean u() {
        k.d("Starting integrated minecraft server version 1.10 Multiplayer Fix");
        this.e(true);
        this.f(true);
        this.g(true);
        this.h(true);
        this.i(true);
        k.d("Generating keypair");
        this.a(net.minecraft.u.m.b());
        this.a(this.ac(), this.ad(), this.m.d(), this.m.h(), this.m.j());
        this.h(String.valueOf(this.aa()) + " - " + this.d[0].F().i());
        return true;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void M() {
        boolean bl2 = this.n;
        boolean bl3 = this.n = r.z().v() != null && r.z().T();
        if (!bl2 && this.n) {
            k.d("Saving and pausing game...");
            this.av().j();
            this.b(false);
        }
        if (this.n) {
            Queue queue = this.j;
            synchronized (queue) {
                while (!this.j.isEmpty()) {
                    cb.a((FutureTask)this.j.poll(), k);
                }
            }
        } else {
            super.M();
            if (this.l.w.d != this.av().s()) {
                k.d("Changing view distance to {}, from {}", this.l.w.d, this.av().s());
                this.av().a(this.l.w.d);
            }
            if (this.l.h != null) {
                net.minecraft.q.a.d d2 = this.d[0].F();
                net.minecraft.q.a.d d3 = this.l.h.F();
                if (!d2.I() && d3.H() != d2.H()) {
                    k.d("Changing difficulty to {}, from {}", new Object[]{d3.H(), d2.H()});
                    this.a(d3.H());
                } else if (d3.I() && !d2.I()) {
                    k.d("Locking difficulty to {}", new Object[]{d3.H()});
                    v[] arrv = this.d;
                    int n2 = this.d.length;
                    for (int i2 = 0; i2 < n2; ++i2) {
                        v v2 = arrv[i2];
                        if (v2 == null) continue;
                        v2.F().g(true);
                    }
                }
            }
        }
    }

    @Override
    public boolean x() {
        return false;
    }

    @Override
    public am y() {
        return this.m.e();
    }

    @Override
    public l z() {
        return this.l.h.F().H();
    }

    @Override
    public boolean A() {
        return this.m.f();
    }

    @Override
    public boolean C() {
        return true;
    }

    @Override
    public boolean D() {
        return true;
    }

    @Override
    public void b(boolean bl2) {
        super.b(bl2);
    }

    @Override
    public File K() {
        return this.l.y;
    }

    @Override
    public boolean ak() {
        return false;
    }

    @Override
    public boolean ao() {
        return false;
    }

    @Override
    public void a(net.minecraft.k.a a2) {
        this.l.a(a2);
    }

    @Override
    public net.minecraft.k.a b(net.minecraft.k.a a2) {
        a2 = super.b(a2);
        a2.f().a("Type", new g(this));
        a2.f().a("Is Modded", new f(this));
        return a2;
    }

    @Override
    public void a(l l2) {
        super.a(l2);
        if (this.l.h != null) {
            this.l.h.F().a(l2);
        }
    }

    @Override
    public void a(net.minecraft.p.d d2) {
        super.a(d2);
        d2.a("snooper_partner", this.l.H().f());
    }

    @Override
    public boolean aj() {
        return r.z().aj();
    }

    @Override
    public String a(am am2, boolean bl2) {
        try {
            int n2 = -1;
            try {
                n2 = ao.a();
            }
            catch (IOException iOException) {
                // empty catch block
            }
            if (n2 <= 0) {
                n2 = 25564;
            }
            this.aw().a(null, n2);
            k.d("Started on {}", n2);
            this.o = true;
            this.p = new i(this.as(), String.valueOf(n2));
            this.p.start();
            this.av().a(am2);
            this.av().c(bl2);
            this.l.j.a(bl2 ? 4 : 0);
            return String.valueOf(n2);
        }
        catch (IOException iOException) {
            return null;
        }
    }

    @Override
    public void F() {
        super.F();
        if (this.p != null) {
            this.p.interrupt();
            this.p = null;
        }
    }

    @Override
    public void H() {
        ci.a((Future)this.a(new e(this)));
        super.H();
        if (this.p != null) {
            this.p.interrupt();
            this.p = null;
        }
    }

    public boolean a() {
        return this.o;
    }

    @Override
    public void a(am am2) {
        super.a(am2);
        this.av().a(am2);
    }

    @Override
    public boolean ar() {
        return true;
    }

    @Override
    public int B() {
        return 4;
    }

    public void b() {
        if (this.aU()) {
            this.d[0].W().a();
        } else {
            this.a(new h(this));
        }
    }
}

