/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.b;

import java.net.URI;
import org.apache.logging.log4j.a.n;
import org.apache.logging.log4j.core.b.a;
import org.apache.logging.log4j.core.i;

public class k
extends org.apache.logging.log4j.core.k {
    public k(String string) {
        super(string);
    }

    public k(String string, Object object) {
        super(string, object);
    }

    public k(String string, Object object, URI uRI) {
        super(string, object, uRI);
    }

    public k(String string, Object object, String string2) {
        super(string, object, string2);
    }

    @Override
    protected i a(org.apache.logging.log4j.core.k k2, String string, n n2) {
        return new a(k2, string, n2);
    }

    @Override
    public void f() {
        org.apache.logging.log4j.core.b.a.r();
        super.f();
    }
}

