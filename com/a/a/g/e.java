/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.g;

import com.a.a.b.cl;
import com.a.a.g.ae;
import com.a.a.g.ai;
import com.a.a.g.aj;
import com.a.a.g.f;
import com.a.a.g.u;
import java.nio.charset.Charset;

abstract class e
implements ai {
    e() {
    }

    @Override
    public aj a() {
        return new f(this, 32);
    }

    @Override
    public aj a(int n2) {
        cl.a(n2 >= 0);
        return new f(this, n2);
    }

    @Override
    public ae a(Object object, u u2) {
        return this.a().a(object, u2).a();
    }

    @Override
    public ae a(CharSequence charSequence) {
        int n2 = charSequence.length();
        aj aj2 = this.a(n2 * 2);
        for (int i2 = 0; i2 < n2; ++i2) {
            aj2.a(charSequence.charAt(i2));
        }
        return aj2.a();
    }

    @Override
    public ae a(CharSequence charSequence, Charset charset) {
        return this.a(charSequence.toString().getBytes(charset));
    }

    @Override
    public ae b(int n2) {
        return this.a(4).a(n2).a();
    }

    @Override
    public ae a(long l2) {
        return this.a(8).a(l2).a();
    }

    @Override
    public ae a(byte[] arrby) {
        return this.a(arrby, 0, arrby.length);
    }
}

