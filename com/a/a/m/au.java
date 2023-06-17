/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.m;

import com.a.a.m.ae;
import com.a.a.m.at;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;

final class au
extends at {
    public boolean a(ae ae2) {
        return !(ae.c(ae2) instanceof TypeVariable) && !(ae.c(ae2) instanceof WildcardType);
    }
}

