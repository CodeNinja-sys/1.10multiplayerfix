/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.b.a;

import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

abstract class a
implements Comparator {
    a() {
    }

    public File[] a(File ... arrfile) {
        if (arrfile != null) {
            Arrays.sort(arrfile, this);
        }
        return arrfile;
    }

    public List a(List list) {
        if (list != null) {
            Collections.sort(list, this);
        }
        return list;
    }

    public String toString() {
        return this.getClass().getSimpleName();
    }
}

