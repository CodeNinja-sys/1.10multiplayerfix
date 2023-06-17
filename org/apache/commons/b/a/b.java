/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.b.a;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import org.apache.commons.b.a.a;

public class b
extends a
implements Serializable {
    private static final Comparator[] a = new Comparator[0];
    private final Comparator[] b;

    public b(Comparator ... arrcomparator) {
        if (arrcomparator == null) {
            this.b = a;
        } else {
            this.b = new Comparator[arrcomparator.length];
            System.arraycopy(arrcomparator, 0, this.b, 0, arrcomparator.length);
        }
    }

    public b(Iterable iterable) {
        if (iterable == null) {
            this.b = a;
        } else {
            ArrayList<Comparator> arrayList = new ArrayList<Comparator>();
            for (Comparator comparator : iterable) {
                arrayList.add(comparator);
            }
            this.b = arrayList.toArray(new Comparator[arrayList.size()]);
        }
    }

    public int a(File file, File file2) {
        Comparator comparator;
        int n2 = 0;
        Comparator[] arrcomparator = this.b;
        int n3 = arrcomparator.length;
        for (int i2 = 0; i2 < n3 && (n2 = (comparator = arrcomparator[i2]).compare(file, file2)) == 0; ++i2) {
        }
        return n2;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append('{');
        for (int i2 = 0; i2 < this.b.length; ++i2) {
            if (i2 > 0) {
                stringBuilder.append(',');
            }
            stringBuilder.append(this.b[i2]);
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((File)object, (File)object2);
    }
}

