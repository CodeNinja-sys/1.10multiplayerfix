/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k.b;

import net.minecraft.client.k.b.l;
import net.minecraft.client.k.b.m;
import net.minecraft.client.k.b.t;
import net.minecraft.d.c;

class u
extends t {
    private final c b;
    private final int c;
    final /* synthetic */ m a;

    public u(m m2, int n2, int n3, int n4, c c2, int n5) {
        this.a = m2;
        super(n2, n3, n4, net.minecraft.client.k.b.l.b, c2.d() % 8 * 18, 198 + c2.d() / 8 * 18);
        this.b = c2;
        this.c = n5;
    }

    @Override
    public void b(int n2, int n3) {
        String string = net.minecraft.client.f.u.a(this.b.b(), new Object[0]);
        if (this.c >= 3 && this.b != net.minecraft.a.c.j) {
            string = String.valueOf(string) + " II";
        }
        net.minecraft.client.k.b.m.a(this.a, string, n2, n3);
    }

    static /* synthetic */ c a(u u2) {
        return u2.b;
    }

    static /* synthetic */ int b(u u2) {
        return u2.c;
    }
}

