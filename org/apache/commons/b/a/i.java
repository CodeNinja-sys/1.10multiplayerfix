/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.b.a;

import java.io.File;
import java.io.Serializable;
import java.util.Comparator;
import org.apache.commons.b.a.a;

class i
extends a
implements Serializable {
    private final Comparator a;

    public i(Comparator comparator) {
        if (comparator == null) {
            throw new IllegalArgumentException("Delegate comparator is missing");
        }
        this.a = comparator;
    }

    public int a(File file, File file2) {
        return this.a.compare(file2, file);
    }

    @Override
    public String toString() {
        return super.toString() + "[" + this.a.toString() + "]";
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((File)object, (File)object2);
    }
}

