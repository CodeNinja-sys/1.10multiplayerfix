/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.c;

import com.a.a.c.ao;
import com.a.a.c.bh;

final class bi
extends bh {
    final /* synthetic */ ao a;

    bi(ao ao2) {
        this.a = ao2;
        super(ao2);
    }

    @Override
    public Object next() {
        return this.e().getKey();
    }
}

