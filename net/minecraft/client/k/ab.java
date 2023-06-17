/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k;

import net.minecraft.client.b.a;
import net.minecraft.client.b.e;
import net.minecraft.client.f.u;
import net.minecraft.client.k.cc;
import net.minecraft.client.k.ch;
import net.minecraft.client.k.cp;
import net.minecraft.client.k.d;
import net.minecraft.client.k.j;
import net.minecraft.client.r;

public class ab
extends cc {
    private static final e[] d = new e[]{net.minecraft.client.b.e.a, net.minecraft.client.b.e.b, net.minecraft.client.b.e.y, net.minecraft.client.b.e.M};
    private final cc e;
    protected String a = "Controls";
    private final a f;
    public net.minecraft.client.b.d b;
    public long c;
    private j g;
    private ch h;

    public ab(cc cc2, a a2) {
        this.e = cc2;
        this.f = a2;
    }

    @Override
    public void ct_() {
        this.g = new j(this, this.n);
        this.r.add(new ch(200, this.p / 2 - 155, this.q - 29, 150, 20, net.minecraft.client.f.u.a("gui.done", new Object[0])));
        this.h = this.b(new ch(201, this.p / 2 - 155 + 160, this.q - 29, 150, 20, net.minecraft.client.f.u.a("controls.resetAll", new Object[0])));
        this.a = net.minecraft.client.f.u.a("controls.title", new Object[0]);
        int n2 = 0;
        e[] arre = d;
        int n3 = d.length;
        for (int i2 = 0; i2 < n3; ++i2) {
            e e2 = arre[i2];
            if (e2.a()) {
                this.r.add(new d(e2.c(), this.p / 2 - 155 + n2 % 2 * 160, 18 + 24 * (n2 >> 1), e2));
            } else {
                this.r.add(new cp(e2.c(), this.p / 2 - 155 + n2 % 2 * 160, 18 + 24 * (n2 >> 1), e2, this.f.c(e2)));
            }
            ++n2;
        }
    }

    @Override
    public void cp_() {
        super.cp_();
        this.g.cr_();
    }

    @Override
    protected void a(ch ch2) {
        if (ch2.j == 200) {
            this.n.a(this.e);
        } else if (ch2.j == 201) {
            net.minecraft.client.b.d[] arrd = this.n.w.ao;
            int n2 = this.n.w.ao.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                net.minecraft.client.b.d d2 = arrd[i2];
                d2.b(d2.i());
            }
            net.minecraft.client.b.d.c();
        } else if (ch2.j < 100 && ch2 instanceof cp) {
            this.f.a(((cp)ch2).a(), 1);
            ch2.i = this.f.c(net.minecraft.client.b.e.a(ch2.j));
        }
    }

    @Override
    protected void a(int n2, int n3, int n4) {
        if (this.b != null) {
            this.f.a(this.b, -100 + n4);
            this.b = null;
            net.minecraft.client.b.d.c();
        } else if (n4 != 0 || !this.g.a(n2, n3, n4)) {
            super.a(n2, n3, n4);
        }
    }

    @Override
    protected void b(int n2, int n3, int n4) {
        if (n4 != 0 || !this.g.c(n2, n3, n4)) {
            super.b(n2, n3, n4);
        }
    }

    @Override
    protected void a(char c2, int n2) {
        if (this.b != null) {
            if (n2 == 1) {
                this.f.a(this.b, 0);
            } else if (n2 != 0) {
                this.f.a(this.b, n2);
            } else if (c2 > '\u0000') {
                this.f.a(this.b, c2 + 256);
            }
            this.b = null;
            this.c = net.minecraft.client.r.I();
            net.minecraft.client.b.d.c();
        } else {
            super.a(c2, n2);
        }
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.m();
        this.g.a(n2, n3, f2);
        this.a(this.u, this.a, this.p / 2, 8, 0xFFFFFF);
        boolean bl2 = false;
        net.minecraft.client.b.d[] arrd = this.f.ao;
        int n4 = this.f.ao.length;
        for (int i2 = 0; i2 < n4; ++i2) {
            net.minecraft.client.b.d d2 = arrd[i2];
            if (d2.j() == d2.i()) continue;
            bl2 = true;
            break;
        }
        this.h.k = bl2;
        super.a(n2, n3, f2);
    }
}

