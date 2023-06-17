/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.f;

import net.minecraft.f.ap;
import net.minecraft.g.cn;
import net.minecraft.k.p;

class s
implements p {
    final /* synthetic */ ap a;

    s(ap ap2) {
        this.a = ap2;
    }

    public String a() {
        int n2 = cn.c(this.a.k.n(this.a.l).c());
        try {
            return String.format("ID #%d (%s // %s)", n2, cn.d(n2).p(), cn.d(n2).getClass().getCanonicalName());
        }
        catch (Throwable throwable) {
            return "ID #" + n2;
        }
    }

    public /* synthetic */ Object call() {
        return this.a();
    }
}

