/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.d.jl;
import com.a.a.d.ov;
import java.util.List;

final class ph
extends jl {
    private final String a;

    ph(String string) {
        this.a = string;
    }

    @Override
    public int indexOf(Object object) {
        return object instanceof Character ? this.a.indexOf(((Character)object).charValue()) : -1;
    }

    @Override
    public int lastIndexOf(Object object) {
        return object instanceof Character ? this.a.lastIndexOf(((Character)object).charValue()) : -1;
    }

    @Override
    public jl a(int n2, int n3) {
        cl.a(n2, n3, this.size());
        return ov.a(this.a.substring(n2, n3));
    }

    @Override
    boolean a() {
        return false;
    }

    public Character b(int n2) {
        cl.a(n2, this.size());
        return Character.valueOf(this.a.charAt(n2));
    }

    @Override
    public int size() {
        return this.a.length();
    }

    @Override
    public /* synthetic */ List subList(int n2, int n3) {
        return this.a(n2, n3);
    }

    public /* synthetic */ Object get(int n2) {
        return this.b(n2);
    }
}

