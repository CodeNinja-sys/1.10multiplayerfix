/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.a;

import java.io.File;
import java.io.RandomAccessFile;
import org.apache.logging.log4j.core.a.aa;
import org.apache.logging.log4j.core.a.ab;
import org.apache.logging.log4j.core.a.ac;
import org.apache.logging.log4j.core.a.ad;
import org.apache.logging.log4j.core.a.b;
import org.apache.logging.log4j.core.a.x;

class ae
implements x {
    private ae() {
    }

    public aa a(String string, ad ad2) {
        File file = new File(string);
        File file2 = file.getParentFile();
        if (null != file2 && !file2.exists()) {
            file2.mkdirs();
        }
        if (!ad.a(ad2)) {
            file.delete();
        }
        ac ac2 = new ac();
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(string, "rw");
            if (ad.a(ad2)) {
                randomAccessFile.seek(randomAccessFile.length());
            } else {
                randomAccessFile.setLength(0L);
            }
            return new aa(randomAccessFile, string, ac2, ad.b(ad2), ad.c(ad2), ad.d(ad2));
        }
        catch (Exception exception) {
            b.a.b("RandomAccessFileManager (" + string + ") " + exception);
            return null;
        }
    }

    /* synthetic */ ae(ab ab2) {
        this();
    }
}

