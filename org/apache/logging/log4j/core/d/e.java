/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.d;

import java.nio.charset.Charset;
import org.apache.logging.log4j.d.d;

public final class e {
    public static final Charset a = Charset.forName("UTF-8");

    public static Charset a(String string) {
        return e.a(string, Charset.defaultCharset());
    }

    public static Charset a(String string, Charset charset) {
        Charset charset2 = null;
        if (string != null && Charset.isSupported(string)) {
            charset2 = Charset.forName(string);
        }
        if (charset2 == null) {
            charset2 = charset;
            if (string != null) {
                d.k().b("Charset " + string + " is not supported for layout, using " + charset2.displayName());
            }
        }
        return charset2;
    }

    private e() {
    }
}

