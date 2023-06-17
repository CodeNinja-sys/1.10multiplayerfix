/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.a.c;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.apache.logging.log4j.core.a.c.f;
import org.apache.logging.log4j.core.a.c.g;
import org.apache.logging.log4j.core.a.c.i;
import org.apache.logging.log4j.core.a.x;

class j
implements x {
    private j() {
    }

    public f a(String string, i i2) {
        File file = new File(string);
        File file2 = file.getParentFile();
        if (null != file2 && !file2.exists()) {
            file2.mkdirs();
        }
        try {
            file.createNewFile();
        }
        catch (IOException iOException) {
            f.q().b("Unable to create file " + string, (Throwable)iOException);
            return null;
        }
        long l2 = i.a(i2) ? file.length() : 0L;
        long l3 = file.lastModified();
        try {
            OutputStream outputStream = new FileOutputStream(string, i.a(i2));
            if (i.b(i2)) {
                outputStream = new BufferedOutputStream(outputStream);
            }
            return new f(string, i.c(i2), outputStream, i.a(i2), l2, l3, i.d(i2), i.e(i2), i.f(i2), i.g(i2));
        }
        catch (FileNotFoundException fileNotFoundException) {
            f.r().b("FileManager (" + string + ") " + fileNotFoundException);
            return null;
        }
    }

    /* synthetic */ j(g g2) {
        this();
    }
}

