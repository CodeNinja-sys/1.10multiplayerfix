/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k;

import net.minecraft.client.f.u;
import net.minecraft.client.k.bh;
import net.minecraft.client.k.ch;
import net.minecraft.client.l.g;
import net.minecraft.x.d.a.h;
import net.minecraft.x.d.a.p;

public class bb
extends bh {
    @Override
    public void ct_() {
        super.ct_();
        this.r.add(new ch(1, this.p / 2 - 100, this.q - 40, net.minecraft.client.f.u.a("multiplayer.stopSleeping", new Object[0])));
    }

    @Override
    protected void a(char c2, int n2) {
        if (n2 == 1) {
            this.f();
        } else if (n2 != 28 && n2 != 156) {
            super.a(c2, n2);
        } else {
            String string = this.a.b().trim();
            if (!string.isEmpty()) {
                this.n.j.b(string);
            }
            this.a.a("");
            this.n.t.c().d();
        }
    }

    @Override
    protected void a(ch ch2) {
        if (ch2.j == 1) {
            this.f();
        } else {
            super.a(ch2);
        }
    }

    private void f() {
        g g2 = this.n.j.d;
        g2.a(new p(this.n.j, h.c));
    }
}

