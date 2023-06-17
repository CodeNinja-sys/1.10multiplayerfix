/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.a.a.a;

import java.util.Random;
import net.minecraft.q.a.a.a.a;
import net.minecraft.q.a.a.c.e;
import net.minecraft.q.a.a.m;
import net.minecraft.q.a.a.q;
import net.minecraft.w.n;

public class d
implements a {
    private final e[] a;
    private final q b;

    public d(e[] arre, q q2) {
        this.a = arre;
        this.b = q2;
    }

    @Override
    public boolean a(Random random, m m2) {
        n n2 = m2.a(this.b);
        if (n2 == null) {
            return false;
        }
        e[] arre = this.a;
        int n3 = this.a.length;
        for (int i2 = 0; i2 < n3; ++i2) {
            e e2 = arre[i2];
            if (e2.a(random, n2)) continue;
            return false;
        }
        return true;
    }

    static /* synthetic */ e[] a(d d2) {
        return d2.a;
    }

    static /* synthetic */ q b(d d2) {
        return d2.b;
    }
}

