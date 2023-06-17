/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.b;

import com.a.a.b.cm;
import net.minecraft.w.b.ae;
import net.minecraft.w.b.s;
import net.minecraft.w.l;

class o
implements cm {
    final /* synthetic */ ae a;

    o(ae ae2) {
        this.a = ae2;
    }

    public boolean a(l l2) {
        double d2 = this.a.f();
        if (l2.G()) {
            d2 *= (double)0.8f;
        }
        return l2.cD() ? false : ((double)l2.m(ae.a(this.a)) > d2 ? false : s.a(ae.a(this.a), l2, false, true));
    }

    @Override
    public /* synthetic */ boolean a(Object object) {
        return this.a((l)object);
    }
}

