/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.i;

import com.a.a.b.cl;
import com.a.a.d.lo;
import com.a.a.i.bh;
import com.a.a.i.bj;
import com.a.a.i.p;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

final class bl
extends p {
    private final File a;
    private final lo b;

    private bl(File file, bh ... arrbh) {
        this.a = (File)cl.a(file);
        this.b = lo.a((Object[])arrbh);
    }

    public FileOutputStream e() {
        return new FileOutputStream(this.a, this.b.contains((Object)bh.a));
    }

    public String toString() {
        return "Files.asByteSink(" + this.a + ", " + this.b + ")";
    }

    @Override
    public /* synthetic */ OutputStream a() {
        return this.e();
    }

    /* synthetic */ bl(File file, bh[] arrbh, bj bj2) {
        this(file, arrbh);
    }
}

