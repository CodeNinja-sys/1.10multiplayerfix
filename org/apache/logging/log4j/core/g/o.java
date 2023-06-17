/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.g;

import java.util.Map;
import org.apache.logging.log4j.core.d.v;
import org.apache.logging.log4j.core.g.h;

class o {
    private final Map b;
    private final boolean c;
    final /* synthetic */ h a;

    public o(h h2, Map map, boolean bl2) {
        this.a = h2;
        this.c = bl2;
        this.b = map;
    }

    boolean a() {
        if (!this.c) {
            return false;
        }
        boolean bl2 = false;
        for (Map.Entry entry : this.b.entrySet()) {
            if (!v.b((CharSequence)entry.getValue())) continue;
            bl2 = true;
            break;
        }
        return !bl2;
    }

    void a(Map map) {
        this.b.putAll(map);
    }

    Map b() {
        return this.b;
    }
}

