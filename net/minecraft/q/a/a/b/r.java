/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.a.a.b;

import com.a.b.ad;
import com.a.b.u;
import com.a.b.z;
import net.minecraft.q.a.a.a.a;
import net.minecraft.q.a.a.b.c;
import net.minecraft.q.a.a.b.o;
import net.minecraft.q.a.a.b.w;
import net.minecraft.q.a.a.f;
import net.minecraft.u.bc;
import net.minecraft.u.bp;

public class r
extends w {
    protected r() {
        super(new bp("set_damage"), c.class);
    }

    public void a(z z2, c c2, ad ad2) {
        z2.a("damage", ad2.a(c.a(c2)));
    }

    public c a(z z2, u u2, a[] arra) {
        return new c(arra, (f)bc.a(z2, "damage", u2, f.class));
    }

    @Override
    public /* synthetic */ o b(z z2, u u2, a[] arra) {
        return this.a(z2, u2, arra);
    }
}

