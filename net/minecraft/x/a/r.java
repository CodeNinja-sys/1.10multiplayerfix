/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.a;

import com.a.a.b.cg;
import net.minecraft.u.b.b;
import net.minecraft.x.a;
import net.minecraft.x.a.g;
import net.minecraft.x.a.m;

class r
implements m {
    r() {
    }

    public void a(a a2, cg cg2) {
        a2.a(cg2.b());
        if (cg2.b()) {
            a2.a((b)cg2.c());
        }
    }

    public cg a(a a2) {
        return !a2.D() ? cg.f() : cg.b(a2.c());
    }

    @Override
    public g a(int n2) {
        return new g(n2, this);
    }

    @Override
    public /* synthetic */ Object b(a a2) {
        return this.a(a2);
    }
}

