/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.aad;
import com.a.a.d.as;
import com.a.a.d.xc;
import com.a.a.d.xi;
import java.util.Iterator;
import java.util.Set;

final class xh
extends as {
    final /* synthetic */ xc a;
    final /* synthetic */ xc b;

    xh(xc xc2, xc xc3) {
        this.a = xc2;
        this.b = xc3;
    }

    @Override
    public int a(Object object) {
        int n2 = this.a.a(object);
        return n2 == 0 ? 0 : Math.min(n2, this.b.a(object));
    }

    @Override
    Set e() {
        return aad.b(this.a.d(), this.b.d());
    }

    @Override
    Iterator b() {
        Iterator iterator = this.a.aS_().iterator();
        return new xi(this, iterator);
    }

    @Override
    int c() {
        return this.d().size();
    }
}

