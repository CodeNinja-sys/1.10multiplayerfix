/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.m;

import net.minecraft.m.cl;
import net.minecraft.m.cu;
import net.minecraft.m.cy;
import net.minecraft.q.k;
import net.minecraft.w.a.b;
import net.minecraft.w.l;

class at
implements cy {
    final /* synthetic */ cl a;

    at(cl cl2) {
        this.a = cl2;
    }

    @Override
    public float a(cu cu2, k k2, l l2) {
        return l2 == null ? 0.0f : (l2.bC() == cu2 && l2 instanceof b && ((b)l2).P != null ? 1.0f : 0.0f);
    }
}

