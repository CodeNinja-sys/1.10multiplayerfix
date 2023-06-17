/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.a.a.c;

import com.a.b.ac;
import com.a.b.ad;
import com.a.b.u;
import com.a.b.w;
import net.minecraft.q.a.a.c.a;
import net.minecraft.q.a.a.c.d;
import net.minecraft.q.a.a.c.e;
import net.minecraft.u.bc;
import net.minecraft.u.bp;

public class b
extends d {
    protected b() {
        super(new bp("on_fire"), a.class);
    }

    public w a(a a2, ad ad2) {
        return new ac(a.a(a2));
    }

    public a a(w w2, u u2) {
        return new a(bc.c(w2, "on_fire"));
    }

    @Override
    public /* synthetic */ e b(w w2, u u2) {
        return this.a(w2, u2);
    }
}

