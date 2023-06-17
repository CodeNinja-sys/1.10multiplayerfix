/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.b.b;

import java.io.File;
import java.io.Serializable;
import java.util.regex.Pattern;
import org.apache.commons.b.b.a;
import org.apache.commons.b.r;

public class t
extends a
implements Serializable {
    private final Pattern a;

    public t(String string) {
        if (string == null) {
            throw new IllegalArgumentException("Pattern is missing");
        }
        this.a = Pattern.compile(string);
    }

    public t(String string, r r2) {
        if (string == null) {
            throw new IllegalArgumentException("Pattern is missing");
        }
        int n2 = 0;
        if (r2 != null && !r2.b()) {
            n2 = 2;
        }
        this.a = Pattern.compile(string, n2);
    }

    public t(String string, int n2) {
        if (string == null) {
            throw new IllegalArgumentException("Pattern is missing");
        }
        this.a = Pattern.compile(string, n2);
    }

    public t(Pattern pattern) {
        if (pattern == null) {
            throw new IllegalArgumentException("Pattern is missing");
        }
        this.a = pattern;
    }

    @Override
    public boolean accept(File file, String string) {
        return this.a.matcher(string).matches();
    }
}

