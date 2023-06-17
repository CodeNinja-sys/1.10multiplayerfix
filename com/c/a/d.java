/*
 * Decompiled with CFR 0.150.
 */
package com.c.a;

import com.c.a.d.a;
import com.c.a.d.b;
import com.c.a.e;
import com.c.a.j;
import com.c.a.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.c.am;
import org.apache.commons.c.ao;
import org.apache.logging.log4j.c;

public abstract class d
implements j {
    private static final org.apache.logging.log4j.d g = org.apache.logging.log4j.c.c();
    protected static final String a = "displayName";
    protected static final String b = "uuid";
    protected static final String c = "profileProperties";
    protected static final String d = "username";
    protected static final String e = "userid";
    protected static final String f = "userProperties";
    private final com.c.a.b h;
    private final b i = new b();
    private String j;
    private String k;
    private String l;
    private e m;
    private k n;

    protected d(com.c.a.b b2) {
        ao.a(b2);
        this.h = b2;
    }

    @Override
    public boolean a() {
        return !this.o() && am.d((CharSequence)this.d()) && am.d((CharSequence)this.e());
    }

    @Override
    public void b() {
        this.l = null;
        this.j = null;
        this.a((e)null);
        this.k().h();
        this.a((k)null);
    }

    @Override
    public boolean c() {
        return this.g() != null;
    }

    @Override
    public void a(String string) {
        if (this.c() && this.o()) {
            throw new IllegalStateException("Cannot change username whilst logged in & online");
        }
        this.k = string;
    }

    @Override
    public void b(String string) {
        if (this.c() && this.o() && am.d((CharSequence)string)) {
            throw new IllegalStateException("Cannot set password whilst logged in & online");
        }
        this.l = string;
    }

    protected String d() {
        return this.k;
    }

    protected String e() {
        return this.l;
    }

    @Override
    public void a(Map map) {
        String string;
        String string2;
        Object object;
        Object object2;
        Object object3;
        Object object4;
        this.b();
        this.a(String.valueOf(map.get(d)));
        this.j = map.containsKey(e) ? String.valueOf(map.get(e)) : this.k;
        if (map.containsKey(f)) {
            try {
                object4 = (List)map.get(f);
                object3 = object4.iterator();
                while (object3.hasNext()) {
                    object2 = (Map)object3.next();
                    object = (String)object2.get("name");
                    string2 = (String)object2.get("value");
                    string = (String)object2.get("signature");
                    if (string == null) {
                        this.k().a(object, new a((String)object, string2));
                        continue;
                    }
                    this.k().a(object, new a((String)object, string2, string));
                }
            }
            catch (Throwable throwable) {
                g.f("Couldn't deserialize user properties", throwable);
            }
        }
        if (map.containsKey(a) && map.containsKey(b)) {
            object4 = new e(com.c.d.b.b(String.valueOf(map.get(b))), String.valueOf(map.get(a)));
            if (map.containsKey(c)) {
                try {
                    object3 = (List)map.get(c);
                    object2 = object3.iterator();
                    while (object2.hasNext()) {
                        object = (Map)object2.next();
                        string2 = (String)object.get("name");
                        string = (String)object.get("value");
                        String string3 = (String)object.get("signature");
                        if (string3 == null) {
                            ((e)object4).c().a(string2, new a(string2, string));
                            continue;
                        }
                        ((e)object4).c().a(string2, new a(string2, string, string3));
                    }
                }
                catch (Throwable throwable) {
                    g.f("Couldn't deserialize profile properties", throwable);
                }
            }
            this.a((e)object4);
        }
    }

    @Override
    public Map f() {
        Object object;
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        if (this.d() != null) {
            hashMap.put(d, this.d());
        }
        if (this.i() != null) {
            hashMap.put(e, this.i());
        } else if (this.d() != null) {
            hashMap.put(d, this.d());
        }
        if (!this.j().o()) {
            object = new ArrayList();
            for (Object object2 : this.j().j()) {
                Object object3 = new HashMap<String, String>();
                object3.put("name", ((a)object2).a());
                object3.put("value", ((a)object2).b());
                object3.put("signature", ((a)object2).c());
                object.add(object3);
            }
            hashMap.put(f, object);
        }
        if ((object = this.g()) != null) {
            hashMap.put(a, ((e)object).b());
            hashMap.put(b, ((e)object).a());
            ArrayList arrayList = new ArrayList();
            for (Object object3 : ((e)object).c().j()) {
                HashMap<String, String> hashMap2 = new HashMap<String, String>();
                hashMap2.put("name", ((a)object3).a());
                hashMap2.put("value", ((a)object3).b());
                hashMap2.put("signature", ((a)object3).c());
                arrayList.add(hashMap2);
            }
            if (!arrayList.isEmpty()) {
                hashMap.put(c, arrayList);
            }
        }
        return hashMap;
    }

    protected void a(e e2) {
        this.m = e2;
    }

    @Override
    public e g() {
        return this.m;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getClass().getSimpleName());
        stringBuilder.append("{");
        if (this.c()) {
            stringBuilder.append("Logged in as ");
            stringBuilder.append(this.d());
            if (this.g() != null) {
                stringBuilder.append(" / ");
                stringBuilder.append(this.g());
                stringBuilder.append(" - ");
                if (this.o()) {
                    stringBuilder.append("Online");
                } else {
                    stringBuilder.append("Offline");
                }
            }
        } else {
            stringBuilder.append("Not logged in");
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public com.c.a.b h() {
        return this.h;
    }

    @Override
    public String i() {
        return this.j;
    }

    @Override
    public b j() {
        if (this.c()) {
            b b2 = new b();
            b2.a(this.k());
            return b2;
        }
        return new b();
    }

    protected b k() {
        return this.i;
    }

    @Override
    public k l() {
        if (this.c()) {
            return this.n == null ? com.c.a.k.a : this.n;
        }
        return null;
    }

    protected void a(k k2) {
        this.n = k2;
    }

    protected void c(String string) {
        this.j = string;
    }
}

