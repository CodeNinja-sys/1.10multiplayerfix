/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.d.b;

import net.minecraft.e.e;
import net.minecraft.u.b.b;
import net.minecraft.x.d.a;
import net.minecraft.x.p;

public class j
implements p {
    private b a;
    private int b;
    private e c;

    public j() {
    }

    public j(b b2, int n2, e e2) {
        this.a = b2;
        this.b = n2;
        this.c = e2;
    }

    @Override
    public void a(net.minecraft.x.a a2) {
        this.a = a2.c();
        this.b = a2.F();
        this.c = a2.h();
    }

    @Override
    public void b(net.minecraft.x.a a2) {
        a2.a(this.a);
        a2.B((byte)this.b);
        a2.a(this.c);
    }

    public void a(a a2) {
        a2.a(this);
    }

    public b a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public e c() {
        return this.c;
    }
}

