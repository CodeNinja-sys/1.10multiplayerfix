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

public class cb
extends cc {
    private static final e[] a = new e[]{e.p, e.q, e.r, e.s, e.t, e.z, e.B, e.C, e.A, e.F};
    private final cc b;
    private final a c;
    private String d;

    public cb(cc cc2, a a2) {
        this.b = cc2;
        this.c = a2;
    }

    @Override
    public void ct_() {
        this.d = net.minecraft.client.f.u.a("options.chat.title", new Object[0]);
        int n2 = 0;
        e[] arre = a;
        int n3 = a.length;
        for (int i2 = 0; i2 < n3; ++i2) {
            e e2 = arre[i2];
            if (e2.a()) {
                this.r.add(new d(e2.c(), this.p / 2 - 155 + n2 % 2 * 160, this.q / 6 + 24 * (n2 >> 1), e2));
            } else {
                this.r.add(new cp(e2.c(), this.p / 2 - 155 + n2 % 2 * 160, this.q / 6 + 24 * (n2 >> 1), e2, this.c.c(e2)));
            }
            ++n2;
        }
        this.r.add(new ch(200, this.p / 2 - 100, this.q / 6 + 120, net.minecraft.client.f.u.a("gui.done", new Object[0])));
    }

    @Override
    protected void a(ch ch2) {
        if (ch2.k) {
            if (ch2.j < 100 && ch2 instanceof cp) {
                this.c.a(((cp)ch2).a(), 1);
                ch2.i = this.c.c(e.a(ch2.j));
            }
            if (ch2.j == 200) {
                this.n.w.b();
                this.n.a(this.b);
            }
        }
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.m();
        this.a(this.u, this.d, this.p / 2, 20, 0xFFFFFF);
        super.a(n2, n3, f2);
    }
}

