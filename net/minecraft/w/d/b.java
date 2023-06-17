/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.d;

import net.minecraft.w.e;
import net.minecraft.w.n;

public class b
extends n {
    public final e a;
    public final String b;

    public b(e e2, String string, float f2, float f3) {
        super(e2.a());
        this.d(f2, f3);
        this.a = e2;
        this.b = string;
    }

    @Override
    protected void cb_() {
    }

    @Override
    protected void b(net.minecraft.e.e e2) {
    }

    @Override
    protected void a(net.minecraft.e.e e2) {
    }

    @Override
    public boolean cg_() {
        return true;
    }

    @Override
    public boolean a(net.minecraft.u.n n2, float f2) {
        return this.b(n2) ? false : this.a.a(this, n2, f2);
    }

    @Override
    public boolean x(n n2) {
        return this == n2 || this.a == n2;
    }
}

