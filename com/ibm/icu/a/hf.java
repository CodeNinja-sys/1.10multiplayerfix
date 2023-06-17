/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.d.ku;
import java.text.CharacterIterator;

public class hf
implements CharacterIterator {
    private ku a;

    public hf(ku ku2) {
        this.a = ku2;
    }

    public char first() {
        this.a.l();
        return (char)this.a.a();
    }

    public char last() {
        this.a.f();
        return (char)this.a.e();
    }

    public char current() {
        return (char)this.a.a();
    }

    public char next() {
        this.a.d();
        return (char)this.a.a();
    }

    public char previous() {
        return (char)this.a.e();
    }

    public char setIndex(int n2) {
        this.a.a(n2);
        return (char)this.a.a();
    }

    public int getBeginIndex() {
        return 0;
    }

    public int getEndIndex() {
        return this.a.b();
    }

    public int getIndex() {
        return this.a.c();
    }

    public Object clone() {
        try {
            hf hf2 = (hf)super.clone();
            hf2.a = (ku)this.a.clone();
            return hf2;
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            return null;
        }
    }
}

