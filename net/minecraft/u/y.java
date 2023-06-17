/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u;

import com.a.a.b.cm;
import net.minecraft.w.n;

class y
implements cm {
    private final /* synthetic */ double a;
    private final /* synthetic */ double b;
    private final /* synthetic */ double c;
    private final /* synthetic */ double d;

    y(double d2, double d3, double d4, double d5) {
        this.a = d2;
        this.b = d3;
        this.c = d4;
        this.d = d5;
    }

    public boolean a(n n2) {
        return n2 != null && n2.h(this.a, this.b, this.c) <= this.d;
    }
}

