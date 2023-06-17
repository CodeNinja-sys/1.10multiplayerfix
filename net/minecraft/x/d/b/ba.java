/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.d.b;

import net.minecraft.q.k;
import net.minecraft.w.n;
import net.minecraft.x.d.a;
import net.minecraft.x.p;

public class ba
implements p {
    private int a;
    private byte b;

    public ba() {
    }

    public ba(n n2, byte by2) {
        this.a = n2.ca();
        this.b = by2;
    }

    @Override
    public void a(net.minecraft.x.a a2) {
        this.a = a2.e();
        this.b = a2.E();
    }

    @Override
    public void b(net.minecraft.x.a a2) {
        a2.d(this.a);
        a2.B(this.b);
    }

    public void a(a a2) {
        a2.a(this);
    }

    public n a(k k2) {
        return k2.a(this.a);
    }

    public byte a() {
        return this.b;
    }
}

