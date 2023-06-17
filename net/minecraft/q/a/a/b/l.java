/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.a.a.b;

import java.util.Random;
import net.minecraft.m.cu;
import net.minecraft.q.a.a.a.a;
import net.minecraft.q.a.a.b.o;
import net.minecraft.q.a.a.f;
import net.minecraft.q.a.a.m;
import net.minecraft.w.n;

public class l
extends o {
    private final f a;
    private final int b;

    public l(a[] arra, f f2, int n2) {
        super(arra);
        this.a = f2;
        this.b = n2;
    }

    @Override
    public cu a(cu cu2, Random random, m m2) {
        n n2 = m2.c();
        if (n2 instanceof net.minecraft.w.l) {
            int n3 = net.minecraft.o.f.h((net.minecraft.w.l)n2);
            if (n3 == 0) {
                return cu2;
            }
            float f2 = (float)n3 * this.a.b(random);
            cu2.b += Math.round(f2);
            if (this.b != 0 && cu2.b > this.b) {
                cu2.b = this.b;
            }
        }
        return cu2;
    }

    static /* synthetic */ f a(l l2) {
        return l2.a;
    }

    static /* synthetic */ int b(l l2) {
        return l2.b;
    }
}

