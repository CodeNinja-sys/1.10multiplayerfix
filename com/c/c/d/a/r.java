/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.d.a;

import com.c.c.d.e;
import net.minecraft.s.b;
import net.minecraft.s.f;
import net.minecraft.s.n;

public class r
extends n {
    private static final int a = 0;
    private final n b;
    private final boolean c;

    public r(n n2, boolean bl2) {
        this.b = n2;
        this.c = bl2;
    }

    @Override
    public void d() {
        this.u();
        this.b(com.c.c.d.a.r.a(0, this.r() / 2 - 100, e.a(12), "Back"));
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.p();
        String string = this.c ? com.c.c.d.a.r.f("mco.client.outdated.title") : com.c.c.d.a.r.f("mco.client.incompatible.title");
        this.a(string, this.r() / 2, e.a(3), 0xFF0000);
        int n4 = this.c ? 2 : 3;
        for (int i2 = 0; i2 < n4; ++i2) {
            String string2 = this.c ? com.c.c.d.a.r.f("mco.client.outdated.msg.line" + (i2 + 1)) : com.c.c.d.a.r.f("mco.client.incompatible.msg.line" + (i2 + 1));
            this.a(string2, this.r() / 2, e.a(5) + i2 * 12, 0xFFFFFF);
        }
        super.a(n2, n3, f2);
    }

    @Override
    public void a(f f2) {
        if (f2.c() == 0) {
            net.minecraft.s.b.a(this.b);
        }
    }

    @Override
    public void a(char c2, int n2) {
        if (n2 == 28 || n2 == 156 || n2 == 1) {
            net.minecraft.s.b.a(this.b);
        }
    }
}

