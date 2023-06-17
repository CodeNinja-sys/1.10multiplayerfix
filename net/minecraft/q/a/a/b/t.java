/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.a.a.b;

import com.a.b.ad;
import com.a.b.u;
import com.a.b.z;
import net.minecraft.q.a.a.a.a;
import net.minecraft.q.a.a.b.o;
import net.minecraft.q.a.a.b.v;
import net.minecraft.q.a.a.b.w;
import net.minecraft.q.a.a.f;
import net.minecraft.u.bc;
import net.minecraft.u.bp;

public class t
extends w {
    public t() {
        super(new bp("enchant_with_levels"), v.class);
    }

    public void a(z z2, v v2, ad ad2) {
        z2.a("levels", ad2.a(v.a(v2)));
        z2.a("treasure", v.b(v2));
    }

    public v a(z z2, u u2, a[] arra) {
        f f2 = (f)bc.a(z2, "levels", u2, f.class);
        boolean bl2 = bc.a(z2, "treasure", false);
        return new v(arra, f2, bl2);
    }

    @Override
    public /* synthetic */ o b(z z2, u u2, a[] arra) {
        return this.a(z2, u2, arra);
    }
}

