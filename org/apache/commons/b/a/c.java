/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.b.a;

import java.io.File;
import java.io.Serializable;
import java.util.Comparator;
import org.apache.commons.b.a.a;
import org.apache.commons.b.a.i;

public class c
extends a
implements Serializable {
    public static final Comparator a = new c();
    public static final Comparator b = new i(a);

    public int a(File file, File file2) {
        return file.compareTo(file2);
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((File)object, (File)object2);
    }
}

