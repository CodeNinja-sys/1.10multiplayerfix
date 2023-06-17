/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.b.d;

import java.io.File;
import java.io.Serializable;

public class e
implements Serializable {
    static final e[] a = new e[0];
    private final e b;
    private e[] c;
    private final File d;
    private String e;
    private boolean f;
    private boolean g;
    private long h;
    private long i;

    public e(File file) {
        this(null, file);
    }

    public e(e e2, File file) {
        if (file == null) {
            throw new IllegalArgumentException("File is missing");
        }
        this.d = file;
        this.b = e2;
        this.e = file.getName();
    }

    public boolean a(File file) {
        boolean bl2 = this.f;
        long l2 = this.h;
        boolean bl3 = this.g;
        long l3 = this.i;
        this.e = file.getName();
        this.f = file.exists();
        this.g = this.f ? file.isDirectory() : false;
        this.h = this.f ? file.lastModified() : 0L;
        this.i = this.f && !this.g ? file.length() : 0L;
        return this.f != bl2 || this.h != l2 || this.g != bl3 || this.i != l3;
    }

    public e b(File file) {
        return new e(this, file);
    }

    public e a() {
        return this.b;
    }

    public int b() {
        return this.b == null ? 0 : this.b.b() + 1;
    }

    public e[] c() {
        return this.c != null ? this.c : a;
    }

    public void a(e[] arre) {
        this.c = arre;
    }

    public File d() {
        return this.d;
    }

    public String e() {
        return this.e;
    }

    public void a(String string) {
        this.e = string;
    }

    public long f() {
        return this.h;
    }

    public void a(long l2) {
        this.h = l2;
    }

    public long g() {
        return this.i;
    }

    public void b(long l2) {
        this.i = l2;
    }

    public boolean h() {
        return this.f;
    }

    public void a(boolean bl2) {
        this.f = bl2;
    }

    public boolean i() {
        return this.g;
    }

    public void b(boolean bl2) {
        this.g = bl2;
    }
}

