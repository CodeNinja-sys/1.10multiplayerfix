/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.a.c.a;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.GZIPOutputStream;
import org.apache.logging.log4j.core.a.c.a.a;

public final class e
extends a {
    private static final int b = 8102;
    private final File c;
    private final File d;
    private final boolean e;

    public e(File file, File file2, boolean bl2) {
        if (file == null) {
            throw new NullPointerException("source");
        }
        if (file2 == null) {
            throw new NullPointerException("destination");
        }
        this.c = file;
        this.d = file2;
        this.e = bl2;
    }

    @Override
    public boolean a() {
        return org.apache.logging.log4j.core.a.c.a.e.a(this.c, this.d, this.e);
    }

    public static boolean a(File file, File file2, boolean bl2) {
        if (file.exists()) {
            int n2;
            FileInputStream fileInputStream = new FileInputStream(file);
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(fileOutputStream);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(gZIPOutputStream);
            byte[] arrby = new byte[8102];
            while ((n2 = fileInputStream.read(arrby)) != -1) {
                bufferedOutputStream.write(arrby, 0, n2);
            }
            bufferedOutputStream.close();
            fileInputStream.close();
            if (bl2 && !file.delete()) {
                a.f("Unable to delete " + file.toString() + '.');
            }
            return true;
        }
        return false;
    }

    @Override
    protected void a(Exception exception) {
        a.f("Exception during compression of '" + this.c.toString() + "'.", (Throwable)exception);
    }
}

