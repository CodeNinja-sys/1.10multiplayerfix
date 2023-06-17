/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.i;

import com.a.a.d.aga;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;

final class bk
extends aga {
    bk() {
    }

    public Iterable a(File file) {
        File[] arrfile;
        if (file.isDirectory() && (arrfile = file.listFiles()) != null) {
            return Collections.unmodifiableList(Arrays.asList(arrfile));
        }
        return Collections.emptyList();
    }

    public String toString() {
        return "Files.fileTreeTraverser()";
    }

    @Override
    public /* synthetic */ Iterable c(Object object) {
        return this.a((File)object);
    }
}

