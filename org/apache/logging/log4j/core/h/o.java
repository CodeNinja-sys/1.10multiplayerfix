/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.h;

import org.apache.logging.log4j.a.y;
import org.apache.logging.log4j.core.h;
import org.apache.logging.log4j.core.h.g;

public class o
implements g {
    @Override
    public String a(String string) {
        return null;
    }

    @Override
    public String a(h h2, String string) {
        if (h2 == null || !(h2.d() instanceof y)) {
            return null;
        }
        y y2 = (y)h2.d();
        if (string.equalsIgnoreCase("id")) {
            return y2.i().c();
        }
        if (string.equalsIgnoreCase("type")) {
            return y2.j();
        }
        return y2.a(string);
    }
}

