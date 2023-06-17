/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.xd;
import java.util.NoSuchElementException;

final class abp {
    private abp() {
    }

    private static Object c(xd xd2) {
        if (xd2 == null) {
            throw new NoSuchElementException();
        }
        return xd2.a();
    }

    private static Object d(xd xd2) {
        return xd2 == null ? null : xd2.a();
    }

    static /* synthetic */ Object a(xd xd2) {
        return abp.c(xd2);
    }

    static /* synthetic */ Object b(xd xd2) {
        return abp.d(xd2);
    }
}

