/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.a.c.a;

import java.util.NoSuchElementException;
import org.apache.commons.a.c.a.h;

final class f
extends h {
    f() {
    }

    @Override
    public boolean a(String string) {
        return false;
    }

    @Override
    public String a() {
        throw new NoSuchElementException("Can't fetch any language from the empty language set.");
    }

    @Override
    public boolean b() {
        return true;
    }

    @Override
    public boolean c() {
        return false;
    }

    @Override
    public h a(h h2) {
        return this;
    }

    public String toString() {
        return "NO_LANGUAGES";
    }
}

