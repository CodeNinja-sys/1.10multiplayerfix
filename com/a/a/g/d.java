/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.g;

import com.a.a.g.aj;
import com.a.a.g.bk;
import java.nio.charset.Charset;

abstract class d
implements aj {
    d() {
    }

    @Override
    public final aj a(boolean bl2) {
        return this.b(bl2 ? (byte)1 : 0);
    }

    @Override
    public final aj a(double d2) {
        return this.a(Double.doubleToRawLongBits(d2));
    }

    @Override
    public final aj a(float f2) {
        return this.a(Float.floatToRawIntBits(f2));
    }

    @Override
    public aj a(CharSequence charSequence) {
        int n2 = charSequence.length();
        for (int i2 = 0; i2 < n2; ++i2) {
            this.a(charSequence.charAt(i2));
        }
        return this;
    }

    @Override
    public aj a(CharSequence charSequence, Charset charset) {
        return this.b(charSequence.toString().getBytes(charset));
    }

    @Override
    public /* synthetic */ bk b(CharSequence charSequence, Charset charset) {
        return this.a(charSequence, charset);
    }

    @Override
    public /* synthetic */ bk b(CharSequence charSequence) {
        return this.a(charSequence);
    }

    @Override
    public /* synthetic */ bk b(boolean bl2) {
        return this.a(bl2);
    }

    @Override
    public /* synthetic */ bk b(double d2) {
        return this.a(d2);
    }

    @Override
    public /* synthetic */ bk b(float f2) {
        return this.a(f2);
    }
}

