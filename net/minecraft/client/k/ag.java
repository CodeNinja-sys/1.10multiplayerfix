/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k;

import io.netty.b.bi;
import net.minecraft.client.f.u;
import net.minecraft.client.k.cc;
import net.minecraft.client.k.ch;
import net.minecraft.client.k.dk;
import net.minecraft.client.k.dn;
import net.minecraft.f.h;
import net.minecraft.f.n;
import net.minecraft.f.q;
import net.minecraft.u.au;
import net.minecraft.u.bx;
import net.minecraft.x.a;
import net.minecraft.x.d.a.j;
import org.lwjgl.a.g;

public class ag
extends cc
implements au {
    private dn a;
    private dn b;
    private final h c;
    private ch d;
    private ch e;
    private ch f;
    private ch g;
    private ch h;
    private ch i;
    private boolean j;
    private n k = net.minecraft.f.n.c;
    private bx l;
    private boolean m;
    private boolean v;

    public ag(h h2) {
        this.c = h2;
    }

    @Override
    public void bY_() {
        this.a.a();
    }

    @Override
    public void ct_() {
        q q2 = this.c.b();
        org.lwjgl.a.g.a(true);
        this.r.clear();
        this.d = this.b(new ch(0, this.p / 2 - 4 - 150, this.q / 4 + 120 + 12, 150, 20, net.minecraft.client.f.u.a("gui.done", new Object[0])));
        this.e = this.b(new ch(1, this.p / 2 + 4, this.q / 4 + 120 + 12, 150, 20, net.minecraft.client.f.u.a("gui.cancel", new Object[0])));
        this.f = this.b(new ch(4, this.p / 2 + 150 - 20, 135, 20, 20, "O"));
        this.g = this.b(new ch(5, this.p / 2 - 50 - 100 - 4, 165, 100, 20, net.minecraft.client.f.u.a("advMode.mode.sequence", new Object[0])));
        this.h = this.b(new ch(6, this.p / 2 - 50, 165, 100, 20, net.minecraft.client.f.u.a("advMode.mode.unconditional", new Object[0])));
        this.i = this.b(new ch(7, this.p / 2 + 50 + 4, 165, 100, 20, net.minecraft.client.f.u.a("advMode.mode.redstoneTriggered", new Object[0])));
        this.a = new dn(2, this.u, this.p / 2 - 150, 50, 300, 20);
        this.a.f(32500);
        this.a.b(true);
        this.b = new dn(3, this.u, this.p / 2 - 150, 135, 276, 20);
        this.b.f(32500);
        this.b.c(false);
        this.b.a("-");
        this.d.k = false;
        this.f.k = false;
        this.g.k = false;
        this.h.k = false;
        this.i.k = false;
        this.l = new dk(this, this.a, true, q2);
    }

    public void f() {
        q q2 = this.c.b();
        this.a.a(q2.c());
        this.j = q2.f();
        this.k = this.c.j();
        this.m = this.c.k();
        this.v = this.c.g();
        this.h();
        this.i();
        this.r();
        this.s();
        this.d.k = true;
        this.f.k = true;
        this.g.k = true;
        this.h.k = true;
        this.i.k = true;
    }

    @Override
    public void cs_() {
        org.lwjgl.a.g.a(false);
    }

    @Override
    protected void a(ch ch2) {
        if (ch2.k) {
            q q2 = this.c.b();
            if (ch2.j == 1) {
                q2.a(this.j);
                this.n.a((cc)null);
            } else if (ch2.j == 0) {
                a a2 = new a(bi.a());
                q2.a(a2);
                a2.a(this.a.b());
                a2.a(q2.f());
                a2.a(this.k.name());
                a2.a(this.m);
                a2.a(this.v);
                this.n.v().a(new j("MC|AutoCmd", a2));
                if (!q2.f()) {
                    q2.b((net.minecraft.u.d.a)null);
                }
                this.n.a((cc)null);
            } else if (ch2.j == 4) {
                q2.a(!q2.f());
                this.h();
            } else if (ch2.j == 5) {
                this.q();
                this.i();
            } else if (ch2.j == 6) {
                this.m = !this.m;
                this.r();
            } else if (ch2.j == 7) {
                this.v = !this.v;
                this.s();
            }
        }
    }

    @Override
    protected void a(char c2, int n2) {
        this.l.d();
        if (n2 == 15) {
            this.l.a();
        } else {
            this.l.c();
        }
        this.a.a(c2, n2);
        this.b.a(c2, n2);
        if (n2 != 28 && n2 != 156) {
            if (n2 == 1) {
                this.a(this.e);
            }
        } else {
            this.a(this.d);
        }
    }

    @Override
    protected void a(int n2, int n3, int n4) {
        super.a(n2, n3, n4);
        this.a.a(n2, n3, n4);
        this.b.a(n2, n3, n4);
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.m();
        this.a(this.u, net.minecraft.client.f.u.a("advMode.setCommand", new Object[0]), this.p / 2, 20, 0xFFFFFF);
        this.b(this.u, net.minecraft.client.f.u.a("advMode.command", new Object[0]), this.p / 2 - 150, 37, 0xA0A0A0);
        this.a.g();
        int n4 = 75;
        int n5 = 0;
        this.b(this.u, net.minecraft.client.f.u.a("advMode.nearestPlayer", new Object[0]), this.p / 2 - 150, n4 + n5++ * this.u.a, 0xA0A0A0);
        this.b(this.u, net.minecraft.client.f.u.a("advMode.randomPlayer", new Object[0]), this.p / 2 - 150, n4 + n5++ * this.u.a, 0xA0A0A0);
        this.b(this.u, net.minecraft.client.f.u.a("advMode.allPlayers", new Object[0]), this.p / 2 - 150, n4 + n5++ * this.u.a, 0xA0A0A0);
        this.b(this.u, net.minecraft.client.f.u.a("advMode.allEntities", new Object[0]), this.p / 2 - 150, n4 + n5++ * this.u.a, 0xA0A0A0);
        this.b(this.u, "", this.p / 2 - 150, n4 + n5++ * this.u.a, 0xA0A0A0);
        if (!this.b.b().isEmpty()) {
            n4 = n4 + n5 * this.u.a + 1;
            this.b(this.u, net.minecraft.client.f.u.a("advMode.previousOutput", new Object[0]), this.p / 2 - 150, n4, 0xA0A0A0);
            this.b.g();
        }
        super.a(n2, n3, f2);
    }

    private void h() {
        q q2 = this.c.b();
        if (q2.f()) {
            this.f.i = "O";
            if (q2.b() != null) {
                this.b.a(q2.b().c());
            }
        } else {
            this.f.i = "X";
            this.b.a("-");
        }
    }

    private void i() {
        switch (this.k) {
            case a: {
                this.g.i = net.minecraft.client.f.u.a("advMode.mode.sequence", new Object[0]);
                break;
            }
            case b: {
                this.g.i = net.minecraft.client.f.u.a("advMode.mode.auto", new Object[0]);
                break;
            }
            case c: {
                this.g.i = net.minecraft.client.f.u.a("advMode.mode.redstone", new Object[0]);
            }
        }
    }

    private void q() {
        switch (this.k) {
            case a: {
                this.k = net.minecraft.f.n.b;
                break;
            }
            case b: {
                this.k = net.minecraft.f.n.c;
                break;
            }
            case c: {
                this.k = net.minecraft.f.n.a;
            }
        }
    }

    private void r() {
        this.h.i = this.m ? net.minecraft.client.f.u.a("advMode.mode.conditional", new Object[0]) : net.minecraft.client.f.u.a("advMode.mode.unconditional", new Object[0]);
    }

    private void s() {
        this.i.i = this.v ? net.minecraft.client.f.u.a("advMode.mode.autoexec.bat", new Object[0]) : net.minecraft.client.f.u.a("advMode.mode.redstoneTriggered", new Object[0]);
    }

    @Override
    public void a(String ... arrstring) {
        this.l.a(arrstring);
    }
}

