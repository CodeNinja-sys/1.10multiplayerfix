/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

import java.io.File;
import java.io.FilenameFilter;
import net.java.games.input.bf;

class bo
implements FilenameFilter {
    private final bf a;

    bo(bf bf2) {
        this.a = bf2;
    }

    public final boolean accept(File file, String string) {
        return string.startsWith("event");
    }
}

