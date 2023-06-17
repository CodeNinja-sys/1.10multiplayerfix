/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g;

import com.a.a.d.ov;
import java.util.List;
import net.minecraft.client.g.bd;
import net.minecraft.client.g.e.q;
import net.minecraft.u.b.b;
import net.minecraft.u.c;

public abstract class bo {
    private double c;
    private double d;
    private double e;
    protected List a = ov.b(17424);
    protected boolean b;

    public void a(double d2, double d3, double d4) {
        this.b = true;
        this.a.clear();
        this.c = d2;
        this.d = d3;
        this.e = d4;
    }

    public void a(q q2) {
        b b2 = q2.j();
        bd.c((float)((double)b2.cy_() - this.c), (float)((double)b2.k() - this.d), (float)((double)b2.l() - this.e));
    }

    public void a(q q2, c c2) {
        this.a.add(q2);
    }

    public abstract void a(c var1);
}

