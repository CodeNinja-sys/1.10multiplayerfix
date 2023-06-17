/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.a.a.a;

import java.util.Random;
import net.minecraft.q.a.a.a.a;
import net.minecraft.q.a.a.m;

public class k
implements a {
    private final boolean a;

    public k(boolean bl2) {
        this.a = bl2;
    }

    @Override
    public boolean a(Random random, m m2) {
        boolean bl2 = m2.b() != null;
        return bl2 == !this.a;
    }

    static /* synthetic */ boolean a(k k2) {
        return k2.a;
    }
}

