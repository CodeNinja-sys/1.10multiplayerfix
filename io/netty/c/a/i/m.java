/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.i;

import io.netty.c.a.i.l;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.util.Map;

final class m
extends l {
    m(Map map) {
        super(map);
    }

    @Override
    Reference a(Object object) {
        return new SoftReference<Object>(object);
    }
}

