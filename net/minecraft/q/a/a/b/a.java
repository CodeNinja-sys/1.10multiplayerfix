/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.a.a.b;

import com.a.a.d.sz;
import java.util.Map;
import net.minecraft.q.a.a.b.b;
import net.minecraft.q.a.a.b.i;
import net.minecraft.q.a.a.b.j;
import net.minecraft.q.a.a.b.k;
import net.minecraft.q.a.a.b.m;
import net.minecraft.q.a.a.b.n;
import net.minecraft.q.a.a.b.o;
import net.minecraft.q.a.a.b.r;
import net.minecraft.q.a.a.b.s;
import net.minecraft.q.a.a.b.t;
import net.minecraft.q.a.a.b.w;
import net.minecraft.u.bp;

public class a {
    private static final Map a = sz.c();
    private static final Map b = sz.c();

    static {
        net.minecraft.q.a.a.b.a.a(new j());
        net.minecraft.q.a.a.b.a.a(new b());
        net.minecraft.q.a.a.b.a.a(new t());
        net.minecraft.q.a.a.b.a.a(new m());
        net.minecraft.q.a.a.b.a.a(new n());
        net.minecraft.q.a.a.b.a.a(new s());
        net.minecraft.q.a.a.b.a.a(new k());
        net.minecraft.q.a.a.b.a.a(new r());
        net.minecraft.q.a.a.b.a.a(new i());
    }

    public static void a(w w2) {
        bp bp2 = w2.a();
        Class class_ = w2.b();
        if (a.containsKey(bp2)) {
            throw new IllegalArgumentException("Can't re-register item function name " + bp2);
        }
        if (b.containsKey(class_)) {
            throw new IllegalArgumentException("Can't re-register item function class " + class_.getName());
        }
        a.put(bp2, w2);
        b.put(class_, w2);
    }

    public static w a(bp bp2) {
        w w2 = (w)a.get(bp2);
        if (w2 == null) {
            throw new IllegalArgumentException("Unknown loot item function '" + bp2 + "'");
        }
        return w2;
    }

    public static w a(o o2) {
        w w2 = (w)b.get(o2.getClass());
        if (w2 == null) {
            throw new IllegalArgumentException("Unknown loot item function " + o2);
        }
        return w2;
    }
}

