/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.a.a.b;

import com.a.b.ad;
import com.a.b.u;
import com.a.b.z;
import net.minecraft.q.a.a.a.a;
import net.minecraft.q.a.a.b.l;
import net.minecraft.q.a.a.b.o;
import net.minecraft.q.a.a.b.w;
import net.minecraft.q.a.a.f;
import net.minecraft.u.bc;
import net.minecraft.u.bp;

public class k
extends w {
    protected k() {
        super(new bp("looting_enchant"), l.class);
    }

    public void a(z z2, l l2, ad ad2) {
        z2.a("count", ad2.a(l.a(l2)));
        if (l.b(l2) > 0) {
            z2.a("limit", ad2.a(l.b(l2)));
        }
    }

    public l a(z z2, u u2, a[] arra) {
        int n2 = bc.a(z2, "limit", 0);
        return new l(arra, (f)bc.a(z2, "count", u2, f.class), n2);
    }

    @Override
    public /* synthetic */ o b(z z2, u u2, a[] arra) {
        return this.a(z2, u2, arra);
    }
}

