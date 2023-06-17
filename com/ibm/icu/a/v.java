/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.d.ku;
import java.text.CharacterIterator;

public class v
extends ku {
    private CharacterIterator b;

    public v(CharacterIterator characterIterator) {
        if (characterIterator == null) {
            throw new IllegalArgumentException();
        }
        this.b = characterIterator;
    }

    public int a() {
        char c2 = this.b.current();
        if (c2 == '\uffff') {
            return -1;
        }
        return c2;
    }

    public int b() {
        return this.b.getEndIndex() - this.b.getBeginIndex();
    }

    public int c() {
        return this.b.getIndex();
    }

    public int d() {
        char c2 = this.b.current();
        this.b.next();
        if (c2 == '\uffff') {
            return -1;
        }
        return c2;
    }

    public int e() {
        char c2 = this.b.previous();
        if (c2 == '\uffff') {
            return -1;
        }
        return c2;
    }

    public void a(int n2) {
        try {
            this.b.setIndex(n2);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new IndexOutOfBoundsException();
        }
    }

    public void f() {
        this.b.setIndex(this.b.getEndIndex());
    }

    public int a(char[] arrc, int n2) {
        int n3 = this.b.getEndIndex() - this.b.getBeginIndex();
        int n4 = this.b.getIndex();
        if (n2 < 0 || n2 + n3 > arrc.length) {
            throw new IndexOutOfBoundsException(Integer.toString(n3));
        }
        char c2 = this.b.first();
        while (c2 != '\uffff') {
            arrc[n2++] = c2;
            c2 = this.b.next();
        }
        this.b.setIndex(n4);
        return n3;
    }

    public Object clone() {
        try {
            v v2 = (v)super.clone();
            v2.b = (CharacterIterator)this.b.clone();
            return v2;
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            return null;
        }
    }

    public int b(int n2) {
        int n3 = this.b.getEndIndex() - this.b.getBeginIndex();
        int n4 = this.b.getIndex() + n2;
        if (n4 < 0) {
            n4 = 0;
        } else if (n4 > n3) {
            n4 = n3;
        }
        return this.b.setIndex(n4);
    }

    public CharacterIterator g() {
        return (CharacterIterator)this.b.clone();
    }
}

