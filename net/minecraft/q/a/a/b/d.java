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

public class d
extends o {
    private final f a;

    public d(a[] arra, f f2) {
        super(arra);
        this.a = f2;
    }

    @Override
    public cu a(cu cu2, Random random, m m2) {
        cu2.b = this.a.a(random);
        return cu2;
    }

    static /* synthetic */ f a(d d2) {
        return d2.a;
    }
}

