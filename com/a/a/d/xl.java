/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.as;
import com.a.a.d.nj;
import com.a.a.d.xc;
import com.a.a.d.xm;
import java.util.Iterator;

final class xl
extends as {
    final /* synthetic */ xc a;
    final /* synthetic */ xc b;

    xl(xc xc2, xc xc3) {
        this.a = xc2;
        this.b = xc3;
    }

    @Override
    public int a(Object object) {
        int n2 = this.a.a(object);
        return n2 == 0 ? 0 : Math.max(0, n2 - this.b.a(object));
    }

    @Override
    Iterator b() {
        Iterator iterator = this.a.aS_().iterator();
        return new xm(this, iterator);
    }

    @Override
    int c() {
        return nj.b(this.b());
    }
}

