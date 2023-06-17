/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.g;

import com.a.a.g.ae;
import com.a.a.g.aj;
import com.a.a.g.b;
import com.a.a.g.bk;
import com.a.a.g.u;
import java.nio.charset.Charset;

class c
implements aj {
    final /* synthetic */ aj[] a;
    final /* synthetic */ b b;

    c(b b2, aj[] arraj) {
        this.b = b2;
        this.a = arraj;
    }

    @Override
    public aj b(byte by2) {
        for (aj aj2 : this.a) {
            aj2.b(by2);
        }
        return this;
    }

    @Override
    public aj b(byte[] arrby) {
        for (aj aj2 : this.a) {
            aj2.b(arrby);
        }
        return this;
    }

    @Override
    public aj b(byte[] arrby, int n2, int n3) {
        for (aj aj2 : this.a) {
            aj2.b(arrby, n2, n3);
        }
        return this;
    }

    @Override
    public aj a(short s2) {
        for (aj aj2 : this.a) {
            aj2.a(s2);
        }
        return this;
    }

    @Override
    public aj a(int n2) {
        for (aj aj2 : this.a) {
            aj2.a(n2);
        }
        return this;
    }

    @Override
    public aj a(long l2) {
        for (aj aj2 : this.a) {
            aj2.a(l2);
        }
        return this;
    }

    @Override
    public aj a(float f2) {
        for (aj aj2 : this.a) {
            aj2.a(f2);
        }
        return this;
    }

    @Override
    public aj a(double d2) {
        for (aj aj2 : this.a) {
            aj2.a(d2);
        }
        return this;
    }

    @Override
    public aj a(boolean bl2) {
        for (aj aj2 : this.a) {
            aj2.a(bl2);
        }
        return this;
    }

    @Override
    public aj a(char c2) {
        for (aj aj2 : this.a) {
            aj2.a(c2);
        }
        return this;
    }

    @Override
    public aj a(CharSequence charSequence) {
        for (aj aj2 : this.a) {
            aj2.a(charSequence);
        }
        return this;
    }

    @Override
    public aj a(CharSequence charSequence, Charset charset) {
        for (aj aj2 : this.a) {
            aj2.a(charSequence, charset);
        }
        return this;
    }

    @Override
    public aj a(Object object, u u2) {
        for (aj aj2 : this.a) {
            aj2.a(object, u2);
        }
        return this;
    }

    @Override
    public ae a() {
        return this.b.a(this.a);
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
    public /* synthetic */ bk b(char c2) {
        return this.a(c2);
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

    @Override
    public /* synthetic */ bk b(long l2) {
        return this.a(l2);
    }

    @Override
    public /* synthetic */ bk b(int n2) {
        return this.a(n2);
    }

    @Override
    public /* synthetic */ bk b(short s2) {
        return this.a(s2);
    }

    @Override
    public /* synthetic */ bk c(byte[] arrby, int n2, int n3) {
        return this.b(arrby, n2, n3);
    }

    @Override
    public /* synthetic */ bk c(byte[] arrby) {
        return this.b(arrby);
    }

    @Override
    public /* synthetic */ bk c(byte by2) {
        return this.b(by2);
    }
}

