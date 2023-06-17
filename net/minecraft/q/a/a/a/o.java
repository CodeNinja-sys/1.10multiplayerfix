/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.a.a.a;

import com.a.b.ad;
import com.a.b.u;
import com.a.b.z;
import net.minecraft.q.a.a.a.a;
import net.minecraft.q.a.a.a.c;
import net.minecraft.q.a.a.a.e;
import net.minecraft.u.bc;
import net.minecraft.u.bp;

public class o
extends e {
    protected o() {
        super(new bp("random_chance"), c.class);
    }

    public void a(z z2, c c2, ad ad2) {
        z2.a("chance", Float.valueOf(c.a(c2)));
    }

    public c a(z z2, u u2) {
        return new c(bc.i(z2, "chance"));
    }

    @Override
    public /* synthetic */ a b(z z2, u u2) {
        return this.a(z2, u2);
    }
}

