/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.b;

import java.io.File;
import java.io.FileFilter;
import java.util.Collection;
import org.apache.commons.b.b.l;
import org.apache.commons.b.b.n;
import org.apache.commons.b.b.w;
import org.apache.commons.b.e;

public abstract class d {
    private final FileFilter a;
    private final int b;

    protected d() {
        this(null, -1);
    }

    protected d(FileFilter fileFilter, int n2) {
        this.a = fileFilter;
        this.b = n2;
    }

    protected d(n n2, n n3, int n4) {
        if (n2 == null && n3 == null) {
            this.a = null;
        } else {
            n2 = n2 != null ? n2 : w.a;
            n3 = n3 != null ? n3 : w.a;
            n2 = l.d(n2);
            n3 = l.e(n3);
            this.a = l.b(new n[]{n2, n3});
        }
        this.b = n4;
    }

    protected final void a(File file, Collection collection) {
        if (file == null) {
            throw new NullPointerException("Start Directory is null");
        }
        try {
            this.b(file, collection);
            this.h(file, 0, collection);
            this.a(collection);
        }
        catch (e e2) {
            this.a(file, collection, e2);
        }
    }

    private void h(File file, int n2, Collection collection) {
        this.a(file, n2, collection);
        if (this.c(file, n2, collection)) {
            this.d(file, n2, collection);
            int n3 = n2 + 1;
            if (this.b < 0 || n3 <= this.b) {
                this.a(file, n2, collection);
                File[] arrfile = this.a == null ? file.listFiles() : file.listFiles(this.a);
                arrfile = this.a(file, n2, arrfile);
                if (arrfile == null) {
                    this.f(file, n3, collection);
                } else {
                    for (File file2 : arrfile) {
                        if (file2.isDirectory()) {
                            this.h(file2, n3, collection);
                            continue;
                        }
                        this.a(file2, n3, collection);
                        this.e(file2, n3, collection);
                        this.a(file2, n3, collection);
                    }
                }
            }
            this.g(file, n2, collection);
        }
        this.a(file, n2, collection);
    }

    protected final void a(File file, int n2, Collection collection) {
        if (this.b(file, n2, collection)) {
            throw new e(file, n2);
        }
    }

    protected boolean b(File file, int n2, Collection collection) {
        return false;
    }

    protected void a(File file, Collection collection, e e2) {
        throw e2;
    }

    protected void b(File file, Collection collection) {
    }

    protected boolean c(File file, int n2, Collection collection) {
        return true;
    }

    protected void d(File file, int n2, Collection collection) {
    }

    protected File[] a(File file, int n2, File[] arrfile) {
        return arrfile;
    }

    protected void e(File file, int n2, Collection collection) {
    }

    protected void f(File file, int n2, Collection collection) {
    }

    protected void g(File file, int n2, Collection collection) {
    }

    protected void a(Collection collection) {
    }
}

