/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.b;

import net.minecraft.w.b.bd;
import net.minecraft.w.b.bm;

class r {
    public final bm a;
    public final int b;
    public boolean c;
    final /* synthetic */ bd d;

    public r(bd bd2, int n2, bm bm2) {
        this.d = bd2;
        this.b = n2;
        this.a = bm2;
    }

    public boolean equals(Object object) {
        return this == object ? true : (object != null && this.getClass() == object.getClass() ? this.a.equals(((r)object).a) : false);
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}

