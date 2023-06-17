/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.e;

import com.a.a.n.a.cg;
import com.c.c.b.n;
import com.c.c.d.a.ae;
import com.c.c.e.f;
import com.c.c.e.i;
import com.c.c.e.j;
import net.minecraft.s.b;

class k
implements cg {
    final /* synthetic */ n a;
    final /* synthetic */ j b;

    k(j j2, n n2) {
        this.b = j2;
        this.a = n2;
    }

    @Override
    public void a(Object object) {
        ae ae2 = new ae(j.a(this.b), new i(j.a(this.b), this.a));
        ae2.b();
        net.minecraft.s.b.a(ae2);
    }

    @Override
    public void a(Throwable throwable) {
        net.minecraft.s.b.n();
        f.a().b((Object)throwable);
        this.b.a("Failed to download resource pack!");
    }
}

