/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.d;

import io.netty.b.bi;
import io.netty.b.g;
import io.netty.b.i;
import io.netty.c.a.d.ad;
import io.netty.c.a.d.ar;
import io.netty.c.a.d.bs;
import io.netty.c.a.d.j;
import io.netty.c.a.d.t;
import io.netty.util.z;
import java.util.Map;

public class s
extends j
implements bs {
    private final ar a;
    private final boolean c;

    public s() {
        this(bi.a(0));
    }

    public s(g g2) {
        this(g2, true);
    }

    public s(g g2, boolean bl2) {
        super(g2);
        this.a = new t(bl2);
        this.c = bl2;
    }

    @Override
    public bs f() {
        s s2 = new s(this.a().Q(), this.c);
        s2.e().b(this.e());
        return s2;
    }

    public bs l() {
        s s2 = new s(this.a().S(), this.c);
        s2.e().b(this.e());
        return s2;
    }

    @Override
    public bs b(int n2) {
        super.c(n2);
        return this;
    }

    @Override
    public bs g() {
        super.j();
        return this;
    }

    @Override
    public ar e() {
        return this.a;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(super.toString());
        stringBuilder.append(io.netty.util.c.ad.a);
        this.a(stringBuilder);
        stringBuilder.setLength(stringBuilder.length() - io.netty.util.c.ad.a.length());
        return stringBuilder.toString();
    }

    private void a(StringBuilder stringBuilder) {
        for (Map.Entry entry : this.e()) {
            stringBuilder.append((String)entry.getKey());
            stringBuilder.append(": ");
            stringBuilder.append((String)entry.getValue());
            stringBuilder.append(io.netty.util.c.ad.a);
        }
    }

    @Override
    public /* synthetic */ ad c(int n2) {
        return this.b(n2);
    }

    @Override
    public /* synthetic */ ad j() {
        return this.g();
    }

    @Override
    public /* synthetic */ ad h() {
        return this.l();
    }

    @Override
    public /* synthetic */ ad k() {
        return this.f();
    }

    @Override
    public /* synthetic */ i a(int n2) {
        return this.b(n2);
    }

    @Override
    public /* synthetic */ i bC_() {
        return this.g();
    }

    @Override
    public /* synthetic */ i c() {
        return this.l();
    }

    @Override
    public /* synthetic */ i b() {
        return this.f();
    }

    @Override
    public /* synthetic */ z J(int n2) {
        return this.b(n2);
    }

    @Override
    public /* synthetic */ z ae() {
        return this.g();
    }
}

