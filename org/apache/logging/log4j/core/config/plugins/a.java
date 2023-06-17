/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.config.plugins;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.apache.logging.log4j.core.b;

public final class a {
    private a() {
    }

    public static ConcurrentMap a(b[] arrb) {
        ConcurrentHashMap<String, b> concurrentHashMap = new ConcurrentHashMap<String, b>();
        for (b b2 : arrb) {
            concurrentHashMap.put(b2.a(), b2);
        }
        return concurrentHashMap;
    }
}

