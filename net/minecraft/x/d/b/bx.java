/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.d.b;

import net.minecraft.g.c.b;
import net.minecraft.g.cn;
import net.minecraft.q.k;
import net.minecraft.x.d.a;
import net.minecraft.x.p;

public class bx
implements p {
    private net.minecraft.u.b.b a;
    private b b;

    public bx() {
    }

    public bx(k k2, net.minecraft.u.b.b b2) {
        this.a = b2;
        this.b = k2.n(b2);
    }

    @Override
    public void a(net.minecraft.x.a a2) {
        this.a = a2.c();
        this.b = (b)cn.w.a(a2.e());
    }

    @Override
    public void b(net.minecraft.x.a a2) {
        a2.a(this.a);
        a2.d(cn.w.a(this.b));
    }

    public void a(a a2) {
        a2.a(this);
    }

    public b a() {
        return this.b;
    }

    public net.minecraft.u.b.b b() {
        return this.a;
    }
}

