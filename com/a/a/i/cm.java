/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.i;

import com.a.a.b.cl;
import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

public final class cm
implements FilenameFilter {
    private final Pattern a;

    public cm(String string) {
        this(Pattern.compile(string));
    }

    public cm(Pattern pattern) {
        this.a = (Pattern)cl.a(pattern);
    }

    @Override
    public boolean accept(File file, String string) {
        return this.a.matcher(string).matches();
    }
}

