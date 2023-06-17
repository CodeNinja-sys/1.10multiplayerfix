/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

import java.io.File;
import java.io.FilenameFilter;
import java.security.PrivilegedAction;
import java.util.Arrays;
import net.java.games.input.bn;

final class bm
implements PrivilegedAction {
    private final File a;
    private final FilenameFilter b;

    bm(File file, FilenameFilter filenameFilter) {
        this.a = file;
        this.b = filenameFilter;
    }

    public Object run() {
        File[] arrfile = this.a.listFiles(this.b);
        Arrays.sort(arrfile, new bn(this));
        return arrfile;
    }
}

