/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.a.d;

import org.apache.logging.log4j.core.config.y;
import org.apache.logging.log4j.d;

public final class a {
    private static final d a = org.apache.logging.log4j.d.d.k();
    private final y b;
    private final String c;
    private final String d;

    private a(y y2, String string, String string2) {
        this.b = y2;
        this.c = string;
        this.d = string2;
    }

    public y a() {
        return this.b;
    }

    public String b() {
        return this.c;
    }

    public String c() {
        return this.d;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Route(");
        stringBuilder.append("type=");
        if (this.c != null) {
            stringBuilder.append("static Reference=").append(this.c);
        } else if (this.b != null) {
            stringBuilder.append("dynamic - type=").append(this.b.f());
        } else {
            stringBuilder.append("invalid Route");
        }
        if (this.d != null) {
            stringBuilder.append(" key='").append(this.d).append("'");
        } else {
            stringBuilder.append(" default");
        }
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public static a a(String string, String string2, y y2) {
        if (y2 != null && y2.c()) {
            for (y y3 : y2.b()) {
            }
            if (string != null) {
                a.b("A route cannot be configured with an appender reference and an appender definition");
                return null;
            }
        } else if (string == null) {
            a.b("A route must specify an appender reference or an appender definition");
            return null;
        }
        return new a(y2, string, string2);
    }
}

