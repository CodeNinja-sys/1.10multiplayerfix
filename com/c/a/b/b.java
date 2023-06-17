/*
 * Decompiled with CFR 0.150.
 */
package com.c.a.b;

import com.c.a.b.a;
import com.c.a.e;
import com.c.a.g;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class b
extends com.c.a.c.b {
    private static final String a = "http://session.minecraft.net/game/";
    private static final URL b = g.a("http://session.minecraft.net/game/joinserver.jsp");
    private static final URL c = g.a("http://session.minecraft.net/game/checkserver.jsp");

    protected b(a a2) {
        super(a2);
    }

    @Override
    public void a(e e2, String string, String string2) {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("user", e2.b());
        hashMap.put("sessionId", string);
        hashMap.put("serverId", string2);
        URL uRL = g.a(b, g.a(hashMap));
        try {
            String string3 = this.a().b(uRL);
            if (!string3.equals("OK")) {
                throw new com.c.a.a.a(string3);
            }
        }
        catch (IOException iOException) {
            throw new com.c.a.a.b(iOException);
        }
    }

    @Override
    public e a(e e2, String string) {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("user", e2.b());
        hashMap.put("serverId", string);
        URL uRL = g.a(c, g.a(hashMap));
        try {
            String string2 = this.a().b(uRL);
            return string2.equals("YES") ? e2 : null;
        }
        catch (IOException iOException) {
            throw new com.c.a.a.b(iOException);
        }
    }

    @Override
    public Map a(e e2, boolean bl2) {
        return new HashMap();
    }

    @Override
    public e b(e e2, boolean bl2) {
        return e2;
    }

    public a a() {
        return (a)super.b();
    }

    @Override
    public /* synthetic */ g b() {
        return this.a();
    }

    @Override
    public /* synthetic */ com.c.a.b c() {
        return this.a();
    }
}

