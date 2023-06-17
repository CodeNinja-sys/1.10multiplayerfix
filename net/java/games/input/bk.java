/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

import java.io.File;
import java.io.FilenameFilter;

final class bk
implements FilenameFilter {
    bk() {
    }

    public final boolean accept(File file, String string) {
        return string.startsWith("js");
    }
}

