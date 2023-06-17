/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.d.b;

import net.minecraft.d.c;
import net.minecraft.q.k;
import net.minecraft.w.n;
import net.minecraft.x.d.a;
import net.minecraft.x.p;

public class bs
implements p {
    private int a;
    private c b;

    public bs() {
    }

    public bs(int n2, c c2) {
        this.a = n2;
        this.b = c2;
    }

    @Override
    public void a(net.minecraft.x.a a2) {
        this.a = a2.e();
        this.b = c.a(a2.F());
    }

    @Override
    public void b(net.minecraft.x.a a2) {
        a2.d(this.a);
        a2.B(c.a(this.b));
    }

    public void a(a a2) {
        a2.a(this);
    }

    public n a(k k2) {
        return k2.a(this.a);
    }

    public c a() {
        return this.b;
    }
}

