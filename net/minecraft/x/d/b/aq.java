/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.d.b;

import net.minecraft.x.d.a;
import net.minecraft.x.p;

public class aq
implements p {
    private int a;
    private short b;
    private boolean c;

    public aq() {
    }

    public aq(int n2, short s2, boolean bl2) {
        this.a = n2;
        this.b = s2;
        this.c = bl2;
    }

    public void a(a a2) {
        a2.a(this);
    }

    @Override
    public void a(net.minecraft.x.a a2) {
        this.a = a2.F();
        this.b = a2.G();
        this.c = a2.D();
    }

    @Override
    public void b(net.minecraft.x.a a2) {
        a2.B(this.a);
        a2.C(this.b);
        a2.a(this.c);
    }

    public int a() {
        return this.a;
    }

    public short b() {
        return this.b;
    }

    public boolean c() {
        return this.c;
    }
}

