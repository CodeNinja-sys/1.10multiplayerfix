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
import net.minecraft.u.b.n;
import org.apache.logging.log4j.d;

public class c
extends o {
    private static final d a = org.apache.logging.log4j.c.c();
    private final f b;

    public c(a[] arra, f f2) {
        super(arra);
        this.b = f2;
    }

    @Override
    public cu a(cu cu2, Random random, m m2) {
        if (cu2.d()) {
            float f2 = 1.0f - this.b.b(random);
            cu2.b(n.d(f2 * (float)cu2.i()));
        } else {
            a.f("Couldn't set damage of loot item {}", cu2);
        }
        return cu2;
    }

    static /* synthetic */ f a(c c2) {
        return c2.b;
    }
}

