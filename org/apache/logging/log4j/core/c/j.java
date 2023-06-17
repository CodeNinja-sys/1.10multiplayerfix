/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.c;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.logging.log4j.a.m;
import org.apache.logging.log4j.b;
import org.apache.logging.log4j.core.c.a;
import org.apache.logging.log4j.core.e;
import org.apache.logging.log4j.core.h;
import org.apache.logging.log4j.core.i;
import org.apache.logging.log4j.f;

public final class j
extends a {
    private final Pattern d;
    private final boolean e;

    private j(boolean bl2, Pattern pattern, e e2, e e3) {
        super(e2, e3);
        this.d = pattern;
        this.e = bl2;
    }

    @Override
    public e a(i i2, b b2, f f2, String string, Object ... arrobject) {
        return this.a(string);
    }

    @Override
    public e a(i i2, b b2, f f2, Object object, Throwable throwable) {
        if (object == null) {
            return this.c;
        }
        return this.a(object.toString());
    }

    @Override
    public e a(i i2, b b2, f f2, m m2, Throwable throwable) {
        if (m2 == null) {
            return this.c;
        }
        String string = this.e ? m2.b() : m2.a();
        return this.a(string);
    }

    @Override
    public e a(h h2) {
        String string = this.e ? h2.d().b() : h2.d().a();
        return this.a(string);
    }

    private e a(String string) {
        if (string == null) {
            return this.c;
        }
        Matcher matcher = this.d.matcher(string);
        return matcher.matches() ? this.b : this.c;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("useRaw=").append(this.e);
        stringBuilder.append(", pattern=").append(this.d.toString());
        return stringBuilder.toString();
    }

    public static j a(String string, String string2, String string3, String string4) {
        Pattern pattern;
        if (string == null) {
            a.b("A regular expression must be provided for RegexFilter");
            return null;
        }
        boolean bl2 = Boolean.parseBoolean(string2);
        try {
            pattern = Pattern.compile(string);
        }
        catch (Exception exception) {
            a.b("RegexFilter caught exception compiling pattern: " + string + " cause: " + exception.getMessage());
            return null;
        }
        e e2 = org.apache.logging.log4j.core.e.a(string3);
        e e3 = org.apache.logging.log4j.core.e.a(string4);
        return new j(bl2, pattern, e2, e3);
    }
}

