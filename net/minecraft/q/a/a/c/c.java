/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.a.a.c;

import com.a.a.d.sz;
import java.util.Map;
import net.minecraft.q.a.a.c.b;
import net.minecraft.q.a.a.c.d;
import net.minecraft.q.a.a.c.e;
import net.minecraft.u.bp;

public class c {
    private static final Map a = sz.c();
    private static final Map b = sz.c();

    static {
        c.a(new b());
    }

    public static void a(d d2) {
        bp bp2 = d2.a();
        Class class_ = d2.b();
        if (a.containsKey(bp2)) {
            throw new IllegalArgumentException("Can't re-register entity property name " + bp2);
        }
        if (b.containsKey(class_)) {
            throw new IllegalArgumentException("Can't re-register entity property class " + class_.getName());
        }
        a.put(bp2, d2);
        b.put(class_, d2);
    }

    public static d a(bp bp2) {
        d d2 = (d)a.get(bp2);
        if (d2 == null) {
            throw new IllegalArgumentException("Unknown loot entity property '" + bp2 + "'");
        }
        return d2;
    }

    public static d a(e e2) {
        d d2 = (d)b.get(e2.getClass());
        if (d2 == null) {
            throw new IllegalArgumentException("Unknown loot entity property " + e2);
        }
        return d2;
    }
}

