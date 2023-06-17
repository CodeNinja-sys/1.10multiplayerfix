/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.d;

import com.a.a.b.cm;
import net.minecraft.m.cg;
import net.minecraft.m.cu;

class g
implements cm {
    private final cg a;
    private final int b;

    public g(cg cg2) {
        this(cg2, -1);
    }

    public g(cg cg2, int n2) {
        this.a = cg2;
        this.b = n2;
    }

    public boolean a(cu cu2) {
        return cu2 != null && cu2.a() == this.a && (this.b == -1 || this.b == cu2.h());
    }

    @Override
    public /* synthetic */ boolean a(Object object) {
        return this.a((cu)object);
    }
}

