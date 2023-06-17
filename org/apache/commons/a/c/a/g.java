/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.a.c.a;

import java.util.NoSuchElementException;
import org.apache.commons.a.c.a.h;

final class g
extends h {
    g() {
    }

    @Override
    public boolean a(String string) {
        return true;
    }

    @Override
    public String a() {
        throw new NoSuchElementException("Can't fetch any language from the any language set.");
    }

    @Override
    public boolean b() {
        return false;
    }

    @Override
    public boolean c() {
        return false;
    }

    @Override
    public h a(h h2) {
        return h2;
    }

    public String toString() {
        return "ANY_LANGUAGE";
    }
}

