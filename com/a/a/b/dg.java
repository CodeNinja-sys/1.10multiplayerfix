/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.b;

import com.a.a.b.cl;
import com.a.a.b.dh;
import com.a.a.b.dj;
import com.a.a.b.dl;
import com.a.a.b.dn;
import com.a.a.b.dp;
import com.a.a.b.dq;
import com.a.a.b.ds;
import com.a.a.b.m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

public final class dg {
    private final m a;
    private final boolean b;
    private final ds c;
    private final int d;

    private dg(ds ds2) {
        this(ds2, false, m.m, Integer.MAX_VALUE);
    }

    private dg(ds ds2, boolean bl2, m m2, int n2) {
        this.c = ds2;
        this.b = bl2;
        this.a = m2;
        this.d = n2;
    }

    public static dg a(char c2) {
        return dg.a(m.a(c2));
    }

    public static dg a(m m2) {
        cl.a(m2);
        return new dg(new dh(m2));
    }

    public static dg a(String string) {
        cl.a(string.length() != 0, (Object)"The separator may not be the empty string.");
        return new dg(new dj(string));
    }

    public static dg a(Pattern pattern) {
        cl.a(pattern);
        cl.a(!pattern.matcher("").matches(), "The pattern may not match the empty string: %s", new Object[]{pattern});
        return new dg(new dl(pattern));
    }

    public static dg b(String string) {
        return dg.a(Pattern.compile(string));
    }

    public static dg a(int n2) {
        cl.a(n2 > 0, (Object)"The length may not be less than 1");
        return new dg(new dn(n2));
    }

    public dg a() {
        return new dg(this.c, true, this.a, this.d);
    }

    public dg b(int n2) {
        cl.a(n2 > 0, "must be greater than zero: %s", new Object[]{n2});
        return new dg(this.c, this.b, this.a, n2);
    }

    public dg b() {
        return this.b(m.r);
    }

    public dg b(m m2) {
        cl.a(m2);
        return new dg(this.c, this.b, m2, this.d);
    }

    public Iterable a(CharSequence charSequence) {
        cl.a(charSequence);
        return new dp(this, charSequence);
    }

    private Iterator c(CharSequence charSequence) {
        return this.c.b(this, charSequence);
    }

    public List b(CharSequence charSequence) {
        cl.a(charSequence);
        Iterator iterator = this.c(charSequence);
        ArrayList arrayList = new ArrayList();
        while (iterator.hasNext()) {
            arrayList.add(iterator.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public dq c(String string) {
        return this.a(dg.a(string));
    }

    public dq b(char c2) {
        return this.a(dg.a(c2));
    }

    public dq a(dg dg2) {
        return new dq(this, dg2, null);
    }

    static /* synthetic */ Iterator a(dg dg2, CharSequence charSequence) {
        return dg2.c(charSequence);
    }

    static /* synthetic */ m b(dg dg2) {
        return dg2.a;
    }

    static /* synthetic */ boolean c(dg dg2) {
        return dg2.b;
    }

    static /* synthetic */ int d(dg dg2) {
        return dg2.d;
    }
}

