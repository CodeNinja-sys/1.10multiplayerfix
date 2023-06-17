/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.a;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import org.apache.logging.log4j.core.a.b;
import org.apache.logging.log4j.core.a.r;
import org.apache.logging.log4j.core.a.s;
import org.apache.logging.log4j.core.a.t;
import org.apache.logging.log4j.core.a.x;

class u
implements x {
    private u() {
    }

    public r a(String string, t t2) {
        File file = new File(string);
        File file2 = file.getParentFile();
        if (null != file2 && !file2.exists()) {
            file2.mkdirs();
        }
        try {
            OutputStream outputStream = new FileOutputStream(string, t.a(t2));
            if (t.b(t2)) {
                outputStream = new BufferedOutputStream(outputStream);
            }
            return new r(string, outputStream, t.a(t2), t.c(t2), t.d(t2), t.e(t2));
        }
        catch (FileNotFoundException fileNotFoundException) {
            b.a.b("FileManager (" + string + ") " + fileNotFoundException);
            return null;
        }
    }

    /* synthetic */ u(s s2) {
        this();
    }
}

