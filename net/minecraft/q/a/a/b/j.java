/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.a.a.b;

import com.a.b.ad;
import com.a.b.u;
import com.a.b.z;
import net.minecraft.q.a.a.a.a;
import net.minecraft.q.a.a.b.d;
import net.minecraft.q.a.a.b.o;
import net.minecraft.q.a.a.b.w;
import net.minecraft.q.a.a.f;
import net.minecraft.u.bc;
import net.minecraft.u.bp;

public class j
extends w {
    protected j() {
        super(new bp("set_count"), d.class);
    }

    public void a(z z2, d d2, ad ad2) {
        z2.a("count", ad2.a(d.a(d2)));
    }

    public d a(z z2, u u2, a[] arra) {
        return new d(arra, (f)bc.a(z2, "count", u2, f.class));
    }

    @Override
    public /* synthetic */ o b(z z2, u u2, a[] arra) {
        return this.a(z2, u2, arra);
    }
}

