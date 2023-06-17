/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k.b;

import net.minecraft.a.p;
import net.minecraft.client.f.u;
import net.minecraft.client.g.bd;
import net.minecraft.client.g.c.d;
import net.minecraft.client.k.cc;
import net.minecraft.client.k.ch;
import net.minecraft.f.ad;
import net.minecraft.g.cn;
import net.minecraft.u.d.k;
import net.minecraft.x.d.a.s;
import org.lwjgl.a.g;

public class r
extends cc {
    private final ad a;
    private int b;
    private int c;
    private ch d;

    public r(ad ad2) {
        this.a = ad2;
    }

    @Override
    public void ct_() {
        this.r.clear();
        g.a(true);
        this.d = this.b(new ch(0, this.p / 2 - 100, this.q / 4 + 120, net.minecraft.client.f.u.a("gui.done", new Object[0])));
        this.a.a(false);
    }

    @Override
    public void cs_() {
        g.a(false);
        net.minecraft.client.l.g g2 = this.n.v();
        if (g2 != null) {
            g2.a(new s(this.a.D(), this.a.a));
        }
        this.a.a(true);
    }

    @Override
    public void bY_() {
        ++this.b;
    }

    @Override
    protected void a(ch ch2) {
        if (ch2.k && ch2.j == 0) {
            this.a.C();
            this.n.a((cc)null);
        }
    }

    @Override
    protected void a(char c2, int n2) {
        if (n2 == 200) {
            this.c = this.c - 1 & 3;
        }
        if (n2 == 208 || n2 == 28 || n2 == 156) {
            this.c = this.c + 1 & 3;
        }
        String string = this.a.a[this.c].c();
        if (n2 == 14 && !string.isEmpty()) {
            string = string.substring(0, string.length() - 1);
        }
        if (net.minecraft.u.d.a(c2) && this.u.a(String.valueOf(string) + c2) <= 90) {
            string = String.valueOf(string) + c2;
        }
        this.a.a[this.c] = new k(string);
        if (n2 == 1) {
            this.a(this.d);
        }
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.m();
        this.a(this.u, net.minecraft.client.f.u.a("sign.edit", new Object[0]), this.p / 2, 40, 0xFFFFFF);
        bd.c(1.0f, 1.0f, 1.0f, 1.0f);
        bd.D();
        bd.c((float)(this.p / 2), 0.0f, 50.0f);
        float f3 = 93.75f;
        bd.b(-93.75f, -93.75f, -93.75f);
        bd.b(180.0f, 0.0f, 1.0f, 0.0f);
        cn cn2 = this.a.E();
        if (cn2 == net.minecraft.a.p.an) {
            float f4 = (float)(this.a.bL_() * 360) / 16.0f;
            bd.b(f4, 0.0f, 1.0f, 0.0f);
            bd.c(0.0f, -1.0625f, 0.0f);
        } else {
            int n4 = this.a.bL_();
            float f5 = 0.0f;
            if (n4 == 2) {
                f5 = 180.0f;
            }
            if (n4 == 4) {
                f5 = 90.0f;
            }
            if (n4 == 5) {
                f5 = -90.0f;
            }
            bd.b(f5, 0.0f, 1.0f, 0.0f);
            bd.c(0.0f, -1.0625f, 0.0f);
        }
        if (this.b / 6 % 2 == 0) {
            this.a.c = this.c;
        }
        net.minecraft.client.g.c.d.a.a(this.a, -0.5, -0.75, -0.5, 0.0f);
        this.a.c = -1;
        bd.E();
        super.a(n2, n3, f2);
    }
}

