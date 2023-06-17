/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.a;

import net.minecraft.x.a;
import net.minecraft.x.a.g;
import net.minecraft.x.a.m;

class k
implements m {
    k() {
    }

    public void a(a a2, Float f2) {
        a2.a(f2.floatValue());
    }

    public Float a(a a2) {
        return Float.valueOf(a2.O());
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

