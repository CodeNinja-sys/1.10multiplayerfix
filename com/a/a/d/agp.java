/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.aej;
import com.a.a.d.ago;
import com.a.a.d.agq;
import java.util.Iterator;
import java.util.Map;

class agp
extends aej {
    final /* synthetic */ ago a;

    agp(ago ago2, Iterator iterator) {
        this.a = ago2;
        super(iterator);
    }

    Map.Entry b(Object object) {
        return new agq(this, object);
    }

    @Override
    /* synthetic */ Object a(Object object) {
        return this.b(object);
    }
}

