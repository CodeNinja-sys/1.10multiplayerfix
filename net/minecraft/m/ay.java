/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.m;

import net.minecraft.a.w;
import net.minecraft.m.bn;
import net.minecraft.m.cu;
import net.minecraft.m.cy;
import net.minecraft.q.k;
import net.minecraft.w.l;

class ay
implements cy {
    final /* synthetic */ bn a;

    ay(bn bn2) {
        this.a = bn2;
    }

    @Override
    public float a(cu cu2, k k2, l l2) {
        if (l2 == null) {
            return 0.0f;
        }
        cu cu3 = l2.bR();
        return cu3 != null && cu3.a() == w.f ? (float)(cu2.l() - l2.bS()) / 20.0f : 0.0f;
    }
}

