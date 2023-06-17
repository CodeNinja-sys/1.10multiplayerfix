/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.b;

import com.a.a.b.ct;
import java.util.regex.Pattern;

class cs
extends ct {
    private static final long b = 0L;

    cs(String string) {
        super(Pattern.compile(string));
    }

    @Override
    public String toString() {
        return "Predicates.containsPattern(" + this.a.pattern() + ")";
    }
}

