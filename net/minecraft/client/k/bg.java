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
import net.minecraft.client.k.t;
import net.minecraft.u.bu;

public class bg
extends cc {
    private final cc b;
    private final a c;
    protected String a = "Options";
    private String d;

    public bg(cc cc2, a a2) {
        this.b = cc2;
        this.c = a2;
    }

    @Override
    public void ct_() {
        this.a = net.minecraft.client.f.u.a("options.sounds.title", new Object[0]);
        this.d = net.minecraft.client.f.u.a("options.off", new Object[0]);
        int n2 = 0;
        this.r.add(new t(this, bu.a.ordinal(), this.p / 2 - 155 + n2 % 2 * 160, this.q / 6 - 12 + 24 * (n2 >> 1), bu.a, true));
        n2 += 2;
        for (bu bu2 : bu.values()) {
            if (bu2 == bu.a) continue;
            this.r.add(new t(this, bu2.ordinal(), this.p / 2 - 155 + n2 % 2 * 160, this.q / 6 - 12 + 24 * (n2 >> 1), bu2, false));
            ++n2;
        }
        int n3 = this.p / 2 - 75;
        int n4 = this.q / 6 - 12;
        this.r.add(new cp(201, n3, n4 + 24 * (++n2 >> 1), e.K, this.c.c(e.K)));
        this.r.add(new ch(200, this.p / 2 - 100, this.q / 6 + 168, net.minecraft.client.f.u.a("gui.done", new Object[0])));
    }

    @Override
    protected void a(ch ch2) {
        if (ch2.k) {
            if (ch2.j == 200) {
                this.n.w.b();
                this.n.a(this.b);
            } else if (ch2.j == 201) {
                this.n.w.a(e.K, 1);
                ch2.i = this.n.w.c(e.K);
                this.n.w.b();
            }
        }
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.m();
        this.a(this.u, this.a, this.p / 2, 15, 0xFFFFFF);
        super.a(n2, n3, f2);
    }

    protected String a(bu bu2) {
        float f2 = this.c.a(bu2);
        return f2 == 0.0f ? this.d : String.valueOf((int)(f2 * 100.0f)) + "%";
    }

    static /* synthetic */ a a(bg bg2) {
        return bg2.c;
    }
}

