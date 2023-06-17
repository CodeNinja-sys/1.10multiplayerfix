/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.d.b;

import io.netty.b.g;
import io.netty.b.i;
import io.netty.c.a.d.ac;
import io.netty.c.a.d.b.j;
import io.netty.channel.ar;
import io.netty.util.a;
import io.netty.util.z;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.regex.Pattern;

public abstract class b
extends a
implements j {
    private static final Pattern a = Pattern.compile("(?:^\\s+|\\s+$|\\n)");
    private static final Pattern g = Pattern.compile("[\\r\\t]");
    protected final String b;
    protected long c;
    protected long d;
    protected Charset e = ac.j;
    protected boolean f;

    protected b(String string, Charset charset, long l2) {
        if (string == null) {
            throw new NullPointerException("name");
        }
        string = g.matcher(string).replaceAll(" ");
        if ((string = a.matcher(string).replaceAll("")).isEmpty()) {
            throw new IllegalArgumentException("empty name");
        }
        this.b = string;
        if (charset != null) {
            this.b(charset);
        }
        this.c = l2;
    }

    @Override
    public String p() {
        return this.b;
    }

    @Override
    public boolean q() {
        return this.f;
    }

    @Override
    public Charset r() {
        return this.e;
    }

    @Override
    public void b(Charset charset) {
        if (charset == null) {
            throw new NullPointerException("charset");
        }
        this.e = charset;
    }

    @Override
    public long s() {
        return this.d;
    }

    @Override
    public g a() {
        try {
            return this.l();
        }
        catch (IOException iOException) {
            throw new ar(iOException);
        }
    }

    @Override
    protected void d() {
        this.j();
    }

    @Override
    public j t() {
        super.ae();
        return this;
    }

    @Override
    public j c(int n2) {
        super.J(n2);
        return this;
    }

    @Override
    public /* synthetic */ z J(int n2) {
        return this.c(n2);
    }

    @Override
    public /* synthetic */ z ae() {
        return this.t();
    }

    @Override
    public /* synthetic */ i a(int n2) {
        return this.c(n2);
    }

    @Override
    public /* synthetic */ i bC_() {
        return this.t();
    }
}

