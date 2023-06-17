/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.bo;
import com.a.a.d.bq;
import com.a.a.d.tu;
import java.util.Iterator;
import java.util.Map;

class bp
extends tu {
    final /* synthetic */ bo a;

    bp(bo bo2) {
        this.a = bo2;
    }

    @Override
    Map a() {
        return this.a;
    }

    @Override
    public Iterator iterator() {
        return new bq(this, this.size());
    }
}

