/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.a.c;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.apache.logging.log4j.core.a.c.k;
import org.apache.logging.log4j.core.a.c.l;
import org.apache.logging.log4j.core.a.c.m;
import org.apache.logging.log4j.core.a.c.n;
import org.apache.logging.log4j.core.a.x;

class o
implements x {
    private o() {
    }

    public k a(String string, n n2) {
        File file = new File(string);
        File file2 = file.getParentFile();
        if (null != file2 && !file2.exists()) {
            file2.mkdirs();
        }
        if (!n.a(n2)) {
            file.delete();
        }
        long l2 = n.a(n2) ? file.length() : 0L;
        long l3 = file.exists() ? file.lastModified() : System.currentTimeMillis();
        RandomAccessFile randomAccessFile = null;
        try {
            randomAccessFile = new RandomAccessFile(string, "rw");
            if (n.a(n2)) {
                long l4 = randomAccessFile.length();
                k.t().e("RandomAccessFile {} seek to {}", string, l4);
                randomAccessFile.seek(l4);
            } else {
                k.u().e("RandomAccessFile {} set length to 0", string);
                randomAccessFile.setLength(0L);
            }
            return new k(randomAccessFile, string, n.b(n2), new m(), n.a(n2), n.c(n2), l2, l3, n.d(n2), n.e(n2), n.f(n2), n.g(n2));
        }
        catch (IOException iOException) {
            k.v().b("Cannot access RandomAccessFile {}) " + iOException);
            if (randomAccessFile != null) {
                try {
                    randomAccessFile.close();
                }
                catch (IOException iOException2) {
                    k.w().b("Cannot close RandomAccessFile {}", string, iOException2);
                }
            }
            return null;
        }
    }

    /* synthetic */ o(l l2) {
        this();
    }
}

