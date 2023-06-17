/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.d.a;

import net.minecraft.u.ai;
import net.minecraft.w.a.i;
import net.minecraft.x.a;
import net.minecraft.x.d.b;
import net.minecraft.x.p;

public class ad
implements p {
    private String a;
    private int b;
    private i c;
    private boolean d;
    private int e;
    private ai f;

    public ad() {
    }

    public ad(String string, int n2, i i2, boolean bl2, int n3, ai ai2) {
        this.a = string;
        this.b = n2;
        this.c = i2;
        this.d = bl2;
        this.e = n3;
        this.f = ai2;
    }

    @Override
    public void a(a a2) {
        this.a = a2.e(7);
        this.b = a2.E();
        this.c = (i)a2.a(i.class);
        this.d = a2.D();
        this.e = a2.F();
        this.f = (ai)a2.a(ai.class);
    }

    @Override
    public void b(a a2) {
        a2.a(this.a);
        a2.B(this.b);
        a2.a(this.c);
        a2.a(this.d);
        a2.B(this.e);
        a2.a(this.f);
    }

    public void a(b b2) {
        b2.a(this);
    }

    public String a() {
        return this.a;
    }

    public i b() {
        return this.c;
    }

    public boolean c() {
        return this.d;
    }

    public int d() {
        return this.e;
    }

    public ai e() {
        return this.f;
    }
}

