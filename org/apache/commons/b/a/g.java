/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.b.a;

import java.io.File;
import java.io.Serializable;
import java.util.Comparator;
import org.apache.commons.b.a.a;
import org.apache.commons.b.a.i;
import org.apache.commons.b.r;

public class g
extends a
implements Serializable {
    public static final Comparator a = new g();
    public static final Comparator b = new i(a);
    public static final Comparator c = new g(r.b);
    public static final Comparator d = new i(c);
    public static final Comparator e = new g(r.c);
    public static final Comparator f = new i(e);
    private final r g;

    public g() {
        this.g = r.a;
    }

    public g(r r2) {
        this.g = r2 == null ? r.a : r2;
    }

    public int a(File file, File file2) {
        return this.g.a(file.getName(), file2.getName());
    }

    @Override
    public String toString() {
        return super.toString() + "[caseSensitivity=" + this.g + "]";
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((File)object, (File)object2);
    }
}

