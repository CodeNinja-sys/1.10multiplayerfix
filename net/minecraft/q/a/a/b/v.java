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

public class v
extends o {
    private final f a;
    private final boolean b;

    public v(a[] arra, f f2, boolean bl2) {
        super(arra);
        this.a = f2;
        this.b = bl2;
    }

    @Override
    public cu a(cu cu2, Random random, m m2) {
        net.minecraft.o.f.a(random, cu2, this.a.a(random), this.b);
        return cu2;
    }

    static /* synthetic */ f a(v v2) {
        return v2.a;
    }

    static /* synthetic */ boolean b(v v2) {
        return v2.b;
    }
}

