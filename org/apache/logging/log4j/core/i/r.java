/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.i;

import org.apache.logging.log4j.core.i.aq;
import org.apache.logging.log4j.core.i.p;

public final class r {
    private r() {
    }

    public static aq a(String[] arrstring) {
        if (arrstring == null || arrstring.length == 0) {
            return p.a(new String[]{"yyyy-MM-dd"});
        }
        return p.a(arrstring);
    }
}

