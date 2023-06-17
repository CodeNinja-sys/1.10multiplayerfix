/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.d.b;

import net.minecraft.x.d.a;
import net.minecraft.x.p;

public class af
implements p {
    private net.minecraft.u.d.a a;

    public af() {
    }

    public af(net.minecraft.u.d.a a2) {
        this.a = a2;
    }

    @Override
    public void a(net.minecraft.x.a a2) {
        this.a = a2.d();
    }

    @Override
    public void b(net.minecraft.x.a a2) {
        a2.a(this.a);
    }

    public void a(a a2) {
        a2.a(this);
    }

    public net.minecraft.u.d.a a() {
        return this.a;
    }
}

