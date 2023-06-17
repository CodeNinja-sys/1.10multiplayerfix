/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a.c;

import com.ibm.icu.a.c.a;
import com.ibm.icu.a.c.c;
import com.ibm.icu.a.c.g;
import com.ibm.icu.a.c.i;
import com.ibm.icu.a.c.j;
import com.ibm.icu.a.c.k;
import com.ibm.icu.a.c.l;
import com.ibm.icu.a.c.o;
import com.ibm.icu.a.c.q;
import com.ibm.icu.a.c.r;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class h {
    private static final boolean b = false;
    private String c = "";
    private String d = "";
    private String e = "";
    private String f = "";
    private static final i g = new i("x".charAt(0));
    private HashMap h;
    private HashSet i;
    private HashMap j;

    public h a(String string) {
        if (string == null || string.length() == 0) {
            this.c = "";
        } else {
            if (!k.a(string)) {
                throw new o("Ill-formed language: " + string, 0);
            }
            this.c = string;
        }
        return this;
    }

    public h b(String string) {
        if (string == null || string.length() == 0) {
            this.d = "";
        } else {
            if (!k.c(string)) {
                throw new o("Ill-formed script: " + string, 0);
            }
            this.d = string;
        }
        return this;
    }

    public h c(String string) {
        if (string == null || string.length() == 0) {
            this.e = "";
        } else {
            if (!k.d(string)) {
                throw new o("Ill-formed region: " + string, 0);
            }
            this.e = string;
        }
        return this;
    }

    public h d(String string) {
        if (string == null || string.length() == 0) {
            this.f = "";
        } else {
            String string2 = string.replaceAll("-", "_");
            int n2 = this.b(string2, "_");
            if (n2 != -1) {
                throw new o("Ill-formed variant: " + string, n2);
            }
            this.f = string2;
        }
        return this;
    }

    public h e(String string) {
        if (string == null || !r.b(string)) {
            throw new o("Ill-formed Unicode locale attribute: " + string);
        }
        if (this.i == null) {
            this.i = new HashSet(4);
        }
        this.i.add(new j(string));
        return this;
    }

    public h f(String string) {
        if (string == null || !r.b(string)) {
            throw new o("Ill-formed Unicode locale attribute: " + string);
        }
        if (this.i != null) {
            this.i.remove(new j(string));
        }
        return this;
    }

    public h a(String string, String string2) {
        if (!r.c(string)) {
            throw new o("Ill-formed Unicode locale keyword key: " + string);
        }
        j j2 = new j(string);
        if (string2 == null) {
            if (this.j != null) {
                this.j.remove(j2);
            }
        } else {
            if (string2.length() != 0) {
                String string3 = string2.replaceAll("_", "-");
                q q2 = new q(string3, "-");
                while (!q2.e()) {
                    String string4 = q2.b();
                    if (!r.d(string4)) {
                        throw new o("Ill-formed Unicode locale keyword type: " + string2, q2.c());
                    }
                    q2.f();
                }
            }
            if (this.j == null) {
                this.j = new HashMap(4);
            }
            this.j.put(j2, string2);
        }
        return this;
    }

    public h a(char c2, String string) {
        boolean bl2 = k.b(c2);
        if (!bl2 && !k.a(c2)) {
            throw new o("Ill-formed extension key: " + c2);
        }
        boolean bl3 = string == null || string.length() == 0;
        i i2 = new i(c2);
        if (bl3) {
            if (r.a(i2.a())) {
                if (this.i != null) {
                    this.i.clear();
                }
                if (this.j != null) {
                    this.j.clear();
                }
            } else if (this.h != null && this.h.containsKey(i2)) {
                this.h.remove(i2);
            }
        } else {
            String string2 = string.replaceAll("_", "-");
            q q2 = new q(string2, "-");
            while (!q2.e()) {
                String string3 = q2.b();
                boolean bl4 = bl2 ? k.i(string3) : k.g(string3);
                if (!bl4) {
                    throw new o("Ill-formed extension value: " + string3, q2.c());
                }
                q2.f();
            }
            if (r.a(i2.a())) {
                this.i(string2);
            } else {
                if (this.h == null) {
                    this.h = new HashMap(4);
                }
                this.h.put(i2, string2);
            }
        }
        return this;
    }

    public h g(String string) {
        CharSequence charSequence;
        int n2;
        String string2;
        if (string == null || string.length() == 0) {
            this.b();
            return this;
        }
        string = string.replaceAll("_", "-");
        q q2 = new q(string, "-");
        ArrayList<String> arrayList = null;
        String string3 = null;
        int n3 = 0;
        while (!q2.e() && k.f(string2 = q2.b())) {
            n2 = q2.c();
            charSequence = string2;
            StringBuilder stringBuilder = new StringBuilder((String)charSequence);
            q2.f();
            while (!q2.e() && k.g(string2 = q2.b())) {
                stringBuilder.append("-").append(string2);
                n3 = q2.d();
                q2.f();
            }
            if (n3 < n2) {
                throw new o("Incomplete extension '" + (String)charSequence + "'", n2);
            }
            if (arrayList == null) {
                arrayList = new ArrayList<String>(4);
            }
            arrayList.add(stringBuilder.toString());
        }
        if (!q2.e() && k.h(string2 = q2.b())) {
            n2 = q2.c();
            charSequence = new StringBuilder(string2);
            q2.f();
            while (!q2.e() && k.i(string2 = q2.b())) {
                ((StringBuilder)charSequence).append("-").append(string2);
                n3 = q2.d();
                q2.f();
            }
            if (n3 <= n2) {
                throw new o("Incomplete privateuse:" + string.substring(n2), n2);
            }
            string3 = ((StringBuilder)charSequence).toString();
        }
        if (!q2.e()) {
            throw new o("Ill-formed extension subtags:" + string.substring(q2.c()), q2.c());
        }
        return this.a(arrayList, string3);
    }

    private h a(List list, String string) {
        this.b();
        if (list != null && list.size() > 0) {
            HashSet hashSet = new HashSet(list.size());
            for (String string2 : list) {
                i i2 = new i(string2.charAt(0));
                if (hashSet.contains(i2)) continue;
                if (r.a(i2.a())) {
                    this.i(string2.substring(2));
                    continue;
                }
                if (this.h == null) {
                    this.h = new HashMap(4);
                }
                this.h.put(i2, string2.substring(2));
            }
        }
        if (string != null && string.length() > 0) {
            if (this.h == null) {
                this.h = new HashMap(1);
            }
            this.h.put(new i(string.charAt(0)), string.substring(2));
        }
        return this;
    }

    public h a(k k2) {
        Object object;
        this.a();
        if (k2.b().size() > 0) {
            this.c = (String)k2.b().get(0);
        } else {
            object = k2.a();
            if (!((String)object).equals(k.c)) {
                this.c = object;
            }
        }
        this.d = k2.c();
        this.e = k2.d();
        object = k2.e();
        if (object.size() > 0) {
            StringBuilder stringBuilder = new StringBuilder((String)object.get(0));
            for (int i2 = 1; i2 < object.size(); ++i2) {
                stringBuilder.append("_").append((String)object.get(i2));
            }
            this.f = stringBuilder.toString();
        }
        this.a(k2.f(), k2.g());
        return this;
    }

    public h a(c c2, l l2) {
        Set set;
        int n2;
        String string = c2.a();
        String string2 = c2.b();
        String string3 = c2.c();
        String string4 = c2.d();
        if (string.length() > 0 && !k.a(string)) {
            throw new o("Ill-formed language: " + string);
        }
        if (string2.length() > 0 && !k.c(string2)) {
            throw new o("Ill-formed script: " + string2);
        }
        if (string3.length() > 0 && !k.d(string3)) {
            throw new o("Ill-formed region: " + string3);
        }
        if (string4.length() > 0 && (n2 = this.b(string4, "_")) != -1) {
            throw new o("Ill-formed variant: " + string4, n2);
        }
        this.c = string;
        this.d = string2;
        this.e = string3;
        this.f = string4;
        this.b();
        Set set2 = set = l2 == null ? null : l2.a();
        if (set != null) {
            for (Character c3 : set) {
                g g2 = l2.a(c3);
                if (g2 instanceof r) {
                    r r2 = (r)g2;
                    for (String string5 : r2.d()) {
                        if (this.i == null) {
                            this.i = new HashSet(4);
                        }
                        this.i.add(new j(string5));
                    }
                    for (String string5 : r2.e()) {
                        if (this.j == null) {
                            this.j = new HashMap(4);
                        }
                        this.j.put(new j(string5), r2.a(string5));
                    }
                    continue;
                }
                if (this.h == null) {
                    this.h = new HashMap(4);
                }
                this.h.put(new i(c3.charValue()), g2.b());
            }
        }
        return this;
    }

    public h a() {
        this.c = "";
        this.d = "";
        this.e = "";
        this.f = "";
        this.b();
        return this;
    }

    public h b() {
        if (this.h != null) {
            this.h.clear();
        }
        if (this.i != null) {
            this.i.clear();
        }
        if (this.j != null) {
            this.j.clear();
        }
        return this;
    }

    public c c() {
        String string;
        String string2 = this.c;
        String string3 = this.d;
        String string4 = this.e;
        String string5 = this.f;
        if (this.h != null && (string = (String)this.h.get(g)) != null) {
            q q2 = new q(string, "-");
            boolean bl2 = false;
            int n2 = -1;
            while (!q2.e()) {
                if (bl2) {
                    n2 = q2.c();
                    break;
                }
                if (com.ibm.icu.a.c.a.a(q2.b(), "lvariant")) {
                    bl2 = true;
                }
                q2.f();
            }
            if (n2 != -1) {
                StringBuilder stringBuilder = new StringBuilder(string5);
                if (stringBuilder.length() != 0) {
                    stringBuilder.append("_");
                }
                stringBuilder.append(string.substring(n2).replaceAll("-", "_"));
                string5 = stringBuilder.toString();
            }
        }
        return com.ibm.icu.a.c.c.a(string2, string3, string4, string5);
    }

    public l d() {
        if (!(this.h != null && this.h.size() != 0 || this.i != null && this.i.size() != 0 || this.j != null && this.j.size() != 0)) {
            return l.a;
        }
        return new l(this.h, this.i, this.j);
    }

    static String h(String string) {
        q q2 = new q(string, "-");
        int n2 = -1;
        boolean bl2 = false;
        while (!q2.e()) {
            if (n2 != -1) {
                bl2 = true;
                break;
            }
            if (com.ibm.icu.a.c.a.a(q2.b(), "lvariant")) {
                n2 = q2.c();
            }
            q2.f();
        }
        if (!bl2) {
            return string;
        }
        assert (n2 == 0 || n2 > 1);
        return n2 == 0 ? null : string.substring(0, n2 - 1);
    }

    private int b(String string, String string2) {
        q q2 = new q(string, string2);
        while (!q2.e()) {
            String string3 = q2.b();
            if (!k.e(string3)) {
                return q2.c();
            }
            q2.f();
        }
        return -1;
    }

    private void i(String string) {
        if (this.i != null) {
            this.i.clear();
        }
        if (this.j != null) {
            this.j.clear();
        }
        q q2 = new q(string, "-");
        while (!q2.e() && r.b(q2.b())) {
            if (this.i == null) {
                this.i = new HashSet(4);
            }
            this.i.add(new j(q2.b()));
            q2.f();
        }
        j j2 = null;
        int n2 = -1;
        int n3 = -1;
        while (!q2.e()) {
            String string2;
            if (j2 != null) {
                if (r.c(q2.b())) {
                    assert (n2 == -1 || n3 != -1);
                    String string3 = string2 = n2 == -1 ? "" : string.substring(n2, n3);
                    if (this.j == null) {
                        this.j = new HashMap(4);
                    }
                    this.j.put(j2, string2);
                    j j3 = new j(q2.b());
                    j2 = this.j.containsKey(j3) ? null : j3;
                    n3 = -1;
                    n2 = -1;
                } else {
                    if (n2 == -1) {
                        n2 = q2.c();
                    }
                    n3 = q2.d();
                }
            } else if (r.c(q2.b())) {
                j2 = new j(q2.b());
                if (this.j != null && this.j.containsKey(j2)) {
                    j2 = null;
                }
            }
            if (!q2.g()) {
                if (j2 == null) break;
                assert (n2 == -1 || n3 != -1);
                String string4 = string2 = n2 == -1 ? "" : string.substring(n2, n3);
                if (this.j == null) {
                    this.j = new HashMap(4);
                }
                this.j.put(j2, string2);
                break;
            }
            q2.f();
        }
    }
}

