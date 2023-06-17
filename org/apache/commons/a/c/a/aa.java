/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.a.c.a;

import java.util.Collections;
import java.util.Comparator;
import org.apache.commons.a.c.a.ab;
import org.apache.commons.a.c.a.ac;
import org.apache.commons.a.c.a.h;

public final class aa
implements ac {
    public static final Comparator a = new ab();
    private final StringBuilder b;
    private final h c;

    public aa(CharSequence charSequence, h h2) {
        this.b = new StringBuilder(charSequence);
        this.c = h2;
    }

    public aa(aa aa2, aa aa3) {
        this(aa2.b, aa2.c);
        this.b.append((CharSequence)aa3.b);
    }

    public aa(aa aa2, aa aa3, h h2) {
        this(aa2.b, h2);
        this.b.append((CharSequence)aa3.b);
    }

    public aa a(CharSequence charSequence) {
        this.b.append(charSequence);
        return this;
    }

    public h a() {
        return this.c;
    }

    @Override
    public Iterable b() {
        return Collections.singleton(this);
    }

    public CharSequence c() {
        return this.b;
    }

    public aa a(aa aa2) {
        return new aa(this.b.toString() + aa2.b.toString(), this.c.a(aa2.c));
    }

    static /* synthetic */ StringBuilder b(aa aa2) {
        return aa2.b;
    }
}

