/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.b;

import com.a.a.b.cl;
import com.a.a.b.dg;
import com.a.a.b.dh;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public final class dq {
    private static final String a = "Chunk [%s] is not a valid entry";
    private final dg b;
    private final dg c;

    private dq(dg dg2, dg dg3) {
        this.b = dg2;
        this.c = (dg)cl.a(dg3);
    }

    public Map a(CharSequence charSequence) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<String, String>();
        for (String string : this.b.a(charSequence)) {
            Iterator iterator = dg.a(this.c, string);
            cl.a(iterator.hasNext(), a, new Object[]{string});
            String string2 = (String)iterator.next();
            cl.a(!linkedHashMap.containsKey(string2), "Duplicate key [%s] found.", new Object[]{string2});
            cl.a(iterator.hasNext(), a, new Object[]{string});
            String string3 = (String)iterator.next();
            linkedHashMap.put(string2, string3);
            cl.a(!iterator.hasNext(), a, new Object[]{string});
        }
        return Collections.unmodifiableMap(linkedHashMap);
    }

    /* synthetic */ dq(dg dg2, dg dg3, dh dh2) {
        this(dg2, dg3);
    }
}

