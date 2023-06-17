/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.b.a.a;

import com.a.a.b.bl;
import com.a.a.d.mq;
import com.a.b.aa;
import com.a.b.u;
import com.a.b.v;
import com.a.b.w;
import com.a.b.z;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Set;
import net.minecraft.client.g.b.a.a.f;
import net.minecraft.client.g.b.a.a.g;
import net.minecraft.client.g.b.a.a.h;
import net.minecraft.client.g.b.a.a.j;
import net.minecraft.client.g.b.a.a.n;
import net.minecraft.client.g.b.a.a.o;
import net.minecraft.client.g.b.a.a.q;
import net.minecraft.client.g.b.a.al;
import net.minecraft.u.bc;

public class c
implements v {
    private static final bl a = new o();
    private static final bl b = new f();

    public j a(w w2, Type type, u u2) {
        z z2 = w2.t();
        return new j(this.b(z2), (al)u2.a(z2.c("apply"), (Type)((Object)al.class)));
    }

    private h b(z z2) {
        return z2.b("when") ? c.a(bc.k(z2, "when")) : h.a;
    }

    static h a(z z2) {
        Set set = z2.b();
        if (set.isEmpty()) {
            throw new aa("No elements found in selector");
        }
        return set.size() == 1 ? (z2.b("OR") ? new q(mq.a((Iterable)bc.l(z2, "OR"), a)) : (z2.b("AND") ? new g(mq.a((Iterable)bc.l(z2, "AND"), a)) : c.b((Map.Entry)set.iterator().next()))) : new g(mq.a((Iterable)set, b));
    }

    private static n b(Map.Entry entry) {
        return new n((String)entry.getKey(), ((w)entry.getValue()).d());
    }

    @Override
    public /* synthetic */ Object b(w w2, Type type, u u2) {
        return this.a(w2, type, u2);
    }

    static /* synthetic */ n a(Map.Entry entry) {
        return c.b(entry);
    }
}

