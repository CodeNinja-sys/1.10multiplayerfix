/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.hy;
import com.a.a.d.hz;
import com.a.a.d.ic;
import com.a.a.d.tu;
import java.util.Iterator;
import java.util.Map;

final class ib
extends tu {
    final /* synthetic */ hy a;

    private ib(hy hy2) {
        this.a = hy2;
    }

    @Override
    Map a() {
        return this.a;
    }

    @Override
    public Iterator iterator() {
        return new ic(this);
    }

    /* synthetic */ ib(hy hy2, hz hz2) {
        this(hy2);
    }
}

