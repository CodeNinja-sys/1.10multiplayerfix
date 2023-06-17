/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.d.b;

import net.minecraft.x.d.a;
import net.minecraft.x.p;

public class ay
implements p {
    private net.minecraft.u.d.a a;
    private net.minecraft.u.d.a b;

    public ay() {
    }

    public ay(net.minecraft.u.d.a a2) {
        this.a = a2;
    }

    @Override
    public void a(net.minecraft.x.a a2) {
        this.a = a2.d();
        this.b = a2.d();
    }

    @Override
    public void b(net.minecraft.x.a a2) {
        a2.a(this.a);
        a2.a(this.b);
    }

    public void a(a a2) {
        a2.a(this);
    }

    public net.minecraft.u.d.a a() {
        return this.a;
    }

    public net.minecraft.u.d.a b() {
        return this.b;
    }
}

