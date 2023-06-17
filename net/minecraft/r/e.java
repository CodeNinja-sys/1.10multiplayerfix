/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.r;

import net.minecraft.r.k;
import net.minecraft.r.l;

class e
implements l {
    e() {
    }

    @Override
    public String a(int n2) {
        double d2 = (double)n2 / 100.0;
        double d3 = d2 / 1000.0;
        return d3 > 0.5 ? String.valueOf(k.n().format(d3)) + " km" : (d2 > 0.5 ? String.valueOf(k.n().format(d2)) + " m" : String.valueOf(n2) + " cm");
    }
}

