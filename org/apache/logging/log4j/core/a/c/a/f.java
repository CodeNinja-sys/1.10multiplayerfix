/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.a.c.a;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import org.apache.logging.log4j.core.a.c.a.a;

public final class f
extends a {
    private static final int b = 8102;
    private final File c;
    private final File d;
    private final boolean e;
    private final int f;

    public f(File file, File file2, boolean bl2, int n2) {
        if (file == null) {
            throw new NullPointerException("source");
        }
        if (file2 == null) {
            throw new NullPointerException("destination");
        }
        this.c = file;
        this.d = file2;
        this.e = bl2;
        this.f = n2;
    }

    @Override
    public boolean a() {
        return org.apache.logging.log4j.core.a.c.a.f.a(this.c, this.d, this.e, this.f);
    }

    public static boolean a(File file, File file2, boolean bl2, int n2) {
        if (file.exists()) {
            int n3;
            FileInputStream fileInputStream = new FileInputStream(file);
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            ZipOutputStream zipOutputStream = new ZipOutputStream(fileOutputStream);
            zipOutputStream.setLevel(n2);
            ZipEntry zipEntry = new ZipEntry(file.getName());
            zipOutputStream.putNextEntry(zipEntry);
            byte[] arrby = new byte[8102];
            while ((n3 = fileInputStream.read(arrby)) != -1) {
                zipOutputStream.write(arrby, 0, n3);
            }
            zipOutputStream.close();
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

