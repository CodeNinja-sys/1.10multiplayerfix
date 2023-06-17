/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.b;

import java.util.Arrays;
import java.util.List;
import org.apache.logging.log4j.b;
import org.apache.logging.log4j.core.b.d;
import org.apache.logging.log4j.core.config.ab;
import org.apache.logging.log4j.core.config.v;

public class e
extends v {
    public static v a(String string, String string2, String string3, org.apache.logging.log4j.core.config.b[] arrb, ab[] arrab, org.apache.logging.log4j.core.config.d d2, org.apache.logging.log4j.core.d d3) {
        b b2;
        List<org.apache.logging.log4j.core.config.b> list = Arrays.asList(arrb);
        try {
            b2 = b.a(string2, b.c);
        }
        catch (Exception exception) {
            a.b("Invalid Log level specified: {}. Defaulting to Error", string2);
            b2 = b.c;
        }
        boolean bl2 = org.apache.logging.log4j.core.d.b.a(string, true);
        return new d("", list, d3, b2, bl2, arrab, d2, e.c(string3));
    }
}

