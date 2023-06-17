/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.m;

import net.minecraft.m.bn;
import net.minecraft.m.cu;
import net.minecraft.m.cy;
import net.minecraft.q.k;
import net.minecraft.w.l;

class bq
implements cy {
    final /* synthetic */ bn a;

    bq(bn bn2) {
        this.a = bn2;
    }

    @Override
    public float a(cu cu2, k k2, l l2) {
        return l2 != null && l2.B() && l2.bR() == cu2 ? 1.0f : 0.0f;
    }
}

