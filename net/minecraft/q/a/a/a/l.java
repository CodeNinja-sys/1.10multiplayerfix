/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.a.a.a;

import com.a.a.d.sz;
import com.a.b.ad;
import com.a.b.u;
import com.a.b.w;
import com.a.b.z;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import net.minecraft.q.a.a.a.a;
import net.minecraft.q.a.a.a.e;
import net.minecraft.q.a.a.a.m;
import net.minecraft.q.a.a.f;
import net.minecraft.q.a.a.q;
import net.minecraft.u.bc;
import net.minecraft.u.bp;

public class l
extends e {
    protected l() {
        super(new bp("entity_scores"), m.class);
    }

    public void a(z z2, m m2, ad ad2) {
        z z3 = new z();
        for (Map.Entry entry : m.a(m2).entrySet()) {
            z3.a((String)entry.getKey(), ad2.a(entry.getValue()));
        }
        z2.a("scores", z3);
        z2.a("entity", ad2.a((Object)m.b(m2)));
    }

    public m a(z z2, u u2) {
        Set set = bc.k(z2, "scores").b();
        LinkedHashMap linkedHashMap = sz.d();
        for (Map.Entry entry : set) {
            linkedHashMap.put((String)entry.getKey(), (f)bc.a((w)entry.getValue(), "score", u2, f.class));
        }
        return new m(linkedHashMap, (q)((Object)bc.a(z2, "entity", u2, q.class)));
    }

    @Override
    public /* synthetic */ a b(z z2, u u2) {
        return this.a(z2, u2);
    }
}

