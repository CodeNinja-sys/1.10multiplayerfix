/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.h;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.a.h.a;
import org.apache.a.h.g;

public class i
extends a
implements Cloneable {
    protected final File e;

    public i(File file, String string) {
        this.e = (File)org.apache.a.o.a.a(file, "File");
        this.a(string);
    }

    public i(File file, g g2) {
        this.e = (File)org.apache.a.o.a.a(file, "File");
        if (g2 != null) {
            this.a(g2.toString());
        }
    }

    public i(File file) {
        this.e = (File)org.apache.a.o.a.a(file, "File");
    }

    public boolean a() {
        return true;
    }

    public long c() {
        return this.e.length();
    }

    public InputStream f() {
        return new FileInputStream(this.e);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(OutputStream outputStream) {
        org.apache.a.o.a.a(outputStream, "Output stream");
        FileInputStream fileInputStream = new FileInputStream(this.e);
        try {
            int n2;
            byte[] arrby = new byte[4096];
            while ((n2 = ((InputStream)fileInputStream).read(arrby)) != -1) {
                outputStream.write(arrby, 0, n2);
            }
            outputStream.flush();
        }
        finally {
            ((InputStream)fileInputStream).close();
        }
    }

    public boolean g() {
        return false;
    }

    public Object clone() {
        return super.clone();
    }
}

