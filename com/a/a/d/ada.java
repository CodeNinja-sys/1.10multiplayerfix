/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.adb;
import com.a.a.d.add;
import java.util.Collection;
import java.util.Iterator;

class ada
extends add {
    private static final long a = 0L;

    ada(Collection collection, Object object) {
        super(collection, object, null);
    }

    @Override
    public Iterator iterator() {
        Iterator iterator = super.iterator();
        return new adb(this, iterator);
    }
}

