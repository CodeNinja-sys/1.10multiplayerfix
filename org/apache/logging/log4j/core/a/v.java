/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.a;

import org.apache.logging.log4j.core.a.a;
import org.apache.logging.log4j.core.a.d;
import org.apache.logging.log4j.core.d.b;
import org.apache.logging.log4j.core.f;
import org.apache.logging.log4j.core.g.p;
import org.apache.logging.log4j.core.h;
import org.apache.logging.log4j.core.net.k;

public final class v
extends a {
    private final k a;

    private v(String string, org.apache.logging.log4j.core.d d2, f f2, k k2, boolean bl2) {
        super(string, d2, f2, bl2);
        this.a = k2;
    }

    @Override
    public void a(h h2) {
        try {
            this.a.a(this.b().b(h2));
        }
        catch (Exception exception) {
            throw new d(exception);
        }
    }

    public static v a(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, f f2, org.apache.logging.log4j.core.d d2, String string11) {
        if (string == null) {
            h.b("No name provided for JMSQueueAppender");
            return null;
        }
        boolean bl2 = b.a(string11, true);
        k k2 = k.a(string2, string3, string4, string5, string6, string7, string8, string9, string10);
        if (k2 == null) {
            return null;
        }
        if (f2 == null) {
            f2 = p.e();
        }
        return new v(string, d2, f2, k2, bl2);
    }
}

