/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.a.a.a;

import com.a.a.d.sz;
import java.util.Map;
import java.util.Random;
import net.minecraft.q.a.a.a.a;
import net.minecraft.q.a.a.a.b;
import net.minecraft.q.a.a.a.e;
import net.minecraft.q.a.a.a.j;
import net.minecraft.q.a.a.a.l;
import net.minecraft.q.a.a.a.n;
import net.minecraft.q.a.a.a.o;
import net.minecraft.q.a.a.m;
import net.minecraft.u.bp;

public class i {
    private static final Map a = sz.c();
    private static final Map b = sz.c();

    static {
        i.a(new o());
        i.a(new b());
        i.a(new j());
        i.a(new n());
        i.a(new l());
    }

    public static void a(e e2) {
        bp bp2 = e2.a();
        Class class_ = e2.b();
        if (a.containsKey(bp2)) {
            throw new IllegalArgumentException("Can't re-register item condition name " + bp2);
        }
        if (b.containsKey(class_)) {
            throw new IllegalArgumentException("Can't re-register item condition class " + class_.getName());
        }
        a.put(bp2, e2);
        b.put(class_, e2);
    }

    public static boolean a(a[] arra, Random random, m m2) {
        if (arra == null) {
            return true;
        }
        a[] arra2 = arra;
        int n2 = arra.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            a a2 = arra2[i2];
            if (a2.a(random, m2)) continue;
            return false;
        }
        return true;
    }

    public static e a(bp bp2) {
        e e2 = (e)a.get(bp2);
        if (e2 == null) {
            throw new IllegalArgumentException("Unknown loot item condition '" + bp2 + "'");
        }
        return e2;
    }

    public static e a(a a2) {
        e e2 = (e)b.get(a2.getClass());
        if (e2 == null) {
            throw new IllegalArgumentException("Unknown loot item condition " + a2);
        }
        return e2;
    }
}

