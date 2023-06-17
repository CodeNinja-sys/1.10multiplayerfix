/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.archivers.b;

import java.io.File;
import java.util.Date;
import java.util.regex.Matcher;
import org.apache.commons.compress.archivers.b.d;
import org.apache.commons.compress.archivers.h.bb;

public class a
implements org.apache.commons.compress.archivers.a {
    private final d b;

    public a() {
        this.b = new d();
    }

    a(d d2) {
        this.b = d2;
    }

    public String getName() {
        if ((this.b.d & 0x10) != 0) {
            return this.b.t.replaceAll("/", Matcher.quoteReplacement(File.separator));
        }
        return this.b.t;
    }

    public long getSize() {
        return this.b.j;
    }

    public boolean isDirectory() {
        return this.b.f == 3;
    }

    public Date a() {
        long l2 = this.e() ? (long)this.b.h * 1000L : bb.c(0xFFFFFFFFL & (long)this.b.h);
        return new Date(l2);
    }

    public int b() {
        return this.b.m;
    }

    public int c() {
        return this.e() ? this.b() : 0;
    }

    public int d() {
        return this.b.c;
    }

    public boolean e() {
        return this.d() == 2 || this.d() == 8;
    }

    int f() {
        return this.b.e;
    }
}

