/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.nj;
import com.a.a.d.sz;
import com.a.a.d.tu;
import com.a.a.d.ur;
import java.util.Iterator;
import java.util.Map;

class us
extends tu {
    final /* synthetic */ ur a;

    us(ur ur2) {
        this.a = ur2;
    }

    @Override
    Map a() {
        return this.a;
    }

    @Override
    public Iterator iterator() {
        return nj.a(this.a.a.entrySet().iterator(), sz.b(this.a.b));
    }
}

