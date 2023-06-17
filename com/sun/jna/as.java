/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna;

import com.sun.jna.aq;
import java.io.File;
import java.io.FilenameFilter;

class as
implements FilenameFilter {
    private final String a;

    as(String string) {
        this.a = string;
    }

    public boolean accept(File file, String string) {
        return (string.startsWith("lib" + this.a + ".so") || string.startsWith(this.a + ".so") && this.a.startsWith("lib")) && aq.g(string);
    }
}

