/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.a.a.b;

import java.util.Random;
import net.minecraft.m.a.w;
import net.minecraft.m.cu;
import net.minecraft.q.a.a.a.a;
import net.minecraft.q.a.a.b.o;
import net.minecraft.q.a.a.m;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class p
extends o {
    private static final d a = c.c();

    public p(a[] arra) {
        super(arra);
    }

    @Override
    public cu a(cu cu2, Random random, m m2) {
        cu cu3 = w.a().a(cu2);
        if (cu3 == null) {
            a.f("Couldn't smelt {} because there is no smelting recipe", cu2);
            return cu2;
        }
        cu cu4 = cu3.j();
        cu4.b = cu2.b;
        return cu4;
    }
}

