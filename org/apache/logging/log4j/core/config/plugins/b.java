/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.config.plugins;

import java.util.concurrent.ConcurrentHashMap;
import org.apache.logging.log4j.core.config.v;
import org.apache.logging.log4j.core.config.x;

public final class b {
    private b() {
    }

    public static x a(v[] arrv) {
        ConcurrentHashMap<String, v> concurrentHashMap = new ConcurrentHashMap<String, v>();
        v v2 = null;
        for (v v3 : arrv) {
            if (v3 == null) continue;
            if (v3.d().isEmpty()) {
                v2 = v3;
            }
            concurrentHashMap.put(v3.d(), v3);
        }
        return new x(concurrentHashMap, v2);
    }
}

