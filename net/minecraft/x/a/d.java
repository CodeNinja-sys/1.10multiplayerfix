/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.a;

import com.a.a.b.cg;
import net.minecraft.g.c.b;
import net.minecraft.g.cn;
import net.minecraft.x.a;
import net.minecraft.x.a.g;
import net.minecraft.x.a.m;

class d
implements m {
    d() {
    }

    public void a(a a2, cg cg2) {
        if (cg2.b()) {
            a2.d(cn.p((b)cg2.c()));
        } else {
            a2.d(0);
        }
    }

    public cg a(a a2) {
        int n2 = a2.e();
        return n2 == 0 ? cg.f() : cg.b(cn.e(n2));
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

