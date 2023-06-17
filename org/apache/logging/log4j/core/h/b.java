/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.h;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.logging.log4j.core.h;
import org.apache.logging.log4j.core.h.g;
import org.apache.logging.log4j.d;

public class b
implements g {
    private static final d a = org.apache.logging.log4j.d.d.k();

    @Override
    public String a(String string) {
        return this.a(System.currentTimeMillis(), string);
    }

    @Override
    public String a(h h2, String string) {
        return this.a(h2.g(), string);
    }

    private String a(long l2, String string) {
        DateFormat dateFormat = null;
        if (string != null) {
            try {
                dateFormat = new SimpleDateFormat(string);
            }
            catch (Exception exception) {
                a.b("Invalid date format: \"" + string + "\", using default", (Throwable)exception);
            }
        }
        if (dateFormat == null) {
            dateFormat = DateFormat.getInstance();
        }
        return dateFormat.format(new Date(l2));
    }
}

