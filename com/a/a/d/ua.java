/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.aej;
import com.a.a.d.tz;
import com.a.a.d.ub;
import java.util.Iterator;
import java.util.Map;

class ua
extends aej {
    final /* synthetic */ tz a;

    ua(tz tz2, Iterator iterator) {
        this.a = tz2;
        super(iterator);
    }

    Map.Entry a(Map.Entry entry) {
        return new ub(this, entry);
    }
}

