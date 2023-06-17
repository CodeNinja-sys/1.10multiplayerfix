/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.i;

import java.util.List;
import org.apache.logging.log4j.core.config.d;
import org.apache.logging.log4j.core.g.g;
import org.apache.logging.log4j.core.h;
import org.apache.logging.log4j.core.i.ac;
import org.apache.logging.log4j.core.i.ar;
import org.apache.logging.log4j.core.i.as;
import org.apache.logging.log4j.core.i.k;

public final class ba
extends ac {
    private final List b;
    private final String c;

    private ba(List list, String string) {
        super("style", "style");
        this.b = list;
        this.c = string;
    }

    public static ba a(d d2, String[] arrstring) {
        if (arrstring.length < 1) {
            a.b("Incorrect number of options on style. Expected at least 1, received " + arrstring.length);
            return null;
        }
        if (arrstring[0] == null) {
            a.b("No pattern supplied on style");
            return null;
        }
        if (arrstring[1] == null) {
            a.b("No style attributes provided");
            return null;
        }
        as as2 = g.a(d2);
        List list = as2.a(arrstring[0]);
        String string = k.a(arrstring[1].split("\\s*,\\s*"));
        return new ba(list, string);
    }

    @Override
    public void a(h h2, StringBuilder stringBuilder) {
        StringBuilder stringBuilder2 = new StringBuilder();
        for (ar ar2 : this.b) {
            ar2.a(h2, stringBuilder2);
        }
        if (stringBuilder2.length() > 0) {
            stringBuilder.append(this.c).append(stringBuilder2.toString()).append(k.a());
        }
    }

    @Override
    public boolean cO_() {
        for (ar ar2 : this.b) {
            if (!ar2.c()) continue;
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append("[style=");
        stringBuilder.append(this.c);
        stringBuilder.append(", patternFormatters=");
        stringBuilder.append(this.b);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

