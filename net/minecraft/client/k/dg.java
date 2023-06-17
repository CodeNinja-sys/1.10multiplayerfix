/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k;

import net.minecraft.client.f.u;
import net.minecraft.client.k.cc;
import net.minecraft.client.k.ch;

public class dg
extends cc {
    private final String a;
    private final String b;

    public dg(String string, String string2) {
        this.a = string;
        this.b = string2;
    }

    @Override
    public void ct_() {
        super.ct_();
        this.r.add(new ch(0, this.p / 2 - 100, 140, net.minecraft.client.f.u.a("gui.cancel", new Object[0])));
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.b(0, 0, this.p, this.q, -12574688, -11530224);
        this.a(this.u, this.a, this.p / 2, 90, 0xFFFFFF);
        this.a(this.u, this.b, this.p / 2, 110, 0xFFFFFF);
        super.a(n2, n3, f2);
    }

    @Override
    protected void a(char c2, int n2) {
    }

    @Override
    protected void a(ch ch2) {
        this.n.a((cc)null);
    }
}

