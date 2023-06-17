/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.d.a;

import net.minecraft.x.a;
import net.minecraft.x.d.b;
import net.minecraft.x.p;

public class q
implements p {
    private int a;

    public q() {
    }

    public q(int n2) {
        this.a = n2;
    }

    @Override
    public void a(a a2) {
        this.a = a2.G();
    }

    @Override
    public void b(a a2) {
        a2.C(this.a);
    }

    public void a(b b2) {
        b2.a(this);
    }

    public int a() {
        return this.a;
    }
}

