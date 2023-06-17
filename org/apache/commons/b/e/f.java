/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.b.e;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.commons.b.e.b;
import org.apache.commons.b.e.q;
import org.apache.commons.b.t;

public class f
extends q {
    private b a;
    private OutputStream b;
    private File c;
    private final String d;
    private final String e;
    private final File f;
    private boolean g = false;

    public f(int n2, File file) {
        this(n2, file, null, null, null);
    }

    public f(int n2, String string, String string2, File file) {
        this(n2, null, string, string2, file);
        if (string == null) {
            throw new IllegalArgumentException("Temporary file prefix is missing");
        }
    }

    private f(int n2, File file, String string, String string2, File file2) {
        super(n2);
        this.c = file;
        this.a = new b();
        this.b = this.a;
        this.d = string;
        this.e = string2;
        this.f = file2;
    }

    @Override
    protected OutputStream a() {
        return this.b;
    }

    @Override
    protected void b() {
        if (this.d != null) {
            this.c = File.createTempFile(this.d, this.e, this.f);
        }
        FileOutputStream fileOutputStream = new FileOutputStream(this.c);
        this.a.a(fileOutputStream);
        this.b = fileOutputStream;
        this.a = null;
    }

    public boolean c() {
        return !this.h();
    }

    public byte[] d() {
        if (this.a != null) {
            return this.a.c();
        }
        return null;
    }

    public File e() {
        return this.c;
    }

    @Override
    public void close() {
        super.close();
        this.g = true;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(OutputStream outputStream) {
        if (!this.g) {
            throw new IOException("Stream not closed");
        }
        if (this.c()) {
            this.a.a(outputStream);
        } else {
            FileInputStream fileInputStream = new FileInputStream(this.c);
            try {
                t.a((InputStream)fileInputStream, outputStream);
            }
            finally {
                t.a(fileInputStream);
            }
        }
    }
}

