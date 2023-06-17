/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.a.a.c;

import java.util.Random;
import net.minecraft.q.a.a.c.e;
import net.minecraft.w.n;

public class a
implements e {
    private final boolean a;

    public a(boolean bl2) {
        this.a = bl2;
    }

    @Override
    public boolean a(Random random, n n2) {
        return n2.cy() == this.a;
    }

    static /* synthetic */ boolean a(a a2) {
        return a2.a;
    }
}

