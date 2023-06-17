/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.b.a;

import java.io.File;
import java.io.Serializable;
import java.util.Comparator;
import org.apache.commons.b.a.a;
import org.apache.commons.b.a.i;
import org.apache.commons.b.o;

public class j
extends a
implements Serializable {
    public static final Comparator a = new j();
    public static final Comparator b = new i(a);
    public static final Comparator c = new j(true);
    public static final Comparator d = new i(c);
    private final boolean e;

    public j() {
        this.e = false;
    }

    public j(boolean bl2) {
        this.e = bl2;
    }

    public int a(File file, File file2) {
        long l2 = 0L;
        l2 = file.isDirectory() ? (this.e && file.exists() ? o.p(file) : 0L) : file.length();
        long l3 = 0L;
        l3 = file2.isDirectory() ? (this.e && file2.exists() ? o.p(file2) : 0L) : file2.length();
        long l4 = l2 - l3;
        if (l4 < 0L) {
            return -1;
        }
        if (l4 > 0L) {
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return super.toString() + "[sumDirectoryContents=" + this.e + "]";
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((File)object, (File)object2);
    }
}

