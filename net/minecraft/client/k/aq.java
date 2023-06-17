/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k;

import net.minecraft.client.b.e;
import net.minecraft.client.f.u;
import net.minecraft.client.k.cc;
import net.minecraft.client.k.ch;
import net.minecraft.client.k.cp;
import net.minecraft.client.k.k;
import net.minecraft.w.a.j;

public class aq
extends cc {
    private final cc a;
    private String b;

    public aq(cc cc2) {
        this.a = cc2;
    }

    @Override
    public void ct_() {
        int n2 = 0;
        this.b = net.minecraft.client.f.u.a("options.skinCustomisation.title", new Object[0]);
        for (j j2 : j.values()) {
            this.r.add(new k(this, j2.b(), this.p / 2 - 155 + n2 % 2 * 160, this.q / 6 + 24 * (n2 >> 1), 150, 20, j2, null));
            ++n2;
        }
        this.r.add(new cp(199, this.p / 2 - 155 + n2 % 2 * 160, this.q / 6 + 24 * (n2 >> 1), e.H, this.n.w.c(e.H)));
        if (++n2 % 2 == 1) {
            ++n2;
        }
        this.r.add(new ch(200, this.p / 2 - 100, this.q / 6 + 24 * (n2 >> 1), net.minecraft.client.f.u.a("gui.done", new Object[0])));
    }

    @Override
    protected void a(ch ch2) {
        if (ch2.k) {
            if (ch2.j == 200) {
                this.n.w.b();
                this.n.a(this.a);
            } else if (ch2.j == 199) {
                this.n.w.a(e.H, 1);
                ch2.i = this.n.w.c(e.H);
                this.n.w.c();
            } else if (ch2 instanceof k) {
                j j2 = k.a((k)ch2);
                this.n.w.a(j2);
                ch2.i = this.a(j2);
            }
        }
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.m();
        this.a(this.u, this.b, this.p / 2, 20, 0xFFFFFF);
        super.a(n2, n3, f2);
    }

    private String a(j j2) {
        String string = this.n.w.d().contains((Object)j2) ? net.minecraft.client.f.u.a("options.on", new Object[0]) : net.minecraft.client.f.u.a("options.off", new Object[0]);
        return String.valueOf(j2.d().d()) + ": " + string;
    }

    static /* synthetic */ String a(aq aq2, j j2) {
        return aq2.a(j2);
    }
}

