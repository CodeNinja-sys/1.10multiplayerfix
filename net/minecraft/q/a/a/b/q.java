/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.a.a.b;

import java.util.Random;
import net.minecraft.e.e;
import net.minecraft.m.cu;
import net.minecraft.q.a.a.a.a;
import net.minecraft.q.a.a.b.o;
import net.minecraft.q.a.a.m;

public class q
extends o {
    private final e a;

    public q(a[] arra, e e2) {
        super(arra);
        this.a = e2;
    }

    @Override
    public cu a(cu cu2, Random random, m m2) {
        e e2 = cu2.o();
        if (e2 == null) {
            e2 = this.a.g();
        } else {
            e2.a(this.a);
        }
        cu2.d(e2);
        return cu2;
    }

    static /* synthetic */ e a(q q2) {
        return q2.a;
    }
}

