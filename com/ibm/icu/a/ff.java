/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.b.b;
import java.util.Iterator;

public class ff
implements Iterator {
    private boolean a;
    private CharSequence b;
    private int c;
    private int d;
    private Character e;

    ff(CharSequence charSequence, int n2, boolean bl2) {
        this.b = charSequence;
        this.c = this.d = n2;
        this.a = bl2;
    }

    public boolean hasNext() {
        return this.c != this.b.length() || this.e != null;
    }

    public Character a() {
        Character c2;
        if (this.c == this.b.length() && this.e == null) {
            return null;
        }
        if (this.e != null) {
            c2 = this.e;
            this.e = null;
        } else if (this.a) {
            int n2 = com.ibm.icu.b.b.a(Character.codePointAt(this.b, this.c), true);
            this.c += Character.charCount(n2);
            char[] arrc = Character.toChars(n2);
            c2 = Character.valueOf(arrc[0]);
            if (arrc.length == 2) {
                this.e = Character.valueOf(arrc[1]);
            }
        } else {
            c2 = Character.valueOf(this.b.charAt(this.c));
            ++this.c;
        }
        return c2;
    }

    public void remove() {
        throw new UnsupportedOperationException("remove() not supproted");
    }

    public int b() {
        return this.c;
    }

    public int c() {
        if (this.e != null) {
            throw new IllegalStateException("In the middle of surrogate pair");
        }
        return this.c - this.d;
    }

    public /* synthetic */ Object next() {
        return this.a();
    }
}

