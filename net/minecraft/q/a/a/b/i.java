/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.a.a.b;

import com.a.b.ad;
import com.a.b.ag;
import com.a.b.t;
import com.a.b.u;
import com.a.b.z;
import net.minecraft.q.a.a.a.a;
import net.minecraft.q.a.a.b.e;
import net.minecraft.q.a.a.b.o;
import net.minecraft.q.a.a.b.w;
import net.minecraft.q.a.a.b.x;
import net.minecraft.u.bc;
import net.minecraft.u.bp;

public class i
extends w {
    public i() {
        super(new bp("set_attributes"), e.class);
    }

    public void a(z z2, e e2, ad ad2) {
        t t2 = new t();
        for (x x2 : e.a(e2)) {
            t2.a(x2.a(ad2));
        }
        z2.a("modifiers", t2);
    }

    public e a(z z2, u u2, a[] arra) {
        t t2 = bc.l(z2, "modifiers");
        x[] arrx = new x[t2.b()];
        int n2 = 0;
        for (com.a.b.w w2 : t2) {
            arrx[n2++] = x.a(bc.f(w2, "modifier"), u2);
        }
        if (arrx.length == 0) {
            throw new ag("Invalid attribute modifiers array; cannot be empty");
        }
        return new e(arra, arrx);
    }

    @Override
    public /* synthetic */ o b(z z2, u u2, a[] arra) {
        return this.a(z2, u2, arra);
    }
}

