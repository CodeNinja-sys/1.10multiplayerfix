/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.a;

import org.apache.logging.log4j.core.config.b;
import org.apache.logging.log4j.d;

public final class p {
    private static final d a = org.apache.logging.log4j.d.d.k();

    private p() {
    }

    public static String[] a(b ... arrb) {
        if (arrb == null) {
            a.b("failovers must contain an appender reference");
            return null;
        }
        String[] arrstring = new String[arrb.length];
        for (int i2 = 0; i2 < arrb.length; ++i2) {
            arrstring[i2] = arrb[i2].a();
        }
        return arrstring;
    }
}

