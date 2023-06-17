/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.d.b;

import net.minecraft.q.k;
import net.minecraft.w.a.b;
import net.minecraft.x.d.a;

public class p
implements net.minecraft.x.p {
    private int a;
    private net.minecraft.u.b.b b;

    public p() {
    }

    public p(b b2, net.minecraft.u.b.b b3) {
        this.a = b2.ca();
        this.b = b3;
    }

    @Override
    public void a(net.minecraft.x.a a2) {
        this.a = a2.e();
        this.b = a2.c();
    }

    @Override
    public void b(net.minecraft.x.a a2) {
        a2.d(this.a);
        a2.a(this.b);
    }

    public void a(a a2) {
        a2.a(this);
    }

    public b a(k k2) {
        return (b)k2.a(this.a);
    }

    public net.minecraft.u.b.b a() {
        return this.b;
    }
}

