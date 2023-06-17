/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.f;

import net.minecraft.a.p;
import net.minecraft.f.ap;
import net.minecraft.g.a.h;
import net.minecraft.q.k;
import net.minecraft.u.b.b;
import net.minecraft.u.b.n;

public class e
extends ap {
    public byte a;
    public boolean b;

    @Override
    public net.minecraft.e.e a(net.minecraft.e.e e2) {
        super.a(e2);
        e2.a("note", this.a);
        e2.a("powered", this.b);
        return e2;
    }

    @Override
    public void b(net.minecraft.e.e e2) {
        super.b(e2);
        this.a = e2.f("note");
        this.a = (byte)net.minecraft.u.b.n.a(this.a, 0, 24);
        this.b = e2.p("powered");
    }

    public void a() {
        this.a = (byte)((this.a + 1) % 25);
        this.C();
    }

    public void a(k k2, b b2) {
        if (k2.n(b2.b()).d() == h.a) {
            h h2 = k2.n(b2.c()).d();
            int n2 = 0;
            if (h2 == h.e) {
                n2 = 1;
            }
            if (h2 == h.p) {
                n2 = 2;
            }
            if (h2 == h.s) {
                n2 = 3;
            }
            if (h2 == h.d) {
                n2 = 4;
            }
            k2.c(b2, p.B, n2, this.a);
        }
    }
}

