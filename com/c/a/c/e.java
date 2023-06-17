/*
 * Decompiled with CFR 0.150.
 */
package com.c.a.c;

import com.c.a.c.c;
import java.util.Calendar;
import java.util.Date;

public class e
extends c {
    private final Date a;
    private final Calendar b;

    public e(Date date, Calendar calendar) {
        super("Decrypted textures payload is too old (" + date + ", but we need it to be at least " + calendar + ")");
        this.a = date;
        this.b = calendar;
    }
}

