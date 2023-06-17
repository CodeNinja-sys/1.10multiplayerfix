/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

import java.io.File;
import java.io.FileFilter;
import net.java.games.input.cs;

class ct
implements FileFilter {
    private ct() {
    }

    public boolean accept(File file) {
        return file.getName().toUpperCase().endsWith(".JAR");
    }

    ct(cs cs2) {
        this();
    }
}

