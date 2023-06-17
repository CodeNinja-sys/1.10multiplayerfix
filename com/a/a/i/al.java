/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.i;

import com.a.a.b.cl;
import com.a.a.b.dg;
import com.a.a.b.e;
import com.a.a.d.jl;
import com.a.a.i.ai;
import com.a.a.i.ak;
import com.a.a.i.am;
import com.a.a.i.ce;
import java.io.Reader;
import java.util.Iterator;
import java.util.regex.Pattern;

class al
extends ak {
    private static final dg a = dg.a(Pattern.compile("\r\n|\n|\r"));
    private final CharSequence b;

    protected al(CharSequence charSequence) {
        this.b = (CharSequence)cl.a(charSequence);
    }

    @Override
    public Reader a() {
        return new ai(this.b);
    }

    @Override
    public String d() {
        return this.b.toString();
    }

    @Override
    public boolean g() {
        return this.b.length() == 0;
    }

    private Iterable k() {
        return new am(this);
    }

    @Override
    public String e() {
        Iterator iterator = this.k().iterator();
        return iterator.hasNext() ? (String)iterator.next() : null;
    }

    @Override
    public jl f() {
        return jl.a(this.k());
    }

    @Override
    public Object a(ce ce2) {
        String string;
        Iterator iterator = this.k().iterator();
        while (iterator.hasNext() && ce2.a(string = (String)iterator.next())) {
        }
        return ce2.b();
    }

    public String toString() {
        return "CharSource.wrap(" + e.a(this.b, 30, "...") + ")";
    }

    @Override
    public /* synthetic */ Object h() {
        return super.b();
    }

    static /* synthetic */ CharSequence a(al al2) {
        return al2.b;
    }

    static /* synthetic */ dg j() {
        return a;
    }
}

