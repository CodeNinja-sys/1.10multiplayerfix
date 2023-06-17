/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.aan;
import com.a.a.d.oj;
import com.a.a.d.op;
import java.util.Iterator;

class ol
extends aan {
    final /* synthetic */ oj a;

    ol(oj oj2) {
        this.a = oj2;
    }

    @Override
    public int size() {
        return oj.d(this.a).size();
    }

    @Override
    public Iterator iterator() {
        return new op(this.a, null);
    }

    @Override
    public boolean contains(Object object) {
        return this.a.f(object);
    }

    @Override
    public boolean remove(Object object) {
        return !this.a.b(object).isEmpty();
    }
}

