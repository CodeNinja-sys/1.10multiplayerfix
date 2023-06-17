/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.d.b;

import net.minecraft.q.k;
import net.minecraft.w.n;
import net.minecraft.x.d.a;
import net.minecraft.x.p;

public class bi
implements p {
    public int a;

    public bi() {
    }

    public bi(n n2) {
        this.a = n2.ca();
    }

    @Override
    public void a(net.minecraft.x.a a2) {
        this.a = a2.e();
    }

    @Override
    public void b(net.minecraft.x.a a2) {
        a2.d(this.a);
    }

    public void a(a a2) {
        a2.a(this);
    }

    public n a(k k2) {
        return k2.a(this.a);
    }
}

