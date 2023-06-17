/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.d.a;

import com.c.c.d.a.ad;
import com.c.c.d.e;
import net.minecraft.s.f;
import net.minecraft.s.n;

public class ac
extends n {
    private final ad e;
    private final String s;
    private final String t;
    protected final n a;
    protected final String b;
    protected final String c;
    private final String u;
    protected final int d;
    private final boolean v;

    public ac(n n2, ad ad2, String string, String string2, boolean bl2, int n3) {
        this.a = n2;
        this.d = n3;
        this.e = ad2;
        this.s = string;
        this.t = string2;
        this.v = bl2;
        this.b = ac.f("gui.yes");
        this.c = ac.f("gui.no");
        this.u = ac.f("mco.gui.ok");
    }

    @Override
    public void d() {
        if (this.v) {
            this.b(ac.a(0, this.r() / 2 - 105, com.c.c.d.e.a(8), 100, 20, this.b));
            this.b(ac.a(1, this.r() / 2 + 5, com.c.c.d.e.a(8), 100, 20, this.c));
        } else {
            this.b(ac.a(0, this.r() / 2 - 50, com.c.c.d.e.a(8), 100, 20, this.u));
        }
    }

    @Override
    public void a(f f2) {
        this.a.a(f2.c() == 0, this.d);
    }

    @Override
    public void a(char c2, int n2) {
        if (n2 == 1) {
            this.a.a(false, this.d);
        }
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.p();
        this.a(this.e.d, this.r() / 2, com.c.c.d.e.a(2), this.e.c);
        this.a(this.s, this.r() / 2, com.c.c.d.e.a(4), 0xFFFFFF);
        this.a(this.t, this.r() / 2, com.c.c.d.e.a(6), 0xFFFFFF);
        super.a(n2, n3, f2);
    }
}

