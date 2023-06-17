/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.k;

import io.netty.c.a.k.am;
import io.netty.c.a.k.bl;
import io.netty.c.a.k.bn;
import io.netty.c.a.k.g;
import io.netty.util.c.ad;

public class m
extends g
implements bn {
    public m(int n2) {
        super(n2);
    }

    @Override
    public bn b(int n2) {
        super.a(n2);
        return this;
    }

    @Override
    public bn c(boolean bl2) {
        super.a(bl2);
        return this;
    }

    @Override
    public bn f() {
        super.b();
        return this;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(ad.a(this));
        stringBuilder.append("(last: ");
        stringBuilder.append(this.i());
        stringBuilder.append(')');
        stringBuilder.append(ad.a);
        stringBuilder.append("--> Stream-ID = ");
        stringBuilder.append(this.h());
        stringBuilder.append(ad.a);
        stringBuilder.append("--> Headers:");
        stringBuilder.append(ad.a);
        this.a(stringBuilder);
        stringBuilder.setLength(stringBuilder.length() - ad.a.length());
        return stringBuilder.toString();
    }

    @Override
    public /* synthetic */ am b() {
        return this.f();
    }

    @Override
    public /* synthetic */ am a(boolean bl2) {
        return this.c(bl2);
    }

    @Override
    public /* synthetic */ am a(int n2) {
        return this.b(n2);
    }

    @Override
    public /* synthetic */ bl b(boolean bl2) {
        return this.c(bl2);
    }

    @Override
    public /* synthetic */ bl d(int n2) {
        return this.b(n2);
    }
}

