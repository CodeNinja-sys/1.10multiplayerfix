/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.aan;
import com.a.a.d.wr;
import com.a.a.d.wt;
import java.util.Iterator;

class ws
extends aan {
    final /* synthetic */ Object a;
    final /* synthetic */ wr b;

    ws(wr wr2, Object object) {
        this.b = wr2;
        this.a = object;
    }

    @Override
    public Iterator iterator() {
        return new wt(this);
    }

    @Override
    public int size() {
        return this.b.a.containsKey(this.a) ? 1 : 0;
    }
}

