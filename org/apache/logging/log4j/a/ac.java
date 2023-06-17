/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.a;

import java.util.HashMap;
import java.util.Map;
import org.apache.logging.log4j.a.ab;
import org.apache.logging.log4j.a.af;
import org.apache.logging.log4j.a.b;

class ac
implements af {
    private ac() {
    }

    @Override
    public Map a() {
        Map<Thread, StackTraceElement[]> map = Thread.getAllStackTraces();
        HashMap<b, StackTraceElement[]> hashMap = new HashMap<b, StackTraceElement[]>(map.size());
        for (Map.Entry<Thread, StackTraceElement[]> entry : map.entrySet()) {
            hashMap.put(new b(entry.getKey()), entry.getValue());
        }
        return hashMap;
    }

    /* synthetic */ ac(ab ab2) {
        this();
    }
}

