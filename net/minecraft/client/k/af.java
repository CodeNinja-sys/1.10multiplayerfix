/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k;

import net.minecraft.client.f.u;
import net.minecraft.client.g.bd;
import net.minecraft.client.i.d;
import net.minecraft.client.k.at;
import net.minecraft.client.k.bu;
import net.minecraft.client.k.cc;
import net.minecraft.client.k.ch;
import net.minecraft.client.k.ci;
import net.minecraft.client.k.y;
import net.minecraft.u.d.a;
import net.minecraft.u.d.o;

public class af
extends cc
implements bu {
    private int a;
    private final a b;

    public af(a a2) {
        this.b = a2;
    }

    @Override
    public void ct_() {
        this.r.clear();
        this.a = 0;
        if (this.n.h.F().s()) {
            this.r.add(new ch(0, this.p / 2 - 100, this.q / 4 + 72, net.minecraft.client.f.u.a("deathScreen.spectate", new Object[0])));
            this.r.add(new ch(1, this.p / 2 - 100, this.q / 4 + 96, net.minecraft.client.f.u.a("deathScreen." + (this.n.D() ? "deleteWorld" : "leaveServer"), new Object[0])));
        } else {
            this.r.add(new ch(0, this.p / 2 - 100, this.q / 4 + 72, net.minecraft.client.f.u.a("deathScreen.respawn", new Object[0])));
            this.r.add(new ch(1, this.p / 2 - 100, this.q / 4 + 96, net.minecraft.client.f.u.a("deathScreen.titleScreen", new Object[0])));
            if (this.n.K() == null) {
                ((ch)this.r.get((int)1)).k = false;
            }
        }
        for (ch ch2 : this.r) {
            ch2.k = false;
        }
    }

    @Override
    protected void a(char c2, int n2) {
    }

    @Override
    protected void a(ch ch2) {
        switch (ch2.j) {
            case 0: {
                this.n.j.q();
                this.n.a((cc)null);
                break;
            }
            case 1: {
                if (this.n.h.F().s()) {
                    this.n.a(new ci());
                    break;
                }
                at at2 = new at(this, net.minecraft.client.f.u.a("deathScreen.quit.confirm", new Object[0]), "", net.minecraft.client.f.u.a("deathScreen.titleScreen", new Object[0]), net.minecraft.client.f.u.a("deathScreen.respawn", new Object[0]), 0);
                this.n.a(at2);
                at2.a(20);
            }
        }
    }

    @Override
    public void a(boolean bl2, int n2) {
        if (bl2) {
            if (this.n.h != null) {
                this.n.h.e();
            }
            this.n.a((d)null);
            this.n.a(new ci());
        } else {
            this.n.j.q();
            this.n.a((cc)null);
        }
    }

    @Override
    public void a(int n2, int n3, float f2) {
        a a2;
        boolean bl2 = this.n.h.F().s();
        this.b(0, 0, this.p, this.q, 0x60500000, -1602211792);
        bd.D();
        bd.b(2.0f, 2.0f, 2.0f);
        this.a(this.u, net.minecraft.client.f.u.a(bl2 ? "deathScreen.title.hardcore" : "deathScreen.title", new Object[0]), this.p / 2 / 2, 30, 0xFFFFFF);
        bd.E();
        if (this.b != null) {
            this.a(this.u, this.b.d(), this.p / 2, 85, 0xFFFFFF);
        }
        this.a(this.u, String.valueOf(net.minecraft.client.f.u.a("deathScreen.score", new Object[0])) + ": " + (Object)((Object)net.minecraft.u.d.o.o) + this.n.j.V(), this.p / 2, 100, 0xFFFFFF);
        if (this.b != null && n3 > 85 && n3 < 85 + this.u.a && (a2 = this.a(n2)) != null && a2.a().i() != null) {
            this.a(a2, n2, n3);
        }
        super.a(n2, n3, f2);
    }

    public a a(int n2) {
        if (this.b == null) {
            return null;
        }
        int n3 = this.n.m.a(this.b.d());
        int n4 = this.p / 2 - n3 / 2;
        int n5 = this.p / 2 + n3 / 2;
        int n6 = n4;
        if (n2 >= n4 && n2 <= n5) {
            for (a a2 : this.b) {
                if ((n6 += this.n.m.a(net.minecraft.client.k.y.a(a2.b(), false))) <= n2) continue;
                return a2;
            }
            return null;
        }
        return null;
    }

    @Override
    public boolean cq_() {
        return false;
    }

    @Override
    public void bY_() {
        super.bY_();
        ++this.a;
        if (this.a == 20) {
            for (ch ch2 : this.r) {
                ch2.k = true;
            }
        }
    }
}

