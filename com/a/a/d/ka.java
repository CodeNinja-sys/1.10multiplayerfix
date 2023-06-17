/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.cl;
import com.a.a.d.jc;

abstract class ka
extends jc {
    ka(Object object, Object object2) {
        super(object, object2);
        cl.a(object, object2);
    }

    ka(ka ka2) {
        super(ka2.getKey(), ka2.getValue());
    }

    abstract ka a();

    abstract ka b();
}

