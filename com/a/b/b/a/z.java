/*
 * Decompiled with CFR 0.150.
 */
package com.a.b.b.a;

import com.a.b.an;
import com.a.b.d.a;
import com.a.b.d.d;
import com.a.b.d.e;

final class z
extends an {
    z() {
    }

    public void a(e e2, Class class_) {
        if (class_ != null) {
            throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + class_.getName() + ". Forgot to register a type adapter?");
        }
        e2.f();
    }

    public Class b(a a2) {
        if (a2.f() == d.i) {
            a2.j();
            return null;
        }
        throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
    }

    public /* synthetic */ Object a(a a2) {
        return this.b(a2);
    }
}

