/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.d.b;

import net.minecraft.u.b.b;
import net.minecraft.x.d.a;
import net.minecraft.x.p;

public class s
implements p {
    private b a;

    public s() {
    }

    public s(b b2) {
        this.a = b2;
    }

    @Override
    public void a(net.minecraft.x.a a2) {
        this.a = a2.c();
    }

    @Override
    public void b(net.minecraft.x.a a2) {
        a2.a(this.a);
    }

    public void a(a a2) {
        a2.a(this);
    }

    public b a() {
        return this.a;
    }
}

