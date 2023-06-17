/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.d.a;

import com.c.c.d.e;
import net.minecraft.s.f;
import net.minecraft.s.n;

public class u
extends n {
    protected n a;
    protected String b;
    private String s;
    protected String c;
    protected String d;
    protected int e;
    private int t;

    public u(n n2, String string, String string2, int n3) {
        this.a = n2;
        this.b = string;
        this.s = string2;
        this.e = n3;
        this.c = u.f("gui.yes");
        this.d = u.f("gui.no");
    }

    public u(n n2, String string, String string2, String string3, String string4, int n3) {
        this.a = n2;
        this.b = string;
        this.s = string2;
        this.c = string3;
        this.d = string4;
        this.e = n3;
    }

    @Override
    public void d() {
        this.b(u.a(0, this.r() / 2 - 105, com.c.c.d.e.a(9), 100, 20, this.c));
        this.b(u.a(1, this.r() / 2 + 5, com.c.c.d.e.a(9), 100, 20, this.d));
    }

    @Override
    public void a(f f2) {
        this.a.a(f2.c() == 0, this.e);
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.p();
        this.a(this.b, this.r() / 2, com.c.c.d.e.a(3), 0xFFFFFF);
        this.a(this.s, this.r() / 2, com.c.c.d.e.a(5), 0xFFFFFF);
        super.a(n2, n3, f2);
    }

    public void a(int n2) {
        this.t = n2;
        for (f f2 : this.v()) {
            f2.b(false);
        }
    }

    @Override
    public void g() {
        super.g();
        if (--this.t == 0) {
            for (f f2 : this.v()) {
                f2.b(true);
            }
        }
    }
}

