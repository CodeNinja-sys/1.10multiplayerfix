/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.b.b;

import java.io.File;
import java.io.Serializable;
import java.util.List;
import org.apache.commons.b.b.a;
import org.apache.commons.b.r;

public class s
extends a
implements Serializable {
    private final String[] a;
    private final r b;

    public s(String string) {
        this(string, r.a);
    }

    public s(String string, r r2) {
        if (string == null) {
            throw new IllegalArgumentException("The prefix must not be null");
        }
        this.a = new String[]{string};
        this.b = r2 == null ? r.a : r2;
    }

    public s(String[] arrstring) {
        this(arrstring, r.a);
    }

    public s(String[] arrstring, r r2) {
        if (arrstring == null) {
            throw new IllegalArgumentException("The array of prefixes must not be null");
        }
        this.a = new String[arrstring.length];
        System.arraycopy(arrstring, 0, this.a, 0, arrstring.length);
        this.b = r2 == null ? r.a : r2;
    }

    public s(List list) {
        this(list, r.a);
    }

    public s(List list, r r2) {
        if (list == null) {
            throw new IllegalArgumentException("The list of prefixes must not be null");
        }
        this.a = list.toArray(new String[list.size()]);
        this.b = r2 == null ? r.a : r2;
    }

    @Override
    public boolean accept(File file) {
        String string = file.getName();
        for (String string2 : this.a) {
            if (!this.b.c(string, string2)) continue;
            return true;
        }
        return false;
    }

    @Override
    public boolean accept(File file, String string) {
        for (String string2 : this.a) {
            if (!this.b.c(string, string2)) continue;
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

