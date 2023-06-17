/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.a.a;

import com.a.b.ad;
import com.a.b.ae;
import com.a.b.ag;
import com.a.b.u;
import com.a.b.v;
import com.a.b.w;
import com.a.b.z;
import java.lang.reflect.Type;
import net.minecraft.q.a.a.h;
import net.minecraft.q.a.a.k;
import net.minecraft.q.a.a.l;
import net.minecraft.q.a.a.s;
import net.minecraft.u.bc;

public class a
implements ae,
v {
    public s a(w w2, Type type, u u2) {
        z z2 = bc.f(w2, "loot item");
        String string = bc.f(z2, "type");
        int n2 = bc.a(z2, "weight", 1);
        int n3 = bc.a(z2, "quality", 0);
        net.minecraft.q.a.a.a.a[] arra = z2.b("conditions") ? (net.minecraft.q.a.a.a.a[])bc.a(z2, "conditions", u2, net.minecraft.q.a.a.a.a[].class) : new net.minecraft.q.a.a.a.a[0];
        if ("item".equals(string)) {
            return l.a(z2, u2, n2, n3, arra);
        }
        if ("loot_table".equals(string)) {
            return k.a(z2, u2, n2, n3, arra);
        }
        if ("empty".equals(string)) {
            return h.a(z2, u2, n2, n3, arra);
        }
        throw new ag("Unknown loot entry type '" + string + "'");
    }

    public w a(s s2, Type type, ad ad2) {
        z z2 = new z();
        z2.a("weight", s2.c);
        z2.a("quality", s2.d);
        if (s2.e.length > 0) {
            z2.a("conditions", ad2.a(s2.e));
        }
        if (s2 instanceof l) {
            z2.a("type", "item");
        } else if (s2 instanceof k) {
            z2.a("type", "item");
        } else {
            if (!(s2 instanceof h)) {
                throw new IllegalArgumentException("Don't know how to serialize " + s2);
            }
            z2.a("type", "empty");
        }
        s2.a(z2, ad2);
        return z2;
    }

    @Override
    public /* synthetic */ w a(Object object, Type type, ad ad2) {
        return this.a((s)object, type, ad2);
    }

    @Override
    public /* synthetic */ Object b(w w2, Type type, u u2) {
        return this.a(w2, type, u2);
    }
}

