/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.a.c.a;

import java.util.LinkedHashSet;
import java.util.Set;
import org.apache.commons.a.c.a.aa;
import org.apache.commons.a.c.a.ac;
import org.apache.commons.a.c.a.h;
import org.apache.commons.a.c.a.l;

final class m {
    private final Set a;

    public static m a(h h2) {
        return new m(new aa("", h2));
    }

    private m(aa aa2) {
        this.a = new LinkedHashSet();
        this.a.add(aa2);
    }

    private m(Set set) {
        this.a = set;
    }

    public void a(CharSequence charSequence) {
        for (aa aa2 : this.a) {
            aa2.a(charSequence);
        }
    }

    public void a(ac ac2, int n2) {
        LinkedHashSet<aa> linkedHashSet = new LinkedHashSet<aa>(n2);
        block0: for (aa aa2 : this.a) {
            for (aa aa3 : ac2.b()) {
                h h2 = aa2.a().a(aa3.a());
                if (h2.b()) continue;
                aa aa4 = new aa(aa2, aa3, h2);
                if (linkedHashSet.size() >= n2) continue;
                linkedHashSet.add(aa4);
                if (linkedHashSet.size() < n2) continue;
                break block0;
            }
        }
        this.a.clear();
        this.a.addAll(linkedHashSet);
    }

    public Set a() {
        return this.a;
    }

    public String b() {
        StringBuilder stringBuilder = new StringBuilder();
        for (aa aa2 : this.a) {
            if (stringBuilder.length() > 0) {
                stringBuilder.append("|");
            }
            stringBuilder.append(aa2.c());
        }
        return stringBuilder.toString();
    }

    /* synthetic */ m(Set set, l l2) {
        this(set);
    }
}

