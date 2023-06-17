/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.g;

import com.a.a.b.cl;
import com.a.a.g.ae;
import com.a.a.g.ai;
import com.a.a.g.aj;
import com.a.a.g.u;
import java.nio.charset.Charset;

abstract class h
implements ai {
    h() {
    }

    @Override
    public ae a(Object object, u u2) {
        return this.a().a(object, u2).a();
    }

    @Override
    public ae a(CharSequence charSequence) {
        return this.a().a(charSequence).a();
    }

    @Override
    public ae a(CharSequence charSequence, Charset charset) {
        return this.a().a(charSequence, charset).a();
    }

    @Override
    public ae b(int n2) {
        return this.a().a(n2).a();
    }

    @Override
    public ae a(long l2) {
        return this.a().a(l2).a();
    }

    @Override
    public ae a(byte[] arrby) {
        return this.a().b(arrby).a();
    }

    @Override
    public ae a(byte[] arrby, int n2, int n3) {
        return this.a().b(arrby, n2, n3).a();
    }

    @Override
    public aj a(int n2) {
        cl.a(n2 >= 0);
        return this.a();
    }
}

