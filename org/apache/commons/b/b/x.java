/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.b.b;

import java.io.File;
import java.io.Serializable;
import java.util.List;
import org.apache.commons.b.b.a;
import org.apache.commons.b.p;
import org.apache.commons.b.r;

public class x
extends a
implements Serializable {
    private final String[] a;
    private final r b;

    public x(String string) {
        this(string, null);
    }

    public x(String string, r r2) {
        if (string == null) {
            throw new IllegalArgumentException("The wildcard must not be null");
        }
        this.a = new String[]{string};
        this.b = r2 == null ? r.a : r2;
    }

    public x(String[] arrstring) {
        this(arrstring, null);
    }

    public x(String[] arrstring, r r2) {
        if (arrstring == null) {
            throw new IllegalArgumentException("The wildcard array must not be null");
        }
        this.a = new String[arrstring.length];
        System.arraycopy(arrstring, 0, this.a, 0, arrstring.length);
        this.b = r2 == null ? r.a : r2;
    }

    public x(List list) {
        this(list, null);
    }

    public x(List list, r r2) {
        if (list == null) {
            throw new IllegalArgumentException("The wildcard list must not be null");
        }
        this.a = list.toArray(new String[list.size()]);
        this.b = r2 == null ? r.a : r2;
    }

    @Override
    public boolean accept(File file, String string) {
        for (String string2 : this.a) {
            if (!p.a(string, string2, this.b)) continue;
            return true;
        }
        return false;
    }

    @Override
    public boolean accept(File file) {
        String string = file.getName();
        for (String string2 : this.a) {
            if (!p.a(string, string2, this.b)) continue;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append("(");
        if (this.a != null) {
            for (int i2 = 0; i2 < this.a.length; ++i2) {
                if (i2 > 0) {
                    stringBuilder.append(",");
                }
                stringBuilder.append(this.a[i2]);
            }
        }
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

