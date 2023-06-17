/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.i;

import org.apache.logging.log4j.core.h;
import org.apache.logging.log4j.core.i.ac;
import org.apache.logging.log4j.f;

public final class ag
extends ac {
    private ag(String[] arrstring) {
        super("Marker", "marker");
    }

    public static ag a(String[] arrstring) {
        return new ag(arrstring);
    }

    @Override
    public void a(h h2, StringBuilder stringBuilder) {
        f f2 = h2.e();
        if (f2 != null) {
            stringBuilder.append(f2.toString());
        }
    }
}

