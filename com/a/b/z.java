/*
 * Decompiled with CFR 0.150.
 */
package com.a.b;

import com.a.b.ac;
import com.a.b.t;
import com.a.b.w;
import com.a.b.y;
import java.util.Map;
import java.util.Set;

public final class z
extends w {
    private final com.a.b.b.w a = new com.a.b.b.w();

    z a() {
        z z2 = new z();
        for (Map.Entry entry : this.a.entrySet()) {
            z2.a((String)entry.getKey(), ((w)entry.getValue()).o());
        }
        return z2;
    }

    public void a(String string, w w2) {
        if (w2 == null) {
            w2 = y.a;
        }
        this.a.put(string, w2);
    }

    public w a(String string) {
        return (w)this.a.remove(string);
    }

    public void a(String string, String string2) {
        this.a(string, this.a((Object)string2));
    }

    public void a(String string, Number number) {
        this.a(string, this.a(number));
    }

    public void a(String string, Boolean bl2) {
        this.a(string, this.a(bl2));
    }

    public void a(String string, Character c2) {
        this.a(string, this.a(c2));
    }

    private w a(Object object) {
        return object == null ? y.a : new ac(object);
    }

    public Set b() {
        return this.a.entrySet();
    }

    public boolean b(String string) {
        return this.a.containsKey(string);
    }

    public w c(String string) {
        return (w)this.a.get(string);
    }

    public ac d(String string) {
        return (ac)this.a.get(string);
    }

    public t e(String string) {
        return (t)this.a.get(string);
    }

    public z f(String string) {
        return (z)this.a.get(string);
    }

    public boolean equals(Object object) {
        return object == this || object instanceof z && ((z)object).a.equals(this.a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    /* synthetic */ w o() {
        return this.a();
    }
}

