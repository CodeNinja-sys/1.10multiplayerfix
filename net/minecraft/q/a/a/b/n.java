/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.a.a.b;

import com.a.b.ad;
import com.a.b.ag;
import com.a.b.u;
import com.a.b.z;
import net.minecraft.e.e;
import net.minecraft.e.i;
import net.minecraft.q.a.a.a.a;
import net.minecraft.q.a.a.b.o;
import net.minecraft.q.a.a.b.q;
import net.minecraft.q.a.a.b.w;
import net.minecraft.u.bc;
import net.minecraft.u.bp;

public class n
extends w {
    public n() {
        super(new bp("set_nbt"), q.class);
    }

    public void a(z z2, q q2, ad ad2) {
        z2.a("tag", q.a(q2).toString());
    }

    public q a(z z2, u u2, a[] arra) {
        try {
            e e2 = net.minecraft.e.n.a(bc.f(z2, "tag"));
            return new q(arra, e2);
        }
        catch (i i2) {
            throw new ag(i2);
        }
    }

    @Override
    public /* synthetic */ o b(z z2, u u2, a[] arra) {
        return this.a(z2, u2, arra);
    }
}

