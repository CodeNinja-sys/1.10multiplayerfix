/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.a.a.b;

import java.util.Random;
import net.minecraft.m.cu;
import net.minecraft.q.a.a.a.a;
import net.minecraft.q.a.a.b.o;
import net.minecraft.q.a.a.m;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class f
extends o {
    private static final d a = c.c();
    private final net.minecraft.q.a.a.f b;

    public f(a[] arra, net.minecraft.q.a.a.f f2) {
        super(arra);
        this.b = f2;
    }

    @Override
    public cu a(cu cu2, Random random, m m2) {
        if (cu2.d()) {
            a.f("Couldn't set data of loot item {}", cu2);
        } else {
            cu2.b(this.b.a(random));
        }
        return cu2;
    }

    static /* synthetic */ net.minecraft.q.a.a.f a(f f2) {
        return f2.b;
    }
}

