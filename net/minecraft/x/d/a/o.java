/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.d.a;

import net.minecraft.x.a;
import net.minecraft.x.d.b;
import net.minecraft.x.p;

public class o
implements p {
    private int a;

    public o() {
    }

    public o(int n2) {
        this.a = n2;
    }

    @Override
    public void a(a a2) {
        this.a = a2.e();
    }

    @Override
    public void b(a a2) {
        a2.d(this.a);
    }

    public void a(b b2) {
        b2.a(this);
    }

    public int a() {
        return this.a;
    }
}

