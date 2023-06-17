/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.aek;
import com.a.a.d.om;
import com.a.a.d.os;
import java.util.ListIterator;
import java.util.Map;

class on
extends aek {
    final /* synthetic */ os a;
    final /* synthetic */ om b;

    on(om om2, ListIterator listIterator, os os2) {
        this.b = om2;
        this.a = os2;
        super(listIterator);
    }

    Object a(Map.Entry entry) {
        return entry.getValue();
    }

    @Override
    public void set(Object object) {
        this.a.a(object);
    }
}

