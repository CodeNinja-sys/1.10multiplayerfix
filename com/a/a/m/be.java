/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.m;

import com.a.a.m.bb;

final class be
extends bb {
    @Override
    Class a(Class class_) {
        if (class_.isLocalClass()) {
            return null;
        }
        return class_.getEnclosingClass();
    }
}

