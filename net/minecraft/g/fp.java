/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import com.a.a.b.cm;
import net.minecraft.g.er;
import net.minecraft.u.ad;
import net.minecraft.w.n;

class fp
implements cm {
    final /* synthetic */ er a;
    private final /* synthetic */ ad b;

    fp(er er2, ad ad2) {
        this.a = er2;
        this.b = ad2;
    }

    public boolean a(n n2) {
        return n2 != null && n2.cl_() == this.b;
    }

    @Override
    public /* synthetic */ boolean a(Object object) {
        return this.a((n)object);
    }
}

