/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.d;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;

final class ao
extends SimpleDateFormat {
    private static final long a = -3178072504225114298L;

    ao() {
        super("E, dd-MMM-yy HH:mm:ss z", Locale.ENGLISH);
        this.setTimeZone(TimeZone.getTimeZone("GMT"));
    }
}

