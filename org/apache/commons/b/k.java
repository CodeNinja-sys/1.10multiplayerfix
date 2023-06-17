/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.b;

import java.io.File;
import java.io.IOException;
import org.apache.commons.b.l;

public class k {
    public static final k a = new k("Normal");
    public static final k b = new l();
    private final String c;

    protected k(String string) {
        this.c = string;
    }

    public boolean a(File file) {
        if (file == null || !file.exists()) {
            return true;
        }
        try {
            return this.c(file);
        }
        catch (IOException iOException) {
            return false;
        }
    }

    public void b(File file) {
        if (file.exists() && !this.c(file)) {
            throw new IOException("Deletion failed: " + file);
        }
    }

    protected boolean c(File file) {
        return file.delete();
    }

    public String toString() {
        return "FileDeleteStrategy[" + this.c + "]";
    }
}

