/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.a.a.b;

import java.util.Random;
import java.util.UUID;
import net.minecraft.h.k;
import net.minecraft.m.cu;
import net.minecraft.q.a.a.a.a;
import net.minecraft.q.a.a.b.o;
import net.minecraft.q.a.a.b.x;
import net.minecraft.q.a.a.m;
import net.minecraft.w.b.a.h;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class e
extends o {
    private static final d a = c.c();
    private final x[] b;

    public e(a[] arra, x[] arrx) {
        super(arra);
        this.b = arrx;
    }

    @Override
    public cu a(cu cu2, Random random, m m2) {
        x[] arrx = this.b;
        int n2 = this.b.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            x x2 = arrx[i2];
            UUID uUID = x.a(x2);
            if (uUID == null) {
                uUID = UUID.randomUUID();
            }
            k k2 = x.b(x2)[random.nextInt(x.b(x2).length)];
            cu2.a(x.c(x2), new h(uUID, x.d(x2), x.e(x2).b(random), x.f(x2)), k2);
        }
        return cu2;
    }

    static /* synthetic */ x[] a(e e2) {
        return e2.b;
    }
}

