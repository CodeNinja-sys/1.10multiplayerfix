/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.d;

import io.netty.c.a.d.ar;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

final class as
extends ar {
    as() {
    }

    @Override
    public String b(String string) {
        return null;
    }

    @Override
    public List c(String string) {
        return Collections.emptyList();
    }

    @Override
    public List b() {
        return Collections.emptyList();
    }

    @Override
    public boolean d(String string) {
        return false;
    }

    @Override
    public boolean c() {
        return true;
    }

    @Override
    public Set d() {
        return Collections.emptySet();
    }

    @Override
    public ar a(String string, Object object) {
        throw new UnsupportedOperationException("read only");
    }

    @Override
    public ar a(String string, Iterable iterable) {
        throw new UnsupportedOperationException("read only");
    }

    @Override
    public ar b(String string, Object object) {
        throw new UnsupportedOperationException("read only");
    }

    @Override
    public ar b(String string, Iterable iterable) {
        throw new UnsupportedOperationException("read only");
    }

    @Override
    public ar a(String string) {
        throw new UnsupportedOperationException("read only");
    }

    @Override
    public ar a() {
        throw new UnsupportedOperationException("read only");
    }

    public Iterator iterator() {
        return this.b().iterator();
    }
}

