/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.bl;
import com.a.a.d.aej;
import com.a.a.d.sz;
import java.util.Iterator;
import java.util.Map;

final class td
extends aej {
    final /* synthetic */ bl a;

    td(Iterator iterator, bl bl2) {
        this.a = bl2;
        super(iterator);
    }

    Map.Entry b(Object object) {
        return sz.a(object, this.a.a(object));
    }

    @Override
    /* synthetic */ Object a(Object object) {
        return this.b(object);
    }
}

