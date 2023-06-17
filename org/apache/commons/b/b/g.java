/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.b.b;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.Serializable;
import org.apache.commons.b.b.a;

public class g
extends a
implements Serializable {
    private final FilenameFilter a;
    private final FileFilter b;

    public g(FilenameFilter filenameFilter) {
        if (filenameFilter == null) {
            throw new IllegalArgumentException("The FilenameFilter must not be null");
        }
        this.a = filenameFilter;
        this.b = null;
    }

    public g(FileFilter fileFilter) {
        if (fileFilter == null) {
            throw new IllegalArgumentException("The FileFilter must not be null");
        }
        this.b = fileFilter;
        this.a = null;
    }

    @Override
    public boolean accept(File file) {
        if (this.b != null) {
            return this.b.accept(file);
        }
        return super.accept(file);
    }

    @Override
    public boolean accept(File file, String string) {
        if (this.a != null) {
            return this.a.accept(file, string);
        }
        return super.accept(file, string);
    }

    @Override
    public String toString() {
        String string = this.b != null ? this.b.toString() : this.a.toString();
        return super.toString() + "(" + string + ")";
    }
}

