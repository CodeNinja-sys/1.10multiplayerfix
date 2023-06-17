/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.config;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.logging.log4j.core.config.plugins.k;

public class y {
    private final y a;
    private final String b;
    private String c;
    private final k d;
    private final Map e = new HashMap();
    private final List f = new ArrayList();
    private Object g;

    public y(y y2, String string, k k2) {
        this.a = y2;
        this.b = string;
        this.d = k2;
    }

    public y() {
        this.a = null;
        this.b = null;
        this.d = null;
    }

    public y(y y2) {
        this.a = y2.a;
        this.b = y2.b;
        this.d = y2.d;
        this.e.putAll(y2.a());
        this.c = y2.d();
        for (y y3 : y2.b()) {
            this.f.add(new y(y3));
        }
        this.g = y2.g;
    }

    public Map a() {
        return this.e;
    }

    public List b() {
        return this.f;
    }

    public boolean c() {
        return this.f.size() > 0;
    }

    public String d() {
        return this.c;
    }

    public void a(String string) {
        this.c = string;
    }

    public y e() {
        return this.a;
    }

    public String f() {
        return this.b;
    }

    public boolean g() {
        return this.a == null;
    }

    public void a(Object object) {
        this.g = object;
    }

    public Object h() {
        return this.g;
    }

    public k i() {
        return this.d;
    }

    public String toString() {
        if (this.g == null) {
            return "null";
        }
        return this.d.c() ? this.g.toString() : this.d.a().getName() + " with name " + this.b;
    }
}

