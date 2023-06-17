/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.b;

import java.util.Random;
import net.minecraft.q.b.ab;
import net.minecraft.q.b.d;
import net.minecraft.q.b.n;
import net.minecraft.q.g.a.q;

public class ag
extends n {
    public ag(ab ab2) {
        super(net.minecraft.q.b.d.c, ab2);
    }

    @Override
    public q a(Random random) {
        return random.nextBoolean() ? net.minecraft.q.b.n.a : net.minecraft.q.b.n.b;
    }
}

