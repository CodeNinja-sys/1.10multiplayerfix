/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.i;

import java.util.List;
import java.util.regex.Pattern;
import org.apache.logging.log4j.core.config.d;
import org.apache.logging.log4j.core.g.g;
import org.apache.logging.log4j.core.h;
import org.apache.logging.log4j.core.i.ac;
import org.apache.logging.log4j.core.i.ar;
import org.apache.logging.log4j.core.i.as;

public final class aw
extends ac {
    private final Pattern b;
    private final String c;
    private final List d;

    private aw(List list, Pattern pattern, String string) {
        super("replace", "replace");
        this.b = pattern;
        this.c = string;
        this.d = list;
    }

    public static aw a(d d2, String[] arrstring) {
        if (arrstring.length != 3) {
            a.b("Incorrect number of options on replace. Expected 3 received " + arrstring.length);
            return null;
        }
        if (arrstring[0] == null) {
            a.b("No pattern supplied on replace");
            return null;
        }
        if (arrstring[1] == null) {
            a.b("No regular expression supplied on replace");
            return null;
        }
        if (arrstring[2] == null) {
            a.b("No substitution supplied on replace");
            return null;
        }
        Pattern pattern = Pattern.compile(arrstring[1]);
        as as2 = g.a(d2);
        List list = as2.a(arrstring[0]);
        return new aw(list, pattern, arrstring[2]);
    }

    @Override
    public void a(h h2, StringBuilder stringBuilder) {
        StringBuilder stringBuilder2 = new StringBuilder();
        for (ar ar2 : this.d) {
            ar2.a(h2, stringBuilder2);
        }
        stringBuilder.append(this.b.matcher(stringBuilder2.toString()).replaceAll(this.c));
    }
}

