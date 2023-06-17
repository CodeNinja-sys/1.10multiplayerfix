/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.sz;
import com.a.a.d.tm;
import com.a.a.d.tu;
import java.util.Iterator;
import java.util.Map;

class tn
extends tu {
    final /* synthetic */ tm a;

    tn(tm tm2) {
        this.a = tm2;
    }

    @Override
    Map a() {
        return this.a;
    }

    @Override
    public Iterator iterator() {
        return sz.b(this.a.c(), this.a.a);
    }
}

