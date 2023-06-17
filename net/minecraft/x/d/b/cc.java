/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.d.b;

import net.minecraft.w.n;
import net.minecraft.x.d.a;
import net.minecraft.x.p;

public class cc
implements p {
    private int a;
    private int b;

    public cc() {
    }

    public cc(n n2, n n3) {
        this.a = n2.ca();
        this.b = n3 != null ? n3.ca() : -1;
    }

    @Override
    public void a(net.minecraft.x.a a2) {
        this.a = a2.K();
        this.b = a2.K();
    }

    @Override
    public void b(net.minecraft.x.a a2) {
        a2.E(this.a);
        a2.E(this.b);
    }

    public void a(a a2) {
        a2.a(this);
    }

    public int a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }
}

