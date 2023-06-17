/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.i;

import com.a.a.b.cl;
import com.a.a.i.ax;
import com.a.a.i.bi;
import com.a.a.i.bj;
import com.a.a.i.s;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

final class bm
extends s {
    private final File a;

    private bm(File file) {
        this.a = (File)cl.a(file);
    }

    public FileInputStream i() {
        return new FileInputStream(this.a);
    }

    @Override
    public long e() {
        if (!this.a.isFile()) {
            throw new FileNotFoundException(this.a.toString());
        }
        return this.a.length();
    }

    @Override
    public byte[] f() {
        ax ax2 = ax.a();
        try {
            FileInputStream fileInputStream = (FileInputStream)ax2.a(this.i());
            byte[] arrby = bi.a(fileInputStream, fileInputStream.getChannel().size());
            return arrby;
        }
        catch (Throwable throwable) {
            throw ax2.a(throwable);
        }
        finally {
            ax2.close();
        }
    }

    public String toString() {
        return "Files.asByteSource(" + this.a + ")";
    }

    @Override
    public /* synthetic */ InputStream a() {
        return this.i();
    }

    /* synthetic */ bm(File file, bj bj2) {
        this(file);
    }
}

