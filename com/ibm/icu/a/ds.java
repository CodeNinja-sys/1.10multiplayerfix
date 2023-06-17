/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.dt;
import com.ibm.icu.a.dx;
import com.ibm.icu.d.fo;
import com.ibm.icu.d.gk;
import com.ibm.icu.d.gm;

public abstract class ds
extends gm {
    public final dt a;

    public ds(dt dt2) {
        this.a = dt2;
    }

    public StringBuilder a(CharSequence charSequence, StringBuilder stringBuilder) {
        if (stringBuilder == charSequence) {
            throw new IllegalArgumentException();
        }
        stringBuilder.setLength(0);
        this.a(charSequence, new dx(this.a, stringBuilder, charSequence.length()));
        return stringBuilder;
    }

    public Appendable a(CharSequence charSequence, Appendable appendable) {
        if (appendable == charSequence) {
            throw new IllegalArgumentException();
        }
        dx dx2 = new dx(this.a, appendable, charSequence.length());
        this.a(charSequence, dx2);
        dx2.e();
        return appendable;
    }

    protected abstract void a(CharSequence var1, dx var2);

    public StringBuilder a(StringBuilder stringBuilder, CharSequence charSequence) {
        return this.a(stringBuilder, charSequence, true);
    }

    public StringBuilder b(StringBuilder stringBuilder, CharSequence charSequence) {
        return this.a(stringBuilder, charSequence, false);
    }

    public StringBuilder a(StringBuilder stringBuilder, CharSequence charSequence, boolean bl2) {
        if (stringBuilder == charSequence) {
            throw new IllegalArgumentException();
        }
        this.a(charSequence, bl2, new dx(this.a, stringBuilder, stringBuilder.length() + charSequence.length()));
        return stringBuilder;
    }

    protected abstract void a(CharSequence var1, boolean var2, dx var3);

    public String d_(int n2) {
        return this.a.k(n2);
    }

    public String e(int n2) {
        return this.a.l(n2);
    }

    public int a(int n2, int n3) {
        return this.a.a(n2, n3);
    }

    public int f(int n2) {
        return this.a.e(this.a.a(n2));
    }

    public boolean a(CharSequence charSequence) {
        return charSequence.length() == this.c(charSequence);
    }

    public gk b(CharSequence charSequence) {
        return this.a(charSequence) ? fo.q : fo.p;
    }

    public int a(int n2) {
        return 1;
    }
}

