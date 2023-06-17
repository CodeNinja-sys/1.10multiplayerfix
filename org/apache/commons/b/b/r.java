/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.b.b;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.commons.b.b.a;
import org.apache.commons.b.b.f;
import org.apache.commons.b.b.n;

public class r
extends a
implements Serializable,
f {
    private final List a;

    public r() {
        this.a = new ArrayList();
    }

    public r(List list) {
        this.a = list == null ? new ArrayList() : new ArrayList(list);
    }

    public r(n n2, n n3) {
        if (n2 == null || n3 == null) {
            throw new IllegalArgumentException("The filters must not be null");
        }
        this.a = new ArrayList(2);
        this.a(n2);
        this.a(n3);
    }

    @Override
    public void a(n n2) {
        this.a.add(n2);
    }

    @Override
    public List a() {
        return Collections.unmodifiableList(this.a);
    }

    @Override
    public boolean b(n n2) {
        return this.a.remove(n2);
    }

    @Override
    public void a(List list) {
        this.a.clear();
        this.a.addAll(list);
    }

    @Override
    public boolean accept(File file) {
        for (n n2 : this.a) {
            if (!n2.accept(file)) continue;
            return true;
        }
        return false;
    }

    @Override
    public boolean accept(File file, String string) {
        for (n n2 : this.a) {
            if (!n2.accept(file, string)) continue;
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
            for (int i2 = 0; i2 < this.a.size(); ++i2) {
                Object e2;
                if (i2 > 0) {
                    stringBuilder.append(",");
                }
                stringBuilder.append((e2 = this.a.get(i2)) == null ? "null" : e2.toString());
            }
        }
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

