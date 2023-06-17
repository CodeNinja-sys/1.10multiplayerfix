/*
 * Decompiled with CFR 0.150.
 */
package b;

import b.a;
import b.a.g;
import b.ag;
import b.d;
import b.r;
import b.v;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class l
extends a {
    static final String a = "[arguments]";
    private ag b;
    private String c = "";

    l() {
        this("");
    }

    l(String string) {
        super(Arrays.asList(a), string);
    }

    public l a(Class class_) {
        this.b = g.a(class_);
        return this;
    }

    public final l b(ag ag2) {
        if (ag2 == null) {
            throw new NullPointerException("illegal null converter");
        }
        this.b = ag2;
        return this;
    }

    public l b(String string) {
        this.c = string;
        return this;
    }

    protected final Object a(String string) {
        return this.a(this.b, string);
    }

    void a(r r2, d d2, v v2, String string) {
        v2.a(this, string);
    }

    public List m() {
        return Collections.emptyList();
    }

    public boolean g() {
        return false;
    }

    public boolean i() {
        return false;
    }

    public boolean j() {
        return false;
    }

    public String k() {
        return this.c;
    }

    public String l() {
        return this.a(this.b);
    }

    public boolean e() {
        return true;
    }
}

