/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.b.d;

import java.io.File;
import java.io.FileFilter;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.apache.commons.b.a.g;
import org.apache.commons.b.d.a;
import org.apache.commons.b.d.e;
import org.apache.commons.b.o;
import org.apache.commons.b.r;

public class d
implements Serializable {
    private final List a = new CopyOnWriteArrayList();
    private final e b;
    private final FileFilter c;
    private final Comparator d;

    public d(String string) {
        this(new File(string));
    }

    public d(String string, FileFilter fileFilter) {
        this(new File(string), fileFilter);
    }

    public d(String string, FileFilter fileFilter, r r2) {
        this(new File(string), fileFilter, r2);
    }

    public d(File file) {
        this(file, (FileFilter)null);
    }

    public d(File file, FileFilter fileFilter) {
        this(file, fileFilter, (r)null);
    }

    public d(File file, FileFilter fileFilter, r r2) {
        this(new e(file), fileFilter, r2);
    }

    protected d(e e2, FileFilter fileFilter, r r2) {
        if (e2 == null) {
            throw new IllegalArgumentException("Root entry is missing");
        }
        if (e2.d() == null) {
            throw new IllegalArgumentException("Root directory is missing");
        }
        this.b = e2;
        this.c = fileFilter;
        this.d = r2 == null || r2.equals(r.c) ? g.e : (r2.equals(r.b) ? g.c : g.a);
    }

    public File a() {
        return this.b.d();
    }

    public FileFilter b() {
        return this.c;
    }

    public void a(a a2) {
        if (a2 != null) {
            this.a.add(a2);
        }
    }

    public void b(a a2) {
        if (a2 != null) {
            while (this.a.remove(a2)) {
            }
        }
    }

    public Iterable c() {
        return this.a;
    }

    public void d() {
        this.b.a(this.b.d());
        File[] arrfile = this.a(this.b.d());
        e[] arre = arrfile.length > 0 ? new e[arrfile.length] : e.a;
        for (int i2 = 0; i2 < arrfile.length; ++i2) {
            arre[i2] = this.a(this.b, arrfile[i2]);
        }
        this.b.a(arre);
    }

    public void e() {
    }

    public void f() {
        for (Object object : this.a) {
            object.a(this);
        }
        File file = this.b.d();
        if (file.exists()) {
            this.a(this.b, this.b.c(), this.a(file));
        } else if (this.b.h()) {
            this.a(this.b, this.b.c(), o.o);
        }
        for (a a2 : this.a) {
            a2.b(this);
        }
    }

    private void a(e e2, e[] arre, File[] arrfile) {
        int n2 = 0;
        e[] arre2 = arrfile.length > 0 ? new e[arrfile.length] : e.a;
        for (e e3 : arre) {
            while (n2 < arrfile.length && this.d.compare(e3.d(), arrfile[n2]) > 0) {
                arre2[n2] = this.a(e2, arrfile[n2]);
                this.a(arre2[n2]);
                ++n2;
            }
            if (n2 < arrfile.length && this.d.compare(e3.d(), arrfile[n2]) == 0) {
                this.b(e3, arrfile[n2]);
                this.a(e3, e3.c(), this.a(arrfile[n2]));
                arre2[n2] = e3;
                ++n2;
                continue;
            }
            this.a(e3, e3.c(), o.o);
            this.b(e3);
        }
        while (n2 < arrfile.length) {
            arre2[n2] = this.a(e2, arrfile[n2]);
            this.a(arre2[n2]);
            ++n2;
        }
        e2.a(arre2);
    }

    private e a(e e2, File file) {
        e e3 = e2.b(file);
        e3.a(file);
        File[] arrfile = this.a(file);
        e[] arre = arrfile.length > 0 ? new e[arrfile.length] : e.a;
        for (int i2 = 0; i2 < arrfile.length; ++i2) {
            arre[i2] = this.a(e3, arrfile[i2]);
        }
        e3.a(arre);
        return e3;
    }

    private void a(e e2) {
        e[] arre = this.a.iterator();
        while (arre.hasNext()) {
            e[] arre2 = (e[])arre.next();
            if (e2.i()) {
                arre2.a(e2.d());
                continue;
            }
            arre2.d(e2.d());
        }
        for (e e3 : arre = e2.c()) {
            this.a(e3);
        }
    }

    private void b(e e2, File file) {
        if (e2.a(file)) {
            for (a a2 : this.a) {
                if (e2.i()) {
                    a2.b(file);
                    continue;
                }
                a2.e(file);
            }
        }
    }

    private void b(e e2) {
        for (a a2 : this.a) {
            if (e2.i()) {
                a2.c(e2.d());
                continue;
            }
            a2.f(e2.d());
        }
    }

    private File[] a(File file) {
        File[] arrfile = null;
        if (file.isDirectory()) {
            File[] arrfile2 = arrfile = this.c == null ? file.listFiles() : file.listFiles(this.c);
        }
        if (arrfile == null) {
            arrfile = o.o;
        }
        if (this.d != null && arrfile.length > 1) {
            Arrays.sort(arrfile, this.d);
        }
        return arrfile;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getClass().getSimpleName());
        stringBuilder.append("[file='");
        stringBuilder.append(this.a().getPath());
        stringBuilder.append('\'');
        if (this.c != null) {
            stringBuilder.append(", ");
            stringBuilder.append(this.c.toString());
        }
        stringBuilder.append(", listeners=");
        stringBuilder.append(this.a.size());
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

