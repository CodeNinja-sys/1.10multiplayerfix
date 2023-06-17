/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.d.b;

import net.minecraft.u.b.b;
import net.minecraft.x.d.a;
import net.minecraft.x.p;

public class ac
implements p {
    private b a;

    public ac() {
    }

    public ac(b b2) {
        this.a = b2;
    }

    public void a(a a2) {
        a2.a(this);
    }

    @Override
    public void a(net.minecraft.x.a a2) {
        this.a = a2.c();
    }

    @Override
    public void b(net.minecraft.x.a a2) {
        a2.a(this.a);
    }

    public b a() {
        return this.a;
    }
}

