/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.a.c;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.logging.log4j.core.a.c.f;
import org.apache.logging.log4j.core.a.c.v;
import org.apache.logging.log4j.core.h;
import org.apache.logging.log4j.d;

public class t
implements v {
    protected static final d a = org.apache.logging.log4j.d.d.k();
    private static final long b = 1024L;
    private static final long c = 0x100000L;
    private static final long d = 0x40000000L;
    private static final long e = 0xA00000L;
    private static final Pattern f = Pattern.compile("([0-9]+([\\.,][0-9]+)?)\\s*(|K|M|G)B?", 2);
    private final long g;
    private f h;

    protected t() {
        this.g = 0xA00000L;
    }

    protected t(long l2) {
        this.g = l2;
    }

    @Override
    public void a(f f2) {
        this.h = f2;
    }

    @Override
    public boolean a(h h2) {
        return this.h.m() > this.g;
    }

    public String toString() {
        return "SizeBasedTriggeringPolicy(size=" + this.g + ")";
    }

    public static t a(String string) {
        long l2 = string == null ? 0xA00000L : t.b(string);
        return new t(l2);
    }

    private static long b(String string) {
        Matcher matcher = f.matcher(string);
        if (matcher.matches()) {
            try {
                long l2 = NumberFormat.getNumberInstance(Locale.getDefault()).parse(matcher.group(1)).longValue();
                String string2 = matcher.group(3);
                if (string2.equalsIgnoreCase("")) {
                    return l2;
                }
                if (string2.equalsIgnoreCase("K")) {
                    return l2 * 1024L;
                }
                if (string2.equalsIgnoreCase("M")) {
                    return l2 * 0x100000L;
                }
                if (string2.equalsIgnoreCase("G")) {
                    return l2 * 0x40000000L;
                }
                a.b("Units not recognized: " + string);
                return 0xA00000L;
            }
            catch (ParseException parseException) {
                a.b("Unable to parse numeric part: " + string, (Throwable)parseException);
                return 0xA00000L;
            }
        }
        a.b("Unable to parse bytes: " + string);
        return 0xA00000L;
    }
}

