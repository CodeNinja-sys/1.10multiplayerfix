/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.i;

import com.a.a.i.be;
import com.a.a.i.bf;
import com.a.a.i.bg;
import com.a.a.i.s;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class bd
extends OutputStream {
    private final int a;
    private final boolean b;
    private final s c;
    private OutputStream d;
    private bg e;
    private File f;

    synchronized File a() {
        return this.f;
    }

    public bd(int n2) {
        this(n2, false);
    }

    public bd(int n2, boolean bl2) {
        this.a = n2;
        this.b = bl2;
        this.e = new bg(null);
        this.d = this.e;
        this.c = bl2 ? new be(this) : new bf(this);
    }

    public s b() {
        return this.c;
    }

    private synchronized InputStream d() {
        if (this.f != null) {
            return new FileInputStream(this.f);
        }
        return new ByteArrayInputStream(this.e.a(), 0, this.e.b());
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public synchronized void c() {
        try {
            this.close();
        }
        finally {
            if (this.e == null) {
                this.e = new bg(null);
            } else {
                this.e.reset();
            }
            this.d = this.e;
            if (this.f != null) {
                File file = this.f;
                this.f = null;
                if (!file.delete()) {
                    throw new IOException("Could not delete: " + file);
                }
            }
        }
    }

    @Override
    public synchronized void write(int n2) {
        this.a(1);
        this.d.write(n2);
    }

    @Override
    public synchronized void write(byte[] arrby) {
        this.write(arrby, 0, arrby.length);
    }

    @Override
    public synchronized void write(byte[] arrby, int n2, int n3) {
        this.a(n3);
        this.d.write(arrby, n2, n3);
    }

    @Override
    public synchronized void close() {
        this.d.close();
    }

    @Override
    public synchronized void flush() {
        this.d.flush();
    }

    private void a(int n2) {
        if (this.f == null && this.e.b() + n2 > this.a) {
            File file = File.createTempFile("FileBackedOutputStream", null);
            if (this.b) {
                file.deleteOnExit();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(this.e.a(), 0, this.e.b());
            fileOutputStream.flush();
            this.d = fileOutputStream;
            this.f = file;
            this.e = null;
        }
    }

    static /* synthetic */ InputStream a(bd bd2) {
        return bd2.d();
    }
}

