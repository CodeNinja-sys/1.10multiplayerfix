/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.bc;
import com.ibm.icu.a.fd;
import com.ibm.icu.a.fi;
import com.ibm.icu.a.fv;
import com.ibm.icu.a.fw;
import com.ibm.icu.a.fx;
import com.ibm.icu.a.fy;
import com.ibm.icu.a.fz;
import com.ibm.icu.a.ga;
import com.ibm.icu.a.gb;
import com.ibm.icu.a.je;
import com.ibm.icu.d.kl;
import com.ibm.icu.d.ks;
import com.ibm.icu.util.dj;
import com.ibm.icu.util.dk;
import com.ibm.icu.util.dn;
import com.ibm.icu.util.dv;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;

public class ft
extends kl {
    private static final long a = -2179814848495897472L;
    private static final String b = "zoneStrings";
    private static final String c = "meta:";
    private static Set d;
    private static final fz e;
    private static final fv f;
    private transient bc g;
    private transient ConcurrentHashMap h;
    private transient ConcurrentHashMap i;
    private transient fd j;
    private transient boolean k;
    private static final Pattern l;

    public ft(dn dn2) {
        this.b(dn2);
    }

    public synchronized Set a() {
        if (d == null) {
            dv dv2 = dv.b("com/ibm/icu/impl/data/icudt51b", "metaZones");
            dv dv3 = dv2.l("mapTimezones");
            Set set = dv3.keySet();
            d = Collections.unmodifiableSet(set);
        }
        return d;
    }

    public Set a(String string) {
        if (string == null || string.length() == 0) {
            return Collections.emptySet();
        }
        List list = (List)e.a((Object)string, (Object)string);
        if (list.isEmpty()) {
            return Collections.emptySet();
        }
        HashSet<String> hashSet = new HashSet<String>(list.size());
        for (fw fw2 : list) {
            hashSet.add(fw2.a());
        }
        return Collections.unmodifiableSet(hashSet);
    }

    public String a(String string, long l2) {
        if (string == null || string.length() == 0) {
            return null;
        }
        String string2 = null;
        List list = (List)e.a((Object)string, (Object)string);
        for (fw fw2 : list) {
            if (l2 < fw2.b() || l2 >= fw2.c()) continue;
            string2 = fw2.a();
            break;
        }
        return string2;
    }

    public String a(String string, String string2) {
        if (string == null || string.length() == 0) {
            return null;
        }
        String string3 = null;
        Map map = (Map)f.a((Object)string, (Object)string);
        if (!map.isEmpty() && (string3 = (String)map.get(string2)) == null) {
            string3 = (String)map.get("001");
        }
        return string3;
    }

    public String a(String string, ks ks2) {
        if (string == null || string.length() == 0) {
            return null;
        }
        return this.e(string).a(ks2);
    }

    public String b(String string, ks ks2) {
        if (string == null || string.length() == 0) {
            return null;
        }
        return this.f(string).a(ks2);
    }

    public String b(String string) {
        if (string == null || string.length() == 0) {
            return null;
        }
        String string2 = this.f(string).a(ks.g);
        return string2;
    }

    public synchronized Collection a(CharSequence charSequence, int n2, EnumSet enumSet) {
        Object object2;
        if (charSequence == null || charSequence.length() == 0 || n2 < 0 || n2 >= charSequence.length()) {
            throw new IllegalArgumentException("bad input text or range");
        }
        fy fy2 = new fy(enumSet);
        this.j.a(charSequence, n2, (fi)fy2);
        if (fy2.b() == charSequence.length() - n2 || this.k) {
            return fy2.a();
        }
        Set set = dj.a(dk.b, null, null);
        for (Object object2 : set) {
            this.f((String)object2);
        }
        Set set2 = this.a();
        object2 = set2.iterator();
        while (object2.hasNext()) {
            String string = (String)object2.next();
            this.e(string);
        }
        this.k = true;
        fy2.c();
        this.j.a(charSequence, n2, (fi)fy2);
        return fy2.a();
    }

    private void b(dn dn2) {
        bc bc2 = (bc)bc.a("com/ibm/icu/impl/data/icudt51b/zone", dn2);
        this.g = (bc)bc2.l(b);
        this.i = new ConcurrentHashMap();
        this.h = new ConcurrentHashMap();
        this.j = new fd(true);
        this.k = false;
        dj dj2 = dj.p();
        String string = je.a(dj2);
        if (string != null) {
            this.d(string);
        }
    }

    private synchronized void d(String string) {
        if (string == null || string.length() == 0) {
            return;
        }
        this.f(string);
        Set set = this.a(string);
        for (String string2 : set) {
            this.e(string2);
        }
    }

    private void a(ObjectOutputStream objectOutputStream) {
        dn dn2 = this.g.i();
        objectOutputStream.writeObject(dn2);
    }

    private void a(ObjectInputStream objectInputStream) {
        dn dn2 = (dn)objectInputStream.readObject();
        this.b(dn2);
    }

    private synchronized gb e(String string) {
        gb gb2 = (gb)this.h.get(string);
        if (gb2 == null) {
            gb2 = gb.a(this.g, c + string);
            string = string.intern();
            for (ks ks2 : ks.values()) {
                String string2 = gb2.a(ks2);
                if (string2 == null) continue;
                fx fx2 = new fx(null);
                fx2.b = string;
                fx2.c = ks2;
                this.j.a((CharSequence)string2, fx2);
            }
            gb gb3 = this.h.putIfAbsent(string, gb2);
            gb2 = gb3 == null ? gb2 : gb3;
        }
        return gb2;
    }

    private synchronized ga f(String string) {
        ga ga2 = (ga)this.i.get(string);
        if (ga2 == null) {
            ga2 = ga.a(this.g, string.replace('/', ':'), string);
            string = string.intern();
            for (ks ks2 : ks.values()) {
                String string2 = ga2.a(ks2);
                if (string2 == null) continue;
                fx fx2 = new fx(null);
                fx2.a = string;
                fx2.c = ks2;
                this.j.a((CharSequence)string2, fx2);
            }
            ga ga3 = this.i.putIfAbsent(string, ga2);
            ga2 = ga3 == null ? ga2 : ga3;
        }
        return ga2;
    }

    public static String c(String string) {
        if (string == null || string.length() == 0 || l.matcher(string).matches()) {
            return null;
        }
        String string2 = null;
        int n2 = string.lastIndexOf(47);
        if (n2 > 0 && n2 + 1 < string.length()) {
            string2 = string.substring(n2 + 1).replace('_', ' ');
        }
        return string2;
    }

    static {
        e = new fz(null);
        f = new fv(null);
        l = Pattern.compile("Etc/.*|SystemV/.*|.*/Riyadh8[7-9]");
    }
}

