/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.k;

import io.netty.c.a.k.am;
import io.netty.c.a.k.bl;
import io.netty.c.a.k.bo;
import io.netty.c.a.k.g;
import io.netty.util.c.ad;

public class n
extends g
implements bo {
    private int a;
    private byte b;
    private boolean c;

    public n(int n2, int n3, byte by2) {
        super(n2);
        this.c(n3);
        this.a(by2);
    }

    @Override
    public bo b(int n2) {
        super.a(n2);
        return this;
    }

    @Override
    public bo c(boolean bl2) {
        super.a(bl2);
        return this;
    }

    @Override
    public bo f() {
        super.b();
        return this;
    }

    @Override
    public int g() {
        return this.a;
    }

    @Override
    public bo c(int n2) {
        if (n2 < 0) {
            throw new IllegalArgumentException("Associated-To-Stream-ID cannot be negative: " + n2);
        }
        this.a = n2;
        return this;
    }

    @Override
    public byte j() {
        return this.b;
    }

    @Override
    public bo a(byte by2) {
        if (by2 < 0 || by2 > 7) {
            throw new IllegalArgumentException("Priority must be between 0 and 7 inclusive: " + by2);
        }
        this.b = by2;
        return this;
    }

    @Override
    public boolean k() {
        return this.c;
    }

    @Override
    public bo d(boolean bl2) {
        this.c = bl2;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(ad.a(this));
        stringBuilder.append("(last: ");
        stringBuilder.append(this.i());
        stringBuilder.append("; unidirectional: ");
        stringBuilder.append(this.k());
        stringBuilder.append(')');
        stringBuilder.append(ad.a);
        stringBuilder.append("--> Stream-ID = ");
        stringBuilder.append(this.h());
        stringBuilder.append(ad.a);
        if (this.a != 0) {
            stringBuilder.append("--> Associated-To-Stream-ID = ");
            stringBuilder.append(this.g());
            stringBuilder.append(ad.a);
        }
        stringBuilder.append("--> Priority = ");
        stringBuilder.append(this.j());
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

