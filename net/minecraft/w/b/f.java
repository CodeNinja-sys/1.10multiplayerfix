/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.b;

import com.a.a.b.cm;
import net.minecraft.u.r;
import net.minecraft.w.b.y;
import net.minecraft.w.l;

class f
implements cm {
    final /* synthetic */ y a;
    private final /* synthetic */ cm b;

    f(y y2, cm cm2) {
        this.a = y2;
        this.b = cm2;
    }

    public boolean a(l l2) {
        return l2 == null ? false : (this.b != null && !this.b.a(l2) ? false : (!r.e.a(l2) ? false : this.a.a(l2, false)));
    }

    @Override
    public /* synthetic */ boolean a(Object object) {
        return this.a((l)object);
    }
}

