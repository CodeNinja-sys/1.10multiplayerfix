/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.b.b;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public interface n
extends FileFilter,
FilenameFilter {
    @Override
    public boolean accept(File var1);

    @Override
    public boolean accept(File var1, String var2);
}

