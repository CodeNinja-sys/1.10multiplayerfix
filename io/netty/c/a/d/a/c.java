/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.d.a;

import io.netty.c.a.d.a.a;
import io.netty.c.a.d.a.d;
import io.netty.c.a.d.a.e;
import io.netty.c.a.d.aw;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;

public class c {
    private final Set a;
    private final boolean b;
    private boolean c;
    private boolean d = true;
    private boolean e;
    private final Set f = new HashSet();
    private long g;
    private final Set h = new HashSet();
    private final Set i = new HashSet();
    private final Map j = new HashMap();
    private boolean k;
    private boolean l;

    public c(String ... arrstring) {
        this.a = new LinkedHashSet<String>(Arrays.asList(arrstring));
        this.b = false;
    }

    public c() {
        this.b = true;
        this.a = Collections.emptySet();
    }

    public c a() {
        this.c = true;
        return this;
    }

    public c b() {
        this.d = false;
        return this;
    }

    public c a(String ... arrstring) {
        this.f.addAll(Arrays.asList(arrstring));
        return this;
    }

    public c c() {
        this.e = true;
        return this;
    }

    public c a(long l2) {
        this.g = l2;
        return this;
    }

    public c a(aw ... arraw) {
        this.h.addAll(Arrays.asList(arraw));
        return this;
    }

    public c b(String ... arrstring) {
        this.i.addAll(Arrays.asList(arrstring));
        return this;
    }

    public c a(CharSequence charSequence, Object ... arrobject) {
        if (arrobject.length == 1) {
            this.j.put(charSequence, new d(arrobject[0], null));
        } else {
            this.a(charSequence, Arrays.asList(arrobject));
        }
        return this;
    }

    public c a(CharSequence charSequence, Iterable iterable) {
        this.j.put(charSequence, new d(iterable, null));
        return this;
    }

    public c a(String string, Callable callable) {
        this.j.put(string, callable);
        return this;
    }

    public c d() {
        this.k = true;
        return this;
    }

    public a e() {
        if (this.j.isEmpty() && !this.k) {
            this.j.put("Date", new e());
            this.j.put("Content-Length", new d("0", null));
        }
        return new a(this, null);
    }

    public c f() {
        this.l = true;
        return this;
    }

    static /* synthetic */ Set a(c c2) {
        return c2.a;
    }

    static /* synthetic */ boolean b(c c2) {
        return c2.b;
    }

    static /* synthetic */ boolean c(c c2) {
        return c2.d;
    }

    static /* synthetic */ Set d(c c2) {
        return c2.f;
    }

    static /* synthetic */ boolean e(c c2) {
        return c2.e;
    }

    static /* synthetic */ long f(c c2) {
        return c2.g;
    }

    static /* synthetic */ Set g(c c2) {
        return c2.h;
    }

    static /* synthetic */ Set h(c c2) {
        return c2.i;
    }

    static /* synthetic */ boolean i(c c2) {
        return c2.c;
    }

    static /* synthetic */ Map j(c c2) {
        return c2.j;
    }

    static /* synthetic */ boolean k(c c2) {
        return c2.l;
    }
}

