/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.d.a;

import net.minecraft.x.a;
import net.minecraft.x.d.b;
import net.minecraft.x.p;

public class t
implements p {
    private int a;
    private short b;
    private boolean c;

    public t() {
    }

    public t(int n2, short s2, boolean bl2) {
        this.a = n2;
        this.b = s2;
        this.c = bl2;
    }

    public void a(b b2) {
        b2.a(this);
    }

    @Override
    public void a(a a2) {
        this.a = a2.E();
        this.b = a2.G();
        this.c = a2.E() != 0;
    }

    @Override
    public void b(a a2) {
        a2.B(this.a);
        a2.C(this.b);
        a2.B(this.c ? 1 : 0);
    }

    public int a() {
        return this.a;
    }

    public short b() {
        return this.b;
    }
}

