/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k;

import net.minecraft.client.f.u;
import net.minecraft.client.i.a;
import net.minecraft.client.k.cc;
import net.minecraft.client.k.ch;
import net.minecraft.client.k.dn;
import org.lwjgl.a.g;

public class dl
extends cc {
    private final cc a;
    private final a b;
    private dn c;

    public dl(cc cc2, a a2) {
        this.a = cc2;
        this.b = a2;
    }

    @Override
    public void bY_() {
        this.c.a();
    }

    @Override
    public void ct_() {
        g.a(true);
        this.r.clear();
        this.r.add(new ch(0, this.p / 2 - 100, this.q / 4 + 96 + 12, net.minecraft.client.f.u.a("selectServer.select", new Object[0])));
        this.r.add(new ch(1, this.p / 2 - 100, this.q / 4 + 120 + 12, net.minecraft.client.f.u.a("gui.cancel", new Object[0])));
        this.c = new dn(2, this.u, this.p / 2 - 100, 116, 200, 20);
        this.c.f(128);
        this.c.b(true);
        this.c.a(this.n.w.aw);
        ((ch)this.r.get((int)0)).k = !this.c.b().isEmpty() && this.c.b().split(":").length > 0;
    }

    @Override
    public void cs_() {
        g.a(false);
        this.n.w.aw = this.c.b();
        this.n.w.b();
    }

    @Override
    protected void a(ch ch2) {
        if (ch2.k) {
            if (ch2.j == 1) {
                this.a.a(false, 0);
            } else if (ch2.j == 0) {
                this.b.b = this.c.b();
                this.a.a(true, 0);
            }
        }
    }

    @Override
    protected void a(char c2, int n2) {
        if (this.c.a(c2, n2)) {
            ((ch)this.r.get((int)0)).k = !this.c.b().isEmpty() && this.c.b().split(":").length > 0;
        } else if (n2 == 28 || n2 == 156) {
            this.a((ch)this.r.get(0));
        }
    }

    @Override
    protected void a(int n2, int n3, int n4) {
        super.a(n2, n3, n4);
        this.c.a(n2, n3, n4);
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.m();
        this.a(this.u, net.minecraft.client.f.u.a("selectServer.direct", new Object[0]), this.p / 2, 20, 0xFFFFFF);
        this.b(this.u, net.minecraft.client.f.u.a("addServer.enterIp", new Object[0]), this.p / 2 - 100, 100, 0xA0A0A0);
        this.c.g();
        super.a(n2, n3, f2);
    }
}

