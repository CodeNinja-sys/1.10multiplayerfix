/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import java.util.Random;
import net.minecraft.a.w;
import net.minecraft.g.a.e;
import net.minecraft.g.c.b;
import net.minecraft.g.dq;
import net.minecraft.m.cg;

public class ah
extends dq {
    @Override
    public cg a(b b2, Random random, int n2) {
        if (n2 > 3) {
            n2 = 3;
        }
        return random.nextInt(10 - n2 * 3) == 0 ? net.minecraft.a.w.am : cg.a(this);
    }

    @Override
    public e g(b b2) {
        return e.m;
    }

    @Override
    public int l(b b2) {
        return -8356741;
    }
}

