/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.b.a;

import java.io.File;
import java.io.Serializable;
import java.util.Comparator;
import org.apache.commons.b.a.a;
import org.apache.commons.b.a.i;

public class f
extends a
implements Serializable {
    public static final Comparator a = new f();
    public static final Comparator b = new i(a);

    public int a(File file, File file2) {
        long l2 = file.lastModified() - file2.lastModified();
        if (l2 < 0L) {
            return -1;
        }
        if (l2 > 0L) {
            return 1;
        }
        return 0;
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((File)object, (File)object2);
    }
}

