/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.a.a.a;

import java.util.Map;
import java.util.Random;
import net.minecraft.j.j;
import net.minecraft.j.r;
import net.minecraft.q.a.a.a.a;
import net.minecraft.q.a.a.f;
import net.minecraft.q.a.a.q;
import net.minecraft.w.a.g;
import net.minecraft.w.n;

public class m
implements a {
    private final Map a;
    private final q b;

    public m(Map map, q q2) {
        this.a = map;
        this.b = q2;
    }

    @Override
    public boolean a(Random random, net.minecraft.q.a.a.m m2) {
        n n2 = m2.a(this.b);
        if (n2 == null) {
            return false;
        }
        r r2 = n2.aQ.Q();
        for (Map.Entry entry : this.a.entrySet()) {
            if (this.a(n2, r2, (String)entry.getKey(), (f)entry.getValue())) continue;
            return false;
        }
        return true;
    }

    protected boolean a(n n2, r r2, String string, f f2) {
        j j2 = r2.b(string);
        if (j2 == null) {
            return false;
        }
        String string2 = n2 instanceof g ? n2.X() : n2.cN();
        return !r2.b(string2, j2) ? false : f2.a(r2.c(string2, j2).b());
    }

    static /* synthetic */ Map a(m m2) {
        return m2.a;
    }

    static /* synthetic */ q b(m m2) {
        return m2.b;
    }
}

