/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.config;

import java.util.concurrent.ConcurrentMap;
import org.apache.logging.log4j.core.config.v;

public class x {
    private final ConcurrentMap a;
    private final v b;

    public x(ConcurrentMap concurrentMap, v v2) {
        this.a = concurrentMap;
        this.b = v2;
    }

    public ConcurrentMap a() {
        return this.a;
    }

    public v b() {
        return this.b;
    }
}

