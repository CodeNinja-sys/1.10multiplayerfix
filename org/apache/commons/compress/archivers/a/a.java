/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.archivers.a;

import java.io.File;
import java.util.Date;

public class a
implements org.apache.commons.compress.archivers.a {
    public static final String b = "!<arch>\n";
    public static final String c = "`\n";
    private final String d;
    private final int e;
    private final int f;
    private final int g;
    private static final int h = 33188;
    private final long i;
    private final long j;

    public a(String string, long l2) {
        this(string, l2, 0, 0, 33188, System.currentTimeMillis() / 1000L);
    }

    public a(String string, long l2, int n2, int n3, int n4, long l3) {
        this.d = string;
        this.j = l2;
        this.e = n2;
        this.f = n3;
        this.g = n4;
        this.i = l3;
    }

    public a(File file, String string) {
        this(string, file.isFile() ? file.length() : 0L, 0, 0, 33188, file.lastModified() / 1000L);
    }

    public long getSize() {
        return this.f();
    }

    public String getName() {
        return this.d;
    }

    public int b() {
        return this.e;
    }

    public int c() {
        return this.f;
    }

    public int d() {
        return this.g;
    }

    public long e() {
        return this.i;
    }

    public Date a() {
        return new Date(1000L * this.e());
    }

    public long f() {
        return this.j;
    }

    public boolean isDirectory() {
        return false;
    }

    public int hashCode() {
        int n2 = 31;
        int n3 = 1;
        n3 = 31 * n3 + (this.d == null ? 0 : this.d.hashCode());
        return n3;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        a a2 = (a)object;
        return !(this.d == null ? a2.d != null : !this.d.equals(a2.d));
    }
}

