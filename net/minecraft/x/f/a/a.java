/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.f.a;

import net.minecraft.x.f.b;
import net.minecraft.x.p;

public class a
implements p {
    private long a;

    public a() {
    }

    public a(long l2) {
        this.a = l2;
    }

    @Override
    public void a(net.minecraft.x.a a2) {
        this.a = a2.M();
    }

    @Override
    public void b(net.minecraft.x.a a2) {
        a2.b(this.a);
    }

    public void a(b b2) {
        b2.a(this);
    }

    public long a() {
        return this.a;
    }
}

