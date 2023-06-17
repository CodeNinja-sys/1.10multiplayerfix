/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.b.a;

import java.io.File;
import java.io.Serializable;
import java.util.Comparator;
import org.apache.commons.b.a.a;
import org.apache.commons.b.a.i;
import org.apache.commons.b.p;
import org.apache.commons.b.r;

public class e
extends a
implements Serializable {
    public static final Comparator a = new e();
    public static final Comparator b = new i(a);
    public static final Comparator c = new e(r.b);
    public static final Comparator d = new i(c);
    public static final Comparator e = new e(r.c);
    public static final Comparator f = new i(e);
    private final r g;

    public e() {
        this.g = r.a;
    }

    public e(r r2) {
        this.g = r2 == null ? r.a : r2;
    }

    public int a(File file, File file2) {
        String string = p.p(file.getName());
        String string2 = p.p(file2.getName());
        return this.g.a(string, string2);
    }

    @Override
    public String toString() {
        return super.toString() + "[caseSensitivity=" + this.g + "]";
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((File)object, (File)object2);
    }
}

