/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.d;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;

final class ap
extends SimpleDateFormat {
    private static final long a = 3010674519968303714L;

    ap() {
        super("E MMM d HH:mm:ss yyyy", Locale.ENGLISH);
        this.setTimeZone(TimeZone.getTimeZone("GMT"));
    }
}

