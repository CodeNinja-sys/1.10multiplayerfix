/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.agm;
import com.a.a.d.agn;
import com.a.a.d.agp;
import com.a.a.d.tu;
import java.util.Iterator;
import java.util.Map;

final class ago
extends tu {
    final /* synthetic */ agm a;

    private ago(agm agm2) {
        this.a = agm2;
    }

    @Override
    Map a() {
        return this.a;
    }

    @Override
    public Iterator iterator() {
        return new agp(this, this.a.keySet().iterator());
    }

    /* synthetic */ ago(agm agm2, agn agn2) {
        this(agm2);
    }
}

