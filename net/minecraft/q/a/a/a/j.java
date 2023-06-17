/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.a.a.a;

import com.a.b.ad;
import com.a.b.u;
import com.a.b.w;
import com.a.b.z;
import java.util.Map;
import java.util.Set;
import net.minecraft.q.a.a.a.a;
import net.minecraft.q.a.a.a.d;
import net.minecraft.q.a.a.a.e;
import net.minecraft.q.a.a.c.c;
import net.minecraft.q.a.a.q;
import net.minecraft.u.bc;
import net.minecraft.u.bp;

public class j
extends e {
    protected j() {
        super(new bp("entity_properties"), d.class);
    }

    public void a(z z2, d d2, ad ad2) {
        z z3 = new z();
        for (net.minecraft.q.a.a.c.e e2 : d.a(d2)) {
            net.minecraft.q.a.a.c.d d3 = c.a(e2);
            z3.a(d3.a().toString(), d3.a(e2, ad2));
        }
        z2.a("properties", z3);
        z2.a("entity", ad2.a((Object)d.b(d2)));
    }

    public d a(z z2, u u2) {
        Set set = bc.k(z2, "properties").b();
        net.minecraft.q.a.a.c.e[] arre = new net.minecraft.q.a.a.c.e[set.size()];
        int n2 = 0;
        for (Map.Entry entry : set) {
            arre[n2++] = c.a(new bp((String)entry.getKey())).b((w)entry.getValue(), u2);
        }
        return new d(arre, (q)((Object)bc.a(z2, "entity", u2, q.class)));
    }

    @Override
    public /* synthetic */ a b(z z2, u u2) {
        return this.a(z2, u2);
    }
}

