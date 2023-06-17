/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.o;

import net.minecraft.h.k;
import net.minecraft.m.bd;
import net.minecraft.m.bn;
import net.minecraft.m.ca;
import net.minecraft.m.cg;
import net.minecraft.m.cl;
import net.minecraft.m.dn;

public enum ae {
    a,
    b,
    c,
    d,
    e,
    f,
    g,
    h,
    i,
    j,
    k;


    public boolean a(cg cg2) {
        if (this == a) {
            return true;
        }
        if (this == j && cg2.l()) {
            return true;
        }
        if (cg2 instanceof dn) {
            if (this == b) {
                return true;
            }
            dn dn2 = (dn)cg2;
            return dn2.c == net.minecraft.h.k.f ? this == f : (dn2.c == net.minecraft.h.k.d ? this == d : (dn2.c == net.minecraft.h.k.e ? this == e : (dn2.c == net.minecraft.h.k.c ? this == c : false)));
        }
        return cg2 instanceof ca ? this == g : (cg2 instanceof bd ? this == h : (cg2 instanceof bn ? this == k : (cg2 instanceof cl ? this == i : false)));
    }
}

