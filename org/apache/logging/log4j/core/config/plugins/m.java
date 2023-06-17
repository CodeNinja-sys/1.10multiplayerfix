/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.config.plugins;

import java.util.HashMap;
import org.apache.logging.log4j.core.config.ab;
import org.apache.logging.log4j.core.config.d;
import org.apache.logging.log4j.core.h.f;
import org.apache.logging.log4j.core.h.g;

public final class m {
    private m() {
    }

    public static g a(ab[] arrab, d d2) {
        if (arrab == null) {
            return new org.apache.logging.log4j.core.h.d(null);
        }
        HashMap<String, String> hashMap = new HashMap<String, String>(d2.c());
        for (ab ab2 : arrab) {
            hashMap.put(ab2.a(), ab2.b());
        }
        return new org.apache.logging.log4j.core.h.d(new f(hashMap));
    }
}

