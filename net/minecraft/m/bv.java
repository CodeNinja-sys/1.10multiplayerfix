/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.m;

import net.minecraft.e.e;
import net.minecraft.e.q;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.r.o;
import net.minecraft.u.a;
import net.minecraft.u.ab;
import net.minecraft.u.ah;
import net.minecraft.w.a.b;

public class bv
extends cg {
    public bv() {
        this.d(1);
    }

    @Override
    public a a(cu cu2, k k2, b b2, ah ah2) {
        b2.a(cu2, ah2);
        b2.a(o.b(this));
        return new a(ab.a, cu2);
    }

    public static boolean b(e e2) {
        if (e2 == null) {
            return false;
        }
        if (!e2.b("pages", 9)) {
            return false;
        }
        q q2 = e2.c("pages", 8);
        for (int i2 = 0; i2 < q2.e(); ++i2) {
            String string = q2.g(i2);
            if (string == null) {
                return false;
            }
            if (string.length() <= 32767) continue;
            return false;
        }
        return true;
    }
}

