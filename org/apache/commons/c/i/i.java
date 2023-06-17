/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.i;

import java.text.Format;
import java.util.Locale;
import java.util.TimeZone;
import org.apache.commons.c.i.ak;
import org.apache.commons.c.i.h;

final class i
extends ak {
    i() {
    }

    protected h a(String string, TimeZone timeZone, Locale locale) {
        return new h(string, timeZone, locale);
    }

    @Override
    protected /* synthetic */ Format b(String string, TimeZone timeZone, Locale locale) {
        return this.a(string, timeZone, locale);
    }
}

