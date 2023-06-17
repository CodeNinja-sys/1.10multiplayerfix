/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna;

import java.io.File;
import java.io.FilenameFilter;

class al
implements FilenameFilter {
    al() {
    }

    public boolean accept(File file, String string) {
        return string.endsWith(".x") && string.indexOf("jna") != -1;
    }
}

