/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k.b;

import io.netty.b.bi;
import net.minecraft.client.f.u;
import net.minecraft.client.k.b.c;
import net.minecraft.client.k.cc;
import net.minecraft.client.k.ch;
import net.minecraft.client.k.dn;
import net.minecraft.f.q;
import net.minecraft.u.au;
import net.minecraft.u.bx;
import net.minecraft.x.a;
import org.lwjgl.a.g;

public class j
extends cc
implements au {
    private dn a;
    private dn b;
    private final q c;
    private ch d;
    private ch e;
    private ch f;
    private boolean g;
    private bx h;

    public j(q q2) {
        this.c = q2;
    }

    @Override
    public void bY_() {
        this.a.a();
    }

    @Override
    public void ct_() {
        org.lwjgl.a.g.a(true);
        this.r.clear();
        this.d = this.b(new ch(0, this.p / 2 - 4 - 150, this.q / 4 + 120 + 12, 150, 20, net.minecraft.client.f.u.a("gui.done", new Object[0])));
        this.e = this.b(new ch(1, this.p / 2 + 4, this.q / 4 + 120 + 12, 150, 20, net.minecraft.client.f.u.a("gui.cancel", new Object[0])));
        this.f = this.b(new ch(4, this.p / 2 + 150 - 20, 150, 20, 20, "O"));
        this.a = new dn(2, this.u, this.p / 2 - 150, 50, 300, 20);
        this.a.f(32500);
        this.a.b(true);
        this.a.a(this.c.c());
        this.b = new dn(3, this.u, this.p / 2 - 150, 150, 276, 20);
        this.b.f(32500);
        this.b.c(false);
        this.b.a("-");
        this.g = this.c.f();
        this.f();
        this.d.k = !this.a.b().trim().isEmpty();
        this.h = new c(this, this.a, true);
    }

    @Override
    public void cs_() {
        org.lwjgl.a.g.a(false);
    }

    @Override
    protected void a(ch ch2) {
        if (ch2.k) {
            if (ch2.j == 1) {
                this.c.a(this.g);
                this.n.a((cc)null);
            } else if (ch2.j == 0) {
                a a2 = new a(bi.a());
                a2.B(this.c.e());
                this.c.a(a2);
                a2.a(this.a.b());
                a2.a(this.c.f());
                this.n.v().a(new net.minecraft.x.d.a.j("MC|AdvCmd", a2));
                if (!this.c.f()) {
                    this.c.b((net.minecraft.u.d.a)null);
                }
                this.n.a((cc)null);
            } else if (ch2.j == 4) {
                this.c.a(!this.c.f());
                this.f();
            }
        }
    }

    @Override
    protected void a(char c2, int n2) {
        this.h.d();
        if (n2 == 15) {
            this.h.a();
        } else {
            this.h.c();
        }
        this.a.a(c2, n2);
        this.b.a(c2, n2);
        boolean bl2 = this.d.k = !this.a.b().trim().isEmpty();
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
            n4 = n4 + n5 * this.u.a + 16;
            this.b(this.u, net.minecraft.client.f.u.a("advMode.previousOutput", new Object[0]), this.p / 2 - 150, n4, 0xA0A0A0);
            this.b.g();
        }
        super.a(n2, n3, f2);
    }

    private void f() {
        if (this.c.f()) {
            this.f.i = "O";
            if (this.c.b() != null) {
                this.b.a(this.c.b().c());
            }
        } else {
            this.f.i = "X";
            this.b.a("-");
        }
    }

    @Override
    public void a(String ... arrstring) {
        this.h.a(arrstring);
    }

    static /* synthetic */ q a(j j2) {
        return j2.c;
    }
}

