/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.oj;
import com.a.a.d.os;
import java.util.AbstractSequentialList;
import java.util.ListIterator;

class oo
extends AbstractSequentialList {
    final /* synthetic */ oj a;

    oo(oj oj2) {
        this.a = oj2;
    }

    @Override
    public int size() {
        return oj.e(this.a);
    }

    @Override
    public ListIterator listIterator(int n2) {
        return new os(this.a, n2);
    }
}

