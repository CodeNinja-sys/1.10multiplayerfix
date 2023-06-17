/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.b;

import com.a.a.b.cm;
import net.minecraft.w.a.b;
import net.minecraft.w.b.ag;
import net.minecraft.w.b.s;
import net.minecraft.w.n;

class l
implements cm {
    final /* synthetic */ ag a;

    l(ag ag2) {
        this.a = ag2;
    }

    public boolean a(n n2) {
        if (!(n2 instanceof b)) {
            return false;
        }
        if (((b)n2).J.a) {
            return false;
        }
        double d2 = this.a.f();
        if (n2.G()) {
            d2 *= (double)0.8f;
        }
        if (n2.cD()) {
            float f2 = ((b)n2).W();
            if (f2 < 0.1f) {
                f2 = 0.1f;
            }
            d2 *= (double)(0.7f * f2);
        }
        return (double)n2.m(ag.a(this.a)) > d2 ? false : s.a(ag.a(this.a), (net.minecraft.w.l)n2, false, true);
    }

    @Override
    public /* synthetic */ boolean a(Object object) {
        return this.a((n)object);
    }
}

