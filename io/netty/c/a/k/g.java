/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.k;

import io.netty.c.a.k.aj;
import io.netty.c.a.k.am;
import io.netty.c.a.k.bl;
import io.netty.c.a.k.c;
import io.netty.c.a.k.l;
import io.netty.util.c.ad;
import java.util.Map;

public class g
extends l
implements am {
    private boolean a;
    private boolean b;
    private final aj c = new c();

    public g(int n2) {
        super(n2);
    }

    @Override
    public am a(int n2) {
        super.d(n2);
        return this;
    }

    @Override
    public am a(boolean bl2) {
        super.b(bl2);
        return this;
    }

    @Override
    public boolean a() {
        return this.a;
    }

    @Override
    public am b() {
        this.a = true;
        return this;
    }

    @Override
    public boolean c() {
        return this.b;
    }

    @Override
    public am d() {
        this.b = true;
        return this;
    }

    @Override
    public aj e() {
        return this.c;
    }

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

    protected void a(StringBuilder stringBuilder) {
        for (Map.Entry entry : this.e()) {
            stringBuilder.append("    ");
            stringBuilder.append((String)entry.getKey());
            stringBuilder.append(": ");
            stringBuilder.append((String)entry.getValue());
            stringBuilder.append(ad.a);
        }
    }

    @Override
    public /* synthetic */ bl b(boolean bl2) {
        return this.a(bl2);
    }

    @Override
    public /* synthetic */ bl d(int n2) {
        return this.a(n2);
    }
}

