/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.d.b;

import net.minecraft.q.l;
import net.minecraft.x.d.a;
import net.minecraft.x.p;

public class d
implements p {
    private l a;
    private boolean b;

    public d() {
    }

    public d(l l2, boolean bl2) {
        this.a = l2;
        this.b = bl2;
    }

    public void a(a a2) {
        a2.a(this);
    }

    @Override
    public void a(net.minecraft.x.a a2) {
        this.a = l.a(a2.F());
    }

    @Override
    public void b(net.minecraft.x.a a2) {
        a2.B(this.a.a());
    }

    public boolean a() {
        return this.b;
    }

    public l b() {
        return this.a;
    }
}

