/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.m;

import com.a.a.d.aad;
import java.util.Set;
import net.minecraft.g.a.h;
import net.minecraft.g.c.b;
import net.minecraft.m.bd;
import net.minecraft.m.cu;
import net.minecraft.m.p;

public class n
extends bd {
    private static final Set l = aad.a(net.minecraft.a.p.f, net.minecraft.a.p.X, net.minecraft.a.p.r, net.minecraft.a.p.s, net.minecraft.a.p.ae, net.minecraft.a.p.aU, net.minecraft.a.p.aZ, net.minecraft.a.p.bk, net.minecraft.a.p.au, net.minecraft.a.p.cd, net.minecraft.a.p.aB);
    private static final float[] m = new float[]{6.0f, 8.0f, 8.0f, 8.0f, 6.0f};
    private static final float[] n = new float[]{-3.2f, -3.2f, -3.1f, -3.0f, -3.0f};

    protected n(p p2) {
        super(p2, l);
        this.b = m[p2.ordinal()];
        this.c = n[p2.ordinal()];
    }

    @Override
    public float a(cu cu2, b b2) {
        h h2 = b2.d();
        return h2 != net.minecraft.g.a.h.d && h2 != net.minecraft.g.a.h.k && h2 != net.minecraft.g.a.h.l ? super.a(cu2, b2) : this.a;
    }
}

