/*
 * Decompiled with CFR 0.150.
 */
package com.c.a.e;

import com.a.a.c.an;
import com.a.a.c.f;
import com.a.a.d.mq;
import com.a.b.aa;
import com.a.b.k;
import com.a.b.r;
import com.c.a.a.a;
import com.c.a.b;
import com.c.a.e;
import com.c.a.e.b.d;
import com.c.a.e.c;
import com.c.a.e.h;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import org.apache.commons.b.t;

public class g
extends com.c.a.c.b {
    private static final String[] a = new String[]{".minecraft.net", ".mojang.com"};
    private static final org.apache.logging.log4j.d b = org.apache.logging.log4j.c.c();
    private static final String c = "https://sessionserver.mojang.com/session/minecraft/";
    private static final URL d = com.c.a.g.a("https://sessionserver.mojang.com/session/minecraft/join");
    private static final URL e = com.c.a.g.a("https://sessionserver.mojang.com/session/minecraft/hasJoined");
    private final PublicKey f;
    private final k g = new r().a((Type)((Object)UUID.class), (Object)new com.c.d.b()).i();
    private final an h = com.a.a.c.f.a().a(6L, TimeUnit.HOURS).a(new h(this));

    protected g(c c2) {
        super(c2);
        try {
            X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(t.c(g.class.getResourceAsStream("/yggdrasil_session_pubkey.der")));
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            this.f = keyFactory.generatePublic(x509EncodedKeySpec);
        }
        catch (Exception exception) {
            throw new Error("Missing/invalid yggdrasil public key!");
        }
    }

    @Override
    public void a(e e2, String string, String string2) {
        com.c.a.e.a.c c2 = new com.c.a.e.a.c();
        c2.a = string;
        c2.b = e2.a();
        c2.c = string2;
        this.a().a(d, c2, com.c.a.e.b.h.class);
    }

    @Override
    public e a(e e2, String string) {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("username", e2.b());
        hashMap.put("serverId", string);
        URL uRL = com.c.a.g.a(e, com.c.a.g.a(hashMap));
        try {
            com.c.a.e.b.b b2 = (com.c.a.e.b.b)this.a().a(uRL, null, com.c.a.e.b.b.class);
            if (b2 != null && b2.a() != null) {
                e e3 = new e(b2.a(), e2.b());
                if (b2.b() != null) {
                    e3.c().a(b2.b());
                }
                return e3;
            }
            return null;
        }
        catch (com.c.a.a.b b3) {
            throw b3;
        }
        catch (a a2) {
            return null;
        }
    }

    @Override
    public Map a(e e2, boolean bl2) {
        d d2;
        com.c.a.d.a a2 = (com.c.a.d.a)mq.d((Iterable)e2.c().c("textures"), null);
        if (a2 == null) {
            return new HashMap();
        }
        if (bl2) {
            if (!a2.d()) {
                b.b("Signature is missing from textures payload");
                throw new com.c.a.c.c("Signature is missing from textures payload");
            }
            if (!a2.a(this.f)) {
                b.b("Textures payload has been tampered with (signature invalid)");
                throw new com.c.a.c.c("Textures payload has been tampered with (signature invalid)");
            }
        }
        try {
            String string = new String(org.apache.commons.a.a.d.b(a2.b()), org.apache.commons.a.d.f);
            d2 = (d)this.g.a(string, d.class);
        }
        catch (aa aa2) {
            b.b("Could not decode textures payload", (Throwable)aa2);
            return new HashMap();
        }
        if (d2.e() == null) {
            return new HashMap();
        }
        for (Map.Entry entry : d2.e().entrySet()) {
            if (com.c.a.e.g.a(((com.c.a.c.g)entry.getValue()).a())) continue;
            b.b("Textures payload has been tampered with (non-whitelisted domain)");
            return new HashMap();
        }
        return d2.e();
    }

    @Override
    public e b(e e2, boolean bl2) {
        if (e2.a() == null) {
            return e2;
        }
        if (!bl2) {
            return (e)this.h.c(e2);
        }
        return this.c(e2, true);
    }

    protected e c(e e2, boolean bl2) {
        try {
            URL uRL = com.c.a.g.a("https://sessionserver.mojang.com/session/minecraft/profile/" + com.c.d.b.a(e2.a()));
            uRL = com.c.a.g.a(uRL, "unsigned=" + !bl2);
            com.c.a.e.b.c c2 = (com.c.a.e.b.c)this.a().a(uRL, null, com.c.a.e.b.c.class);
            if (c2 == null) {
                b.a("Couldn't fetch profile properties for " + e2 + " as the profile does not exist");
                return e2;
            }
            e e3 = new e(c2.a(), c2.b());
            e3.c().a(c2.c());
            e2.c().a(c2.c());
            b.a("Successfully fetched profile properties for " + e2);
            return e3;
        }
        catch (a a2) {
            b.f("Couldn't look up profile properties for " + e2, (Throwable)a2);
            return e2;
        }
    }

    public c a() {
        return (c)super.b();
    }

    private static boolean a(String string) {
        URI uRI = null;
        try {
            uRI = new URI(string);
        }
        catch (URISyntaxException uRISyntaxException) {
            throw new IllegalArgumentException("Invalid URL '" + string + "'");
        }
        String string2 = uRI.getHost();
        for (int i2 = 0; i2 < a.length; ++i2) {
            if (!string2.endsWith(a[i2])) continue;
            return true;
        }
        return false;
    }

    @Override
    public /* synthetic */ com.c.a.g b() {
        return this.a();
    }

    @Override
    public /* synthetic */ b c() {
        return this.a();
    }
}

