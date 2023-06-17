/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.k;

import io.netty.c.a.k.aj;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

final class ak
extends aj {
    ak() {
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
    public boolean d() {
        return true;
    }

    @Override
    public Set c() {
        return Collections.emptySet();
    }

    @Override
    public aj a(String string, Object object) {
        throw new UnsupportedOperationException("read only");
    }

    @Override
    public aj b(String string, Iterable iterable) {
        throw new UnsupportedOperationException("read only");
    }

    @Override
    public aj b(String string, Object object) {
        throw new UnsupportedOperationException("read only");
    }

    @Override
    public aj a(String string, Iterable iterable) {
        throw new UnsupportedOperationException("read only");
    }

    @Override
    public aj a(String string) {
        throw new UnsupportedOperationException("read only");
    }

    @Override
    public aj a() {
        throw new UnsupportedOperationException("read only");
    }

    @Override
    public Iterator iterator() {
        return this.b().iterator();
    }

    @Override
    public String b(String string) {
        return null;
    }
}

