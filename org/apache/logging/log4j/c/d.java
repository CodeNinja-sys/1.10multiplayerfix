/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.c;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.apache.logging.log4j.c.c;

class d
extends InheritableThreadLocal {
    final /* synthetic */ c a;

    d(c c2) {
        this.a = c2;
    }

    protected Map a(Map map) {
        return map == null || !c.a(this.a) ? null : Collections.unmodifiableMap(new HashMap(map));
    }

    protected /* synthetic */ Object childValue(Object object) {
        return this.a((Map)object);
    }
}

