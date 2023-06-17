/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.e;

import com.a.a.b.cm;
import net.minecraft.w.a.b;
import net.minecraft.w.e.g;
import net.minecraft.w.h.ac;
import net.minecraft.w.l;

class bg
implements cm {
    private final g a;

    public bg(g g2) {
        this.a = g2;
    }

    public boolean a(l l2) {
        return (l2 instanceof b || l2 instanceof ac) && l2.n(this.a) > 9.0;
    }

    @Override
    public /* synthetic */ boolean a(Object object) {
        return this.a((l)object);
    }
}

