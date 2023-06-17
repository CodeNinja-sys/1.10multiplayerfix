/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.a.c.a;

import java.util.Set;
import java.util.regex.Pattern;
import org.apache.commons.a.c.a.c;

final class d {
    private final boolean a;
    private final Set b;
    private final Pattern c;

    private d(Pattern pattern, Set set, boolean bl2) {
        this.c = pattern;
        this.b = set;
        this.a = bl2;
    }

    public boolean a(String string) {
        return this.c.matcher(string).find();
    }

    /* synthetic */ d(Pattern pattern, Set set, boolean bl2, c c2) {
        this(pattern, set, bl2);
    }

    static /* synthetic */ boolean a(d d2) {
        return d2.a;
    }

    static /* synthetic */ Set b(d d2) {
        return d2.b;
    }
}

