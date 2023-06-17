/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.b.b;

import java.io.File;
import java.io.Serializable;
import java.util.List;
import org.apache.commons.b.b.a;
import org.apache.commons.b.p;

public class y
extends a
implements Serializable {
    private final String[] a;

    public y(String string) {
        if (string == null) {
            throw new IllegalArgumentException("The wildcard must not be null");
        }
        this.a = new String[]{string};
    }

    public y(String[] arrstring) {
        if (arrstring == null) {
            throw new IllegalArgumentException("The wildcard array must not be null");
        }
        this.a = new String[arrstring.length];
        System.arraycopy(arrstring, 0, this.a, 0, arrstring.length);
    }

    public y(List list) {
        if (list == null) {
            throw new IllegalArgumentException("The wildcard list must not be null");
        }
        this.a = list.toArray(new String[list.size()]);
    }

    @Override
    public boolean accept(File file, String string) {
        if (file != null && new File(file, string).isDirectory()) {
            return false;
        }
        for (String string2 : this.a) {
            if (!p.h(string, string2)) continue;
            return true;
        }
        return false;
    }

    @Override
    public boolean accept(File file) {
        if (file.isDirectory()) {
            return false;
        }
        for (String string : this.a) {
            if (!p.h(file.getName(), string)) continue;
            return true;
        }
        return false;
    }
}

