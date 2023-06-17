/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.i;

import java.util.regex.Pattern;
import org.apache.logging.log4j.d;

public final class av {
    private static final d a = org.apache.logging.log4j.d.d.k();
    private final Pattern b;
    private final String c;

    private av(Pattern pattern, String string) {
        this.b = pattern;
        this.c = string;
    }

    public String a(String string) {
        return this.b.matcher(string).replaceAll(this.c);
    }

    public String toString() {
        return "replace(regex=" + this.b.pattern() + ", replacement=" + this.c + ")";
    }

    public static av a(String string, String string2) {
        if (string == null) {
            a.b("A regular expression is required for replacement");
            return null;
        }
        if (string2 == null) {
            a.b("A replacement string is required to perform replacement");
        }
        Pattern pattern = Pattern.compile(string);
        return new av(pattern, string2);
    }
}

