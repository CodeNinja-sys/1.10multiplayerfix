/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.aej;
import com.a.a.d.wn;
import com.a.a.d.wp;
import com.a.a.d.xd;
import java.util.Iterator;
import java.util.Map;

class wo
extends aej {
    final /* synthetic */ wn a;

    wo(wn wn2, Iterator iterator) {
        this.a = wn2;
        super(iterator);
    }

    xd a(Map.Entry entry) {
        return new wp(this, entry);
    }
}

