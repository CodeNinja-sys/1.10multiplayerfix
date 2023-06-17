/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.e.b;

import net.minecraft.u.d.b;
import net.minecraft.x.p;

public class a
implements p {
    private net.minecraft.u.d.a a;

    public a() {
    }

    public a(net.minecraft.u.d.a a2) {
        this.a = a2;
    }

    @Override
    public void a(net.minecraft.x.a a2) {
        this.a = b.b(a2.e(32767));
    }

    @Override
    public void b(net.minecraft.x.a a2) {
        a2.a(this.a);
    }

    public void a(net.minecraft.x.e.a a2) {
        a2.a(this);
    }

    public net.minecraft.u.d.a a() {
        return this.a;
    }
}

