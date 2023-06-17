/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.d.c;

import io.netty.c.a.d.ae;
import io.netty.c.a.d.ar;
import io.netty.c.a.d.ay;
import io.netty.c.a.d.bk;
import io.netty.c.a.d.bo;
import io.netty.c.a.d.bq;
import io.netty.c.a.d.c.af;
import io.netty.c.a.d.c.aj;
import io.netty.c.a.d.c.av;
import io.netty.c.a.d.c.b;
import io.netty.c.a.d.v;
import io.netty.c.a.d.w;
import io.netty.channel.an;
import io.netty.channel.aw;
import io.netty.channel.ba;
import io.netty.channel.bd;
import io.netty.channel.br;
import io.netty.channel.bw;
import io.netty.util.b.ad;
import io.netty.util.c.b.g;
import io.netty.util.c.b.h;
import io.netty.util.c.d;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public abstract class ai {
    protected static final g a = h.a(ai.class);
    private final String c;
    private final String[] d;
    private final av e;
    private final int f;
    private String g;
    public static final String b = "*";

    protected ai(av av2, String string, String string2, int n2) {
        this.e = av2;
        this.c = string;
        if (string2 != null) {
            String[] arrstring = io.netty.util.c.ad.a(string2, ',');
            for (int i2 = 0; i2 < arrstring.length; ++i2) {
                arrstring[i2] = arrstring[i2].trim();
            }
            this.d = arrstring;
        } else {
            this.d = io.netty.util.c.d.j;
        }
        this.f = n2;
    }

    public String a() {
        return this.c;
    }

    public Set b() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Collections.addAll(linkedHashSet, this.d);
        return linkedHashSet;
    }

    public av c() {
        return this.e;
    }

    public int d() {
        return this.f;
    }

    public io.netty.channel.av a(an an2, v v2) {
        return this.a(an2, v2, null, an2.p());
    }

    public final io.netty.channel.av a(an an2, v v2, ar ar2, bw bw2) {
        String string;
        bd bd2;
        if (a.d()) {
            a.b("{} WebSocket version {} server handshake", (Object)an2, (Object)this.c());
        }
        w w2 = this.a(v2, ar2);
        br br2 = an2.c();
        if (br2.b(ay.class) != null) {
            br2.a(ay.class);
        }
        if (br2.b(ae.class) != null) {
            br2.a(ae.class);
        }
        if ((bd2 = br2.c(bk.class)) == null) {
            bd2 = br2.c(bq.class);
            if (bd2 == null) {
                bw2.a(new IllegalStateException("No HttpDecoder and no HttpServerCodec in the pipeline"));
                return bw2;
            }
            br2.a(bd2.f(), "wsdecoder", (ba)this.f());
            br2.a(bd2.f(), "wsencoder", (ba)this.g());
            string = bd2.f();
        } else {
            br2.c(bd2.f(), "wsdecoder", this.f());
            string = br2.c(bo.class).f();
            br2.a(string, "wsencoder", (ba)this.g());
        }
        an2.b(w2).a((ad)new aj(this, string, bw2));
        return bw2;
    }

    protected abstract w a(v var1, ar var2);

    public io.netty.channel.av a(an an2, b b2) {
        if (an2 == null) {
            throw new NullPointerException("channel");
        }
        return this.a(an2, b2, an2.p());
    }

    public io.netty.channel.av a(an an2, b b2, bw bw2) {
        if (an2 == null) {
            throw new NullPointerException("channel");
        }
        return an2.b(b2, bw2).a((ad)aw.g);
    }

    protected String a(String string) {
        String[] arrstring;
        if (string == null || this.d.length == 0) {
            return null;
        }
        for (String string2 : arrstring = io.netty.util.c.ad.a(string, ',')) {
            String string3 = string2.trim();
            for (String string4 : this.d) {
                if (!"*".equals(string4) && !string3.equals(string4)) continue;
                this.g = string3;
                return string3;
            }
        }
        return null;
    }

    public String e() {
        return this.g;
    }

    protected abstract io.netty.c.a.d.c.ae f();

    protected abstract af g();
}

