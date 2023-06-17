/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.oj;
import com.a.a.d.oq;
import com.a.a.d.ot;
import java.util.AbstractSequentialList;
import java.util.ListIterator;

class ok
extends AbstractSequentialList {
    final /* synthetic */ Object a;
    final /* synthetic */ oj b;

    ok(oj oj2, Object object) {
        this.b = oj2;
        this.a = object;
    }

    @Override
    public int size() {
        oq oq2 = (oq)oj.d(this.b).get(this.a);
        return oq2 == null ? 0 : oq2.c;
    }

    @Override
    public ListIterator listIterator(int n2) {
        return new ot(this.b, this.a, n2);
    }
}

