/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.g;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.logging.log4j.core.g.h;
import org.apache.logging.log4j.core.g.o;
import org.apache.logging.log4j.core.i.ar;

class k {
    private final Map b;
    private final boolean c;
    final /* synthetic */ h a;

    public k(h h2, Map map, boolean bl2) {
        this.a = h2;
        this.c = bl2;
        this.b = map;
    }

    public o a(org.apache.logging.log4j.core.h h2) {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.b.entrySet()) {
            StringBuilder stringBuilder = new StringBuilder();
            for (ar ar2 : (List)entry.getValue()) {
                ar2.a(h2, stringBuilder);
            }
            hashMap.put(entry.getKey(), stringBuilder.toString());
        }
        return new o(this.a, hashMap, this.c);
    }
}

