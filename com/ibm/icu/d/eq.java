/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.d.er;
import java.text.AttributedCharacterIterator;

final class eq {
    private AttributedCharacterIterator.Attribute a;
    private Object b;
    private int c;
    private int d;

    public eq(Object object, int n2, int n3) {
        this.a(er.a, object, n2, n3);
    }

    public eq(AttributedCharacterIterator.Attribute attribute, Object object, int n2, int n3) {
        this.a(attribute, object, n2, n3);
    }

    public void a(AttributedCharacterIterator.Attribute attribute, Object object, int n2, int n3) {
        this.a = attribute;
        this.b = object;
        this.c = n2;
        this.d = n3;
    }

    static /* synthetic */ AttributedCharacterIterator.Attribute a(eq eq2) {
        return eq2.a;
    }

    static /* synthetic */ Object b(eq eq2) {
        return eq2.b;
    }

    static /* synthetic */ int c(eq eq2) {
        return eq2.c;
    }

    static /* synthetic */ int d(eq eq2) {
        return eq2.d;
    }
}

