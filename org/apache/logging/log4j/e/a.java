/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.e;

import java.util.Locale;

public final class a {
    private a() {
    }

    public static Enum a(Class class_, String string) {
        return a.a(class_, string, null);
    }

    public static Enum a(Class class_, String string, Enum enum_) {
        return string == null ? enum_ : Enum.valueOf(class_, string.toUpperCase(Locale.ENGLISH));
    }
}

