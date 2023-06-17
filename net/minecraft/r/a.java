/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.r;

import net.minecraft.r.k;
import net.minecraft.r.l;

class a
implements l {
    a() {
    }

    @Override
    public String a(int n2) {
        double d2 = (double)n2 / 20.0;
        double d3 = d2 / 60.0;
        double d4 = d3 / 60.0;
        double d5 = d4 / 24.0;
        double d6 = d5 / 365.0;
        return d6 > 0.5 ? String.valueOf(k.n().format(d6)) + " y" : (d5 > 0.5 ? String.valueOf(k.n().format(d5)) + " d" : (d4 > 0.5 ? String.valueOf(k.n().format(d4)) + " h" : (d3 > 0.5 ? String.valueOf(k.n().format(d3)) + " m" : String.valueOf(d2) + " s")));
    }
}

